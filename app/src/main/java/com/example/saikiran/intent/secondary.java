package com.example.saikiran.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }
    public void onclick2(View v)
    {
        Intent it =new Intent(secondary.this,MainActivity.class);
        startActivity(it);
    }
}
