import java.util.Scanner;
    public class uri1006 {

        public static void main(String args[]){

            Scanner teclado = new Scanner (System.in);


        double A, B, C, media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        media = ((A * 2)+(B * 3)+(C *5))/ 10;

        System.out.printf("%.1f\n", media);



        }



    }