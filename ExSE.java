
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Davi
 */
public class ExSE {
    
    public static void main(String[]args){
    
        
       //Declaração de variaveis
       double salarioBruto, impostoRenda, salarioLiquido;
       
       //entrada de dados
       Scanner entrada = new Scanner(System.in);
       System.out.println("Salário Bruto: ");
       salarioBruto = entrada.nextFloat();
       
       //Processamento de dados
       impostoRenda= 0;
       if(salarioBruto > 1500){
          impostoRenda =  salarioBruto * 0.15;
       }
       salarioLiquido = salarioBruto - impostoRenda;
       
       //Saida de dados
       System.out.printf("Desconto de imposto de renda: %6.2f", impostoRenda);
       System.out.printf("\nSalario Liquido: %6.2f\n", salarioLiquido);
       
    
    
    }
    
}
