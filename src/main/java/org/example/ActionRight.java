package org.example;

import org.example.Action;

public class ActionRight implements Action {
    Player player;
    public ActionRight(Player player) {
        this.player = player;
    }
    public void doAction(){
        player.moveRight();
    }
}
