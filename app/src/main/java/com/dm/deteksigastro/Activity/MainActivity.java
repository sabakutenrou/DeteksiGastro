package com.dm.deteksigastro.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dm.deteksigastro.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = findViewById(R.id.btn_start);
        btnStart.setOnClickListener(new StartClickListener());

        Button btnInfo = findViewById(R.id.btn_info);
        btnInfo.setOnClickListener(new StartClickInfoListener());
    }

    private class StartClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent questionIntent = new Intent(MainActivity.this, QuestionActivity.class);
            startActivity(questionIntent);
        }
    }

    private class StartClickInfoListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent infoIntent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(infoIntent);
        }
    }
}
