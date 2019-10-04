package com.company;

import java.util.ArrayList;

public class Factory {
    private String name;
    private String info;
    private ArrayList<Farm> farms = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();

    public Factory()
    {
        this.name = "deep dark fantasy";
        this.info = "boy next door";
    }
    public Factory(String name_,String info_)
    {
        this.name = name_;
        this.info = info_;
    }
    public String Getname()
    {
        return name;
    }
    public String Getinfo()
    {
        return info;
    }
    public void AddFarm()
    {
        int len = farms.size();
        farms.add(new Farm( String.valueOf(len + 1),len + 1,this));
    }
    public void AddFarms(int num_)
    {
        int i;
        for(i = 0;i < num_;i++)
            this.AddFarm();
    }
    public void PrintFarm()
    {
        int len = farms.size();
        int i;
        for(i = 0;i < len;i++)
            System.out.println(farms.get(i).name);
    }

}
