package com.company.Iterator;

public class ThirdFloorIterator implements Iterator{
    Flat[] flats;
    int position = 0;

    public ThirdFloorIterator(Flat[] flats)
    {
        this.flats = flats;
    }

    @Override
    public boolean hasNext() {
        if (position >= flats.length) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Flat next() {
        if (!hasNext()){
            return null;
        }
        else {
            Flat nextFlat = flats[position];
            position += 1;
            return nextFlat;
        }
    }
}
