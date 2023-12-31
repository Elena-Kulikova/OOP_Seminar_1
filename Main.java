// Нужно создать несколько классов животных:
// 1. Пес (Собака)
// 2. Кот (Кошка)
// 3. ... придумать еще парочку

// Каждое животное имеет: (поля)
// 1. Имя (кличка)
// 2. Возраст
// 3. ... придумать еще какие-то параметры

// Каждое животное может: (методы)
// 1. Подавать голос
// 2. Питаться (съедает какое-то количество еды, переданное в метод)
// 3. Двигаться
// 4. ... все, что сумеете придумать

// Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
// Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Animals> animals = new LinkedList<>();
        Animals cat = new Cat(57, 8, "золотисто-зеленые", "Беляш", "Девон-рекс", "серо-белый", "25.08.2017.");
        Animals dog = new Dog(89, 17, "карие", "Рэкс", "Овчарка", "черный", "01.01.2020.");
        Animals tiger = new Tiger(102, 50, "зеленые", "Амурская тайга", "15.02.2022.");
        Animals wolf = new Wolf(50, 30, "черные", "лес", "08.03.2022г.");

        animals.add(cat);
        animals.add(dog);
        animals.add(tiger);
        animals.add(wolf);

        Zoo.getData(animals);
        Zoo.doSomething(animals);
    }
}