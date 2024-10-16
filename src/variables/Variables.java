package variables;

public class Variables {
  int a = 100;
  String programme = "Java";


    public static void main(String[] args) {
        //variables declaration
       // int x;
       // int y;
      //  int z;
        int x,y,z;
        x = 10;
        y = 20;
        z = 30;

        String name = "Prime Testing";
        System.out.println(name);
        System.out.println("result = "+(x+y+z) + " OK"); //concetinatio
        Variables obj = new Variables();//object created
        System.out.println(obj.a);
        System.out.println(obj.programme);

    }
}
