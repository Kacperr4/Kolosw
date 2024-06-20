package org.example;

import java.io.IOException;

public class Calculator {
    int x,y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() throws IOException {
        return x+y;
    }
}
