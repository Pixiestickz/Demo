package com.example.demo;

public class Stats {
    private int hits, misses;
    private int gamesPlayed;
    private int wins, losses;
    private double wlr, hmr; // win/loss ratio and hit/miss ratio

    Stats(){
        this.hits = 0;
        this.misses = 0;
        this.gamesPlayed = 0;
        this.wins = 0;
        this.losses = 0;
        this.wlr = 0.0;
        this.hmr = 0.0;
    }

    // setters, sort of
    public void AddHit(){
        this.hits++;
    }
    public void AddMiss(){
        this.misses++;
    }
    public void AddWin(){
        this.wins++;
    }
    public void AddLoss(){
        this.losses++;
    }



    // getters
    public int wins(){
        return this.wins;
    }
    public int losses(){
        return this.losses;
    }
    public int hits(){
        return this.hits;
    }
    public int misses(){
        return this.misses;
    }
    public int gamesPlayed(){
        return this.gamesPlayed;
    }

    // setters/resetters
    public double WinLossRatio(Stats track){
        if(track.losses != 0)
            track.wlr = (double)(track.wins()/track.losses());
        else
            track.wlr = (double) track.wins();

        return track.wlr;
    }

    public double HitMissRatio(Stats track){
        if(track.misses() != 0)
            track.hmr = (double)(track.hits()/track.misses());
        else
            track.hmr = (double) track.hits();

        return track.hmr;
    }

    // StatWipe function to allow players to reset their stats
    public void StatWipe(Stats wipe){
        wipe = new Stats();
    }

    // At some point perhaps the Stats Page display here
}
