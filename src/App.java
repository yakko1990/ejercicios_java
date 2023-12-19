import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class App
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {

        GiveMeTheNegative();
        GiveMeTheMultiple();
        GiveMeTheInvertedVector();
        GiveMeThePalindrome();
        ParesoNones();
    }



    public static int GiveMeTheNegative(){
        int[] numbers = new int[5];
        int count = 0;

        System.out.println("dime 5 numeros");


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numero " + (i + 1));
            int num = scanner.nextInt();
            if(num < 0){
                numbers[i]= num;
                count++;
            }

        }
        System.out.println("hay " + count + " numeros negativos");

        return count;
    }


    public static void GiveMeTheMultiple() {
        int count = 0;
        String answer = "si"; // Inicializamos la respuesta con "si"

        while (answer.equalsIgnoreCase("si")) {
            System.out.println("Dime un numero");
            int num = scanner.nextInt();

            if (num % 3 == 0) {
                System.out.println("Es multiplo de 3");
            } else {
                System.out.println("No es multiplo de 3");
            }

            System.out.println("¿Quieres probar con otro numero? (si/no)");
            scanner.nextLine();
            answer = scanner.nextLine();
        }


    }

    public static int[]GiveMeTheInvertedVector(){


        System.out.println("Dime cuantos numeros quieres agregar al array:");
        int num = scanner.nextInt();
        int []arraynum = new int[num];
        int [] arrayinverso = new int[num];

        for (int i = 0; i < arraynum.length; i++) {
            System.out.println("dime el numero " +  (i + 1));
            int numarray = scanner.nextInt();
            arraynum[i]=numarray;

        }

        for (int i = 0; i < arraynum.length; i++) {

            arrayinverso[arraynum.length-1-i] = arraynum[i];

        }

        System.out.println("Asi queda el array que has construido invertido"+ Arrays.toString(arrayinverso));

        return arrayinverso ;
    }


    public static void GiveMeThePalindrome(){

        System.out.println("Dime una palabra:");
        String word = scanner.nextLine();
        char[] Palindromeword = word.toCharArray();


        char[] Newpalindromeword = new char[Palindromeword.length];

        for (int i = 0; i < Palindromeword.length; i++) {

            Newpalindromeword[Palindromeword.length - 1 - i] = Palindromeword[i];

        }
        boolean sonIguales = Arrays.equals(Palindromeword, Newpalindromeword);


        if (sonIguales) {
            System.out.println("Son palindromos");
        } else {
            System.out.println("No son palindromos");
        }
    }

    public static void ParesoNones(){


        int numrandom = (int) (Math.random() * 5);

        for (int i = 0; i < 3; i++) {
            System.out.println("¿Eliges pares o nones:");
            String answer = scanner.nextLine();

            System.out.println("Dime el número:");
            int num = scanner.nextInt();
            scanner.nextLine();

            System.out.println(numrandom);

            if ((answer.equals("pares") && (numrandom + num) % 2 == 0) ||
                    (answer.equals("nones") && (numrandom + num) % 2 != 0)) {
                System.out.println("Ganaste");
            } else {
                System.out.println("Perdiste");
            }
        }
    }







}





