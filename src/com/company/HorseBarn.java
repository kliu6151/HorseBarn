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
            if (spaces[i] != null && name.equals(spaces[i]))
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
}
