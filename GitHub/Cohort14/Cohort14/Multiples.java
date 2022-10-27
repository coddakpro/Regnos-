import java.util.Scanner;

public class Multiples{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number = input.nextInt();

System.out.print("Enter number: ");
int number = input.nextInt();



if(number % 3){
number *= 3;
System.out.print("number Mutiplies by 3");
}else if(number / 2){
number *= 2;
System.out.println("number multiplies by 2");
}

}

  }