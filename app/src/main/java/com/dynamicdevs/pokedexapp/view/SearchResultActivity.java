package com.dynamicdevs.pokedexapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.dynamicdevs.pokedexapp.databinding.ActivityCardItemBinding;
import com.dynamicdevs.pokedexapp.databinding.ActivitySearchResultBinding;
import com.dynamicdevs.pokedexapp.model.data.Datum;
import com.dynamicdevs.pokedexapp.model.network.PokeRetrofit;
import com.dynamicdevs.pokedexapp.presenter.PokePresenter;
import com.dynamicdevs.pokedexapp.presenter.PresenterContract;
import com.dynamicdevs.pokedexapp.view.adapter.PokeAdapter;

import java.util.List;

public class SearchResultActivity extends AppCompatActivity implements PresenterContract.View, PokeAdapter.PokeDelegate{

    private ActivitySearchResultBinding binding;
    private PokeAdapter adapter = new PokeAdapter(this);
    private PokePresenter presenter;
    private PokeRetrofit pokeRetrofit = new PokeRetrofit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySearchResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = new PokePresenter(this,adapter);
        Bundle extras = getIntent().getExtras();
        String pokeQuery = extras.getString("POKE_DATA");
        binding.pokeRecyclerview.setAdapter(adapter);
        presenter.searchPoke(pokeQuery);



    }

    @Override
    public void displayResults(List<Datum> pokes) {
        adapter.setResults(pokes);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this,"An error has occured: " + message,Toast.LENGTH_LONG).show();
    }

    @Override
    public void selectImage(String url) {
        Intent intent = new Intent(this, ActivityCardItemBinding.class);
        intent.putExtra("URL_DATA", url);
        startActivity(intent);
    }
}
