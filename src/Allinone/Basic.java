package Allinone;

import java.util.Scanner;

public class Basic {


    public static void main(String[] args) {
        Basic sc=new Basic();
        int result=sc.add(10,20);
        sc.store(result);

    }
    public void store(int result){
        System.out.println("in sub method"+result);

    }
    public int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }


}
