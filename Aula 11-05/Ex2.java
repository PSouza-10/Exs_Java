import java.util.Calendar;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();

        System.out.println("Digite um ano para saber onde ele está no tempo : ");
        int ano = scan.nextInt();
        int y = cal.get(Calendar.YEAR);

        if (ano != y){
            System.out.println(ano > y ? (ano  + " é do futuro") : (ano + " é do passado"));
        }else System.out.println(y + " é o ano atual");
        
        scan.close();
    }
}