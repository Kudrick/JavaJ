package com.company;

public class Circle extends Figure implements Scalable
{

    private Dot center;
    private int radius;
    {
        radius = 1;
    }
    public Circle()
    {
center = new Dot();
    }

    @Override
    public void draw() {

    }

    @Override
    public void scale(double s) {
        radius *= s;
    }
}
