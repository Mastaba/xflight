package xflight;

import com.googlecode.lanterna.screen.ScreenCharacterStyle;
import com.googlecode.lanterna.terminal.Terminal;

public class Menu {

    private String[] contents;
    private String title;

    public Menu(String[] contents, String title) {
        // Make this menu 'contents' the argument specified
        this.contents = contents;
        this.title = title;

    }

    public void show_menu() {

       Main.textGUI.getScreen().putString(Main.textGUI.getScreen().getTerminalSize().getColumns() / 2 - (title.length() / 2), 3, title,
                Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);

        // Line number
        int x = 1;
        // Iterate through contents, print each 'menu item'
        for (String item : contents) {
            item = x + ". " + item;
            Main.textGUI.getScreen().putString(Main.textGUI.getScreen().getTerminalSize().getColumns() / 2 - (item.length() / 2), 3 + x, item,
                    Terminal.Color.BLACK, Terminal.Color.WHITE, ScreenCharacterStyle.Bold);
            x++;
        }
    }

}
