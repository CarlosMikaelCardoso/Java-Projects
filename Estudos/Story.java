package Estudos;
public class Story {
    public static void main(String[] args) {
        int myNumber = 7;
        /* MY number is equals 2 */
        int stepOne = myNumber * 2;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepOne);
        System.out.println(stepTwo);
        System.out.println(stepThree);
        System.out.println(stepFour);
        System.out.println(stepFive);
        System.out.println(stepSix);

    }
}
