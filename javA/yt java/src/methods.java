public class methods {
    static int sum(int...arr){
        int o=0;
        for (int q:arr){
            o+=q;
        }
        return o;

    }
    static void joke(){
        System.out.println("you are a noob!!!");
    }
    static int add(int x,int y){
        int z=0;
        z=x+y;
        return z;

    }
    public static void main(String[] args) {
//        int a,b;
//        a=23;
//        b=17;
//        System.out.println(add(a,b));
//        int c=10,d=11;
//        System.out.println(add(c,d));
//        joke();
        int w=1,e=2,r=3,t=4,y=5;
        System.out.println(sum(w+e));
        System.out.println(w+e+r);
        System.out.println(w+e+r+t);
        System.out.println(w+e+r+t+y);



    }
}
