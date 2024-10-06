package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
  SportsVehicle(){
    super(new SportsDriveStrategy());
  }
}
