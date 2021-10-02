package Player.Stats;

import org.json.simple.JSONObject;
import Player.Stats.Gamemodes.*;
import Player.Stats.Gamemodes.Arcade.Arcade;
import Player.Stats.Gamemodes.Bedwars.Bedwars;
import Player.Stats.Gamemodes.Blitz;
import Player.Stats.Gamemodes.BuildBattle;
import Player.Stats.Gamemodes.Duels.Duels;
import Player.Stats.Gamemodes.MurderMystery.MurderMystery;
import Player.Stats.Gamemodes.Skywars.Skywars;
import Player.Stats.Gamemodes.UHC.UHC;

public class Stats {

    public JSONObject json;

    public Stats(JSONObject json){
        this.json = json;
    }

    public Arcade getArcade() {
        return new Arcade(json);
    }

    public Bedwars getBedwars() {
        return new Bedwars(json);
    }

    public Blitz getBlitz(){
        return new Blitz(json);
    }

    public BuildBattle getBuildBattle(){
        return new BuildBattle(json);
    }

    public Duels getDuels() {
        return new Duels(json);
    }

    public MegaWalls getMegaWalls() {
        return new MegaWalls(json);
    }

    public MurderMystery getMurderMystery() {
        return new MurderMystery(json);
    }

    public Skywars getSkywars() {
        return new Skywars(json);
    }

    public Smash getSmash() {
        return new Smash(json);
    }

    public SpeedUHC getSpeedUHC() {
        return new SpeedUHC(json);
    }

    public UHC getUHC() {
        return new UHC(json);
    }

    public TNT getTNT() {
        return new TNT(json);
    }

    public CopsAndCrims getCopsAndCrims() {
        return new CopsAndCrims(json);
    }

}