public class Method {

    public static void main(String[] arg) {
        findPrimeNumber();
        findSeriesOfPrimeNumber();

    }

    public static void findSeriesOfPrimeNumber() {

        int num = 100;



        for (int i = 3; i <= num; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0)
                    isPrime = false;
            }


        if (isPrime) {

            System.out.println("The Number is Prime="+i);
        } else {
            System.out.println("The Number is not Prime="+i);
        }
        }
    }


    public static void findPrimeNumber() {
        int num = 3;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {


            if (num % i == 0)
                isPrime = false;
        }


        if (isPrime) {
            String i;
            System.out.println("The Number is Prime=" + num);
        } else {
            System.out.println("The Number is not Prime=" + num);
        }
    }

}
