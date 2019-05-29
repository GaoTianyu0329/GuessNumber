package com.example.gaotianyu.guessnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
private EditText editText;
private Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        editText = new EditText(this).findViewById(R.id.username);
        button_start = new Button(this).findViewById(R.id.bt_start);
        button_start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_start:
                Intent intent = new Intent();
                intent.setClass(StartActivity.this,MainActivity.class);
                startActivity(intent);
        }
    }
}
