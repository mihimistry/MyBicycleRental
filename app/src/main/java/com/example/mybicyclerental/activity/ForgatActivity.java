package com.example.mybicyclerental.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mybicyclerental.R;

public class ForgatActivity extends AppCompatActivity {

    Button btn_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgat_);

        btn_success=findViewById(R.id.btn_success);

        btn_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgatActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}