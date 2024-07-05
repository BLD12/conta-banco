import java.beans.beancontext.BeanContextServiceAvailableEvent;
import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(locale.US);


       System.out.println("por favor, digite o numero da conta:");
       int numero = scanner.nextInt();

       System.out.println("por favor, digite o número da Agência:");
       String agência = scanner.nextInt();

       System.out.println("me informe seu nome:");
       String nome = scanner.next();

       System.out.println("me informe seu saldo atual:");
       double saldo = scanner.nextDouble();


      
}

} 





