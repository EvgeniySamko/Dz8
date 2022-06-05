package ru.skypro;

import ru.skypro.Beepers.Beeper;
import ru.skypro.Enginse.Engine;
import ru.skypro.Weight.Weight;

public class Bilaz extends Car{
    public Bilaz(Beeper beeper, Engine engine, Weight weight) {
        super(beeper, engine, weight);
    }
    String priceBilaz(){
        return "12 390 000 тысяч рублей";

    }
    String truckBodyUp(){
        return "Поднимает кузов ";
    }

    String truckBodyDw(){
        return "Опускает Кузов";
    }
}
