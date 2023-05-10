package com.example.menubee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    boolean view_tip = true;
    AppCompatButton start_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_btn =(AppCompatButton) findViewById(R.id.start_btn);
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnstartclicked(v);
            }
        });
    }

    public void btnstartclicked(View v)
    {
        if (view_tip) {
            Tip tip = new Tip(view_tip);
            Intent intent = new Intent(getApplicationContext(), Tip.class);
            startActivity(intent);
            view_tip = tip.giveviewtip();
        } else {
            Intent intent = new Intent(getApplicationContext(), Choice_mode.class);
            startActivity(intent);
        }
    }
}