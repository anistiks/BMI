public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 60; //kg
        double height = 1.60; //m
        double BmiService = service.calculate(weight, height);
        System.out.println("Your BMI is " + BmiService);
    }
}
