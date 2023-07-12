package Home;

public class Child extends methods{
    public static void main(String[] args) {
        Child obj = new Child("java");
        System.out.println(obj.getName());


    }
    public void methods(int a, int b){
        System.out.println("this is method overriding");
        System.out.println(a+b);


    }
 public String name;
    public Child(String n){
        System.out.println("parameterized constructor");
        this.name=n;

    }
    public String getName(){
        return name;
    }


}
