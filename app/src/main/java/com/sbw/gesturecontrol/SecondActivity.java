package com.sbw.gesturecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    
    private Button btn_activity_b;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        
        btn_activity_b = (Button) findViewById(R.id.btn_activity_b);
    
        btn_activity_b.setOnClickListener(View ->{
            Intent intentToC = new Intent(SecondActivity.this, ThirdActivity.class);
            startActivity(intentToC);
        });
    }
}