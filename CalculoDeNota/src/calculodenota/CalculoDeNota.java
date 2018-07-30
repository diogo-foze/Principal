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
        if((nota1+nota2)/2 < 7){
            media= (nota1 +nota2)/2;
            System.out.println("Recuperação final sua media das provas foi: "+media);
        }else{
            System.out.println("Digite a nota do trabalho: ");
            trabalho = scan.nextDouble();
            media=(nota1+nota2+trabalho)/3;
            if(trabalho>= 7 ){               
                System.out.println("Parabens você foi aprovado com média: "+media);
            }else{
                System.out.println("Você esta de Recuperação sua Meida foi: "+media);
            }
                
        }
    }
}
