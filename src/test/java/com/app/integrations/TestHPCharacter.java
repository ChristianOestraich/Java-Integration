package com.app.integrations;

import com.app.integrations.entities.HPCharacter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class TestHPCharacter
{
    @Autowired
    protected MockMvc mvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @Test
    public void save() throws Exception
    {
        String characterResp =
                        "{" +
                        "  \"name\": \"Harry Potter\"," +
                        "  \"alternate_names\": [" +
                        "  ]," +
                        "  \"species\": \"human\"," +
                        "  \"gender\": \"male\"," +
                        "  \"house\": \"Gryffindor\"," +
                        "  \"dateOfBirth\": \"31-07-1980\"," +
                        "  \"yearOfBirth\": 1980," +
                        "  \"wizard\": true," +
                        "  \"ancestry\": \"half-blood\"," +
                        "  \"eyeColour\": \"green\"," +
                        "  \"hairColour\": \"black\"," +
                        "  \"wand\": {" +
                        "    \"wood\": \"holly\"," +
                        "    \"core\": \"phoenix feather\"," +
                        "    \"length\": 11" +
                        "  }," +
                        "  \"patronus\": \"stag\"," +
                        "  \"hogwartsStudent\": true," +
                        "  \"hogwartsStaff\": false," +
                        "  \"actor\": \"Daniel Radcliffe\"," +
                        "  \"alternate_actors\": [" +
                        "  ]," +
                        "  \"alive\": true," +
                        "  \"image\": \"http://hp-api.herokuapp.com/images/harry.jpg\"" +
                        "}";

        final HPCharacter obj = objectMapper.readValue( characterResp, new TypeReference<HPCharacter>()
        {
        } );
        final String reqBody = objectMapper.writeValueAsString( obj );

        this.mvc.perform
        (
            MockMvcRequestBuilders
                    .post( "/api/characters/save" )
                    .contentType( MediaType.APPLICATION_JSON )
                    .content( reqBody )
        ) .andExpect( MockMvcResultMatchers.status().isOk() );
    }
}