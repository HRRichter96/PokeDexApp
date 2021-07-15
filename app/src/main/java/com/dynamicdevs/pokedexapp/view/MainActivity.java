package com.dynamicdevs.pokedexapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.dynamicdevs.pokedexapp.R;
import com.dynamicdevs.pokedexapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String searchQuery = "";
    String modif = "name";

    private ActivityMainBinding binding;


    private String[] options = {
            "Name",
            "Number",
            "Types"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pokeSpinner.setAdapter(new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.search_spinner, options));
        binding.pokeSpinner.setSelection(0);

        binding.pokeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(options[i].equals("Name")){
                    modif = "name";
                    binding.tipTextview.setVisibility(View.INVISIBLE);
                }else if (options[i].equals("Number")){
                    modif = "nationalPokedexNumbers";
                    binding.tipTextview.setVisibility(View.VISIBLE);
                }else {
                    modif = "types";
                    binding.tipTextview.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //do nothing
            }
        });


        binding.searchButton.setOnClickListener(view -> {
            searchQuery = modif + ":" + binding.searchBarEdittext.getText().toString();
            Intent intent = new Intent(this, SearchResultActivity.class);
            intent.putExtra("POKE_DATA", searchQuery);
            startActivity(intent);
        });
    }
}