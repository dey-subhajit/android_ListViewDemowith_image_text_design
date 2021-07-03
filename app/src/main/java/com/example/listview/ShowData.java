package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    TextView tv_show;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        tv_show = findViewById(R.id.tv_show);
        btn_back = findViewById(R.id.btn_back);

        Intent i = getIntent();
        // tv_show.setText("Month name is: " + i.getStringExtra("month"));
        tv_show.setText("Month name is: " + i.getExtras().getString("month"));

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShowData.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}