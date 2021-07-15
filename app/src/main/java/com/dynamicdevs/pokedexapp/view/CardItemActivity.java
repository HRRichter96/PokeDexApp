package com.dynamicdevs.pokedexapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dynamicdevs.pokedexapp.R;
import com.dynamicdevs.pokedexapp.databinding.ActivityCardItemBinding;

public class CardItemActivity extends AppCompatActivity {

    private ActivityCardItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCardItemBinding.inflate(getLayoutInflater());
        Intent intent = getIntent();
        String url = getIntent().getExtras().get("URL_DATA").toString();
        Glide.with(binding.getRoot())
                .applyDefaultRequestOptions(RequestOptions.centerCropTransform())
                .load(url)
                .into(binding.zoomImageview);
        setContentView(binding.getRoot());
    }
}