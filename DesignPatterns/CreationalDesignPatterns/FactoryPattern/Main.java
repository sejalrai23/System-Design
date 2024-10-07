package DesignPatterns.CreationalDesignPatterns.FactoryPattern;

public class Main {
  public static void main(String args[]){
    ShapeFactory s = new ShapeFactory();
    Shape shape = s.getShape("CIRCLE");
    shape.draw();
  }
}
