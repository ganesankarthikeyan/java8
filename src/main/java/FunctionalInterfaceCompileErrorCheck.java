public class FunctionalInterfaceCompileErrorCheck {
   public static void main(String args[]){

   }
}

interface FI{
   public void m1();
   public void m2();
}

@FunctionalInterface
interface FIC{
   public void m1();
//   public void m2();
}
