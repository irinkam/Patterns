package com.company.Iterator;

import java.util.LinkedList;

public class SecondFloorIterator implements Iterator {
    LinkedList flats;
    int position;

    public SecondFloorIterator(LinkedList flats)
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
            Flat nextFlat = (Flat)flats.get(position);
            position+=1;
            return nextFlat;
        }
    }
}
