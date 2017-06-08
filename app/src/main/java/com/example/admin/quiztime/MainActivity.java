package com.example.admin.quiztime;

import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btncolours, btnShapes, btnNumbers;
    public static int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        btncolours = (Button) findViewById(R.id.btnColours);
        btncolours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Colour.class);
                startActivity(intent);
            }
        });

        btnShapes = (Button) findViewById(R.id.btnShapes);
        btnShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Shapes.class);
                startActivity(intent);
            }
        });

        btnNumbers = (Button) findViewById(R.id.btnNumbers);
        btnNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Numbers.class);
                startActivity(intent);
            }
        });
    }
}

