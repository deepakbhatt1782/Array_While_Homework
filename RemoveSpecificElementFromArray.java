import java.util.ArrayList;

public class RemoveSpecificElementFromArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(5);
        arr.add("Helen");
        arr.add("Paul");
        arr.add("Maria");
        arr.add("John");
        System.out.println("The list of the size is:" + arr.size());

        for(String name : arr) {
            System.out.println("Name is: " + name);
        }
        arr.remove(1);
        System.out.println("\nAfter removing the element the size is: ");

        for(String name : arr){
            System.out.println("Name is: " + name);
        }
    }
}
