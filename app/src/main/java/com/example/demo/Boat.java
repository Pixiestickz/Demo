package com.example.demo;

import android.graphics.Point;

import java.util.ArrayList;
import android.graphics.Point;

class Boat {
    private final int grid = 8;
    private int size;
    public int health;
    public ArrayList<Point> location;

    Boat(int shipClass){
        this.size = shipClass;
        this.health = size;
    }

    public void setLocation(int x, int y, String orientation){
        this.location = new ArrayList<Point>();
        Point p;

        for(int i=0;i<this.size;i++){
            if(x>grid || x<0 || y>grid || y<0){ // if the boat location lands outside the grid limits
                // output a warning here for out of bounds
                return; // returning an error here
            }

            p = new Point(x,y);

            // this snippet right here
            if(this.location.contains(p)){
                // output a warning
                return;
            }
            // end snippet

            this.location.add(p);

            if(orientation == "sideways")
                x++;
            else if (orientation == "vertical")
                y++;
        }

        return; // succesful return
    }

    public Boolean isSunk(){
        if(health == 0)
            return true;
        else
            return false;
    }

}
