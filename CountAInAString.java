//3. WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;
public class CountAInAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");

        String str = sc.nextLine();
        System.out.println("Number of 'a' in string:" + CountNumberOfaInString(str));
    }
    public static int CountNumberOfaInString(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }
}
