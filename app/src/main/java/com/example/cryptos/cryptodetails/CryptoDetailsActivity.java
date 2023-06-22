package com.example.cryptos.cryptodetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.cryptos.databinding.ActivityCryptoDetailsBinding;
import com.example.cryptos.model.cryptodetails.CryptoCoinDetails;
import com.example.cryptos.model.cryptodetails.Tag;
import com.example.cryptos.model.cryptodetails.Team;
import com.example.cryptos.network.cryptodetails.CryptosDetailsApi;
import com.example.cryptos.network.cryptodetails.CryptosDetailsApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoDetailsActivity extends AppCompatActivity {

    private ActivityCryptoDetailsBinding binding;
    private ArrayList<Tag> tags = new ArrayList<>();
    private CryptosDetailsAdapter cryptosDetailsAdapter;
    private CryptosTeamMembersAdapter cryptosTeamMembersAdapter;
    private ArrayList<Team> teams = new ArrayList<>();
    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCryptoDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (getIntent().hasExtra("id")) {
            id = getIntent().getStringExtra("id");
        }
        getTeamMembers();
        getCryptosDetails();
        setupAdapter();
        setupTeamMemberAdapter();
        setupRv();
        teamMemberRv();
    }

    private void getCryptosDetails() {
        CryptosDetailsApi cryptosDetailsApi = new CryptosDetailsApi();
        CryptosDetailsApiService cryptosDetailsApiService = cryptosDetailsApi.createCryptosDetailsApiService();
        Call<CryptoCoinDetails> call = cryptosDetailsApiService.getCryptoDetails(id);
        call.enqueue(new Callback<CryptoCoinDetails>() {
            @Override
            public void onResponse(Call<CryptoCoinDetails> call, Response<CryptoCoinDetails> response) {
                CryptoCoinDetails cryptoCoinDetailsCall = response.body();
                cryptosDetailsAdapter.setCryptoCoinDetails(cryptoCoinDetailsCall.getTags());
                binding.setCryptoDetails(cryptoCoinDetailsCall);
            }

            @Override
            public void onFailure(Call<CryptoCoinDetails> call, Throwable t) {

            }
        });
    }

    private void getTeamMembers() {
        CryptosDetailsApi cryptosDetailsApi = new CryptosDetailsApi();
        CryptosDetailsApiService cryptosDetailsApiService = cryptosDetailsApi.createCryptosDetailsApiService();
        Call<CryptoCoinDetails> call = cryptosDetailsApiService.getCryptoDetails(id);
        call.enqueue(new Callback<CryptoCoinDetails>() {
            @Override
            public void onResponse(Call<CryptoCoinDetails> call, Response<CryptoCoinDetails> response) {
                List<Team> teamList = response.body().getTeams();
                cryptosTeamMembersAdapter.setTeams(teamList);
            }

            @Override
            public void onFailure(Call<CryptoCoinDetails> call, Throwable t) {
            }
        });
    }

    private void setupRv() {
        binding.cryptoDetailsRv.setLayoutManager(new GridLayoutManager(this, 3));
        binding.cryptoDetailsRv.setAdapter(cryptosDetailsAdapter);
    }

    private void setupAdapter() {
        cryptosDetailsAdapter = new CryptosDetailsAdapter();
        cryptosDetailsAdapter.setCryptoCoinDetails(tags);
    }

    private void setupTeamMemberAdapter() {
        cryptosTeamMembersAdapter = new CryptosTeamMembersAdapter();
        cryptosTeamMembersAdapter.setTeams(teams);
    }

    private void teamMemberRv() {
        binding.teamMemberRv.setLayoutManager(new LinearLayoutManager(this));
        binding.teamMemberRv.setAdapter(cryptosTeamMembersAdapter);
    }
}