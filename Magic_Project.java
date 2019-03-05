public class Magic_Project {
	public static void main(String[] args) {
    int myNumber = 8;
    //myNumber will be called the original number
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    
    System.out.println(stepSix);
	
    int x = 10;

    String y = (x>0) ? "Yes" : "No";
    System.out.println(y);

	}
}