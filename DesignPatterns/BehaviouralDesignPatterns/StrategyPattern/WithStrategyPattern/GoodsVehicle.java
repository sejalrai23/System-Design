package DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern;

import DesignPatterns.BehaviouralDesignPatterns.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
  GoodsVehicle(){
    super(new NormalDriveStrategy());
  }
}
