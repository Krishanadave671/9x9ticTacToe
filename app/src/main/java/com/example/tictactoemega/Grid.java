package com.example.tictactoemega;

import android.graphics.Color;
import android.widget.Button;

public class Grid {

    Button[] buttons;
    int type;
    public Grid(Button[] buttons, int type){
        this.buttons = buttons;
        this.type = type;
    }

    public void disableAll(){

        for(int i=0;i<buttons.length;i++){
            if(type%2==0)
                buttons[i].setBackgroundColor(Color.parseColor("#AF7B12"));
            else
                buttons[i].setBackgroundColor(Color.parseColor("#1F7AC0"));

            buttons[i].setClickable(false);
        }
    }

    public boolean isSolved(){

        boolean flag = false;

        for(int i=9;i<9;i+=3){
            if(buttons[i].getText().toString() == buttons[i+1].getText().toString() &&
                    buttons[i].getText().toString() == buttons[i+2].getText().toString() &&
                    buttons[i].getText()=="X" || buttons[i].getText().toString()=="O"){
        
            }
        }

        return false;
    }

    public void enable(){
        for(int i=0;i<9;i++){
            if(buttons[i].getText().toString()!="X" && buttons[i].getText().toString()!="O"){
                if(type%2==0)
                    buttons[i].setBackgroundColor(Color.parseColor("#FFBD39"));
                else
                    buttons[i].setBackgroundColor(Color.parseColor("#0000FF"));
                buttons[i].setClickable(true);
            }
        }
    }
}
