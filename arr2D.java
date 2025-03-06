import java.util.Scanner;

public class arr2D {
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        int[][]arr=new int[5][5];
        System.out.println("enter the array: ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j]=5;
            }
           
        }

        System.out.println();

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    
    
}