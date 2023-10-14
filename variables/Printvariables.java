public class Printvariables {
 public static void main (String [] args) {
   String name = "John";
   System.out.println("Hello" + name);

  String firstName = "John ";
  String lastName = "Doe";
  String fullName = firstName + lastName;
  System.out.println(fullName);

  // for numeric values, + woels as mathematical operator
  int x = 5;
  int y = 6;
  System.out.println(x + y);

  // declare more than one variable of the same type
  int p = 5, q = 6, r = 50;
  System.out.println(p + q + r);

  // assign same value to multiple variables in one line
  int t, u, v;
  t = u = v = 50;
  System.out.println(t + u + v);
 }
}
