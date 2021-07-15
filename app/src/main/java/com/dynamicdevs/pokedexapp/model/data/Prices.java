package com.dynamicdevs.pokedexapp.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prices {

    @SerializedName("holofoil")
    @Expose
    private Holofoil holofoil;
    @SerializedName("1stEditionHolofoil")
    @Expose
    private com.dynamicdevs.pokedexapp.model.data._1stEditionHolofoil _1stEditionHolofoil;
    @SerializedName("reverseHolofoil")
    @Expose
    private ReverseHolofoil reverseHolofoil;
    @SerializedName("normal")
    @Expose
    private Normal normal;
    @SerializedName("1stEditionNormal")
    @Expose
    private com.dynamicdevs.pokedexapp.model.data._1stEditionNormal _1stEditionNormal;

    public Holofoil getHolofoil() {
        return holofoil;
    }

    public void setHolofoil(Holofoil holofoil) {
        this.holofoil = holofoil;
    }

    public com.dynamicdevs.pokedexapp.model.data._1stEditionHolofoil get1stEditionHolofoil() {
        return _1stEditionHolofoil;
    }

    public void set1stEditionHolofoil(com.dynamicdevs.pokedexapp.model.data._1stEditionHolofoil _1stEditionHolofoil) {
        this._1stEditionHolofoil = _1stEditionHolofoil;
    }

    public ReverseHolofoil getReverseHolofoil() {
        return reverseHolofoil;
    }

    public void setReverseHolofoil(ReverseHolofoil reverseHolofoil) {
        this.reverseHolofoil = reverseHolofoil;
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    public com.dynamicdevs.pokedexapp.model.data._1stEditionNormal get1stEditionNormal() {
        return _1stEditionNormal;
    }

    public void set1stEditionNormal(com.dynamicdevs.pokedexapp.model.data._1stEditionNormal _1stEditionNormal) {
        this._1stEditionNormal = _1stEditionNormal;
    }

}
