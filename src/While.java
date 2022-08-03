import java.util.Scanner;

public class While {

    public static void main(String[] arg) {

        for (int i = 2; i <= 100 ; i++) {
            boolean isPrime = true;


            for (int j = 2; j <= i/2; j++) {

                if ((i % j) == 0) {

                    isPrime = false;
                }

            }

            if (isPrime) {
                System.out.println("it is Prime Number=" + i);
            } else {
                System.out.println("it is not Prime Number=" + i);

            }
        }

        }
        }















