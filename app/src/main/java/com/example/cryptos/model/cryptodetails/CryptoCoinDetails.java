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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getOpenSource() {
        return openSource;
    }

    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getDevelopmentStatus() {
        return developmentStatus;
    }

    public void setDevelopmentStatus(String developmentStatus) {
        this.developmentStatus = developmentStatus;
    }

    public Boolean getHardwareWallet() {
        return hardwareWallet;
    }

    public void setHardwareWallet(Boolean hardwareWallet) {
        this.hardwareWallet = hardwareWallet;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public String getOrgStructure() {
        return orgStructure;
    }

    public void setOrgStructure(String orgStructure) {
        this.orgStructure = orgStructure;
    }

    public String getHashAlgorithm() {
        return hashAlgorithm;
    }

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }

    public ArrayList<LinkExtended> getLinksExtended() {
        return linksExtended;
    }

    public void setLinksExtended(ArrayList<LinkExtended> linksExtended) {
        this.linksExtended = linksExtended;
    }

    public WhitePaper getWhitePaper() {
        return whitePaper;
    }

    public void setWhitePaper(WhitePaper whitePaper) {
        this.whitePaper = whitePaper;
    }

    public String getFirstDataAt() {
        return firstDataAt;
    }

    public void setFirstDataAt(String firstDataAt) {
        this.firstDataAt = firstDataAt;
    }

    public String getLastDataAt() {
        return lastDataAt;
    }

    public void setLastDataAt(String lastDataAt) {
        this.lastDataAt = lastDataAt;
    }

    @SerializedName("last_data_at")
    private String lastDataAt;


}
