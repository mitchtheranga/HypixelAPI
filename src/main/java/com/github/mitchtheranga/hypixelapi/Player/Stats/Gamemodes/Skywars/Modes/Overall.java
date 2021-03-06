package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Skywars.Modes;

import org.json.simple.JSONObject;

public class Overall {
    private final JSONObject json;

    public Overall(JSONObject json){
        this.json = json;
    }

    public int getKills(){
        return Integer.parseInt(json.get("kills").toString());
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public int getAssists(){
        return Integer.parseInt(json.get("assists").toString());
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins").toString());
    }

    public int getLosses(){
        return Integer.parseInt(json.get("losses").toString());
    }
}
