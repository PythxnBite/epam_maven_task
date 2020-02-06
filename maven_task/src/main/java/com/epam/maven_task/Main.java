package com.epam.maven_task;

import java.util.*;

public class Main {
    // Scanner for taking input
    static Scanner input = new Scanner(System.in);

    // ArrayLists for storing objects of different gifts.
    static ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
    static ArrayList<Sweets> sweets = new ArrayList<Sweets>();

    public static void main(String[] args) {
        inputChocolates();

        inputSweets();

        System.out.println("Total Weight of the Gift: " + totalWeight());
        System.out.println();
        System.out.println("Total Price of the Gift: " + totalPrice());
        System.out.println();

        System.out.println("Details of Gift after sorting by: ");
        System.out.println();
        System.out.println("1. Weight");
        sortedByWeight();
        System.out.println();
        System.out.println("2. Price");
        sortedByPrice();

    }

    private static void inputChocolates() {
        System.out.println("Enter No. of Chocolates in Gift");
        int numberOfChocolates = input.nextInt();
        for (int itr = 0; itr < numberOfChocolates; itr++) {
            System.out.println("Enter Weight of the Chocolate:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Chocolate:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. Candies \n2. Gummies \n3. Lollipops");
            int typeOfChocolate = input.nextInt();
            boolean flag = false;
            switch (typeOfChocolate) {
            case 1:
                for (Chocolate item : chocolates) {
                    if (item.getName() == "Candy") {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    Candy candy = new Candy(weight, price);
                    chocolates.add(candy);
                }
                break;
            case 2:
                for (Chocolate item : chocolates) {
                    if (item.getName() == "Gummies") {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    Gummies gummies = new Gummies(weight, price);
                    chocolates.add(gummies);
                }
                break;
            case 3:
                for (Chocolate item : chocolates) {
                    if (item.getName() == "Lollipops") {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    Lollipops lollipops = new Lollipops(weight, price);
                    chocolates.add(lollipops);
                }
                break;
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }

    }

    private static void inputSweets() {
        System.out.println("Enter No. of Sweets in Gift");
        int numberOfSweets = input.nextInt();
        for (int itr = 0; itr < numberOfSweets; itr++) {
            System.out.println("Enter Weight of the Sweets:");
            int weight = input.nextInt();
            System.out.println("Enter Price of the Sweets:");
            int price = input.nextInt();
            System.out.println("Select from below options: ");
            System.out.println("1. KajuBarfi \n2. GulabJamun \n3. Other Sweet");
            int typeOfSweets = input.nextInt();
            boolean flag = false;
            switch (typeOfSweets) {
            case 1:
                for (Sweets item : sweets) {
                    if (item.getName() == "KajuBarfi") {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    KajuBarfi kajuBarfi = new KajuBarfi(weight, price);
                    sweets.add(kajuBarfi);
                }
                break;
            case 2:
                for (Sweets item : sweets) {
                    if (item.getName() == "GulabJamun") {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    GulabJamun gulabJamun = new GulabJamun(weight, price);
                    sweets.add(gulabJamun);
                }
                break;
            case 3:
                System.out.println("Enter name of the Sweet");
                String sweetName = input.next();
                for (Sweets item : sweets) {
                    if (item.getName() == sweetName) {
                        flag = true;
                        item.addWeight(weight);
                        item.addPrice(price);
                    }
                }
                if (!flag) {
                    OtherSweets otherSweet = new OtherSweets(sweetName, weight, price);
                    sweets.add(otherSweet);
                }
                break;
            default:
                System.out.println("Please Enter a valid Option");
                itr--;
                break;
            }
        }
    }

    public static int totalWeight() {
        int total = 0;
        for (Chocolate item : chocolates) {
            total += item.getWeight();
        }
        for (Sweets item : sweets) {
            total += item.getWeight();
        }

        return total;

    }

    public static int totalPrice() {
        int total = 0;
        for (Chocolate item : chocolates) {
            total += item.getPrice();
        }
        for (Sweets item : sweets) {
            total += item.getPrice();
        }

        return total;

    }

    public static void sortedByWeight() {
        Comparator<Chocolate> chocolateWeightComparator = (Chocolate c1,
                Chocolate c2) -> ((Integer) c1.getWeight().compareTo(c2.getWeight()));

        Collections.sort(chocolates, chocolateWeightComparator);

        for (Chocolate i : chocolates) {
            System.out.println("Name of Chocolate: " + i.getName());
            System.out.println("Weight of Chocolate: " + i.getWeight());
            System.out.println("Price of Chocolate: " + i.getPrice());
            System.out.println();
        }

        Comparator<Sweets> sweetsWeightComparator = (Sweets c1,
                Sweets c2) -> ((Integer) c1.getWeight().compareTo(c2.getWeight()));

        Collections.sort(sweets, sweetsWeightComparator);

        for (Sweets i : sweets) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getPrice());
            System.out.println();
        }
    }

    public static void sortedByPrice() {
        Comparator<Chocolate> chocolatePriceComparator = (Chocolate c1,
                Chocolate c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));

        Collections.sort(chocolates, chocolatePriceComparator);

        for (Chocolate i : chocolates) {
            System.out.println("Name of Chocolate: " + i.getName());
            System.out.println("Weight of Chocolate: " + i.getWeight());
            System.out.println("Price of Chocolate: " + i.getWeight());
            System.out.println();
        }

        Comparator<Sweets> sweetsPriceComparator = (Sweets c1,
                Sweets c2) -> ((Integer) c1.getPrice().compareTo(c2.getPrice()));

        Collections.sort(sweets, sweetsPriceComparator);

        for (Sweets i : sweets) {
            System.out.println("Name of Sweet: " + i.getName());
            System.out.println("Weight of Sweet: " + i.getWeight());
            System.out.println("Price of Sweet: " + i.getWeight());
            System.out.println();
        }
    }
}