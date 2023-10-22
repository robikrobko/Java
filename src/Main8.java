import java.util.Scanner;
import java.util.stream.IntStream;

public class Main8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Zadaj cislo: ");
        int cislo = input.nextInt();
        IntStream.range(1, 11).forEachOrdered(n -> {
            int sucin = cislo * n;
            System.out.println(cislo + " * " + n + " = " + sucin);
        });
    }
}
