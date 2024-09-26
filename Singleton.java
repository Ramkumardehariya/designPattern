// package designPattern;

class Abc{
    private Abc(){

    };
    static Abc obj = new Abc();

    public static Abc getInstance(){
        return obj;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Abc ab = Abc.getInstance();
    }
}
