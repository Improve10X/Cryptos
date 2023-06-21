package com.example.cryptos.cryptocoins;

import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.ActivityCryptosBinding;
import com.example.cryptos.databinding.CryptosItemBinding;

public class CryptoViewHolder extends RecyclerView.ViewHolder {

    CryptosItemBinding binding;

    public CryptoViewHolder(CryptosItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
