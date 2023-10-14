public class Main {
  public static void main (String [] args) {

    // widening casting
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double
    
    System.out.println(myInt);
    System.out.println(myDouble);

    //narrowing casting
    double myDoubled = 9.78d;
    int myIntg = (int) myDoubled; // Explicit casting: double to int

    System.out.println(myDoubled);
    System.out.println(myIntg);
  }
}
