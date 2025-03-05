import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
    int n=8,i=1,prime=0;
    if(n==1){
        System.out.println("notprime");
        
    }
    for(i=2;i<n;i++){
    if(n%i == 0){
        prime++;

    }
}
if(prime==1){
System.out.println("prime");
}
else{
    System.out.println("not prime");
}

    
    }
    }



    

