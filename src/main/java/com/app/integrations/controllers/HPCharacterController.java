package com.app.integrations.controllers;

import com.app.integrations.entities.HPCharacter;
import com.app.integrations.services.HPCharacterService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping( "/api/characters" )
public class HPCharacterController
{
    private final ObjectMapper om;
    private List<HPCharacter> hpCharacters = new ArrayList<>();

    @Autowired
    private HPCharacterService HPCharacterService;

    public HPCharacterController( ObjectMapper om )
    {
        this.om = om;
    }

    @GetMapping( "/saveAll" )
    public ResponseEntity<Collection<HPCharacter>> getSaveAll() throws IOException
    {
        String characterResp = HPCharacterService.searchCharacters();
        hpCharacters = om.readValue( characterResp, new TypeReference<List<HPCharacter>>(){} );

        return characterResp != null ? ResponseEntity.ok().body( hpCharacters ) : ResponseEntity.notFound().build();
    }

    @GetMapping( "/listAll" )
    public ResponseEntity<Collection<HPCharacter>> getCharacters()
    {
        return ! hpCharacters.isEmpty() ? ResponseEntity.ok().body( hpCharacters ) : ResponseEntity.notFound().build();
    }

    @PostMapping( "/save" )
    public ResponseEntity<HPCharacter> saveCharacters( @RequestBody String hpCharacter ) throws IOException
    {
        HPCharacter character = om.readValue( hpCharacter, new TypeReference<HPCharacter>(){} );

        hpCharacters.add( character );

        if ( hpCharacters.contains( character ) )
        {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.internalServerError().build();
    }

    @PatchMapping( "/update" )
    public ResponseEntity<HPCharacter> updateHPCharacter( @RequestParam String name, @RequestBody String hpCharacter ) throws IOException
    {
        HPCharacter character = om.readValue( hpCharacter, new TypeReference<HPCharacter>(){} );

        for ( HPCharacter hp : hpCharacters )
        {
            if ( hp.getName().equals( name ) )
            {
                hpCharacters.set( hpCharacters.indexOf( hp ), character );

                return ResponseEntity.ok().build();
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping( "/delete" )
    public ResponseEntity<?> remove( @RequestParam String name ) throws IOException
    {
        System.out.println( name );

        for ( HPCharacter hpCharacter : hpCharacters )
        {
            if ( hpCharacter.getName().equals( name ) )
            {
                hpCharacters.remove( hpCharacter );

                return ResponseEntity.ok().build();
            }
        }

        return ResponseEntity.internalServerError().build();
    }
}
