package com.company;

public class Dot extends Figure{

    int x,y;
    public int getX()
    {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public Dot ()
    {
        x = 0;
        y = 0;
    }
    public Dot (int x,int y)
    {
        this.x = x;
       this.y = y;
    }


    public Dot (Dot dot)
    {
        this(dot.x, dot.y);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
    public String toString(){
        return "Dot: ("+x+", "+y+")";
    }
    {}
}
