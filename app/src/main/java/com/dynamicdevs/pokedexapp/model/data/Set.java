package com.dynamicdevs.pokedexapp.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Set {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("series")
    @Expose
    private String series;
    @SerializedName("printedTotal")
    @Expose
    private int printedTotal;
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("legalities")
    @Expose
    private Legalities legalities;
    @SerializedName("ptcgoCode")
    @Expose
    private String ptcgoCode;
    @SerializedName("releaseDate")
    @Expose
    private String releaseDate;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("images")
    @Expose
    private Images images;

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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getPrintedTotal() {
        return printedTotal;
    }

    public void setPrintedTotal(int printedTotal) {
        this.printedTotal = printedTotal;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Legalities getLegalities() {
        return legalities;
    }

    public void setLegalities(Legalities legalities) {
        this.legalities = legalities;
    }

    public String getPtcgoCode() {
        return ptcgoCode;
    }

    public void setPtcgoCode(String ptcgoCode) {
        this.ptcgoCode = ptcgoCode;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

}
