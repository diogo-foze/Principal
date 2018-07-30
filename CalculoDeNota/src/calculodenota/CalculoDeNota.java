/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodenota;

import java.util.Scanner;

/**
 *
 * @author Diogo
 */
public class CalculoDeNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaração das variaveis
        Double nota1, nota2, trabalho, media;
        //Instanciar Scanner e atribuir a variavel scan
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");//exibe a mensagem para o usuário
        nota1 = scan.nextDouble();// atribui o numero digitado na variavel
        System.out.println("Valor da nota1: "+nota1);//exibe ao usuário o valor da nota1 
    }
    
}
