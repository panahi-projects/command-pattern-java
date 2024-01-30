package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Receiver object
        Player player = new VideoGamePlayer();

        // Concrete command
        Action up = new ActionUp(player);
        Action down = new ActionDown(player);
        Action left = new ActionLeft(player);
        Action right = new ActionRight(player);

        // Invoker
        Controller controller = new JoyStickGameController(up, down, left, right);

        // Client action
        try(BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter Option [UP|DOWN|LEFT|RIGHT] : ");
                String option = inputReader.readLine();
                switch (option.toLowerCase()) {
                    case "up":
                        controller.up();
                        break;
                    case "down":
                        controller.down();
                        break;
                    case "left":
                        controller.left();
                        break;
                    case "right":
                        controller.right();
                        break;
                    default:
                        System.out.println("Wrong input!");
                        break;
                }
            }
        }
        catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}