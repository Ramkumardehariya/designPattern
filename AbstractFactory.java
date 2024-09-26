
interface Employee{
    int salary();
    String name();
} 

class AndroidDeveloper implements Employee{
    public int salary(){
        return 50000;
    }
    public String name(){
        System.out.println("I am android developer");
        return "andoird developer";
    }
}

class WebDeveloper implements Employee{
    public int salary(){
        return 50000;
    }
    public String name(){
        System.out.println("I am Web developer");
        return "web developer";
    }
}

abstract class EmployeeAbstractFactory{
    public abstract Employee createEmployee();
}

class AndroidDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }
}
class WebDevFactory extends EmployeeAbstractFactory{
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}

class EmployeeFactory{
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}



public class AbstractFactory {
    public static void main(String[] args) {
        // i want to get android developer

        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
        e2.name();
    }
}
