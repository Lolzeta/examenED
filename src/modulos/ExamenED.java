package modulos;

import java.util.Random;
import java.util.Scanner;

public class ExamenED {

    static int w = 30;

    public static void main(String args[]){

        System.out.println("INTRODUCE UN NUMERO: ");
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        Random random = new Random();
        int []a = new int[m];
        for(int in=0; in<m; in++)
        {
            a[in] = random.nextInt(ExamenED.w);
        }

        ExamenED.ejecutarAlgoritmo(a);
        input.close();
    }


    public static void ejecutarAlgoritmo(int[] a){

        int x = 0;
        int y = ExamenED.w;

        for(int in=0; in<a.length; in++)
        {
            System.out.println(a[in]);
            if(a[in] > x ){
                x = a[in];
            }

            if(a[in] < y){
                y = a[in];
            }
        }

        int z = y *x;
        if (z == 0 || (z % 2 != 0)  ){
            System.out.println("NO ES");
        }else{
            System.out.println("ES");
        }

    }
}