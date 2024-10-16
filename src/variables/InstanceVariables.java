package variables;

public class InstanceVariables {
   int a = 10 ; //  a is instance variable or global variable
    String name = "Prime Testing";

    public static void main(String[] args) {
       InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println("m1 method starts");
        obj.m1();


    }

    public void m1(){
        System.out.println(a);
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a);
        System.out.println(name); // direct calling
        System.out.println(obj.name); // calling with object

    }
}
