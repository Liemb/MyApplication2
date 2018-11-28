package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }


    public void clicked(View view) {
        int y=0;
            btn.setText("This is a click number:" + y+1);
            y=y+1;
        if(y == 7)
        {
            btn.setText("Enough to click. Go to new start!");
            y = 0;
        }




    }
}
