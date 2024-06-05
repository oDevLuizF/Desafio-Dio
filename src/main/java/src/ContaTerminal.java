
package src;
import java.util.Scanner;

        public class ContaTerminal {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in);

                System.out.println("Por favor, digite o número da conta !");
                int numero = reader.nextInt();
                System.out.println("Por favor, digite o número da agência !");
                String agencia = reader.next();
                System.out.println("Por favor, digite o nome do cliente !");
                String nome = reader.next();
                System.out.println("Por favor, digite o saldo !");
                float saldo = reader.nextFloat();

                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +" e seu saldo R$"+saldo+" já está disponível para saque");


            }
        }


