package com.company;

import com.company.Iterator.*;

public class Main {

    public static void printFlats(Iterator iterator)
    {
        while (iterator.hasNext()) {
            Flat nextFlat = (Flat)iterator.next();
            nextFlat.display();
        }
    }

    public static void main(String[] args) {
        FirstFloor firstFloor = new FirstFloor();
        SecondFloor secondFloor = new SecondFloor();
        ThirdFloor thirdFloor = new ThirdFloor();

        Iterator firstIterator = firstFloor.createIterator();
        Iterator secondIterator = secondFloor.createIterator();
        Iterator thirdIterator = thirdFloor.createIterator();

        System.out.println("*******First floor*******");
        printFlats(firstIterator);
        System.out.println("*******Second floor*******");
        printFlats(secondIterator);
        System.out.println("*******Third floor*******");
        printFlats(thirdIterator);
    }
}
