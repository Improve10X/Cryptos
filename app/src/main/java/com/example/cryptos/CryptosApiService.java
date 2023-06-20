package com.example.cryptos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptosApiService {
    @GET("v1/coins")
    Call<List<CryptoCoin>> getCryptoCoins();
}
