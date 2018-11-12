package com.example.android.theapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void launchFifthActivity(View view) {
        Intent intent4 = new Intent(this, FifthActivity.class);
        startActivity(intent4);
    }
}
