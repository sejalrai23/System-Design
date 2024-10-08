package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public interface EmployeeDao {
  public void create(String client , EmployeeDo emp) throws Exception;
  public void delete(String client , int empId) throws Exception;
  public EmployeeDo get(String client , EmployeeDo empId) throws Exception;
}
