import java.util.Scanner;

public class FormulaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa a: ");
        int a = sc.nextInt();
        System.out.print("Ingresa b: ");
        int b = sc.nextInt();
        System.out.print("Ingresa c: ");
        int c = sc.nextInt();

        int z = (a + b) * c;

        System.out.println("El resultado final es: " + z);
    }
}

