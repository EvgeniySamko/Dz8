package ru.skypro.Beepers;

import ru.skypro.Beepers.Beeper;

public class Horn implements Beeper {
    @Override
    public String makeSound() {
        return "Guuuuuuuu";
    }
}
