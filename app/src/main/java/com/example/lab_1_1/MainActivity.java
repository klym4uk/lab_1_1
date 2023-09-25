package com.example.lab_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= findViewById(R.id.change_text);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "wow, TEXT changed", Toast.LENGTH_SHORT).show();
           TextView change_text= findViewById(R.id.textView);
           change_text.setText("Hello people!");
           // find text

           }
       });

       Button btn2= findViewById(R.id.change_color);
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "wow, COLOR changed", Toast.LENGTH_SHORT).show();
            TextView change_text_color=findViewById(R.id.textView);
            change_text_color.setTextColor(Color.RED);

           }
       });
    }
}