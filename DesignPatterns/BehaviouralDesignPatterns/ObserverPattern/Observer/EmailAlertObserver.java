package DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer;

import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
   String emailId;
  StocksObservable observable;
  public EmailAlertObserver(String emailId , StocksObservable observable){
    this.emailId = emailId;
    this.observable = observable;
  }
  public void update(){
    sendMessageOnEmail(emailId , "Product is in stock hurry up!");
  }
  
  public void sendMessageOnEmail(String emailId , String msg){
    System.out.println("email- sent" + emailId + msg);
  }
}
