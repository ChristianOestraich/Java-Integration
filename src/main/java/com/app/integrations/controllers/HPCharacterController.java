package com.app.integrations.controllers;

import com.app.integrations.entities.HPCharacter;
import com.app.integrations.services.HPCharacterService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/api/characters")
public class HPCharacterController {

    private final ObjectMapper om;
    private List<HPCharacter> hpCharacters;

    @Autowired
    private HPCharacterService HPCharacterService;

    public HPCharacterController(ObjectMapper om) {
        this.om = om;
    }

    @GetMapping("/listAll")
    public ResponseEntity<Collection<HPCharacter>> getCharacters() throws IOException {
        String characterResp = HPCharacterService.searchCharacters();
        hpCharacters = om.readValue(characterResp, new TypeReference<List<HPCharacter>>() {
        });
        return characterResp != null ? ResponseEntity.ok().body(hpCharacters) : ResponseEntity.notFound().build();
    }

}
