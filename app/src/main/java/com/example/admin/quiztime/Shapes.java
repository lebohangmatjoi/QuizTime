package com.example.admin.quiztime;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.String.valueOf;

public class Shapes extends AppCompatActivity {
    TextView tvScore;
    RadioGroup rgQ6,rgQ7,rgQ8,rgQ9,rgQ10;
    RadioButton rbCirTrue,rbCirFalse,rbTriTrue,rbTriFalse,rbSqTrue,rbSqFalse,rbRecTrue,rbRecFalse,rbOvTrue,rbOvFalse;
    Button btnSubmitt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes);
        rgQ6 =(RadioGroup)findViewById(R.id.rgQ6);
        rgQ7 =(RadioGroup)findViewById(R.id.rgQ7);
        rgQ8 =(RadioGroup)findViewById(R.id.rgQ8);
        rgQ9 =(RadioGroup)findViewById(R.id.rgQ9);
        rgQ10 =(RadioGroup)findViewById(R.id.rgQ10);
        tvScore=(TextView) findViewById(R.id.tvScore);


        rbCirTrue=(RadioButton)findViewById(R.id.rbCirTrue);
        rbCirFalse=(RadioButton)findViewById(R.id.rbCirFalse);
        rbTriTrue=(RadioButton)findViewById(R.id.rbTriTrue);
        rbTriFalse=(RadioButton)findViewById(R.id.rbTriFalse);
        rbSqTrue=(RadioButton)findViewById(R.id.rbSqTrue);
        rbSqFalse=(RadioButton)findViewById(R.id.rbSqFalse);
        rbRecTrue=(RadioButton)findViewById(R.id.rbRecTrue);
        rbRecFalse=(RadioButton)findViewById(R.id.rbRecFalse);
        rbOvTrue=(RadioButton)findViewById(R.id.rbOvTrue);
        rbOvFalse=(RadioButton)findViewById(R.id.rbOvFalse);

        btnSubmitt=(Button)findViewById(R.id.btnSubmit);

        rgQ6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbOvTrue:

                        break;
                    case R.id.rbOvFalse:

                        MainActivity.score++;
                        break;
                }

            }
        });
        rgQ7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbRecTrue:


                        break;
                    case R.id.rbRecFalse:

                        MainActivity.score++;
                break;
            }

            }
        });
        rgQ8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbSqTrue:

                        MainActivity.score++;
                        break;
                    case R.id.rbSqFalse:

                        break;
                }

            }
        });
        rgQ9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbCirTrue:


                        break;
                    case R.id.rbCirFalse:

                        MainActivity.score++;
                        break;
                }

            }
        });
        rgQ10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbTriTrue:

                        MainActivity.score++;
                        break;


                    case R.id.rbTriFalse:



                        break;
                }

            }
        });

        btnSubmitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


               double highNum =5;
                double score = MainActivity.score;
                double div= score/highNum;
                double perc = div*100;

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(Shapes.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(Shapes.this);
                }
                builder.setTitle("End Quiz")
                        .setMessage("Do you want to go back to the main page?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i = new Intent(Shapes.this,MainActivity.class);
                                startActivity(i);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Shapes.this,Shapes.class);
                                startActivity(i);

                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

                if(score>2) {
                    Toast.makeText(Shapes.this,"CONGRATULATIONS "+perc+"%",Toast.LENGTH_LONG).show();

               }else  {
                    Toast.makeText(Shapes.this,"Sorry you scored "+perc+"%",Toast.LENGTH_LONG).show();
                }
                MainActivity.score=0;
            }
        });
    }
    public void  main(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }



}






