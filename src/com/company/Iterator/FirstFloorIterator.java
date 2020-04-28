package com.company.Iterator;

import java.util.ArrayList;

public class FirstFloorIterator implements Iterator {
    ArrayList flats;
    int position;

    public  FirstFloorIterator(ArrayList flats)
    {
        this.flats = flats;
    }

    @Override
    public boolean hasNext() {
        if (position >= flats.size()) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Flat next() {
        if (!hasNext()) {
            return null;
        }
        else {
            Flat nextFlat = (Flat) flats.get(position);
            position += 1;
            return nextFlat;
        }
    }
}
