import java.util.Scanner;
public class statements {
    public static void main(String[] args) {
        /*Scanner num = new Scanner(System.in);
        System.out.println("enter your marks in maths:");
        int a= num.nextInt();
        System.out.println("enter your marks in chemistry:");
        int b= num.nextInt();
        System.out.println("enter your marks in physics:");
        int c= num.nextInt();

        float avg= (a+b+c)/3.0f;
        System.out.println("your overall percentage: "+ avg);
        if (avg>40 && a>33 && b>33 && c>33){
            System.out.println("congratulations you have been promoted");
        }
        else {
            System.out.println("Sorry you have not been promoted");
        }*/
//        Scanner day = new Scanner(System.in);
//        System.out.println("enter the number of the day:");
//        int d= day.nextInt();
//        switch (d){
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("thursday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//        }
        Scanner web = new Scanner(System.in);
        System.out.println("enter the full website url:");
        String name = web.next();
        if (name.endsWith(".com")){
            System.out.println("its a e-commerce website.");
        }
        else if (name.endsWith(".in")){
            System.out.println("its an indian origin website");
        }
        else if (name.endsWith(".org")){
            System.out.println("its an organisational website");
        }
    }
}
