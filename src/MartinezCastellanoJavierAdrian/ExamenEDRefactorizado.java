package MartinezCastellanoJavierAdrian;

import java.util.Random;
import java.util.Scanner;

public class ExamenEDRefactorizado {

    static int maximo = 30;

    public static void main(String args[]){

        System.out.println("INTRODUCE UN NUMERO: ");
        Scanner input = new Scanner(System.in); // Introduciremos un numero
        int numero = input.nextInt(); // Asignara el numero introducido a numero.
        Random random = new Random(); // Creara un objeto de la clase random.
        int []array = new int[numero]; // Creara un array de enteros, cual tendrá el tamaño del array asignado
        for(int i = 0; i <numero; i++)
        {
            array[i] = random.nextInt(ExamenEDRefactorizado.maximo); // Aqui cada elemento del array sera rellenado con un numero entero que ira del numero 0 al 30.
        }

        ExamenEDRefactorizado.ejecutarAlgoritmo(array); // Una llamada al algoritmo
        input.close(); // Cerrara el proceso
    }


    public static void ejecutarAlgoritmo(int[] arrayenteros){

        int numero1 = 0; // numero1 será 0 al declararlo.
        int numero2 = ExamenEDRefactorizado.maximo; // numero2 será 30 o Maximo al declararlo.

        for(int i=0; i<arrayenteros.length; i++)
        {
            System.out.println(arrayenteros[i]); // Pondrá en pantalla el numero en el interior del hueco "i" del array, que será un numero evolutivo desde el 0 hasta su fin numero2 subiendo de uno en uno
            if(arrayenteros[i] > numero1 ){
                numero1 = arrayenteros[i]; // Aqui pone que si el numero en el interior del array es mayor que numero1, entonces numero1 pasará a ser ese numero
            }

            if(arrayenteros[i] < numero2){
                numero2 = arrayenteros[i]; // Aqui pone que si el numero en el interior del array es menor que numero2, entonces numero2 pasara a ser ese numero.
            }
        } // El proceso se repetira tantas veces como dure el for.

        int resultado = numero2 *numero1; // resultado sera igual a la multiplicación entre "numero2" numero2 "numero1".
        if (resultado == 0 || (resultado % 2 != 0)  ){
            System.out.println("NO ES");
        }else{
            System.out.println("ES");
        } // Si resultado es igual a 0, o su resto entre 2 no es igual a 0, entonces no será par, de otra forma, será par.

    }
}
