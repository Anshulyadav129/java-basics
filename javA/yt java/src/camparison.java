import java.util.Scanner;
public class camparison {
    public static void main(String[] args) {
        System.out.println("enter number 1");
        Scanner s1= new Scanner(System.in);
        int a=s1.nextInt();
        System.out.println("enter number 2 to compare");
        int b=s1.nextInt();
        if (a==b){
            System.out.println("both numbers are equal");
        } else if (a>b){
            System.out.println("number 1 is greater than number 2");
        }
        else {
            System.out.println("number 2 is greater than number 1");
        }
    }
}
