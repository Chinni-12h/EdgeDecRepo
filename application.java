class Main {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    Main obj = new Main();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
  #feature202 changes by pavan for the report module in oct2023
  public int addNumbers(int a, int b) {
    int sum = a + b;
    return sum;
}

public static void main(String[] args) {
    Main obj = new Main();
    int result = obj.addNumbers(25, 15);
    System.out.println("Sum is: " + result);
}
#end of feature202 code
}