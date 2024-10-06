package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
   PassengerVehicle(){
    super(new NormalDriveStrategy());
  }
}
