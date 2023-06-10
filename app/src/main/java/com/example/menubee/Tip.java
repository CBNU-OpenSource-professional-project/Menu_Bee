package com.example.menubee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Tip extends AppCompatActivity {

    boolean viewtip;
    Button closeTip, closeTip2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        Intent intent = getIntent();
        CheckBox neverview = findViewById(R.id.neverview);
        closeTip = findViewById(R.id.closetip);

        closeTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cafe.class);
                startActivity(intent);
            }
        });

        if(neverview.isChecked())
        {
            viewtip = false;
        }
        else
        {
            viewtip = true;
        }
    }

    public Tip() {

    }

    public Tip(boolean viewtip)
    {
        this.viewtip = viewtip;

    }


    boolean giveviewtip()
    {
        return viewtip;
    }
}