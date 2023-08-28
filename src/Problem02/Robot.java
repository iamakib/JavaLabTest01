package Problem02;

import java.awt.*;

public class Robot {
    int initialX , initialY;
    char initialFace;

    public Robot(int initialX, int initialY, char initialFace){
        this.initialX = initialX;
        this.initialY = initialY;
        this.initialFace = initialFace;
    }

    public void turnLeft(){
        if(initialFace == 'N'){
            initialFace = 'W';
        }
        else if(initialFace == 'W'){
            initialFace = 'S';
        }
        else if(initialFace == 'S'){
            initialFace = 'E';
        }
        else if(initialFace == 'E'){
            initialFace = 'N';
        }
    }
    public void turnRight(){
        if(initialFace == 'N'){
            initialFace = 'E';
        }
        else if(initialFace == 'E'){
            initialFace = 'S';
        }
        else if(initialFace == 'S'){
            initialFace = 'W';
        }
        else if(initialFace == 'W'){
            initialFace = 'N';
        }
    }
    public void move(){
        if(initialFace == 'N'){
            initialY++;
        }
        else if(initialFace == 'E'){
            initialX++;
        }
        else if(initialFace == 'S'){
            initialY--;
        }
        else if(initialFace == 'W'){
            initialX--;
        }
    }
    public Point getLocation(){
        Point point = new Point(initialX,initialY);
        return point;
    }

    public char getDirection(){
        return initialFace;
    }
}
