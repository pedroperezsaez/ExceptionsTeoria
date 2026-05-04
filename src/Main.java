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

            int a= Integer.parseInt(scanner.nextLine());
            int b=Integer.parseInt(scanner.nextLine());
            while (true){
                try{
                    int c= divideix(a,b);
                    break;
                } catch(DivisioPerZeroException e){
                    System.out.println("no puc dividir entre zero");
                } catch (DivisioZeroZeroException o){
                    System.out.println("divide 0 entre 0 malo");
                }
            }



    }
        //tambien se puede poner throws Exception en vez d eir poniendo nombre por nombre pero no es lo suyo
    static int divideix(int a, int b) throws DivisioPerZeroException,DivisioZeroZeroException {
       if (b==0){
         if (a==0)throw new DivisioZeroZeroException();
         throw new DivisioPerZeroException();
       }
        return a / b;

    }
}
