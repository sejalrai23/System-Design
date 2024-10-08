package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class Main {
  public static void main(String args[]){
    try{
      EmployeeDao empObj = new EmployeeDaoProxy();
      empObj.create("USER", new EmployeeDo());
      System.out.println("operation successful");
    }catch (Exception e){
      System.out.println("operation failed - " + e.getMessage());
    }
  }
}
