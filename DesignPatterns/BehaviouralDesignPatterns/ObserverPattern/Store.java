package DesignPatterns.BehaviouralDesignPatterns.ObserverPattern;

import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable.IphoneObservable;
import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer.EmailAlertObserver;
import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer.MobileAlertObserver;
import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
  public static void main() {
    StocksObservable iphoneStock = new IphoneObservable();
    NotificationAlertObserver obv1 = new EmailAlertObserver("abc@gmail.com", iphoneStock);
    NotificationAlertObserver obv2 = new EmailAlertObserver("abc@gmail.com", iphoneStock);
    NotificationAlertObserver obv3 = new MobileAlertObserver("sejalrai23", iphoneStock);
    iphoneStock.add(obv1);
    iphoneStock.add(obv2);
    iphoneStock.add(obv3);
    iphoneStock.setStockCount(10);
  }
}
