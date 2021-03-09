import java.util.Locale;

public class hello {
    public static int doubly(int x){
        return x * x ;
        // x-- x++ x-3 x/6 basic operation;
    }
    public static void main(String[] args) {
        //Functions;
        // f(x) = x*x;
        //f(5) = 5*5;
        int doubled = doubly(5);
        int otherdoubled = doubly(10);
        System.out.println(doubled);
        System.out.println(otherdoubled);
        String name = "Tania";
        char firstInitial = name.charAt(name.length()-1);
        String lowered = name.toLowerCase();
        System.out.println(firstInitial);
        System.out.println(lowered);

    }
    /* public static void main(String[] args) {
        //How to print
        System.out.println("Hello World!");
        //variables
        int num = 5;
        double doubley = 4.6;
        char firstInitial = 'T';
        String name = "Tania";
        boolean isHome = false;
        // System.out.println(num);
        // System.out.println(doubley);
        //System.out.println(firstInitial);
        // System.out.println(name);
        // System.out.println(isHome);
        // conditionals/ if else condition
        if (num < 18){
            System.out.println("You are not an adult");
        }
        if (num == 18){
            System.out.println("You are not an adult");
        }
        if (!isHome || num < 18){
            System.out.println("You are not an adult");

        }
        if (name.equals("Tania")) {
        System.out.println("Happy Birthday") ;
        } else{
            System.out.println("Have a nice day") ;
        }

        //loops, while,for, do while
        while(num < 18) {
            System.out.println("You are not an adult");
            //num= num+1;
            num ++ ;
        }
        for(int i=0;i<20; i++){
            System.out.println(i);
        }
        int x= 1;
        do{
            System.out.println("Happy coding");
            x++;
        } while(x<10);
    } */

}
