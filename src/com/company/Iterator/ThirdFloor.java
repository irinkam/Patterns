package com.company.Iterator;

public class ThirdFloor {
    static final int MAX_FLATS = 3;
    int numberOfItems = 0;
    Flat[] flats;

    public ThirdFloor()
    {
        flats = new Flat[MAX_FLATS];

        addFlat(4, 58);
        addFlat(5, 80);
        addFlat(6, 50);
    }
    public void addFlat(int number, double square)
    {
        if (numberOfItems >= MAX_FLATS) {
            System.out.println("Too much flats on the floor");
        }
        else {
            Flat flat = new Flat(number, square);
            flats[numberOfItems] = flat;
            numberOfItems++;
        }
    }

    public Iterator createIterator(){
        return new ThirdFloorIterator(flats);
    }
}
