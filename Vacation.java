import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        int numberOfPeople;


        Scanner Input = new Scanner(System.in);
        numberOfPeople = Input.nextInt();
        String typeOfGroup = Input.next();
        String typeOfDay = Input.next();
        double price = 0;
        double sum = 0;
        double discountPrice = 0;
        switch (typeOfGroup) {
            case "Students":
                if (typeOfDay.equals("Friday")) {
                    price = 8.45;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 30) {
                        discountPrice = sum * 0.85;
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Saturday")) {
                    price = 9.80;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 30) {
                        discountPrice = sum * 0.85;
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Sunday")) {
                    price = 10.46;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 30) {
                        discountPrice = sum * 0.85;
                    }else
                        discountPrice=sum;
                }
                break;

            case "Business":
                if (typeOfDay.equals("Friday")) {
                    price = 10.90;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 100) {
                        discountPrice = sum - (price * 10);
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Saturday")) {
                    price = 15.60;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 100) {
                        discountPrice = sum - (price * 10);
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Sunday")) {
                    price = 16;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 100) {
                        discountPrice = sum - (price * 10);
                    }else
                        discountPrice=sum;
                }
                break;

            case "Regular":
                if (typeOfDay.equals("Friday")) {
                    price = 15;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        discountPrice = sum * 0.95;
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Saturday")) {
                    price = 20;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        discountPrice = sum * 0.95;
                    }else
                        discountPrice=sum;
                }

                if (typeOfDay.equals("Sunday")) {
                    price = 22.50;
                    sum = numberOfPeople * price;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                        discountPrice = sum * 0.95;
                    }else
                        discountPrice=sum;
                }
                break;

            default:
                //  System.out.println("Wrong enrty, please try again");
                break;


        }
        System.out.println("Total price: " + String.format("%.2f", discountPrice));


    }
}
