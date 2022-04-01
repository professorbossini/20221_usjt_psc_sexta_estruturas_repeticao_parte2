import java.util.Scanner;
import java.util.Random;
public class Exercicio1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random();
        //int Integer
        //auto boxing auto unboxing
        Integer n;
        do{
            System.out.println("Digite um valor positivo");
            n = leitor.nextInt();
        }while (n <= 0);
        
        //repetição controlada por contador
        int contador = 1;
        while(contador <= n){//condição de continuidade
            //int d1 = gerador.nextInt(1, 7);
            int d1 = gerador.nextInt(6) + 1;
            int d2 = gerador.nextInt(6) + 1;
            //2 5: 2 < 5
            //6 6: 6 = 6
            //5 2: 5 > 2
            // if (d1 < d2)
            //     System.out.printf("%d %c %d\n", d1, '<', d2);
            // else if (d1 == d2)
            //     System.out.printf("%d = %d\n", d1, d2);
            // else
            //     System.out.println(d1 + " > " + d2);
            //exercício
            //reescrever o if/else usando operador ternário
            
            ++contador;
        
        }
        leitor.close();
    }    
}

