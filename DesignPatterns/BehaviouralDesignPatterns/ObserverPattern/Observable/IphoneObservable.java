package DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observable;
import java.util.*;

import DesignPatterns.BehaviouralDesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservable implements StocksObservable{
  public List<NotificationAlertObserver> observerList = new ArrayList<>();
  public int stockCount = 0;
  
  
  public void add(NotificationAlertObserver obs){
    observerList.add(obs);
  }
  
  public void remove(NotificationAlertObserver obs){
    observerList.remove(obs);
  }
  
  public void notifySubscribers(){
    for(NotificationAlertObserver obs : observerList){
      obs.update();
    }
  }
  
  public void setStockCount(int newCount){
    if(stockCount == 0){
      notifySubscribers();   // new stock has come notify all subscribers
    }
    stockCount += newCount; 
  }
  
  public int getStockCount(){
    return stockCount;
  }
}
