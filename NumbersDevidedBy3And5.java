//10.WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class NumbersDevidedBy3And5 {

        public static void main(String[] args) {
            System.out.println("Number divided by 3");
            for (int i = 1; i < 100; i++) {
                //finding the numbers which are divided by 3 between 1 - 100

                if (i % 3 == 0)
                    System.out.println(i + ",");
            }
            System.out.println("Number divided by 5");
            for (int i = 1; i < 100; i++) {
                //finding the numbers which are divided by 5 between 1 - 100

                if (i % 5 == 0)
                    System.out.println(i + ",");
            }
        }
    }


