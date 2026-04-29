import java.util.Scanner;
//classe per detectar divisions entre zero
class DivisioPerZeroException extends  RuntimeException{

}
//clase per detectar divisions 0/0
class DivisioZeroZeroException extends RuntimeException{

}
public class Main {
    static int  error=0;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);

            int a= Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());

                int c= divideix(a,b);
                System.out.println(c);


    }
        //tambien se puede poner throws Exception en vez d eir poniendo nombre por nombre pero no es lo suyo
    static int divideix(int a, int b) {
       if (b==0){
         if (a==0)throw new DivisioZeroZeroException();
         throw new DivisioPerZeroException();
       }
        return a / b;

    }
}
