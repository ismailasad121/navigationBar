package com.example.navigationbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void thanks(View view) {
        Button button=findViewById(R.id.button2);
        Intent intent=new Intent(signup.this,thanks.class);
        startActivity(intent);
    }
}