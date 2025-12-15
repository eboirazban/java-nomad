import processing.core.PApplet;

public class Main1 extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main1");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(255);
    }

    public void draw() {
        // Размер каждой клетки
        int cellSize = 50;

        // Рисуем все клетки
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                // Номер клетки (считаем с 0)
                int cellX = col * cellSize;
                int cellY = row * cellSize;

                // Проверяем, находится ли мышка над этой клеткой
                boolean mouseOverCell = mouseX >= cellX &&
                        mouseX < cellX + cellSize &&
                        mouseY >= cellY &&
                        mouseY < cellY + cellSize;

                // Выбираем цвет
                if (mouseOverCell) {
                    fill(255, 0, 0); // Красный, если мышка над клеткой
                } else if ((row + col) % 2 == 0) {
                    fill(255);       // Белый
                } else {
                    fill(0);         // Черный
                }

                // Рисуем клетку
                rect(cellX, cellY, cellSize, cellSize);
            }
        }
    }
}