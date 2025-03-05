import java.util.Scanner;

public class marks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int mark1 = sc.nextInt();
      int pass=50;
      if(mark1>=pass){
        System.out.println("you have passed");
      }
      else{
        System.out.println("you have failed");
      }
    }
    
}
