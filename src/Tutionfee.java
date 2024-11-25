
public class Tutionfee
{
    public static void main(String[] args) {
        double tuition = 10000; // Current tuition
        double targetTuition = tuition * 2; // Target tuition (double the current tuition)
        double rate = 0.07; // Annual increase rate
        int years = 0;

        // Loop until tuition doubles
        while (tuition < targetTuition) {
            tuition += tuition * rate;
            years++;
        }

        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}


