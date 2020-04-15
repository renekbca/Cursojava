
 /* 
2 este programa eh um exemplo de como se fazer uma leitura de dados 
3 vinda do teclado, um pequeno calculo e, finalmente, exibir o  
4 valor final na tela  
5 */ 
 
 /* para fazer a leitura vou precisar de uma biblioteca */ 
 import java.util.Scanner; 
 
 
 public class Leitura{ 
     public static void main(String args[]){ 
         Scanner teclado;  
         teclado = new Scanner(System.in); 
          
         /* entrada de dados */ 
         int valor;  
         System.out.print(" Por favor, digite um valor"); 
         valor = teclado.nextInt(); 
 
 
         /* processamento */ 
         valor = valor * 100; 
 
 
         /* saida */ 
         System.out.print(" Novo valor "+ valor); 
     } 
 } 
