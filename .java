package atividade02.pkgdo.pkg12;
import java.util.Scanner;
/**
 * @author ZKNobrega
 */
public class Atividade02Do12 {

       public static void Programa1(){
        Scanner valor = new Scanner (System.in);
		
		double valorConta, valorComissao, valorTotal;
                System.out.print("Esse programa calcula o valor da comissão de 10% da venda de um vendedor \n");
		System.out.print("Insira o valor da venda para calcular a comissão: ");
		valorConta = valor.nextDouble();
		valorComissao = valorConta/10;
		System.out.printf ("Comissão de: R$ %.2f" , valorComissao);
    }
       public static void Programa2(){
           Scanner valor = new Scanner (System.in);
            Double sal, salA;
            System.out.print("Insira seu saláro Mensal: ");
            sal = valor.nextDouble();
            System.out.print("Insira valor do salario minimo: ");
            salA = valor.nextDouble();
            System.out.printf ("Você recebe: %.2f", sal/salA);
            System.out.print (" salarios minimos");
       }
       
    public static void main(String[] args) {
        Scanner op = new Scanner (System.in);
        int numOp;
        
        for(; true; ){        
            System.out.print("Digite o número correspondente da opção desejada.\n");
            System.out.print("1 - Calcular comissão\n2 - Calculo de salario mínimo\n3 - Sair\n");
            //System.out.print("2 - Sair");
            numOp = op.nextInt();

            switch(numOp){
            case 1: Programa1();
            break;

            case 2: Programa2();
            break;

            case 3: System.exit(0);
                }
            }
    }
     
}
