package com.example.andoird.lastproj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void num (View view)
    {
        String btn_num;
        btn_num = ((Button) view).getText().toString();

        if (btn_num.equals("Number One")){
            Intent intent= new Intent(this ,number1.class);
            startActivity(intent);
        }
        else if (btn_num.equals("Number Two"))
        {
            Intent intent= new Intent(this, number2.class);
            startActivity(intent);
        }
        else if (btn_num.equals("Number Three"))
        {
            Intent intent= new Intent(this, number3.class);
            startActivity(intent);
        }
        else if (btn_num.equals("Number Four"))
        {
            Intent intent= new Intent(this, number4.class);
            startActivity(intent);
        }
        else if (btn_num.equals("Number Five"))
        {
            Intent intent= new Intent(this, number5.class);
            startActivity(intent);
        }

    }
}
