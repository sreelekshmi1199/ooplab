import java.util.Scanner;

    class complex{
        float real;
        float imag;
        complex(){
            real=0;
            imag=0;
        }
        public void input(){
            Scanner reader=new Scanner(System.in);
            System.out.print("Enter Real part :");
            real=reader.nextFloat();
            System.out.print("Enter imaginary part :");
            imag=reader.nextFloat();
        }
        public complex add(complex obj){
            complex c=new complex();
            c.real=real+obj.real;
            c.imag=imag+obj.imag;
            return c;
        }
        public void output() {
            if (imag < 0)
                System.out.print("Complex number1: " + real + "  " + imag + "i");
            else
                System.out.print("Complex number2: " + real + "  " + imag + "i");
        }
    };
        public class complexadd {
            public static void main(String[] args){

                complex c1=new complex();
                complex c2=new complex();
                complex result=new complex();
                System.out.print("Enter first complex number\n ");
                c1.input();
                System.out.print("Enter second complex number\n ");
                c2.input();
                result = c1.add(c2);
                result.output();
            }    }
