//8. WAP to transpose matrix of 2-D array
public class Transpose2DMatrixArray {
    public static void main(String[] args) {
        //creating a matrix
        int original[][] = {{1,2,3},{2,4,6},{3,6,9}};

        //creating another matrix to store transpose of a matrix
        int transpose[][] = new int[3][3]; //3 rows and 3 columns

        //code to transpose a matrix
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(original[i][j] + " ");
            }
            System.out.println();//new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}
