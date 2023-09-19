public class Classes {
    public static void main(String nqt[]){
        // Person p1 = new Person("Rohan",21);
        // Person p1 = new Person();
        // p1.name="Rohan";
        // p1.age=21;
        // Person p2 = new Person();
        // p2.name="Neha";
        // p2.age=21;
        //System.out.println("Hello "+p1.name+" your age is "+p1.age+".");
        //p1.walk();
        //p1.count=100;
        //System.out.println(p1.count);
        Developrs d1 = new Developrs("Rohan",21);
        d1.work(5);
    }
}

class Developrs extends Person{
    public Developrs(String name, int age){
        super(name,age);
    }
    void work(){
        System.out.println("Developr "+name+" is working!"); 
        // This is Runtime Polymorphisam
    }
}


class Person {
    static int count=0;
    public Person(){
        System.out.println("This is an Constructor!");
        count++;
    }
    public Person(String name,int age){
        //this();
        this.name=name;
        this.age=age;
    }
    String name;
    int age;
    //This is compliletime Polymorphisam
    void work(){
        System.out.println(name+" is working.");
    }
    void work(int steps){
        System.out.println(name+" is working "+steps+" steps.");
    }
}