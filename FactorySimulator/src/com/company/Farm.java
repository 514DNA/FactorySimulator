package com.company;

public class Farm {
    String name;
    int id;
    Factory factory;
    public Farm(String name_,int id_,Factory factory_)
    {
        this.name = name_;
        this.id = id_;
        this.factory = factory_;
    }
    public String Getname()
    {
        return name;
    }
    public int Getinfo()
    {
        return id;
    }
}
