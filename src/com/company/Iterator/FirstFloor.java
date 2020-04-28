package com.company.Iterator;

import java.util.ArrayList;

public class FirstFloor {
    ArrayList flats;

    public FirstFloor()
    {
        flats = new ArrayList();

        addFlat(1, 65);
        addFlat(2, 76);
        addFlat(3, 54);
    }

    public void addFlat(int number, double square)
    {
        Flat flat = new Flat(number, square);
        flats.add(flat);
    }

    public Iterator createIterator(){
        return new FirstFloorIterator(flats);
    }
}
