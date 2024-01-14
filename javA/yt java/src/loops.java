public class loops {
    public static void main(String[] args) {
//    int i=5;
//    for (int a=0;a<i;a++){
//        System.out.println();
//    for (int n=i;n>a;n--){
//        System.out.print("*");
//    }
//    }
//        System.out.println("\n");
//    int b=1;
//    int c=0;
//    while (b<11){
//        System.out.println(b);
//        c=c+b;
//        b++;
//    }
//        System.out.println("the sum of first 10 natural numbers will be "+c);

//        int b=10,c;
//        for (int i=1;i<=b;i++){
//            c = 2 * i;
//            System.out.println("2 X "+ i +" = "+ c );
//        }
//int n=5,b=n;
//for (int i=1;i<n;i++){
//    b *= i ;
//}
//        System.out.println(b);



//   int q=5,w=0,n=0;
//   while (w<q){
//       System.out.println();
//       while (n<q){
//       System.out.print("*");
//       n++;
//       }
//       w++;
//       n=w;
//   }
        //for loop 10 natural numbers
        int q=10,sum=0;
        for (int i=0;i<=q;++i){
            sum += i;
        }
        System.out.println(sum);

    }
}
