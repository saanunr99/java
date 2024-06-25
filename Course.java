public class Course {
    public static void main(String[] args) {
        double courseCost = 12000.0;
        double gstRate = 18.0;

        double gstAmount = (gstRate / 100) * courseCost;

        double totalFee = courseCost + gstAmount;

        System.out.println("Course Cost: Rs. " + courseCost);
        System.out.println("GST Rate: " + gstRate + "%");
        System.out.println("GST Amount: Rs. " + gstAmount);
        System.out.println("Total Fee (including GST): Rs. " + totalFee);
    }
}
