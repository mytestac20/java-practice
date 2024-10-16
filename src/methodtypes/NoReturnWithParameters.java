package methodtypes;

public class NoReturnWithParameters {

    public static void addition(int a,int b){
        int  answer = a + b;
        System.out.println(answer);
    }

    public static void printName(String name){
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        addition(10, 20);
        addition(20, 20);
        addition(1,  3);
        printName("Prime");
        printName("Manmeet");

    }

}
