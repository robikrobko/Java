import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj prve cislo: ");
        int prven = input.nextInt();
        System.out.print("Zadaj druhe cislo: ");
        int druhen = input.nextInt();
        System.out.print(prven + " x " + druhen + " = ");
        System.out.print(prven * druhen);
    }
}
