import java.util.Scanner;
public class rooftopconditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the energy generated in kwh");
        double energyGenerated = sc.nextDouble();
        System.out.println("Energy Generated: " + energyGenerated + " kwh");
        if (energyGenerated <= 10) {
            System.out.println("Condition: Good energy generation");
        } else {
            System.out.println("Condition: low energy generation");
        }
    }
}