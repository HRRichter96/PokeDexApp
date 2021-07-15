package com.dynamicdevs.pokedexapp.model.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("supertype")
    @Expose
    private String supertype;
    @SerializedName("subtypes")
    @Expose
    private List<String> subtypes = null;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("hp")
    @Expose
    private String hp;
    @SerializedName("types")
    @Expose
    private List<String> types = null;
    @SerializedName("abilities")
    @Expose
    private List<Ability> abilities = null;
    @SerializedName("weaknesses")
    @Expose
    private List<Weakness> weaknesses = null;
    @SerializedName("resistances")
    @Expose
    private List<Resistance> resistances = null;
    @SerializedName("retreatCost")
    @Expose
    private List<String> retreatCost = null;
    @SerializedName("convertedRetreatCost")
    @Expose
    private int convertedRetreatCost;
    @SerializedName("set")
    @Expose
    private Set set;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("artist")
    @Expose
    private String artist;
    @SerializedName("rarity")
    @Expose
    private String rarity;
    @SerializedName("flavorText")
    @Expose
    private String flavorText;
    @SerializedName("nationalPokedexNumbers")
    @Expose
    private List<Integer> nationalPokedexNumbers = null;
    @SerializedName("legalities")
    @Expose
    private Legalities__1 legalities;
    @SerializedName("images")
    @Expose
    private Images__1 images;
    @SerializedName("tcgplayer")
    @Expose
    private Tcgplayer tcgplayer;
    @SerializedName("attacks")
    @Expose
    private List<Attack> attacks = null;
    @SerializedName("rules")
    @Expose
    private List<String> rules = null;
    @SerializedName("evolvesFrom")
    @Expose
    private String evolvesFrom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public List<String> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }

    public List<Resistance> getResistances() {
        return resistances;
    }

    public void setResistances(List<Resistance> resistances) {
        this.resistances = resistances;
    }

    public List<String> getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(List<String> retreatCost) {
        this.retreatCost = retreatCost;
    }

    public int getConvertedRetreatCost() {
        return convertedRetreatCost;
    }

    public void setConvertedRetreatCost(int convertedRetreatCost) {
        this.convertedRetreatCost = convertedRetreatCost;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public List<Integer> getNationalPokedexNumbers() {
        return nationalPokedexNumbers;
    }

    public void setNationalPokedexNumbers(List<Integer> nationalPokedexNumbers) {
        this.nationalPokedexNumbers = nationalPokedexNumbers;
    }

    public Legalities__1 getLegalities() {
        return legalities;
    }

    public void setLegalities(Legalities__1 legalities) {
        this.legalities = legalities;
    }

    public Images__1 getImages() {
        return images;
    }

    public void setImages(Images__1 images) {
        this.images = images;
    }

    public Tcgplayer getTcgplayer() {
        return tcgplayer;
    }

    public void setTcgplayer(Tcgplayer tcgplayer) {
        this.tcgplayer = tcgplayer;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

}
