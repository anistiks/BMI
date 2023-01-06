public class BmiService {
    public double calculate(double weight, double height) {
        double indexBody = weight / height / height;
        return indexBody;
    }
}
