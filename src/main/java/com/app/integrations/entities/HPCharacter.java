package com.app.integrations.entities;

import java.util.List;

public class HPCharacter {

    private String name;
    private List<String> alternate_names;
    private String species;
    private String gender;
    private String house;
    private String dateOfBirth;
    private Integer yearOfBirth;
    private Boolean wizard;
    private String ancestry;
    private String eyeColour;
    private String hairColour;
    private Wand wand;
    private String patronus;
    private Boolean hogwartsStudent;
    private Boolean hogwartsStaff;
    private String actor;
    private List<String> alternate_actors;
    private Boolean alive;
    private String image;

    public HPCharacter(String name, List<String> alternate_names, String species, String gender, String house, String dateOfBirth, Integer yearOfBirth, Boolean wizard, String ancestry, String eyeColour, String hairColour, Wand wand, String patronus, Boolean hogwartsStudent, Boolean hogwartsStaff, String actor, List<String> alternate_actors, Boolean alive, String image) {
        this.name = name;
        this.alternate_names = alternate_names;
        this.species = species;
        this.gender = gender;
        this.house = house;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.wizard = wizard;
        this.ancestry = ancestry;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.wand = wand;
        this.patronus = patronus;
        this.hogwartsStudent = hogwartsStudent;
        this.hogwartsStaff = hogwartsStaff;
        this.actor = actor;
        this.alternate_actors = alternate_actors;
        this.alive = alive;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAlternate_names() {
        return alternate_names;
    }

    public void setAlternate_names(List<String> alternate_names) {
        this.alternate_names = alternate_names;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Boolean getWizard() {
        return wizard;
    }

    public void setWizard(Boolean wizard) {
        this.wizard = wizard;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public Boolean getHogwartsStudent() {
        return hogwartsStudent;
    }

    public void setHogwartsStudent(Boolean hogwartsStudent) {
        this.hogwartsStudent = hogwartsStudent;
    }

    public Boolean getHogwartsStaff() {
        return hogwartsStaff;
    }

    public void setHogwartsStaff(Boolean hogwartsStaff) {
        this.hogwartsStaff = hogwartsStaff;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public List<String> getAlternate_actors() {
        return alternate_actors;
    }

    public void setAlternate_actors(List<String> alternate_actors) {
        this.alternate_actors = alternate_actors;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
