package com.dynamicdevs.pokedexapp.presenter;


import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.dynamicdevs.pokedexapp.model.data.PokeResponse;
import com.dynamicdevs.pokedexapp.model.network.PokeRetrofit;
import com.dynamicdevs.pokedexapp.view.adapter.PokeAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PokePresenter extends AppCompatActivity implements PresenterContract.Presenter {

    private PokeAdapter adapter;
    private PokeRetrofit pokeRetrofit = new PokeRetrofit();
    private PresenterContract.View view;

    public PokePresenter(PresenterContract.View view, PokeAdapter adapter){
        this.view = view;
        this.adapter = adapter;
    }

    @Override
    public void searchPoke(String query) {
        pokeRetrofit.getSearchResults(query)
                .enqueue(new Callback<PokeResponse>() {
                    @Override
                    public void onResponse(Call<PokeResponse> call, Response<PokeResponse> response) throws NullPointerException {
                        Log.d("TAG_X", " " + call.request().url());
                        adapter.setResults(response.body().getData());
                        view.displayResults(response.body().getData());
                    }

                    @Override
                    public void onFailure(Call<PokeResponse> call, Throwable t) throws NullPointerException {
                        Log.d("TAG_X", " Response failed " + call.request().url());
                    }
                });
    }
}
