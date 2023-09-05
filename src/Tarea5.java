import java.util.*;
import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args){
        int numeroIngresado = 0;
        Random ran = new Random();
        int nxt = ran.nextInt(10) + 1;
        int contador = 0;

        do {
            System.out.println("Adivine el numero : ");
            Scanner scan = new Scanner(System.in);
            numeroIngresado = scan.nextInt();
            contador ++;
            if(numeroIngresado == nxt){
                System.out.println("Ganaste !!");
                break;
            }else{
                System.out.println("No acerto, siga particiapando");
            }
        }while(contador < 3);
    }
}
