import java.util.Scanner;

class Ex1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número para saber se ele eh par ou impar");
        int n = scan.nextInt();

        System.out.println(n%2 == 0 ? "E um número par" : "E um número impar");
        scan.close();
    }
}