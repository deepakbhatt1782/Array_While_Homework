import java.util.Scanner;

//4. Printing multiplication table using do while loop
public class MultiplicationTableUsingDoWhile {
    public static void main(String[] args) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i = 1;
        System.out.println("The multiplication table of "+n+" is: ");
        do {
            System.out.println(n+ " * "+i+" = "+ (n*i));
            i++;
        }
        while(i<=10);
    }
}
