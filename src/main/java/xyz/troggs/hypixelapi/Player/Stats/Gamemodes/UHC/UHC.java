package xyz.troggs.hypixelapi.Player.Stats.Gamemodes.UHC;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.UHC.Modes.DuoBrawl;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.UHC.Modes.Overall;
import xyz.troggs.hypixelapi.Player.Stats.Gamemodes.UHC.Modes.Solo;

public class UHC {
    private JSONObject json;

    public UHC(JSONObject json){
        try {
            this.json = (JSONObject) new JSONParser().parse(json.get("UHC").toString());
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
    }

    public int getCoins(){
        return Integer.parseInt(json.get("coins").toString());
    }

    public DuoBrawl getDuoBrawl(){
        return new DuoBrawl(json);
    }

    public Overall getOverall(){
        return new Overall(json);
    }

    public Solo getSolo(){
        return new Solo(json);
    }
}
