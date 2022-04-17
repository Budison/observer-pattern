package com;

public class Board {
    String board = """
            
            
            
            """;

    @Override
    public String toString() {
        return board;
    }

    public Board o(int i) {
        StringBuilder stringBuilder = new StringBuilder(board);
        stringBuilder.setCharAt(i, 'o');
        board = stringBuilder.toString();
        return this;
    }
}
