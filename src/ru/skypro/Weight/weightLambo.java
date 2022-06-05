package ru.skypro.Weight;

public class weightLambo implements Weight {
    @Override
    public String totalWeight() {
        return " Вес ламбы 1500 кг";
    }

    @Override
    public String capacity() {
        return "Гпузоподьемность ламбы 100 кг";
    }
}
