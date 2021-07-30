package com.example.tictactoemega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void action(View view){
        String name = getResources().getResourceName(view.getId());
        Toast.makeText(this, name.substring(name.length()-2,name.length()),Toast.LENGTH_SHORT).show();

        Button press = findViewById(view.getId());

        if(count%2==0){
            press.setText("X");
        }else{
            press.setText("O");
        }

        count++;
    }
}