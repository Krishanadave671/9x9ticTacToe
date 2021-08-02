package com.example.tictactoemega;

import android.widget.Button;

public class Grid {

    Button[] buttons;

    public Grid(Button[] buttons){
        this.buttons = buttons;
    }

    public void disableAll(){
        for(int i=0;i<buttons.length;i++){
            buttons[i].setClickable(false);
        }
    }

    public void enable(){
        for(int i=0;i<9;i++){
            if(buttons[i].getText().toString()!="X" || buttons[i].getText().toString()!="O"){
                buttons[i].setClickable(true);
            }
        }
    }
}
