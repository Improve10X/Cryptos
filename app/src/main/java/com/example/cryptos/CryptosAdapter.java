package com.example.cryptos;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.CryptosItemBinding;

import java.util.ArrayList;
import java.util.List;

public class CryptosAdapter extends RecyclerView.Adapter<CryptoViewHolder> {

    private List<CryptoCoin> cryptoCoinList;

    void setCryptosList(List<CryptoCoin> cryptoCoinList) {
        this.cryptoCoinList = cryptoCoinList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CryptoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptosItemBinding binding = CryptosItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        CryptoViewHolder cryptoViewHolder = new CryptoViewHolder(binding);
        return cryptoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoViewHolder holder, int position) {
        CryptoCoin cryptoCoin = cryptoCoinList.get(position);
        holder.binding.setCryptoCoin(cryptoCoin);
    }

    @Override
    public int getItemCount() {
        return cryptoCoinList.size();
    }
}