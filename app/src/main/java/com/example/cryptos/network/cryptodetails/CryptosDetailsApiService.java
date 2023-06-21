package com.example.cryptos.network.cryptodetails;

import com.example.cryptos.model.cryptodetails.CryptoCoinDetails;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CryptosDetailsApiService {

    @GET("coins/{id}")
    Call<CryptoCoinDetails> getCryptoDetails(@Path("id") String id);
}
