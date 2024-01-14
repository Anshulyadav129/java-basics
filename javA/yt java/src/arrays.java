import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
//        String [] day = new String[7];
//        day[0] = "monday";
//        day[1] = "tuesday";
//        day[2] = "wednesday";
//        day[3] = "thursday";
//        day[4] = "friday";
//        day[5] = "saturday";
//        day[6] = "sunday";
//        //System.out.println(day[6]);
//        int [] num = {1,2,3,4,5,6};
//        for (int i = 0;i<day.length;i++){
//            System.out.println(day[i]);
//        }
//        for (int n=num.length - 1;n>=0;n--){
//            System.out.println(num[n]);
//        }
//
//int [][]th =new int [2][3];
//        th [0][0]=201;
//        th [0][1]=202;
//        th [0][2]=203;
//        th [1][0]=101;
//        th [1][1]=102;
//        th [1][2]=103;
//for (int i=0;i<th.length;i++){
//    for (int j=0;j<th[i].length;j++){
//        System.out.print(th[i][j]);
//        System.out.print(" ");
//    }
//    System.out.println();
//}


//        float [] marks ={1.01f,3.99f,5,6,7};
//        float sum = 0;
//        for (float total:marks){
//            sum += total;
//        }
//        System.out.println(sum/ marks.length);


//        int [][] a={{1,2,3},{1,2,3}};
//        int [][] b={{3,2,1},{3,2,1}};
//        int [][] c={{0,0,0},{0,0,0}};
//
//        for (int i=0;i< a.length;i++){
//            for (int j =0;j<a[i].length;j++){
//                c[i][j]=a[i][j]+b[i][j];
//                System.out.print(c[i][j]+ " ");
//            }
//            System.out.println();
//        }
//
//        int [] a={1,2,3,4,5,6};
//        int temp;
//        int l = a.length;
//        int    n    =Math.floorDiv(l,2);
//        for (int i=0;i<n;i++){
//            temp = a[i];
//            a[i]=a[l-1-i];
//            a[l-1-i]=temp;
//        }
//        for (int b:a){
//            System.out.println(b);
//        }
//        int max =0;
//        for (int e:a){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println("max="+max);
//        int min=a[0];
//        for (int r:a){
//            if (min>r){
//                min = r;
//            }
//        }
//        System.out.println("min="+min);

        boolean sorted =true;
        int []arr={1,2,3,4,10,6};
        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
            }
        }
            if (sorted ==true){
                System.out.println("the array is sorted");
            }
            else {
                System.out.println("the array is not sorted");
            }
        }
    }

