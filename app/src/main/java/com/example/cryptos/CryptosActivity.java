package com.example.cryptos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.cryptos.databinding.ActivityCryptosBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptosActivity extends AppCompatActivity {

    private ActivityCryptosBinding binding;
    private List<CryptoCoin> cryptoCoins = new ArrayList<>();
    private CryptosAdapter cryptosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Cryptos");
        getCryptoCoins();
        setupAdapter();
        setupRecyclerView();
    }

    private void getCryptoCoins() {
        CryptosApi cryptosApi = new CryptosApi();
        CryptosApiService cryptosApiService = cryptosApi.createCryptosApiService();
        Call <List<CryptoCoin>> call = cryptosApiService.getCryptoCoins();
        call.enqueue(new Callback<List<CryptoCoin>>() {
            @Override
            public void onResponse(Call<List<CryptoCoin>> call, Response<List<CryptoCoin>> response) {
                List<CryptoCoin> coins = response.body();
                cryptosAdapter.setCryptosList(coins);
            }

            @Override
            public void onFailure(Call<List<CryptoCoin>> call, Throwable t) {

            }
        });
    }

    private void setupRecyclerView() {
        binding.cryptosRv.setLayoutManager(new LinearLayoutManager(this));
        binding.cryptosRv.setAdapter(cryptosAdapter);
    }

    private void setupAdapter() {
        cryptosAdapter = new CryptosAdapter();
        cryptosAdapter.setCryptosList(cryptoCoins);
    }
}