import java.util.Scanner;
public class SwitchCase
{
    public static void main (String[] args)
    {
    int choice;
    System.out.println("Enter your choice:");
    System.out.println("1.Hey \t2.Hello \t3.Hi");
    Scanner s = new Scanner(System.in);
    choice = s.nextInt();
    switch(choice)
    {
        case 1: 
        System.out.println("You chose Hey!. So Hey , how are you doing?");
        break;
        case 2: 
        System.out.println("You chose Hello!. So Hello, how are you doing?");
        break;
        case 3:
        System.out.println("You chose Hi!. So Hi, how are you doing?");
        break;
        default:
        System.out.println("Invalid Choice!");
    }
    }

}
