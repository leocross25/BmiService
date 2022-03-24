public class Main {
    public static void main(String[] args) {
        BmiService result = new BmiService();
        double height = 1.86;
        int weight = 95;
        double indexBmi = result.calculate(height, weight);
        System.out.println(indexBmi);
    }
}
