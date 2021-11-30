package com.example.demo;

import android.graphics.Point;

import com.example.demo.Boat;

import android.graphics.Point;

class Ocean{
    private final int grid = 8;
    public Point [][] ocean;
    public int numBoats;
    private Boat [] boats;
    public Boolean [][] markShot;

    Ocean(){
        this.ocean = new Point[grid][grid];

        this.numBoats = 5;
        this.boats = new Boat[numBoats];
        for(int i=0;i<5;i++){
            this.boats[i] = new Boat(i);
        }
        this.markShot = new Boolean[grid][grid];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                markShot[i][j] = false;
                ocean[i][j] = new Point(i, j);
            }
        }
    }

    public void setBoat(int size, Point head, String orientation){
        this.boats[size].setLocation(head.x, head.y, orientation);
    }

    public void fire(Point target){
        for(int i=0;i<5;i++){
            if(boats[i].location.contains(target)){ // HIT
                // Output a hit here
                markShot[target.x][target.y] = true;
                this.boats[i].location.remove(target);
                // Add hit to StatTrack
                DamageReport(boats[i]);
                return;
            }
        }
        // MISS
        // Add miss to StatTrack
        return;
    }

    private void DamageReport(Boat ship){
        ship.health--;
        if(ship.isSunk()){
            numBoats--;
            if(numBoats == 0){
                // end the game, and the other player wins
                // Add loss to StatTrack
            }
        }
        else{
            return;
        }
    }

}