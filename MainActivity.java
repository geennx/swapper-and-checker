package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button swap,check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        check = findViewById(R.id.check);
        swap = findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t1 = editText1.getText().toString();
                String t2 = editText2.getText().toString();
                editText1.setText(t2);
                editText2.setText(t1);
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t;
                String t1 = editText1.getText().toString();
                String t2 = editText2.getText().toString();

                if (t1==t2)
                    t="SAME";
                else
                    t="NOT THE SAME";
                Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("id",t);
                startActivity(intent);
            }
        });
    }
}
