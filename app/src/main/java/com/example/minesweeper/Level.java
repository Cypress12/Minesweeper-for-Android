package com.example.minesweeper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Level extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level);
    }

    /*根据不同难度返回相应参数*/
    public void Easy(View view) {
        Intent data = new Intent();
        data.putExtra("result", "easy");
        setResult(2, data);
        finish();
    }

    public void Hard(View view) {
        Intent data = new Intent();
        data.putExtra("result", "hard");
        setResult(2, data);
        finish();
    }

    public void Return(View view) {
        Intent data = new Intent();
        data.putExtra("result", "");
        setResult(2, data);
        finish();
    }
}
