package org.example;

import org.example.Action;

public class ActionLeft implements Action {
    Player player;

    public ActionLeft(Player player) {
        this.player = player;
    }

    public void doAction() {
        player.moveLeft();
    }
}
