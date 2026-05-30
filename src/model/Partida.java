package model;

public class Partida {

    private Time time1;
    private Time time2;

    private int mapasTime1;
    private int mapasTime2;

    public Partida(Time time1,Time time2,int mapasTime1,int mapasTime2) {

        this.time1 = time1;
        this.time2 = time2;
        this.mapasTime1 = mapasTime1;
        this.mapasTime2a = mapasTime2;

        time1.registrarResultado(mapasTime1,mapasTime2);
        time2.registrarResultado(mapasTime2,mapasTime1);
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public Time getMapasTime1() {
        return time1;
    }

    public Time getMapasTime2() {
        return mapasTime2;
    }

    @override
    public String toString() {
        return time1.getNome() + " "
                + mapasTime1 + " x "
                + mapasTimes2 + " "
                + time2.getNome();
        
    }

}