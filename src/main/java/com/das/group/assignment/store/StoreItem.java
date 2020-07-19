package com.das.group.assignment.store;

public class StoreItem {
    private static int id_counter = 0;
    public String ID;
    public String Name;
    public double Price;
    public int Unit;

    StoreItem(String name, double price, int unit) {
        Name = name;
        Price = price;
        Unit = unit < 1 ? 1 : unit;
        ID = String.valueOf(++id_counter);
    }

    @Override
    public String toString() {
        return ID + " | " + Name + " | " + Price + " | " + Unit;
    }
}
