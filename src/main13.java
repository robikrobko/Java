import java.util.Scanner;

public class main13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj prve cislo: ");
        int prve = input.nextInt();
        System.out.print("Zadaj druhe cislo: ");
        int druhe = input.nextInt();
        System.out.print("Zadaj tretie cislo: ");
        int tretie = input.nextInt();

        System.out.println((prve+druhe+tretie)/3);
    }
}
