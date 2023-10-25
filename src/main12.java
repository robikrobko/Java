import java.util.Scanner;

public class main12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj polomer: ");
        int polomer = input.nextInt();
        double obvod = 2 * 3.14 * polomer;
        double obsah = 3.14 * polomer * polomer;
        System.out.println("obvod je = " + obvod);
        System.out.println("obsah je = " + obsah);

    }
}
