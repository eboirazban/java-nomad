import processing.core.PApplet;

public class main4 extends PApplet {

    public static void main(String[] args){
        PApplet.main("main4");
    }


    public void settings(){
        size(400,400);
    }
   public void setup(){
        background(255);
    }

    public void draw(){
    int cellSize = 50;
        for (int i =0;i<8;i++){
            for (int y=0;y<8;y++){
                int cellX = cellSize * i;
                int cellY = cellSize * y;

                boolean mouseOverCell = mouseX >= cellX && mouseX < cellX +cellSize && mouseY >=cellY &&mouseY < cellY +cellSize;

                if (mouseOverCell){
                    fill(255,0,0);
                }else if((i+y) %2 ==0){
                    fill(255);
                }else {
                    fill(0);
                }
                rect(cellX,cellY,cellSize,cellSize);

            }
        }
    }
}
