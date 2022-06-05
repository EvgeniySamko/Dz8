package ru.skypro;

import ru.skypro.Beepers.Beeper;
import ru.skypro.Weight.Weight;
import ru.skypro.Enginse.Engine;

public abstract class Car {

    Beeper beeper;
    Engine engine;
    Weight weight;


    public Car(Beeper beeper, Engine engine, Weight weight) {
        this.beeper = beeper;
        this.engine = engine;
        this.weight = weight;

    }



}
