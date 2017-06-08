package com.example.admin.quiztime;

import android.content.DialogInterface;
import android.content.Intent;
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

public class Numbers extends AppCompatActivity {
    TextView tvScore;
    RadioGroup rgQ11,rgQ12,rgQ13,rgQ14,rgQ15;
    RadioButton rb2,rb3,rb9,rb10,rb13,rb11,rb7,rb5,rb1,rb4,rb6,rb12,rb14,rb15,rb8;
    Button btnSubmittt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        rgQ11 =(RadioGroup)findViewById(R.id.rgQ11);
        rgQ12 =(RadioGroup)findViewById(R.id.rgQ12);
        rgQ13 =(RadioGroup)findViewById(R.id.rgQ13);
        rgQ14 =(RadioGroup)findViewById(R.id.rgQ14);
        rgQ15 =(RadioGroup)findViewById(R.id.rgQ15);
        tvScore=(TextView) findViewById(R.id.tvScore);

        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb9=(RadioButton)findViewById(R.id.rb9);
        rb10=(RadioButton)findViewById(R.id.rb10);
        rb13=(RadioButton)findViewById(R.id.rb13);
        rb11=(RadioButton)findViewById(R.id.rb11);
        rb7=(RadioButton)findViewById(R.id.rb7);
        rb5=(RadioButton)findViewById(R.id.rb5);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb4=(RadioButton)findViewById(R.id.rb4);
        rb6=(RadioButton)findViewById(R.id.rb6);
        rb12=(RadioButton)findViewById(R.id.rb12);
        rb14=(RadioButton)findViewById(R.id.rb14);
        rb15=(RadioButton)findViewById(R.id.rb15);
        rb8=(RadioButton)findViewById(R.id.rb8);



        btnSubmittt=(Button)findViewById(R.id.btnSubmit);

        rgQ11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rb2:

                        MainActivity.score++;
                        break;
                    case R.id.rb3:

                    break;
                    case R.id.rb6:

                        break;
                }

            }
        });
        rgQ12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rb9:

                        MainActivity.score++;
                        break;
                    case R.id.rb10:

                        break;
                    case R.id.rb12:

                        break;
                }

            }
        });
        rgQ13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rb13:

                        MainActivity.score++;
                        break;
                    case R.id.rb11:

                        break;
                    case R.id.rb14:

                        break;
                }

            }
        });
        rgQ14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rb5:

                        break;
                    case R.id.rb7:
                        MainActivity.score++;
                        break;
                    case R.id.rb15:

                        break;
                }

            }
        });
        rgQ15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rb4:

                        break;
                    case R.id.rb1:

                        MainActivity.score++;
                        break;
                    case R.id.rb8:

                        break;
                }

            }
        });

        btnSubmittt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                double highNum =5;
                double score = MainActivity.score;
                double div= score/highNum;
                double perc = div*100;

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(Numbers.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(Numbers.this);
                }
                builder.setTitle("End Quiz?")
                        .setMessage("Do you want to go back to the main page?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i = new Intent(Numbers.this,MainActivity.class);
                                startActivity(i);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Numbers.this,Shapes.class);
                                startActivity(i);

                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

                if(score>2) {
                    Toast.makeText(Numbers.this,"CONGRATULATIONS "+perc+"%",Toast.LENGTH_LONG).show();

                }else  {
                    Toast.makeText(Numbers.this,"Sorry you scored "+perc+"%",Toast.LENGTH_LONG).show();





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
