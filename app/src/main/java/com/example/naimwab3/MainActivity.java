package com.example.naimwab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clikButton;
        TextView tvDisplay;

        clikButton = findViewById(R.id.clikButton);
        tvDisplay = findViewById(R.id.tvDisplay);

        clikButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvDisplay.setText("hello Brother, how are you? place click the text");

            }
        });

        tvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clikButton.setText("thank you my dear friend, it's works");
            }
        });










    }

}