package calculodenota;      //nome do pacote
import java.util.Scanner;   //importar a biblioteca
public class CalculoDeNota {

    public static void main(String[] args) {
        // TODO code application logic here
        //declaração das variaveis
        Double nota1, nota2, trabalho, media;
        //Instanciar Scanner e atribuir a variavel scan
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite a nota da primeira prova: ");//exibe a mensagem para o usuário
        nota1 = scan.nextDouble();                              // atribui o numero digitado na variavel
        System.out.println("Digite a nota da segunda prova: ");
        nota2 = scan.nextDouble();
        if((nota1+nota2)/2 < 7){    // se a media das provas for menor que 7 o aluno está de final
            media= (nota1 +nota2)/2; //media recebe a soma das 2 notas e divide por 2 para termos a média das provas
            System.out.println("Recuperação final sua media das provas foi: "+media);
        }else{  //senão é fará um trabalho com mais uma nota
            System.out.println("Digite a nota do trabalho: ");
            trabalho = scan.nextDouble();
            media=(nota1+nota2+trabalho)/3; //media recebe a soma das 3 notas e divide por 3 para termos a média
            if(trabalho>= 7 ){ // se a nota do trabalho for maior o igual a 7 esta aprovado              
                System.out.println("Parabens você foi aprovado com média: "+media);
            }else{  //senão esta de recuperação
                System.out.println("Você esta de Recuperação sua média foi: "+media);
            }
                
        }
    }
}
