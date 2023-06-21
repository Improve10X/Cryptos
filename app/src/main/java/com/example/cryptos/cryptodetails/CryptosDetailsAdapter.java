package com.example.cryptos.cryptodetails;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.CryptoDetailsItemBinding;
import com.example.cryptos.model.cryptodetails.CryptoCoinDetails;
import com.example.cryptos.model.cryptodetails.Tag;

import java.util.List;

public class CryptosDetailsAdapter extends RecyclerView.Adapter<CryptoDetailsViewHolder> {

    private List<Tag> tags;

    void setCryptoCoinDetails(List<Tag> tags) {
        this.tags = tags;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CryptoDetailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptoDetailsItemBinding binding = CryptoDetailsItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        CryptoDetailsViewHolder cryptoDetailsViewHolder = new CryptoDetailsViewHolder(binding);
        return cryptoDetailsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoDetailsViewHolder holder, int position) {
        Tag tag = tags.get(position);
        holder.binding.setTag(tag);
    }

    @Override
    public int getItemCount() {
        return tags.size();
    }
}
