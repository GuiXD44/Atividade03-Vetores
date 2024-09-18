import java.util.Scanner;

public class LeituraNomesUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[3];
        System.out.println("Insira seu nome: ");
        nome[0] = sc.nextLine();
        System.out.println("Insira seu nome: ");
        nome[1] = sc.nextLine();
        System.out.println("Insira seu nome: ");
        nome[2] = sc.nextLine();
        System.out.println("Os nomes armazenados são: " + nome[0] + ", " + nome[1] + ", " + nome[2]);
    }
    }
