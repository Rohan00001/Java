public class Super {
    public static void main(String timepass[]){
        Developer d1 = new Developer("Rohan", 0);
        d1.Hello();
    }
}

class Employee{
    String name;
    float salary;
    Employee(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}

class Developer extends Employee{
    Developer(String name,int salary){
        super(name, salary);
    }
    void Hello(){
        System.out.println("Hello I am "+name+" my salary is "+salary );
    }
}