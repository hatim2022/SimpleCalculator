import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean tmp=true;
        Scanner scanner=new Scanner(System.in);
        int a,b,x;
        SimpleCalculator simpleCalculator=new SimpleCalculator();

        System.out.println("Welcome");


        while(tmp){
            System.out.println("please make a choice : ");
            System.out.println("1 ==> addition");
            System.out.println("2 ==> substraction");
            System.out.println("3 ==> multiplication");
            System.out.println("4 ==> division");
            System.out.println("5 ==> exit");
            x=scanner.nextInt();
            if(x==5){
                tmp=false;
                continue;
            }

            System.out.println("Please enter the first number : ");
            a=scanner.nextInt();
            System.out.println("Please enter the second number : ");
            b=scanner.nextInt();

            switch (x){
                case 1:
                    System.out.println("the result of adding "+a+" and "+b+" is :"+simpleCalculator.addition(a,b));
                    break;
                case 2:
                    System.out.println("the result of subtracting "+a+" and "+b+" is :"+simpleCalculator.subtraction(a,b));
                    break;
                case 3:
                    System.out.println("the result of multiplying "+a+" and "+b+" is :"+simpleCalculator.multiplication(a,b));
                    break;
                case 4:
                    System.out.println("the result of divising "+a+" and "+b+" is :"+simpleCalculator.division(a,b));
                    break;
            }


        }

        System.out.println("thank you");

    }
}
