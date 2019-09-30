package com.company;

import javax.swing.*;

public class Main {

    public static Factory CreateFactory()
    {
        return new Factory();
    }
    public static void main(String[] args) {
	// write your code here
        Factory fac = CreateFactory();
        System.out.println(fac.Getname());
        fac.AddFarms(3);
        fac.PrintFarm();


    }
}
