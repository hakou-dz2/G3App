package com.example.g3app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        TextView tv_welcome = findViewById(R.id.tv_welcome);

        Intent intent = getIntent();
        tv_welcome.setText("Welcome " + intent.getStringExtra("username"));

        Button btn_logout = findViewById(R.id.bnt_logout);

        btn_logout.setOnClickListener(view -> {
            Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent1);
        });



    }
}