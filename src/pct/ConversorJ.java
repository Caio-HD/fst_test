/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author caioh
 */
public class ConversorJ {
    public static void main(String[] args) {
        
        double j, c, i, n;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\t\t --Conversor--\n");
        
        System.out.print("\t Informe capital:");
        c = entrada.nextDouble();
        
        System.out.print("\t Informe taxa:");
        i = entrada.nextDouble();
        
        System.out.print("\t Informe prazo:");
        n = entrada.nextDouble();
        
        j = c * i * n / 100;
        
        System.out.printf("\n\t\t Juros = %.2f\n", j);

    }
}
