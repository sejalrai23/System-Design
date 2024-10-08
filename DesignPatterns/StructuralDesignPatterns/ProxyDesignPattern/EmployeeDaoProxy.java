package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeDao {
  EmployeeDao employeeObj;
  
  EmployeeDaoProxy(){
    employeeObj = new EmployeeDaoImpl();
  }
  
  public void create(String client , EmployeeDo emp) throws Exception{
    if(client.equals("ADMIN")){
      employeeObj.create(client , emp);
      return;
    }
    throw new Exception("Access Denied");
  };
  
  
  public void delete(String client , int empId) throws Exception{
    if(client.equals("ADMIN")){
      employeeObj.delete(client , empId);
      return;
    }
    throw new Exception("Access Denied");
  };
  
  
  public EmployeeDo get(String client , EmployeeDo empId) throws Exception{
    if(client.equals("ADMIN") || client.equals("USER")){
      return employeeObj.get(client , empId);
    }
    throw new Exception("Access Denied");
  };
}
