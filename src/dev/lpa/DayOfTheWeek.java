package dev.lpa;

public enum DayOfTheWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ,SATURDAY;


    // The enum type is used to declare a limited set of constants, and sometiems,
    // there is a natural order to the listing, as in the case of days of the week.

    // Some other examples of possible enum declarations might be:
    // The months in the year, a set of sizes, the direction in a compass (north..)

    @Override
    public String toString() {
        return "Day: " + name();
    }
}
