import Allinone.Desktop;

public class Laptop extends Desktop {

    public Laptop(){

        System.out.println("charge");
    }
    public Laptop(String brand){

        System.out.println(brand);
    }

   /* int a=15;
    public void sup(){
        System.out.println(super.a);
        super.sup();
        System.out.println(a);
        System.out.println("this is cild method");

    }*/

    public static void main(String[] args) {
        Laptop ex=new Laptop();
       // ex.sup();


        Laptop exs=new Laptop("Hp");


    }


    }

