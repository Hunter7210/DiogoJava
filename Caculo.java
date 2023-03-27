package AtivGrupoDiogo;

import java.util.Scanner;

public class Caculo {
    Scanner sc = new Scanner(System.in);

    public void Decisao10() {

            System.out.println("Insira seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Insira seu sexo: 1:feminio/2:masculino");
            double sexo = sc.nextDouble();
    
            System.out.println("Insira sua idade: ");
            double idade = sc.nextDouble();

            System.out.println("Insira sua altura: (em metros)");
            double altura = sc.nextDouble();

            System.out.println("Insira seu peso: ");
            double peso = sc.nextDouble();
            
            System.out.println("O seu IMC seria de:" + ( peso /(altura * altura)) + "%");
            double imc = sc.nextDouble();
            
            System.out.println("Vamos calcular seu peso ideal:");
            if (sexo == 2) {
                System.out.println("O seu peso seria de:" + ((72.7 * altura) - 58) + "kg");
            
            }
            else {
                System.out.println("O seu peso seria de:" + ((62.1 * altura) - 44.7) + "kg");
            } 
        
            
            if (imc	< 18.5){
                Double result= (peso -63.3); 
                System.out.println("Você está magro");
                System.out.println("Você precisa ganhar: "+result +"Kg");
            }
            else if (imc > 18.5 && imc <24.9){
                System.out.println("Você está no peso normal");
                System.out.println("Você precisa manter o peso");
            }
            else if( imc> 24.9 && imc < 30){
                Double result= (peso -85.2 ); 
                System.out.println("Você está sobrepeso");
                System.out.println("Você precisa perder: "+result +"Kg");
            }
            else if( imc>30){
                Double result= (peso -85.2 ); 
                System.out.println("Você está obeso");
                System.out.println("Você precisa perder: "+result +"Kg");
            }   

            System.out.println("Qual o tipo de sua atividade fisica :");
            
            if (imc< 18.5){
                System.out.println("Sugiro Atividade Dificil, para ");
             }
            




        






            //CALCULAR IMC

            double resultadoI= ( peso /(altura * altura));


        }
    }
