package com.example.cryptos.network.cryptodetails;

import com.example.cryptos.model.cryptodetails.CryptoCoinDetails;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptosDetailsApiService {

    @GET("btc-bitcoin")
    Call<CryptoCoinDetails> getCryptoDetails();
}
