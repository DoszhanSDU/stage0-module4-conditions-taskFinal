package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide &&
                secondSide + thirdSide > firstSide &&
                thirdSide + firstSide > secondSide) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }
}
