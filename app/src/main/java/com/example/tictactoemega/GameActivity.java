package com.example.tictactoemega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    private Button[] grid1 = new Button[9];
    private Button[] grid2 = new  Button[9];
    private Button[] grid3 = new Button[9];
    private Button[] grid4 = new Button[9];
    private Button[] grid5 = new Button[9];
    private Button[] grid6 = new Button[9];
    private Button[] grid7 = new Button[9];
    private Button[] grid8 = new Button[9];
    private Button[] grid9 = new Button[9];
    private int count=0;
    //private Grid one,two,three,four,five,six,seven,eight,nine;
    ArrayList<Grid> matrix = new ArrayList<Grid>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(10+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid1[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(20+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid2[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(30+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid3[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(40+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid4[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(50+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid5[i] = findViewById(id);
        }

        for(int i=0;i<9;i++) {
            String idS = "g" + Integer.toString(60 + (i + 1));
            int id = getResources().getIdentifier(idS, "id", getPackageName());
            grid6[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(70+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid7[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(80+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid8[i] = findViewById(id);
        }

        for(int i=0;i<9;i++){
            String idS = "g"+Integer.toString(90+(i+1));
            int id = getResources().getIdentifier(idS,"id",getPackageName());
            grid9[i] = findViewById(id);
        }

        fillObjects();
    }

    private void fillObjects(){
        matrix.add(0, new Grid(grid1,1));
        matrix.add(1,new Grid(grid2,2));
        matrix.add(2, new Grid(grid3, 3));
        matrix.add(3, new Grid(grid4, 4));
        matrix.add(4, new Grid(grid5, 5));
        matrix.add(5, new Grid(grid6, 6));
        matrix.add(6, new Grid(grid7, 7));
        matrix.add(7, new Grid(grid8, 8));
        matrix.add(8, new Grid(grid9, 9));
    }

    public void action(View view){
        String name = getResources().getResourceName(view.getId());
        int pos = Integer.parseInt(name.substring(name.length()-2,name.length()));
        Button press = findViewById(view.getId());
        press.setClickable(false);

        if(count%2==0){
            press.setText("X");
        }else{
            press.setText("O");
        }

        count++;

        if(count>=1){
            stopAll();
            enableGrid(pos%10);
        }
    }

    private void stopAll(){
        for(int i=0;i<matrix.size();i++){
            matrix.get(i).disableAll();
        }
    }

    private void enableGrid(int gridNo){
        matrix.get(gridNo-1).enable();
    }


}