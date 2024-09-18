import java.util.Scanner;

public class LeituraValoresUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num =  new int [3];
        System.out.println("Insira um valor: ");
        num[0] = sc.nextInt();
        System.out.println("Insira um valor: ");
        num[1] = sc.nextInt();
        System.out.println("Insira um valor: ");
        num[2] = sc.nextInt();
        System.out.println(num[0] +","+ num[1] +","+ num[2] +" A média é: "+ ((num[0]+num[1]+num[2])/3));
    }
}
