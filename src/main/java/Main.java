import FruitExc.Apple;
import FruitExc.Box;
import FruitExc.Orange;
import Swap.SwapItems;


public class Main {
    public static void main(String[] args) {
        SwapItems<Integer> swapItems = new SwapItems<>(3,2,1,2,3,4);
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2);
        System.out.println(box1.getFruits());
        System.out.println(box2.getFruits());
        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.transferArray(box3);
        System.out.println(box3.getFruits());
        System.out.println(box2.getFruits());
    }
}
