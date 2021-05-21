package Swap;

import java.util.Arrays;

public class SwapItems<N extends Number> {
    private static final Object N = "k";
    N[] c;
    int b, d;

    @SafeVarargs
    public SwapItems(int b, int d, N... c) {
        this.c = c;
        this.b = b;
        this.d = d;
        for (N n : c) {
            System.out.print("[" + n + "]");
        }
        System.out.println();
        swapItems(b, d, c);
        System.out.println();
        System.out.print(Arrays.asList(c));
    }

    private void swapItems(int b, int d, N[] c) {
        N firstItem = c[b];
        N secondItem = c[d];
        c[b] = secondItem;
        c[d] = firstItem;
        for (N n : c) {
            System.out.print("[" + n + "]");
        }
    }

}
