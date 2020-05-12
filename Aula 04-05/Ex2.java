import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Insira seu nome :");

        String name = scan.nextLine();
        
        float notas = 0;

        System.out.println("Olá " + name + "! Seja bem vindo");
        System.out.println("Para calcular sua média de Matemática, insira as quatro notas :");
        
        for(int i = 0; i <= 3;i++){
            System.out.println( i+1 +"ª nota :");
            notas += scan.nextFloat();
            System.out.println();
        }

        System.out.println(name + ", sua média é : " + notas/4);

        scan.close();
    }
}