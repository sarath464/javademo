package Allinone;

public class Methodoverriding extends Methodoverloading {
    public static void main(String[] args) {
        Methodoverriding ex=new Methodoverriding();
        ex.over(10,5);


    }
    public void over(int a,int b){
        System.out.println("this is child"+(a+b));
    }
}
