import java.util.Scanner;
//classe per detectar divisions entre zero
class DivisioPerZeroException extends  Exception{

}
//clase per detectar divisions 0/0
class DivisioZeroZeroException extends Exception{

}
public class Main {
    static int  error=0;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(System.in);
        while (true){
            int a= Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());
            try{
                int c= divideix(a,b);
                System.out.println(c);
                break;
            } catch (DivisioPerZeroException e){
                System.out.println("no puc dividir entre 0");


            }catch (DivisioZeroZeroException e){
                System.out.println("no es pot dividir 0/0");
            }
        }


    }

    static int divideix(int a, int b) throws Exception {
       if (b==0){
         if (a==0)throw new DivisioZeroZeroException();
         throw new DivisioPerZeroException();
       }
        return a / b;

    }
}
