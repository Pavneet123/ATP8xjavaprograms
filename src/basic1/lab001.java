package basic1;

public class lab001 {

    public static void main(String[] args) {
        System.out.println("hello world");
        main("pavneet");// calling of the function
    }
    //method overloading
    public static void main(String args) {    // defination of the function
        System.out.println("hello world");
    }
    public  void main(int args) {
        System.out.println("hello world");
    }
}
