public class Main {
  public static void main (String [] args) {
    String greeting = "Hello";
    System.out.println(greeting);

    // string length
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    // upper and lower case string
    String text = "Hello World";
    System.out.println(text.toUpperCase());
    System.out.println(text.toLowerCase());

    // index 
    String tex = "Please locate where 'locate' occurs!";
    System.out.println(tex.indexOf("locate"));
  }
}
