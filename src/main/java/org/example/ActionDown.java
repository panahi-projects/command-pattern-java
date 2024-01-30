package org.example;

import org.example.Action;

public class ActionDown implements Action {
    Player player;

    public ActionDown(Player player) {
        this.player = player;
    }

    public void doAction() {
        player.moveDown();
    }
}
