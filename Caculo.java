package AtivGrupoDiogo;

import java.util.Scanner;

public class Caculo {
    Scanner sc = new Scanner(System.in);

    public void Decisao10() {

     System.out.println("Digite seu nome ");
     String nome = sc.nextLine();
     
     System.out.println("Digite a sua idade");
     int idade = sc.nextInt();
     
     System.out.println("Digite seu sexo 1 para Feminino 2 Masculino");
     int sexo = sc.nextInt();

     System.out.println("Digite primeiro o seu peso e depois a sua altura");
     int peso = sc.nextInt();
     double Altura = sc.nextDouble();
     
    double imc = peso/(Altura*Altura);
   
      if (imc<20 && sexo==1 && idade>5 && idade>16 && idade<25) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades diciceis como: Luta.  Ganhe  " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal" );
  
      }if (imc<20 && sexo==2 && idade>5 && idade>16 && idade<25) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta.  Ganhe  " + ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==2 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe  " + ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==1 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe  " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal");
  
      }if (imc<20 && sexo==2 && idade>35 && idade<45) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe  " +  ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==1 && idade>35 && idade<45) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Musculação Intensa.  Ganhe  " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==2 && idade>45 && idade<55) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta.  Ganhe " + ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==1 && idade>45 && idade<55) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Luta,Pilates.  Ganhe  " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==2 && idade>55 && idade<65) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis.  Ganhe  " + ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==1 && idade>55 && idade<65) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como:Pilates.  Ganhe  " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==2 && idade>66) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Pilates.  Ganhe  " + ((72.7* Altura - 58) - peso) + " Kg para estar no seu peso ideal");
   
      }if (imc<20 && sexo==1 && idade>66) {
      System.out.println(" Seu imc é igual a " + peso/(Altura*Altura) + " está abaixo do peso e deve praticar atividades dificeis como: Pilates.  Ganhe entre " + ((62.1* Altura - 44.7) - peso) + " Kg para estar no seu peso ideal");


   
      }if (imc>20 && imc<27 && sexo==1 && idade>5 && idade>16 && idade<25){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança" ); 
    
      }if (imc>20 && imc<27 && sexo==2 && idade>5 && idade>16 && idade<25){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança" ); 
 
      }if (imc>20 && imc<27 && sexo==1 && idade>25 && idade<35){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Dança,Corrida" );

      }if (imc>20 && imc<27 && sexo==2 && idade>25 && idade<35) {
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação,Dança,Corrida " );

      }if (imc>20 && imc<27 && sexo==1 && idade>35 && idade<45){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   
      }if (imc>20 && imc<27 && sexo==2 && idade>35 && idade<45){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   
      }if (imc>20 && imc<27 && sexo==1 && idade>45 && idade<55){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 
   
      }if (imc>20 && imc<27 && sexo==2 && idade>45 && idade<55){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Musculação Moderada,Corrida,Dança" ); 

      }if (imc>20 && imc<27 && sexo==1 && idade>55 && idade<65){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Corrida,Dança" ); 
   
      }if (imc>20 && imc<27 && sexo==2 && idade>55 && idade<65){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Corrida,Dança" ); 
      }if (imc>20 && imc<27 && sexo==1 && idade>66){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Dança" ); 

      }if (imc>20 && imc<27 && sexo==2 && idade>66){
      System.out.println(" Seu imc é igual"  + peso/(Altura*Altura) +  " seu peso normal então pratique atividades moderadas como: Dança" ); 



  
      }if (imc>27 && sexo==1 &&  idade>5 && idade>16 && idade<25) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + ( peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
      
      }if (imc>27 && sexo==2 && idade>5 && idade>16 && idade<25) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
     
      }if (imc>27 && sexo==1 && idade>25 && idade<35) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==2 && idade>25 && idade<35) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==1 && idade>35 && idade<45) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==2 && idade>35 && idade<45) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Yoga " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==1 && idade>45 && idade<55) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação leve,Yoga " + (peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==2 && idade>45 && idade<55) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );   
  
      }if (imc>27 && sexo==1 && idade>55 && idade<65) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==2 && idade>55 && idade<65) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==1 && idade>66 ) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga " + (peso - (62.1* Altura - 44.7)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   
      }if (imc>27 && sexo==2 && idade>66) {
      System.out.println( " Seu imc está igual " + peso/(Altura*Altura) + " prátique atividades Leves como: Musculação Leve,Yoga  " + (peso - (72.7* Altura - 58)) + " Kg este é o valor que você precisaria perder para estar no peso ideal." );
   }
      }
    }
 