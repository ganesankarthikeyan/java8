public class AdditionOfTwoNumbersWithoutFI {
   public static void main(String args[]){
      AdditionOfTwoNumbersNonFI addition = new AdditionOfTwoNumbersImplementationNonFi();
      System.out.println(addition.add(2,2));
   }
}

interface AdditionOfTwoNumbersNonFI{
   public int add(int a, int b);
}

class AdditionOfTwoNumbersImplementationNonFi implements AdditionOfTwoNumbersNonFI{
   public int add(int a, int b){
      return a+b;
   }
}
