//5. Write a Java program to find the common elements between two arrays (string values)./
public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {

        String array1[] = {"black","red","pink", "yellow","brown","purple"};
        String array2[] = { "pink","blue","green","silver","gold","copper"};

        for (int i=0;i<array1.length;i++)
        {
            for(int j =0;j<array2.length;j++)
            {
                if (array1[i] == array2[j])
                {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
