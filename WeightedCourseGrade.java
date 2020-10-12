/**
 * This class will set user user input to the fields and apply the fields to the below methods
 * in order to calculate the weighted grade.
 *
 * @author Michael Soskin
 * @version .03 September 27th 2020
 */

/*
No argument Constructor
 */
public class WeightedCourseGrade {
    double weight;
    double grade;
    private double weightedSubtotal;
    private double categoryWeightTotal;

    public WeightedCourseGrade(){
        weight = 0.0;
        grade = 0.0;
        weightedSubtotal = 0.0;
        categoryWeightTotal = 0.0;
    }

/*
passes parameter to variable weightSubtotal and categoryWeightTotal
@param categoryWeightAndGrade
@return weight , weight*grade
 */
    public void addCategoryWeightAndGrade(double weight,double grade){
        this.categoryWeightTotal += weight;
        this.weightedSubtotal += (weight * grade);
    }
/*
Mutator method returning a double.
@param categoryWeightsTotal
@return categoryWeightTotal from previous method
 */
    public double getCategoryWeightsTotal(){
        return categoryWeightTotal;
    }
/*
Mutator method returning the product of two doubles
@param WeightSubtotal
@return weightedSubtotal which is the product of CategoryWeightAndGrade method
 */
    public double getWeightSubtotal() {
        return weightedSubtotal;
    }
/*
Mutator method that returns the final total of all category weights and grades.
@param CurrentGrade
@return percentTotal into a percentage by using Math.round
 */
    public double getCurrentGrade() {
        return getWeightSubtotal() / getCategoryWeightsTotal();


    }
    public double getPercentage(){
       double percentage = Math.abs(getCurrentGrade()* 100);
       return (Math.round(percentage));
    }
    /*
    toString will pas the mutator method get current grade into a string.
     */
    public String toString(){
        return ("Your weighted grade is "+ getCurrentGrade()+" "+ getPercentage() +"%");
    }
}
