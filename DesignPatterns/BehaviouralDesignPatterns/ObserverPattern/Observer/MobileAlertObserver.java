package DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer;

import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
  String username;
  StocksObservable observable;
  public MobileAlertObserver(String username , StocksObservable observable){
    this.username = username;
    this.observable = observable;
  }
  public void update(){
    sendMessageOnMobile(username , "Product is in stock hurry up!");
  }
  
  public void sendMessageOnMobile(String username , String msg){
    System.out.println("Message- sent" + username + msg);
  }
}
