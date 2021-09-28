class Employee{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
   String getName(){
    return name;
  }
   int getYear(){
    return year;
  }
 int getSalary(){
    return salary;
  }
   String getAddress(){
    return address;
  }
}

class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Ayush", 2002, 580000, "Mumbai");
    Employee e2 = new Employee("Smriti", 2005, 780000, "Delhi");
    Employee e3 = new Employee("Rahul", 1992, 680000, "Bangalore");
    System.out.println("Name\tYear of joining\t\tSalary\t\tAddress");
    System.out.println();
    System.out.println(e1.getName()+"\t    "+e1.getYear()+"\t\t"+e1.getSalary()+"\t\t"+e1.getAddress()); 
    System.out.println(e2.getName()+"\t    "+e2.getYear()+"\t\t"+e2.getSalary()+"\t\t"+e2.getAddress());  
    System.out.println(e3.getName()+"\t    "+e3.getYear()+"\t\t"+e3.getSalary()+"\t\t"+e3.getAddress());  
  }
}
