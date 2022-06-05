package ru.skypro.Enginse;

public class EngineV12 implements Engine {


    @Override
    public String getSpeed() {
        return "300km/h";
    }

    @Override
    public String typeGasoline() {
        return "Бензиновый двигатель";
    }
}
