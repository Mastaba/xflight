package xflight;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: denizen_
 * Date: 10/18/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    public enum ShipColor { WHITE, RED, BLUE, YELLOW }
    public static ShipColor ship_color = ShipColor.WHITE;

    public static String ship_design = "\\\\!//";

    boolean crashed = false;
    Character key = null;
    int score = 0;


    public Game() {

        long millis = System.currentTimeMillis();

        DataInputStream capture = new DataInputStream(System.in);

        // Create game loop
        boolean ticking = true;

        while (ticking) {

            try {
                // key = (char) capture.readByte();
            } catch (Exception e) { }

            // Draw the next line in the canyon
            draw_canyon();

            // Check if the ship has crashed
            // and end the loop
            if (crashed) ticking = false;

            // Increase score
            score++;

            if (score > 1500) ticking = false;
        }
    }



    int clearance = 40;
    int max_width = 60;
    char left_wall = '>';
    char right_wall = '<';
    int next_level = 10;
    Random rand = new Random();

    private void draw_canyon() {

        int white_space = Math.abs(score/next_level - clearance) + (rand.nextInt(5) - 3);

        int wall_width =  max_width - white_space / 2;


        for (int x = 1; x < wall_width; x++)
        System.out.print(left_wall);

        for (int x = 1; x < white_space; x++)
            System.out.print(' ');

        for (int x = 1; x < wall_width; x++)
            System.out.print(right_wall);

        System.out.println();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


    }


}
