public class HelloWorldWithoutFI {
   public static void main(String args[]){
      HelloWorldNonFI helloWorld = new HelloWorldImplementation();
      helloWorld.method();
   }
}

interface HelloWorldNonFI{
   public void method();
}

class HelloWorldImplementation implements HelloWorldNonFI{
   public void method(){
      System.out.println("Hello World");
   }
}