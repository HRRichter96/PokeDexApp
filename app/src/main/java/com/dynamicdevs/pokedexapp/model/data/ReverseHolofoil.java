package com.dynamicdevs.pokedexapp.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReverseHolofoil {

    @SerializedName("low")
    @Expose
    private double low;
    @SerializedName("mid")
    @Expose
    private double mid;
    @SerializedName("high")
    @Expose
    private double high;
    @SerializedName("market")
    @Expose
    private double market;
    @SerializedName("directLow")
    @Expose
    private Object directLow;

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getMarket() {
        return market;
    }

    public void setMarket(double market) {
        this.market = market;
    }

    public Object getDirectLow() {
        return directLow;
    }

    public void setDirectLow(Object directLow) {
        this.directLow = directLow;
    }

}
