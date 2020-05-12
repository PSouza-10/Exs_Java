import java.util.Scanner;

class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome, seguido de suas duas notas para constatar a situação");
        
        String nome = scan.nextLine();
        Float n1 = scan.nextFloat();
        Float n2 = scan.nextFloat();

        Float med = (n1+n2)/2;
        String sit = "Aprovado";

        if(med < 6.00 ){
            sit = med < 4.00 ? "Reprovado" : "Em recuperação";
        }

        System.out.println("Nome :" + nome + "\nMedia: "+ med +"\nSituacao:"+ sit);
        scan.close();

    }      
}