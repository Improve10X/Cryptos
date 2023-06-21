package com.example.cryptos.network.cryptodetails;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CryptosDetailsApi {

    public CryptosDetailsApiService createCryptosDetailsApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinpaprika.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CryptosDetailsApiService cryptosDetailsApiService = retrofit.create(CryptosDetailsApiService.class);
        return cryptosDetailsApiService;
    }
}
