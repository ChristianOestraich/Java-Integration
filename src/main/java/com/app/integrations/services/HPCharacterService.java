package com.app.integrations.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "http://hp-api.herokuapp.com/api/" , name = "hp-api")
public interface HPCharacterService {

    @GetMapping("/characters")
    String searchCharacters();

    @GetMapping("/characters/students")
    String searchStudents();

    @GetMapping("/characters/staff")
    String searchStaffMembers();

    @GetMapping("/characters/houses/{house}")
    String searchCharactersByHouse(@PathVariable String house);
}
