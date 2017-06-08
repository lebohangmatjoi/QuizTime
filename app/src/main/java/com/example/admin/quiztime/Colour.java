package com.example.admin.quiztime;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.IdRes;
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

public class Colour extends AppCompatActivity {
    TextView tvScore;
    RadioGroup rgQ2,rgQ1,rgQ3,rgQ4,rgQ5;
    RadioButton rbGreen,rbRed,rbRedd,rbGreeen,rbWhite,rbOrange,rbYellow,rbPink,rbBlue,rbBluee,rbBlack,rbPeach,rbMaroon,rbPurple,rbViolet;
Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
         rgQ1 =(RadioGroup)findViewById(R.id.rgQ1);
         rgQ2 =(RadioGroup)findViewById(R.id.rgQ2);
         rgQ3 =(RadioGroup)findViewById(R.id.rgQ3);
         rgQ4 =(RadioGroup)findViewById(R.id.rgQ4);
         rgQ5 =(RadioGroup)findViewById(R.id.rgQ5);
        tvScore=(TextView) findViewById(R.id.tvScore);


        rbBluee=(RadioButton)findViewById(R.id.rbBluee);
        rbGreen=(RadioButton)findViewById(R.id.rbGreen);
        rbGreeen=(RadioButton)findViewById(R.id.rbGreeen);
        rbWhite=(RadioButton)findViewById(R.id.rbWhite);
        rbOrange=(RadioButton)findViewById(R.id.rbOrange);
        rbYellow=(RadioButton)findViewById(R.id.rbYellow);
        rbPink=(RadioButton)findViewById(R.id.rbPink);
        rbRed=(RadioButton)findViewById(R.id.rbRed);
        rbRedd=(RadioButton)findViewById(R.id.rbRedd);
        rbBlue=(RadioButton)findViewById(R.id.rbBlue);
        rbBlack=(RadioButton)findViewById(R.id.rbBlack);
        rbPeach=(RadioButton)findViewById(R.id.rbPeach);
        rbMaroon=(RadioButton)findViewById(R.id.rbMaroon);
        rbPurple=(RadioButton)findViewById(R.id.rbPurple);
        rbViolet=(RadioButton)findViewById(R.id.rbViolet);

        btnSubmit=(Button)findViewById(R.id.btnSubmit);

rgQ1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup group, int i) {


        switch(i)
        {
            case R.id.rbRed:

                break;
            case R.id.rbOrange:

                MainActivity.score++;
                break;
            case R.id.rbMaroon:

                break;

        }

    }
});
        rgQ2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbGreen:

                        break;
                    case R.id.rbBlue:

                        MainActivity.score++;

                        break;
                    case R.id.rbBlack:

                        break;
                }

            }
        });
        rgQ3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbWhite:

                        MainActivity.score++;
                        break;
                    case R.id.rbYellow:

                        break;
                    case R.id.rbViolet:

                        break;

                }

            }
        });
        rgQ4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbRedd:

                        MainActivity.score++;
                        break;
                    case R.id.rbPink:

                        break;
                    case R.id.rbPeach:

                        break;
                }

            }
        });
        rgQ5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {


                switch(i)
                {
                    case R.id.rbBluee:

                        break;
                    case R.id.rbGreeen:

                        MainActivity.score++;
                        break;
                    case R.id.rbPurple:

                        break;
                }

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double highNum =5;
                double score = MainActivity.score;
                double div= score/highNum;
                double perc = div*100;

                AlertDialog.Builder builder;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    builder = new AlertDialog.Builder(Colour.this, android.R.style.Theme_Material_Dialog_Alert);
                } else {
                    builder = new AlertDialog.Builder(Colour.this);
                }
                builder.setTitle("End Quiz")
                        .setMessage("Do you want to go back to the main page?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                                Intent i = new Intent(Colour.this,MainActivity.class);
                                startActivity(i);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(Colour.this,Shapes.class);
                                startActivity(i);

                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();

                if(score>2) {
                    Toast.makeText(Colour.this,"CONGRATULATIONS "+perc+"%",Toast.LENGTH_LONG).show();

                }else  {
                    Toast.makeText(Colour.this,"Sorry you scored "+perc+"%",Toast.LENGTH_LONG).show();


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
