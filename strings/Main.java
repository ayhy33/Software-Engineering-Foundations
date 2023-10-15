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
    System.out.println(tex.indexOf("locate")); // Java starts from index 0

    // concatenation
    String firstName = "John";
    String lastName = "DOe";
    System.out.println(firstName + " " + lastName);

    // concat()
    String firstNm = "John";
    String lastNm = "Doe";
    System.out.println(firstNm.concat(lastNm));

    // adding two numbers
    int x = 10;
    int y = 20;
    int z = x + y; // z will be 30 (an integer)

    // adding two strings
    String p = "10";
    String q = "20";
    String r = p + q; // r will be 1020 (a String)

    // adding number and string
    String t = "10";
    int u = 20;
    String v = t + u; // v will be 1020 (a String)

    // \" inserts a double quote 
    String statement = "We are the so-called \"Vikings\" from the north.";
    System.out.println(statement);

    // \' inserts a single quote
    String sentence = "It\'s alright.";
    System.out.println(sentence);

    // \\ inserts a single backslash
    String line = "The character \\ is called backslash.";
    System.out.println(line);
  }
}
