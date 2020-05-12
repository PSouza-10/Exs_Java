import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Meses para dias.\n Insira um número de meses :");
        Float m = scan.nextFloat(); 
        Float d = m * 30 + m/2;
        System.out.println(d + " Dias");

        scan.close();
    }
}