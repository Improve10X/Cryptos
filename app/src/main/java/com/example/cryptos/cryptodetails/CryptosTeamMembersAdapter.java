package com.example.cryptos.cryptodetails;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cryptos.databinding.CryptoTeamMemberItemBinding;
import com.example.cryptos.model.cryptodetails.Team;

import java.util.List;

public class CryptosTeamMembersAdapter extends RecyclerView.Adapter<CryptoTeamMemberViewHolder> {

    private List<Team> teams;

    void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @NonNull
    @Override
    public CryptoTeamMemberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CryptoTeamMemberItemBinding binding = CryptoTeamMemberItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        CryptoTeamMemberViewHolder cryptoTeamMemberViewHolder = new CryptoTeamMemberViewHolder(binding);
        return cryptoTeamMemberViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoTeamMemberViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.binding.setTeam(team);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }
}
