package Allinone;

public class Strings {
    String name;
    int as;
    public Strings(String name,int a) {
        this.name=name;
        this.as=a;
    }
    public String toString(){
        return name+" "+this.as;

    }

    public static void main(String[] args){
        Strings sa=new Strings("this is object string",55);
        String str="sarath";
        System.out.println(str.length());
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                System.out.println(str.charAt(i));
            }

        }}
}
