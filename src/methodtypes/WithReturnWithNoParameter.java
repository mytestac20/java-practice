package methodtypes;

public class WithReturnWithNoParameter {



    public static int addition(){
     int a = 10;
     int b = 20;
     int ans = a+b;
     return ans;
    }

    public String myName (){

        String firstname ="Manmeet";
        String lastname = "Kaur";
        return firstname + " " +lastname;
    }

    public static boolean isRight(){
        boolean a = true;
        boolean b = false;
        return a;
    }

    public static void main (String[]args){
       int result = addition();
       System.out.println(result);
        System.out.println(addition());
        WithReturnWithNoParameter obj = new WithReturnWithNoParameter();

        System.out.println(isRight());
    }

    }

