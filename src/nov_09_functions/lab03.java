package nov_09_functions;

import javax.swing.plaf.basic.BasicMenuItemUI;

public class lab03 {
    public static void main(String[] args) {

        //without parameters but without  return type
        function_type1();
        //without parameters but with return type
        String name= function_Type2();
        System.out.println(name);
        //with parameter and without return type
        function_type3("amit");

        // with parameter and with return type

        int result=function_type4(4,7);
        System.out.println(result);

    }
    //without parameters but without  return type
    public static void function_type1() {
        System.out.println("without parameters but without return type");


    }
    //without parameters but with return type

    public static String function_Type2(){
        System.out.println("without parameters but with return type");
        return "pavneet";
    }

    //with parameter and without return type
    public static void function_type3(String name){
        System.out.println("with parameters but without return type");
        System.out.println("you have shared-->"+ name);
    }

    // with parameter and with return type

    public static int function_type4(int a, int b){
        System.out.println("with parameters but with return type");
        return a+b;
    }
}
