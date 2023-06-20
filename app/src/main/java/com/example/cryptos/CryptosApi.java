package com.example.cryptos;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CryptosApi {
    public CryptosApiService createCryptosApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinpaprika.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(CryptosApiService.class);
    }
}
