package com.example.cryptos.cryptocoins;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.cryptodetails.OnItemActionListener;
import com.example.cryptos.databinding.CryptosItemBinding;
import com.example.cryptos.model.cryptoncoin.CryptoCoin;

import java.util.List;

public class CryptosAdapter extends RecyclerView.Adapter<CryptoViewHolder> {

    private List<CryptoCoin> cryptoCoinList;

    private OnItemActionListener onItemActionListener;

    void setCryptosList(List<CryptoCoin> cryptoCoinList) {
        this.cryptoCoinList = cryptoCoinList;
        notifyDataSetChanged();
    }

    void setOnItemActionListener(OnItemActionListener onItemActionListener) {
        this.onItemActionListener = onItemActionListener;
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
        holder.binding.getRoot().setOnClickListener(v -> {
            onItemActionListener.onClick(cryptoCoin.getId());
        });
    }

    @Override
    public int getItemCount() {
        return cryptoCoinList.size();
    }
}