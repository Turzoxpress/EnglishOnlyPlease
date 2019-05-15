package com.turzo.englishonlyplease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.turzo.onlyenglish.OnlyEnglishChecker;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tempS = OnlyEnglishChecker.returnOnlyLeftEnglishPart(input.getText().toString(),MainActivity.this,true,"Please type only English letters");
                input.setText(tempS);
                Log.d("asfasffsf",tempS);



            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tempS = OnlyEnglishChecker.retunWholeEnglishPart(input.getText().toString(),MainActivity.this,true,"Please type only English letters");
                input.setText(tempS);
                Log.d("asfasffsf",tempS);
            }
        });
    }
}
