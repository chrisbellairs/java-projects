public class Magic {
  public static void main(String[] args) {
    //Input any number in myNumber and see that it will always return 3.

    //This is the original number
    int myNumber = 4;

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);

  }
}
