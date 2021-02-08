import java.rmi.activation.ActivationID;
import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) {

        WhereTheMagicHappens Activate = new WhereTheMagicHappens();
        Activate.setAmountOfRandom();
        Activate.setRandomsArray();
        Activate.readArray();
        Activate.sortArray1();
        Activate.readArray();


    }

}


class WhereTheMagicHappens {


    private static int amountOfRandom;
    private static int array1[];


    public void WhereTheMagicHappens(int x) {

        amountOfRandom = x;


    }

    public void setAmountOfRandom() {


        Scanner input1 = new Scanner(System.in);

        System.out.println("how many random numbers would you like?");
        amountOfRandom = input1.nextInt();

        array1 = new int[amountOfRandom];


    }


    public void setRandomsArray() {

        Random r = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(10 + 1);

        }


    }

    public void readArray() {

        for (int i = 0; i < array1.length; i++) {
            System.out.println((i + 1) + ": " + array1[i]);

        }


    }

    public void sortArray1() {


        boolean loop = false;

        //The problem is forgetting the while loop

        while (!loop) {

            for (int x = 0; x < array1.length - 1; x++) {

                for (int u = 0; u < array1.length - 1; u++) {

                    if (array1[u] > array1[u + 1]) {

                        int holder = 0;
                        holder = array1[u];
                        array1[u] = array1[u + 1];
                        array1[u + 1] = holder;

                    }


                }
                loop = true;

            }


        }


    }



}
