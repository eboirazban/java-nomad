import processing.core.PApplet;

public class Main1 extends PApplet {
    int tileSize = 50;
    int hoverCol = -1;
    int hoverRow = -1;


    public static void main(String[] args) {
        // Запуск приложения Processing
        PApplet.main("Main1");
    }

    public void settings() {
        size(400, 400);  // Устанавливаем размер окна
    }

    public void setup() {
        // Настройки при запуске
        background(255);
    }

    public void draw() {


        // Рисуем шахматную доску
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                // Определяем цвет клетки
                if ((row + col) % 2 == 0) {
                    fill(255);  // Белый
                } else {
                    fill(0);    // Черный
                }


                // Рисуем квадрат
                rect(col * 50, row * 50, 50, 50);
            }
        }
    }
}