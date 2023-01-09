import java.util.Scanner;
import java.util.List;
public class Calculator {
    public static void main(String[] args) {
      int num1;
      int num2;
      int ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите два числа и операцию: ");
      num1 = reader.nextInt();
      op = reader.next().charAt(0);
      num2 = reader.nextInt();
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
         default:  System.out.printf("Ошибка");
            return;
      }
      System.out.print("\nРезультат операции:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
  }
  
