package com.example.brint_aflevering1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button knap1, knap2, knap3, knap4, knap5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        knap1 = findViewById(R.id.button1);
        knap1.setOnClickListener(this);

        knap2 = findViewById(R.id.button2);
        knap2.setOnClickListener(this);

        knap3 = findViewById(R.id.button3);
        knap3.setOnClickListener(this);

        knap4 = findViewById(R.id.button4);
        knap4.setOnClickListener(this);

        knap5 = findViewById(R.id.button5);
        knap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMain2Web();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == knap1){
            knap1.setText("Hej");
        }
        else if (v == knap2){
            knap2.setText("Hej");
        }
        else if (v == knap3){
            knap3.setText("Hej");
        }
        else if (v == knap4){
            knap4.setText("Hej");
        }
    }
    private void openMain2Web() {
        Intent intent = new Intent(this, Main2Web.class);
        startActivity(intent);
    }
}
