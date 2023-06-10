package com.example.menubee;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class TextOrder extends AppCompatActivity {
    TextView orderText;
    AppCompatButton voiceOrder, back;
    int code;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textorder);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Intent intent = getIntent();
        String reqText = intent.getStringExtra("req");
        CharSequence order = intent.getCharSequenceExtra("order");
        orderText = (TextView) findViewById(R.id.orderText);

        if(reqText != null) {
            orderText.setText(reqText);
        }
        else {
            orderText.setText(order);
        }


        voiceOrder = (AppCompatButton) findViewById(R.id.voiceOrder);
        back = (AppCompatButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
    }
}
