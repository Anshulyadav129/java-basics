public class functions {
    public static void main(String[] args) {
        int x= 3;
//        System.out.println(fib(x));
//        int [] a={1,2,3};
//        System.out.println(sum(a));
    float q= 32;
        System.out.println(temp(q));
    }
    static int factorial(int a){
        if (a==0 || a==1){
            return 1;
        }
        else {
            return a*factorial(a-1);
        }

    }

    static void table(int x) {
            for (int i = 1; i <= 10; i++) {
                 System.out.format("%d X %d = %d \n", x, i, x * i);

        }
    }

    static void pattern(int a){
        for (int i=0;i<a;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternrev(int a){
        for (int i = a;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sumrec(int a){
        if (a==1){
            return 1;
        }
        else {
            return a + sumrec(a-1);
        }
    }
    static int fib(int a){
        if (a==1){
            return 0;
        }
        else if (a==2) {
            return 1;
        }
        else {
            return fib(a-1) + fib(a-2);
        }
    }
    static int sum(int ...a){
        int q=0,i=0;
        for (int w:a){
            q+=w;
            i++;
        }
        return q/i;
    }
    static float temp(float a){
        return a * (9f/5f) + 32f;
    }
}
