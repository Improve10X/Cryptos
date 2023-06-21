package com.example.cryptos.cryptodetails;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.CryptoDetailsItemBinding;

public class CryptoDetailsViewHolder extends RecyclerView.ViewHolder {

    CryptoDetailsItemBinding binding;

    public CryptoDetailsViewHolder(CryptoDetailsItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
