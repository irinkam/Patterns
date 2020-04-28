package com.company.Iterator;

import java.util.LinkedList;

public class SecondFloor {
    LinkedList flats;

    public SecondFloor()
    {
        flats = new LinkedList();

        addFlat(7, 70);
        addFlat(8, 60);
        addFlat(9, 50);
    }

    public void addFlat(int number, double square)
    {
        Flat flat = new Flat(number, square);
        flats.add(flat);
    }

    public Iterator createIterator(){
        return new SecondFloorIterator(flats);
    }
}
