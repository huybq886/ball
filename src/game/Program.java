package game;

import com.google.gson.Gson;
import game.maps.Layer;
import game.maps.Map;
import game.utils.Utils;

import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();
        window.setTitle("BALL");
        window.setResizable(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        panel.setPreferredSize(new Dimension(Settings.GAME_WIDTH, Settings.GAME_HEIGHT));
        panel.setBackground(Color.black);
        window.add(panel);
        window.pack();

        window.setVisible(true);

        panel.gameLoop();

    }
}
