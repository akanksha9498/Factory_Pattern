import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          GetPlanFactory plan = new GetPlanFactory();
          String planType = scn.next();
          scn.nextLine();
double unit = scn.nextDouble();
Plan p = plan.getPlan(planType);
p.getRate();
p.calculateBill(unit);
}
}