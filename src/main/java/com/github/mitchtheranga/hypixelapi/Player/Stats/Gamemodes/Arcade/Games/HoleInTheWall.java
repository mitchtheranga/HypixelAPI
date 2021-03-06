package com.github.mitchtheranga.hypixelapi.Player.Stats.Gamemodes.Arcade.Games;

import org.json.simple.JSONObject;

public class HoleInTheWall {
    private final JSONObject json;

    public HoleInTheWall(JSONObject json){
        this.json = json;
    }

    public int getWins(){
        return Integer.parseInt(json.get("wins_hole_in_the_wall").toString());
    }

    public int getRounds(){
        return Integer.parseInt(json.get("rounds_hole_in_the_wall").toString());
    }
}
