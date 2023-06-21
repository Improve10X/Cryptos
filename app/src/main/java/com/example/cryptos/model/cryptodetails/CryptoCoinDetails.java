package com.example.cryptos.model.cryptodetails;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CryptoCoinDetails {
    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private Boolean isNew;
    @SerializedName("is_active")
    private Boolean isActive;
    private String type;
    private String logo;
    @SerializedName("tags")
    private ArrayList<Tag> tags;
    @SerializedName("team")
    private ArrayList<Team> teams;
    private String description;
    private String message;
    @SerializedName("open_source")
    private Boolean openSource;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("development_status")
    private String developmentStatus;
    @SerializedName("hardware_wallet")
    private Boolean hardwareWallet;
    @SerializedName("proof_type")
    private String proofType;
    @SerializedName("org_structure")
    private String orgStructure;
    @SerializedName("hash_algorithm")
    private String hashAlgorithm;
    private Link links;
    @SerializedName("links_extended")
    private ArrayList<LinkExtended> linksExtended;
    @SerializedName("whitepaper")
    private WhitePaper whitePaper;
    @SerializedName("first_data_at")
    private String firstDataAt;
    @SerializedName("last_data_at")
    private String lastDataAt;


}
