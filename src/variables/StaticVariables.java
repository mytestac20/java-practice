package variables;

/**
 * static variables - in the class
 * scope             - within the class
 * memory allocation - class loaded
 * store             - non heap memory
 */

public class StaticVariables {
    static int a = 10;
     static String name = "Prime Testing";

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(StaticVariables.a);
        System.out.println(name);
        System.out.println(StaticVariables.name);
        StaticVariables obj = new StaticVariables();
        obj.m1();
    }


    public void m1(){
        System.out.println(StaticVariables.a);
        System.out.println(StaticVariables.name);

    }
}
