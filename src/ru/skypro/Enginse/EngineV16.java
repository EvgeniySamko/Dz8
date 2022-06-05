package ru.skypro.Enginse;

public class EngineV16 implements Engine{
    @Override
    public String getSpeed() {
        return "60km/h";
    }

    @Override
    public String typeGasoline() {
        return "Дизельный двигатель";
    }
}
