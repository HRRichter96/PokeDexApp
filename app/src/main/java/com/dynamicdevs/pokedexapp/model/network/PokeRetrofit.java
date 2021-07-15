package com.dynamicdevs.pokedexapp.model.network;

import com.dynamicdevs.pokedexapp.model.data.PokeResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static com.dynamicdevs.pokedexapp.util.Constants.BASE_URL;
import static com.dynamicdevs.pokedexapp.util.Constants.END_POINT;
import static com.dynamicdevs.pokedexapp.util.Constants.SEARCH_QUERY;


public class PokeRetrofit {

    private PokeService PokeService = createRetrofit().create(PokeService.class);

    private Retrofit createRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    public Call<PokeResponse> getSearchResults(String query) throws NullPointerException {
        return PokeService.searchPoke(query);
    }

    interface PokeService {
        @GET(END_POINT)
        public Call<PokeResponse> searchPoke(@Query(SEARCH_QUERY) String query);

    }

}

