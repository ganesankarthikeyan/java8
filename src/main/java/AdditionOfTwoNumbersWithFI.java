public class AdditionOfTwoNumbersWithFI {
   public static void main(String args[]){
      AdditionOfTwoNumbersFI addition = (a,b)->a+b;
      System.out.println(addition.add(2,2));
   }
}

@FunctionalInterface
interface AdditionOfTwoNumbersFI{
   public int add(int a, int b);
}
