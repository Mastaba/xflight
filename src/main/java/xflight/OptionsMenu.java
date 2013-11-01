package xflight;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: denizen_
 * Date: 10/18/13
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class OptionsMenu {



    // Define possible selections
    enum Selection { SHIP_DESIGN, SHIP_COLOR, BACK };


    public OptionsMenu() {

        System.out.println("----+ Options +---------");

        // Define options menu
        Menu options_menu = new Menu(new String[] {
                "Specify ship design",
                "Select ship color",
                "Back"
        }, "Options");

        // Show options menu
        options_menu.show_menu();

        // Get input and make sure it is valid
        boolean configuring = true;
        while (configuring == true) {

//            // Specify ship design
//            if (input.equals("1")) {
//
//                System.out.println("Draw your ship in 7 characters or less:");
//
//                boolean is_valid = false;
//                String ship_design = null;
//
//                while (!is_valid) {
//                    ship_design = design_ship();
//                    if (ship_design.length() < 7)
//                        is_valid = true;
//                    else
//                        System.out.println("Invalid ship design! Must be more more than 7 characters.");
//                }
//
//                xflight.Game.ship_design = ship_design;
//
//
//            } else if (input.equals("2")) {
//
//                // Ship color
//
//            } else if (input.equals("3")) {
//                configuring = false;
//                return;
//
//            } else {
//                System.out.println("Invalid selection!");
//            }
//
//            options_menu.show_menu();
//
        }

    }


    public String design_ship() {
        Scanner ship_designer = new Scanner(System.in);

        return ship_designer.next();
    }

}
