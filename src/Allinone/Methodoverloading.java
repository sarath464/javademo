package Allinone;

public class Methodoverloading {
    public static void main(String[] args) {
        Methodoverloading s=new Methodoverloading();
        s.saran(10,50);
        s.mono("msk","saran");

        int a,b;

    }
    public void  saran(int a,int b){
        System.out.println(a+b);
    }
    public void  mono(String c,String d){
        System.out.println(c+d);
    }
    public void over(int a,int b){

        System.out.println("this is parent"+(a+b));
    }
}
