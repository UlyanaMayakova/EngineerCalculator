package com.example.engineercalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private boolean isCommon = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button switcher = findViewById(R.id.switcher);
        final View commonC = findViewById(R.id.common_calculator);
        final View engineerC = findViewById(R.id.engineer_calculator);
        commonC.setVisibility(View.VISIBLE);
        engineerC.setVisibility(View.INVISIBLE);

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isCommon) {
                    commonC.setVisibility(View.INVISIBLE);
                    engineerC.setVisibility(View.VISIBLE);
                    isCommon = false;
                } else {
                    commonC.setVisibility(View.VISIBLE);
                    engineerC.setVisibility(View.INVISIBLE);
                    isCommon = true;
                }
            }
        });
    }
}