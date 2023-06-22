package com.example.cryptos.cryptodetails;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.CryptoTeamMemberItemBinding;

public class CryptoTeamMemberViewHolder extends RecyclerView.ViewHolder {

    CryptoTeamMemberItemBinding binding;

    public CryptoTeamMemberViewHolder(CryptoTeamMemberItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
