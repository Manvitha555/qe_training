package com.example;

public class bicycle {
public int tyres=2;
public int maxspeed=65;
}
public void applyBrake(int increment);
 public void speedUp(int decrement);

}
class Bicycle implements Bicycleparts{
    int speed=0;
     

    public int getSpeed(){
        return speed;

    }
}
class MountainBike extends bicycle implements Bicycleoperations{

}

}
