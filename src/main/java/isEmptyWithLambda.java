import java.util.function.Predicate;

public class isEmptyWithLambda {
   public static void main(String args[]){
      Predicate<String> isEmptyString = input->input.isEmpty();
      System.out.println("is empty "+isEmptyString.test(""));
      System.out.println("is empty "+isEmptyString.test("not empty"));
   }
}
