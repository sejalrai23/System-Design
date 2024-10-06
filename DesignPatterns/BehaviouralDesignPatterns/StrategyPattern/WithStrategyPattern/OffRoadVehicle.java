package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
  OffRoadVehicle(){
    super(new SportsDriveStrategy());
  }
}
