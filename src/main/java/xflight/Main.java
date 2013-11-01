package xflight;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;

public class Main {

    public static GUIScreen textGUI;

    public static void main(String[] args) {

        // Initiate Lanterna Terminal
        textGUI = TerminalFacade.createGUIScreen();
        if (textGUI == null) {
            System.err.println("Couldn't allocate a terminal!");
            return;
        }

        // Display the screen
        textGUI.getScreen().startScreen();


        // Handle start menu
        boolean has_started_game = false;
        while (has_started_game == false) {
            has_started_game = handle_start_menu();
            textGUI.getScreen().refresh();
            // Define start menu
        }

        // new xflight.Game();

        textGUI.getScreen().stopScreen();

    }


    static Menu start_menu = new Menu(new String[] {
            "Start xflight.Game",
            "Options",
            "About",
            "End xflight.Game"
    }, "-----+ X-Flight 2013 +-----");

    public static boolean handle_start_menu() {

        // Show start menu
        start_menu.show_menu();

        Key key = textGUI.getScreen().readInput();

        Character input = null;

        if (key != null) input = key.getCharacter();

        if (input != null) {

            if (input == '1') {
                // ...

            } else if (input == '2')  {
                new OptionsMenu();
                return false;

            } else if (input == '3')  {
                // Show 'About'
                System.out.println("Made by Mastaba and aufdemrand, 2013.");
                return false;

            } else if (input == '4')  {
                // End the game
                System.out.println("Thanks for playing!");
                System.exit(0);

            } else {
                System.out.println("Invalid selection!");
                return false;
            }
        }

        return false;
    }





}
