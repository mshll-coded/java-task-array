public class App {
    public static void main(String[] args) {
        double[] temperatures = {21.5, 27, 31, 0, 5};

        temperatures[2] = 100;

        for (double temp : temperatures) {
            System.out.println(temp);
        }
    }
}
