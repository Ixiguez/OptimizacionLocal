package sentenciafor;
import java.util.Scanner;
public class Sentenciafor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);{
            int valor, f, promedio, suma =0; 
            for (f = 1; f <= 10; f++) {
                System.out.println("Ingrese valor: ");
                valor = teclado.nextInt();
                suma = suma + valor;}
        promedio = suma /10;
        System.out.println("La suma es: " + suma + "El promedio es: " + promedio);}}}

