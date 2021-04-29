package Day6;

class CEO extends Managers{
    CEO(String s, String j, int id){

        super.name=s;
        super.jobs=j;
//        super.empId=id;

    }
    CEO(){}
    void display(){
        System.out.println("CEO");
    }


}
class Managers extends Employee{
//    Managers(String s, String j, int id){
//
//        super.name=s;
//        super.jobs=j;
//        super.empId=id;
//
//    }
//
//    public Managers() {
//
//    }
void display(){
    System.out.println("Manager");
}
}
public class Employee{
    protected String name;
    protected String jobs;
    private int empId;

    public Employee(String name, String jobs, int empId) {
        this.name = name;
        this.jobs = jobs;
        this.empId = empId;
    }

    public Employee() {
    }

    void display(){
        System.out.println("Hey my name is "+name+" and my empID "+empId+"I am workings here as a "+jobs);
    }
    public static void main(String[] args) {
//        Managers managers = new Managers("aditya","manager",123);
        Employee employee= new Employee("Riyaz","engineer",3243);
        CEO ceo = new CEO("Ritu","CEO",45);
        employee.display();
//        managers.display();
        ceo.display();
        B  b = new B();
        b.display();

        Employee employee1= new Managers();
        Employee employee2= new CEO();
//        Managers employee3 = new Employee();
        employee1.display();
        employee2.display();
//        employee3.display();

    }
}
class B{
    void display(){
        Employee ceo = new Employee("aditya","chef",435);
        System.out.println(ceo.jobs);
    }
}
interface a {

        }