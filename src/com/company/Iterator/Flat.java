package com.company.Iterator;

public class Flat {
    private int number;
    private double square;

    public Flat(int number, double square)
    {
        this.number = number;
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public int getNumber() {
        return number;
    }

    public void display()
    {
        System.out.println("Flat number " + number + " has " + square + " m²");
    }
}
