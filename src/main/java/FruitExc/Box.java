package FruitExc;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    @SafeVarargs
    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    @SafeVarargs
    public final void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001;
    }

    public void transferArray(Box<? super T> box) {
        if (this == box) return;
        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

}
