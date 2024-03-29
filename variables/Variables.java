public class Variables {
  public static void main (String [] args) {

    // variable that store text
    String name = "John";
    System.out.println(name);

    // variable that store number
    int myNum = 15;
    System.out.println(myNum);

    // variable assigning value later
    int myNumb;
    myNumb = 15;
    System.out.println(myNumb);

    // new value on an existing variable will overwrite the previous value
    int num = 15;
    num = 20;
    System.out.println(num);

    // use "final" keyword to avoid oversriting existing values
    final int numb = 15;
    numb = 20; // this will generate an error
    
  }
}
