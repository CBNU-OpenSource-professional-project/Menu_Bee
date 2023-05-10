package com.example.menubee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;

public class Tip extends AppCompatActivity {

    boolean viewtip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);
        Intent intent = getIntent();
        CheckBox neverview = findViewById(R.id.neverview);

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