import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        int ordersCount = 0;
        double capsulePrice = 0;
        int days = 0;
        int capsulesCount = 0;
        double sum = 0;
        double totalSum = 0;

        Scanner Input = new Scanner(System.in);
        ordersCount = Input.nextInt();
        for (int i = 0; i < ordersCount; i++) {
            int count = 1;
            count++;
            capsulePrice = Input.nextDouble();
            days = Input.nextInt();
            capsulesCount = Input.nextInt();

            sum = days * capsulesCount * capsulePrice;
            totalSum += sum;
            if (count == ordersCount) {
                System.out.println("The price for the coffee is: $" + String.format("%.2f", sum));
            }

        }

        System.out.println("Total: $" + String.format("%.2f", totalSum));
    }
}
