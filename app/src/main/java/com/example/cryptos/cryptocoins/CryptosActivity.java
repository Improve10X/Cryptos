package com.example.cryptos.cryptocoins;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.cryptos.cryptodetails.CryptoDetailsActivity;
import com.example.cryptos.cryptodetails.OnItemActionListener;
import com.example.cryptos.databinding.ActivityCryptosBinding;
import com.example.cryptos.model.cryptoncoin.CryptoCoin;
import com.example.cryptos.network.cryptocoin.CryptosApi;
import com.example.cryptos.network.cryptocoin.CryptosApiService;

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
        cryptosAdapter.setOnItemActionListener(new OnItemActionListener() {
            @Override
            public void onClick(String id) {
                handleItemClick(id);
            }
        });
    }

    private void handleItemClick(String id) {
        Intent intent = new Intent(this, CryptoDetailsActivity.class);
        intent.putExtra("id", id);
        startActivity(intent);
    }
}