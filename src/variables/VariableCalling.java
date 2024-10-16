package variables;

public class VariableCalling {

    String name = "Prime"; // instance variable
    static int number = 100; //Static variable

    public static void main(String[] args) {
        VariableCalling t = new VariableCalling();
        System.out.println(t.name);
        System.out.println(number);
        System.out.println(VariableCalling.number);


        t.m1();
    }

    public void m1(){
        VariableCalling obj = new VariableCalling();
    //m1 is non static method/ instance method and we call instance variable with object name
        System.out.println(obj.name);
        System.out.println(name);
        System.out.println(VariableCalling.number);
        System.out.println(number);
    }


}
