import java.util.Scanner;

public class IntroductionRunner 
{
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String n = input.nextLine();

        System.out.print("Age: ");
        int a = input.nextInt();

        System.out.print("Weight: ");
        double w = input.nextDouble();


        Introduction person1 = new Introduction(n, a, w);
        person1.introduce();
    }
}
