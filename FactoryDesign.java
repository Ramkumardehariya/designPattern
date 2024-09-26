
interface Employee{
    int salary();
}

class AndroidDeveloper implements Employee{
    public int salary(){
        System.out.println("Geting android developer salary");
        return 50000;
    }
}

class WebDeveloper implements Employee{
    public int salary(){
        System.out.println("Web developer salary ");
        return 40000;
    }
}

class EmployeeFactory{
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("webdeveloper")){
            return new WebDeveloper();
        }
        else{
            return null;
        }
    }
}



public class FactoryDesign {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("AndroidDeveloper");
        Employee employee2 = EmployeeFactory.getEmployee("webDeveloper");
        employee.salary();
        employee2.salary();

    }
}
