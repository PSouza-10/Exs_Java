import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um numero e veja sua tabuada :");

        int n = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n+" X "+ i + " : " + (n*i));
        }
        
        scan.close();
    }
}