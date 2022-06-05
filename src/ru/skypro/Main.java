package ru.skypro;

import ru.skypro.Beepers.Beeper;
import ru.skypro.Beepers.Horn;
import ru.skypro.Beepers.MegicSound;
import ru.skypro.Beepers.SuperLoudHorn;
import ru.skypro.Enginse.Engine;
import ru.skypro.Enginse.EngineV12;
import ru.skypro.Enginse.EngineV16;
import ru.skypro.Enginse.EngineV6;
import ru.skypro.Weight.Weight;
import ru.skypro.Weight.weightBilaz;
import ru.skypro.Weight.weightLambo;
import ru.skypro.Weight.weightPriora;

public class Main {
    public static void main(String[] args) {

        Horn horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Weight weightLambo = new weightLambo();

        Lambo lambo = new Lambo(horn, engineV12, weightLambo);

        Beeper magicSound = new MegicSound();
        Engine engineV6 = new EngineV6();
        Weight weightPriora = new weightPriora();

        Priora priora = new Priora(magicSound, engineV6, weightPriora);

        SuperLoudHorn superLoudHorn = new SuperLoudHorn();
        EngineV16 engineV16 = new EngineV16();
        Weight weightBilaz = new weightBilaz();

        Bilaz bilaz = new Bilaz(superLoudHorn, engineV16, weightBilaz);





        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.weight.totalWeight());
        System.out.println(lambo.weight.capacity());
        System.out.println(lambo.engine.typeGasoline());

        System.out.println();

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.weight.totalWeight());
        System.out.println(priora.weight.capacity());
        System.out.println(priora.engine.typeGasoline());

        System.out.println();

        System.out.println(bilaz.beeper.makeSound());
        System.out.println(bilaz.engine.getSpeed());
        System.out.println(bilaz.weight.totalWeight());
        System.out.println(bilaz.weight.capacity());
        System.out.println(bilaz.engine.typeGasoline());
        System.out.println(bilaz.priceBilaz());
        System.out.println(bilaz.truckBodyUp());
        System.out.println(bilaz.truckBodyDw());

    }

}
