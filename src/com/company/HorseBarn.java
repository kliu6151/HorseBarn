package com.company;

import java.util.ArrayList;
import java.util.List;

public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn (Horse[] spaces) {
        this.spaces = spaces;
    }

    public int findHorseSpace (String name) {
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] != null && name.equals(spaces[i].getName()))
                return i;
        }
        return -1;
    }

    public void consolidate() {
        Horse[] newSpaces = new Horse[this.spaces.length];
        int nextSpot = 0;
        for (Horse nextHorse : this.spaces) {
            if (nextHorse != null) {
                newSpaces[nextSpot] = nextHorse;
                nextSpot++;
            }
        }
        this.spaces = newSpaces;
    }

    public String toString(){
        String result = "";
        for(int i = 0;i<spaces.length;i++){
            if (spaces[i] != null)
                result = result + spaces[i].getName() + " is in space " + i + " and is a " + spaces[i].getHorse() + '\n';
            }
        return result;
        }
}
