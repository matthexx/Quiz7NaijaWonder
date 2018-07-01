package com.example.matthexx.quiz7naijawonder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    RadioButton btn1;
    CheckBox cbox2, cbox3;
    CheckBox cboxb1, cboxb3, cboxb4;
    RadioButton rad1, radb2;
    Button abjbtn;
    EditText inputText;
    Button grade;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);


        cbox2 = findViewById(R.id.box2);
        cbox3 = findViewById(R.id.box3);


        rad1 = findViewById(R.id.rd1);
        radb2 = findViewById(R.id.rdb2);



        cboxb1 = findViewById(R.id.boxb1);
        cboxb3 = findViewById(R.id.boxb3);
        cboxb4 = findViewById(R.id.boxb4);

        abjbtn = findViewById(R.id.abuja);



        inputText = findViewById(R.id.userInput);
        grade = findViewById(R.id.submit);

    }



    boolean clicked = false;


    //my button clic

    //then on another method or where you want

    public int sumScore() {
        if (btn1.isChecked()) {
            score = score + 1;
        }

        boolean getcbox2 = cbox2.isChecked();
        boolean getcbox3 = cbox3.isChecked();
        if (getcbox2 || getcbox3){
            score = score + 1; }


        if (rad1.isChecked()) {
            score = score + 1;

        }

        if (radb2.isChecked()) {
            score = score + 1;

        }


        boolean getcboxb1 = cboxb1.isChecked();
        boolean getcboxb3 = cboxb3.isChecked();
        boolean getcboxb4 = cboxb4.isChecked();
        if (getcboxb1 || getcboxb3 || getcboxb4){
            score = score + 1; }


        abjbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //change boolean value
                clicked=true;
            }
        });

        if(clicked)
        {
            score = score+ 1;
        }


        String answer = inputText.getText().toString();
        if (answer.equalsIgnoreCase("lagos")){
            score = score + 1;
        }

        return score;

    }
    public String  totalScoremsg(){
        String msg = "your score is: " + sumScore() + " of 7 wonder questions!";
        return msg;
    }


    public void showScore(View v) {

        Toast.makeText(this, "Well done!  " + totalScoremsg(), Toast.LENGTH_LONG).show();
        score = 0 ;
    }

    public void restart(View v){

        Intent t= new Intent(MainActivity.this,MainActivity.class);
        startActivity(t);
        finish();
    }


}
