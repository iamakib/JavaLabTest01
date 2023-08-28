package Problem02;

import java.awt.*;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0,'N');
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();

        Point point;
        point = robot.getLocation();

        char direction = robot.getDirection();

        System.out.println("Location coordinates are : " + point.getX() + ", " + point.getY());
        System.out.println("Direction of the robot is : " + robot.getDirection());
    }
}

