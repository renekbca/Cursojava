import java.util.Scanner;
    public class Capturadata{
        public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int data, dia, mes, ano, res;

System.out.print("Digite uma data no formato DDMMAAAA:");
data = teclado.nextInt();

ano = data % 10000;
res = data / 10000;

dia = res / 100;
mes = res % 100;

System.out.println(" Dia ="+dia);
System.out.println(" Mes ="+mes);
System.out.println(" Ano ="+ano);

        }
    }