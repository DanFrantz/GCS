import java.util.Scanner;
public class app{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Teste usando Git");
        
        
        System.out.println("Insira o primeiro valor");
        int primeiroValor=teclado.nextInt();
        
        System.out.println("Insira o segundo valor:");
        int segundoValor=teclado.nextInt();

        int resultado=primeiroValor+segundoValor;
        teclado.close();

        System.out.println("Resultado "+ resultado);
    }
}