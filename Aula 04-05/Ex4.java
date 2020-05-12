import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        System.out.println("O que deseja calcular? Digite o número \n 1.Area do triangulo \n 2.Area do quadrado \n 3.Indice de Massa Corporal \n 4.Km para Milhas");

        op = scan.nextInt();

        switch (op) {
            case 1:
                triangulo(scan);
                break;
            case 2:
                quadrado(scan);
                break;
            case 3:
                IMC(scan);
                break;
            default:
                break;
        }
        
        scan.close();
    }

    public static void triangulo (Scanner scan){
        System.out.println("Forneça a base e altura do triangulo:");
        double b = scan.nextDouble();
        double a = scan.nextDouble();

        System.out.println("A área é : " + b*a/2);
    }

    public static void quadrado (Scanner scan){
        System.out.println("Forneça a largura do quadrado:");
        double b = scan.nextDouble();

        System.out.println("A área é : " + Math.pow(b,2));
    }

    public static void IMC (Scanner scan){
        System.out.println("Peso(kg) e altura(m) do indivíduo:");
        double p = scan.nextDouble();
        double a = scan.nextDouble();

        System.out.println("O indice de massa corporal é : " + Math.round(p/a));
    }
    
    public static void milhas(Scanner scan){
        System.out.println("Conversor Quilometros - milhas : \n Insira o valor em Km :");
        Double m = scan.nextDouble() / 1.60934;
        System.out.println("Igual a :" + Math.round(m) + " milhas.");
    }
    

}
