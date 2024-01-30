package org.example;

import org.example.Action;

public class ActionUp implements Action {
    Player player;
    public ActionUp(Player player){
        this.player = player;
    }
    @Override
    public void doAction(){
        player.moveUp();
    }
}
