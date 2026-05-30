package util;

import java.util.ArrayList;

import model.Partida;
import model.time;

public class Dados {

    public static ArrayList<Time> times =
            new ArrayList<>();

    public static ArrayList<Partida> partidas =
            new ArrayList<>();

    static{

        times.add(new Time(
                "Natus Vincere",
                "CS2",
                "AleksiB",
                5
        ));

        times.add(new Time(
                "Team Vitality",
                "CS2",
                "apEX",
                5
        ));

        times.add(new Time(
                "Faze Clan",
                "CS2",
                "karrigan",
                5
        ));

        times.add(new Time(
                "G2 Esports",
                "CS2",
                "huNter",
                5
        ));

        times.add(new Time(
                "Team Spirit",
                "CS2",
                "chopper",
                5
        ));

        times.add(new Time(
                "MOUZ",
                "CS2",
                "Brollan",
                5
        ));

        times.add(new Time(
                "FURIA",
                "CS2",
                "FalleN",
                5
        ));

        times.add(new Time(
                "The Mongolz",
                "CS2",
                "blitz",
                5
        ));
    }
}