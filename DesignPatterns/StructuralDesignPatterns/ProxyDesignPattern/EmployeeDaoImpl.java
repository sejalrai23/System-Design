package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {
  public void create(String client , EmployeeDo emp) throws Exception{
    System.out.println("created successfully");
  };
  public void delete(String client , int empId) throws Exception{
    System.out.println("deleted successfully");
  };
  public EmployeeDo get(String client , EmployeeDo empId) throws Exception{
    System.out.println("fetched successfully");
    return new EmployeeDo();
  };
}
