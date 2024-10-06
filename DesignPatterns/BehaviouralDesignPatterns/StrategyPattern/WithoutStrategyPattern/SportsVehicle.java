package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithoutStrategyPattern;

public class SportsVehicle {
  public void drive(){
    System.out.println("sports drive capability");  // code is repeating in sports and offRoad , hence we will use strategy design pattern
   }
}
