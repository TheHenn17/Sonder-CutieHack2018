package com.example.android.theapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void launchThirdActivity(View view) {
        Intent intent2 = new Intent(this, ThirdActivity.class);
        startActivity(intent2);
    }

    public void launchFourthActivity(View view) {
        Intent intent3 = new Intent(this, FourthActivity.class);
        startActivity(intent3);
    }
}
