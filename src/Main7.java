import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj prve cislo: ");
        int prven = input.nextInt();
        System.out.print("Zadaj druhe cislo: ");
        int druhen = input.nextInt();
        int sucet  = druhen + prven;
        int rozdiel = prven - druhen;
        int sucin = prven * druhen;
        int podiel = prven / druhen;
        int zostatok = prven % druhen;
        System.out.println(prven  + " + " + druhen + " = " + sucet);
        System.out.println(prven  + " - " + druhen + " = " + rozdiel);
        System.out.println(prven  + " * " + druhen + " = " + sucin);
        System.out.println(prven  + " / " + druhen + " = " + podiel);
        System.out.println(prven  + " mod " + druhen + " = " + zostatok);

    }
}
