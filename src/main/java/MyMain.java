import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name?"); 
        String name = scan.next();
        System.out.println("Nice to meet you " + name);
        System.out.print("What is your favorite food? ");
        String food = scan.next();
        System.out.println("Yummy! I love " + food);
        System.out.print("What about your favorite animal?");
        String animal = scan.next();
        System.out.println("Oh cool I actually have a pet " + animal);
        System.out.print("What do you like about them? ");
        String reason = scan.next();
        System.out.println("Me too! I love that they " + reason);
        System.out.print("We have a lot of common interests. Want to be friends?");
        String friend = scan.next();
        System.out.println("Ok.." + friend);
             
        scan.close();
    }
}
