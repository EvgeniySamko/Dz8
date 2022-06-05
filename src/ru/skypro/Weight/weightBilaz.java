package ru.skypro.Weight;

public class weightBilaz implements Weight{
    @Override
    public String totalWeight() {
        return "Вес Билаза 350тонн";
    }

    @Override
    public String capacity() {
        return "Грузоподьемность 450 тонн";
    }
}
