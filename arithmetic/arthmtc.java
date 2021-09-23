package arithmetic;
interface arthop{
    void add(int x,int y);
    void sub(int x,int y);
    void div(int x,int y);
    void multi(int x,int y);
}
public class arthmtc {
    void add(int x,int y){
        System.out.println("ADDITION: "+(x+y));
    }
    void sub(int x,int y){
        System.out.println("SUBTRACTION: "+(x-y));
    }
    void div(int x,int y){
        System.out.println("DIVISION: "+(x/y));
    }
    void multi(int x,int y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}
