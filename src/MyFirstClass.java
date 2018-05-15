import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyFirstClass {
//statinis ne statinis metoda tik per klases objekta
    //paleidzia programa psvm(enter)
    public static void main(String[] args){

        //objekto sukurimas
      MyFirstClass myFirstClass = new MyFirstClass();

      float ff = 5.6f;

      myFirstClass.notStaticMethod("Jonas");

        System.out.println(sayHi());

        myFirstClass.checkThisNumber(20);

        System.out.println("Please insert a number!!!");
        Scanner scanner = new Scanner(System.in);
        try {
            int numb = scanner.nextInt();
            System.out.println("Your number is -> " + numb);
        }catch (InputMismatchException e) {
            System.out.println("Ivedete kazka ne taip");
        }
    }


    private void notStaticMethod(String name){
        // trumpinys sout(enter)
        System.out.println(name);
        sayHi();

    }

    private static String sayHi(){


        return "Hi Andrius";
    }

    private void checkThisNumber(int numb){
        if(numb>10){
            System.out.println("Daugiau");
        }else if(numb>15){
            System.out.println("Daugiau uz 15");
        }else{
            System.out.println("Maziau");
        }
    }
}
