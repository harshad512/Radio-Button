package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton white,black,red,green,blue;
    LinearLayout layout;
    Button submit;


    //video reference
//    private static RadioGroup radioGroup;
//    private static RadioButton rad_b;
//    private static Button button_sub;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        white = (RadioButton)findViewById(R.id.white);
        black = (RadioButton)findViewById(R.id.black);
        red = (RadioButton)findViewById(R.id.red);
        green = (RadioButton) findViewById(R.id.green);
        blue = (RadioButton)findViewById(R.id.blue);

        layout = (LinearLayout)findViewById(R.id.layout);

        submit = (Button)findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(white.isChecked()){
                    layout.setBackgroundColor(Color.WHITE);
                }
                else if(black.isChecked()){
                    layout.setBackgroundColor(Color.BLACK);
                }
                else if(red.isChecked()){
                    layout.setBackgroundColor(Color.RED);
                }
                else if(green.isChecked()){
                    layout.setBackgroundColor(Color.GREEN);
                }
                else if(blue.isChecked()) {
                    layout.setBackgroundColor(Color.BLUE);
                }
            }
        });

//VIDEO REFERENCE
//        radioGroup = (RadioGroup) findViewById(R.id.rad_g_color);
//        button_sub = (Button)findViewById(R.id.submitButton);
//
//        button_sub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selected_id = radioGroup.getCheckedRadioButtonId();
//                rad_b = (RadioButton)findViewById(selected_id);
//                Toast.makeText(MainActivity.this,rad_b.getText().toString(),Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
