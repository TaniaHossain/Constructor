
public class Constructor {

   public static void main(String args[]) {
      System.out.println("Simple Constructor Calling Result:");
	  MyClass t1 = new MyClass();
      MyClass t2 = new MyClass();
      System.out.println(t1.x + " " + t2.x);
      System.out.println("Constructor with Parameter Calling Result:");
      MyClass t3 = new MyClass( 13 );
      MyClass t4 = new MyClass( 197 );
      System.out.println(t3.x + " " + t4.x);
      
   }
}

class MyClass {
	   int x;
	   MyClass() {
	      x = 77;
	   }
	   MyClass(int i ) {
		      x = i;
		   }
	}