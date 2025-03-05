import java.util.Scanner;
public class den {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1,n2,n3,n4,n5,total,average;
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    n4 = sc.nextInt();
    n5 = sc.nextInt();
    total=n1+n2+n3+n4+n5;
    average=total/5;
    System.out.println("total : "+total);
    System.out.println("average : "+average);
    }
}
