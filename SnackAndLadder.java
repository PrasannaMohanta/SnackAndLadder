package com.SnackLadderGame;

/**
 *
 */
public class SnackAndLadder {
    int snake[] = { 12, 46, 57, 78 };
    int ladder[] = { 13, 47, 58, 79 };

    public static void main(String[] args) {
        SnackAndLadder snakeAndLadderGame = new SnackAndLadder();
        snakeAndLadderGame.snakeAndLadder();
    }

    public void snakeAndLadder() {
        Player prasanna = new Player();
        while(prasanna.getPostion() != 100) {
            System.out.println("Position = "+prasanna.getPostion());
            player(prasanna);
        }

        System.out.println("Position = "+prasanna.getPostion());
    }

    public void player(Player prasanna) {
        int position = prasanna.getPostion();
        int randomNum = getRandomNumber(6);
        while (randomNum == 6 && position <= 94) {
            position += randomNum;

            if (isSnake(position)) {
                position -= 5;
                break;
            } else if (isLadder(position)) {
                position += 5;
                randomNum = getRandomNumber(6);
            } else {
                randomNum = getRandomNumber(6);
            }
        }

        if ((position <= 95 && randomNum == 5) || (position <= 96 && randomNum == 4)
                || (position <= 97 && randomNum == 3) || (position <= 98 && randomNum == 2)
                || (position <= 99 && randomNum == 1)) {
            position += randomNum;
            if (isSnake(position)) {
                position -= 5;
            } else if (isLadder(position) && position + 5 <= 100) {
                position += 5;
                randomNum = getRandomNumber(6);
            }
        }

        prasanna.setPostion(position);
    }

    public boolean isSnake(int position) {
        for (int i = 0; i < snake.length; i++) {
            if (position == snake[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isLadder(int position) {
        for (int i = 0; i < ladder.length; i++) {
            if (position == ladder[i]) {
                return true;
            }
        }
        return false;
    }

    public int getRandomNumber(int value) {
        return (int) Math.floor(Math.random() * value + 1);
    }
}


