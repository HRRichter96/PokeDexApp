package com.dynamicdevs.pokedexapp.presenter;

import com.dynamicdevs.pokedexapp.model.data.Datum;

import java.util.List;

public interface PresenterContract {

    interface Presenter {
        public void searchPoke(String query);
    }

    interface View {
        public void displayResults(List<Datum> pokes);
        public void showError(String message);
    }


}
