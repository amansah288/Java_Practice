public class QFunc {

  public String name;
  private double salary;

  // The name variable is assigned in the constructor.
  public QFunc(String empName) {
    name = empName;
  }

  public void setSalary(double empSal) {
    salary = empSal;
  }

  public void printEmp() {
    System.out.println("name : " + name);
    System.out.println("salary : " + salary);
  }

  public static void main(String[] args) {
    QFunc empOne = new QFunc("Ransika");
    empOne.setSalary(10000);
    empOne.printEmp();

  }
}