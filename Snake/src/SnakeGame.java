import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel {
    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWith;
    int boardHeight;
    int titleSize = 25;

    Tile snakeHead;

    SnakeGame(int boardWith, int boardHeight) {
        this.boardWith = boardWith;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(boardWith, boardHeight));
        setBackground(Color.BLACK);

        snakeHead = new Tile(5, 5);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Snake
        g.setColor(Color.GREEN);
        g.fillRect(snakeHead.x, snakeHead.y, titleSize, titleSize);
    }
}
