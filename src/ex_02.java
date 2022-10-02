import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        System.out.print("O número digitado foi --- " + numero);

        sc.close();

    }
}
