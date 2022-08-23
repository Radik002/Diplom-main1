package ru.netology.graphics.image;

/**
  * Символы соответствия: '▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'
  * Вариант: '#', '$', '@', '%', '*', '+', '-', '''
  * Диапазон 0 - 255
  */
public class ColorToSymbol implements TextColorSchema {
    //    private static char[] sym = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
    //    private static char[] sym = {'#', '$', '@', '%', '*', '+', '-', '\''};
    private static final char[] SCHEMA_SYMBOLS = {'@', '■', '%', '$', '#', '+', '+', '*', '-', '\''};
    private static final int SCHEMA_LENGTH = SCHEMA_SYMBOLS.length;
    private static final double NUMBER_OF_COLORS = 256;

    @Override
    public char convert(int color) {
        double dNum = (SCHEMA_LENGTH / NUMBER_OF_COLORS) * color;
        return SCHEMA_SYMBOLS[(int) dNum];
    }
}
