package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {
    @Override
    public char convert(int color) {
        if (color < 25) {
            return '▇';
        } else if (color < 50) {
            return '●';
        } else if (color < 75) {
            return '◉';
        } else if (color < 100) {
            return '◍';
        } else if (color < 125) {
            return '◎';
        } else if (color < 150) {
            return '○';
        } else if (color < 175) {
            return '☉';
        } else if (color < 200) {
            return '◌';
        } else if (color < 225) {
            return '+';
        } else {
            return '-';
        }
    }
}
