package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {




        Customer tom = new Customer("Tom");
        Customer cat = new Customer("Cat");
        Bank bank = new Bank("City Bank");

        bank.addCustomer(tom);
        bank.addCustomer(cat);
        bank.addCustomer(tom);

        bank.addTransaction("Tom", 50);
        bank.addTransaction("Tom", -18);
        bank.addTransaction("Tom", 15);
        bank.addTransaction("Cat", 32.54);
        bank.addTransaction("Cat", -9.6);

        bank.printStatement("Tom");
        bank.printStatement("Cat");
        System.out.println();

        System.out.println("-".repeat(40));
        DayOfTheWeek weekDay = DayOfTheWeek.TUESDAY;
        System.out.println(weekDay);

        // ordinal method: return the ordinal value (start counting at 0)
        System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());

        for (int i =0; i<10; i++){
            var day = getRandomDay();
            System.out.println(day.ordinal() + " " + day);

            if (day == DayOfTheWeek.FRIDAY){
                System.out.println("Found a Friday!");
            }

        }

    }

    public static void switchDayOfWeek (DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WEDNESDAY -> {
                // .name() method can not be overridden.
                System.out.println("Wednesday is day " + weekDay.name());
                // automatically call the toString() method which can be overridden!
                System.out.println("Wednesday is day " + weekDay);
            }

        }
    }

    public static DayOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        // An array of all the enum constant values
        var allDays = DayOfTheWeek.values();
        switchDayOfWeek(allDays[randomInt]);
        // Access the specific element of Array using index.
        return allDays[randomInt];
    }
}