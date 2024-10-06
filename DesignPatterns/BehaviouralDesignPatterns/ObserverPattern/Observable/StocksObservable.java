package DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable;

import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
  public void add(NotificationAlertObserver obs);
  public void remove(NotificationAlertObserver obs);
  public void notifySubscribers();
  public void setStockCount(int newStockCount);
  public int getStockCount();
}
