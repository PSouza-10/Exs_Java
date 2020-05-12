import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Insira seu nome :");

        String name = scan.nextLine();

        System.out.println("Olá " + name + "! Seja bem vindo");

        scan.close();
    }
}

