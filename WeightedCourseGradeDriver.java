import java.util.Scanner;
import java.lang.Math;
/*
This driver class will instantiate the objet and apply its respective fields to the class
WeightedCourseGrade.
 */
public class WeightedCourseGradeDriver {

    public static void main(String[] args) {
        WeightedCourseGrade weightedCourseGrade = new WeightedCourseGrade();
        double weightTmp ;
        double gradeTmp ;
        int categoryNum;
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Welcome to the Weighted Grade Calculator!"+"\n");

            System.out.println("Enter the number of categories for weight:");
            categoryNum =UserInput.nextInt();

            for (int x = 0; x!= categoryNum;x ++) {
                System.out.println("Please enter a category weight:");
                weightTmp = UserInput.nextDouble();
                while (Math.abs(weightTmp - 1.0) < 0.001) {
                    System.out.println("Please Enter a category weight:");
                    weightTmp = UserInput.nextDouble();
                }
                System.out.println("Please enter the category grade:");
                gradeTmp = UserInput.nextDouble();
                while (Math.abs(gradeTmp - 1.00) < 0.001) {
                    System.out.println("Please enter the category grade:");
                    gradeTmp = UserInput.nextDouble();
                }
                weightedCourseGrade.addCategoryWeightAndGrade(weightTmp,gradeTmp);

            }
            System.out.println(weightedCourseGrade.toString());



}

}