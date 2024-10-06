package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
  DriveStrategy driveObj;
  // this is known as constructor injection
  Vehicle (DriveStrategy driveObj) {
    this.driveObj = driveObj;
  }
  
  public void drive(){
    driveObj.drive();
  }
}
