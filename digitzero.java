import java.util.Scanner;
public class digitzero 
{
    public static void main(String[] args) 
    {
      int  digit=1204,num=0;
      while(digit != 0)
      {
        digit=digit%10;
        num=num/10;
        if(num==0){
        System.out.println("zero exist");
        break;
        }
        else{
            System.out.println("zero doesnt exist");
            break;
        }
      }
    }

    
}
