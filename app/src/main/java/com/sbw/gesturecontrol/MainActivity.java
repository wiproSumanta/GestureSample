package com.sbw.gesturecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    private Button btn_activity_a;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        btn_activity_a = (Button)findViewById(R.id.btn_activity_a);
    
        btn_activity_a.setOnClickListener(view -> {
            Intent intentToB = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intentToB);
        });
    }
}