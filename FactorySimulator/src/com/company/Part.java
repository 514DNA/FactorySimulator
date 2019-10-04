package com.company;

public class Part {
    private String kind;
    private int num;
    public Part(String kind_,int num_)
    {
        this.kind = kind_;
        this.num = num_;
    }
    public String GetKind()
    {
        return this.kind;
    }
    public int GetNum()
    {
        return this.num;
    }
}
