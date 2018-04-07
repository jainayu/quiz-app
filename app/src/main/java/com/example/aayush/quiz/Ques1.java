package com.example.aayush.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Ques1 extends AppCompatActivity {
    public static int c=0;
    public int a=1,i=20;
    public static int d=0;
    TextView ques1;
    TextView ptv;

    Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);

        ques1 = (TextView) findViewById(R.id.ques1);
        RadioGroup grp1 = (RadioGroup) findViewById(R.id.grp1);
        final RadioButton op1 = (RadioButton) findViewById(R.id.op11);
        final RadioButton op2 = (RadioButton) findViewById(R.id.op12);
        final RadioButton op3 = (RadioButton) findViewById(R.id.op13);
        final RadioButton op4 = (RadioButton) findViewById(R.id.op14);
        Next = (Button) findViewById(R.id.Next);
        ptv=(TextView) findViewById(R.id.ptv);
        final ProgressBar pb= (ProgressBar) findViewById(R.id.pb);
        //Set first question here
        ques1.setText("QUES1. Brass gets discoloured in air because of the presence of which of the following gases in air ?");
        op1.setText("Oxygen");
        op2.setText("Carbon dioxide");
        op3.setText("Hydrogen Sulphide");
        op4.setText("Nitrogen");
        Next.setText("Next");
        ptv.setText("QUES 1 of 5");
        pb.setProgress(i);
        i=i+20;
        Next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                switch (a) {

                    case 1:
                        if (op3.isChecked()) {
                            Toast.makeText(getApplicationContext(), "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                            ++Ques1.c;
                        }
                        else if (op1.isChecked()|| op2.isChecked()||op4.isChecked())
                            Toast.makeText(getApplicationContext(), "WRONG ANSWER,  (C)Hydrogen Sulphide was correct answer.", Toast.LENGTH_SHORT).show();
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        ques1.setText("QUES2. Chemical formula for water is");
                        op1.setText("NaALO2");
                        op2.setText("H2O");
                        op3.setText("Al2O3");
                        op4.setText("CaSiO3");
                        Next.setText("Next");
                        ptv.setText("QUES 2 of 5");
                        pb.setProgress(i);
                        i=i+20;
                        a++;

                    break;

                    case 2:
                    {    if (op2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                        ++Ques1.c;
                        }
                        else if (op1.isChecked()|| op3.isChecked()||op4.isChecked())
                        Toast.makeText(getApplicationContext(), "WRONG ANSWER,  (B)H2O was correct answer.", Toast.LENGTH_SHORT).show();
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        ques1.setText("QUES3. Which of the gas is not known as green house gas?");
                        op1.setText("Methane");
                        op2.setText("Hydrogen");
                        op3.setText("Nitrous Oxide");
                        op4.setText("Carbon dioxide");
                        Next.setText("Next");
                        ptv.setText("QUES 3 of 5");
                        pb.setProgress(i);
                        i=i+20;
                        a++;}
                    break;

                    case 3:
                    {    if (op2.isChecked()) {
                        Toast.makeText(getApplicationContext(), "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                        ++Ques1.c;
                        }
                        else if (op1.isChecked()|| op3.isChecked()||op4.isChecked())
                        Toast.makeText(getApplicationContext(), "WRONG ANSWER,  (B)Hydrogen was correct answer.", Toast.LENGTH_SHORT).show();
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        ques1.setText("QUES4. Which of the following is used in pencils ?");
                        op1.setText("Graphite");
                        op2.setText("Silicon");
                        op3.setText("Iron");
                        op4.setText("Charcoal");
                        Next.setText("Next");
                        ptv.setText("QUES 4 of 5");
                        pb.setProgress(i);
                        i=i+20;

                        a++;}
                    break;

                    case 4: {
                        if (op1.isChecked()) {
                            Toast.makeText(getApplicationContext(), "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                            ++Ques1.c;
                        }
                        else if (op3.isChecked()|| op2.isChecked()||op4.isChecked())
                            Toast.makeText(getApplicationContext(), "WRONG ANSWER,  (A)Graphite was correct answer.", Toast.LENGTH_SHORT).show();
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        ques1.setText("QUES5. Which of the following metals forms an amalgam with other metals ?");
                        op1.setText("Tin");
                        op2.setText("Mercury");
                        op3.setText("Lead");
                        op4.setText("Zinc");
                        Next.setText("Submit");
                        ptv.setText("QUES 5 of 5");
                        pb.setProgress(i);
                        i=i+20;
                        a++;
                    }
                    break;
                    case(5):{
                        if (op2.isChecked()) {
                            Toast.makeText(getApplicationContext(), "CORRECT ANSWER", Toast.LENGTH_SHORT).show();
                            ++Ques1.c;
                        }
                        else if (op1.isChecked()|| op3.isChecked()||op4.isChecked())
                            Toast.makeText(getApplicationContext(), "WRONG ANSWER,  (B)Mercury was correct answer.", Toast.LENGTH_SHORT).show();
                        op1.setChecked(false);
                        op2.setChecked(false);
                        op3.setChecked(false);
                        op4.setChecked(false);
                        nxtques();
                        break;
                    }
                }


            }
        });


    }
    public void onBackPressed()
    {
        Log.e("My Tags", "onBackPressed");
        d++;
        if(d == 1)
        {
            Toast.makeText(Ques1.this, "Please Press Again To Exit.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("EXIT", true);
            d=0;
            startActivity(intent);
        }
    }
    private void nxtques() {
        Intent myIntent = new Intent(Ques1.this, Submit.class);
        startActivity(myIntent);
    }


}


