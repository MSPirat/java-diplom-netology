package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchemaImpl;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

import java.io.File;
import java.io.PrintWriter;

public class Main {

    private final static double maxRatio = 0; //= 1.0

    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут объект вашего класса конвертера
        converter.setMaxRatio(maxRatio);
        converter.setTextColorSchema(new TextColorSchemaImpl());
        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
        // String url = "https://pngicon.ru/file/uploads/vinni-pukh-v-png.png";
        // String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        // String imgTxt = converter.convert(url);
        // System.out.println(imgTxt);
    }
}