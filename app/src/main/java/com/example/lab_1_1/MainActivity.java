package com.example.lab_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.change_text);
        TextView change_text = findViewById(R.id.textView);

// An array of possible text options
        String[] randomTextOptions = {
                "Hello PEOPLE!",
                "Hello PROFE$$OR!",
                "Random Text!",
                "Have a nice day!"
        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "wow, TEXT changed", Toast.LENGTH_SHORT).show();

                // A random index to select a random text from the array
                int randomIndex = new Random().nextInt(randomTextOptions.length);

                // Set the text to the randomly selected option
                change_text.setText(randomTextOptions[randomIndex]);
            }
        });

        Button btn2= findViewById(R.id.change_color);
       btn2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "wow, COLOR changed", Toast.LENGTH_SHORT).show();
               TextView change_text_color = findViewById(R.id.textView);

               // Generate a random color
               int randomColor = generateRandomColor();

               // Set the text color to the random color
               change_text_color.setTextColor(randomColor);
           }

           private int generateRandomColor() {
               Random rand = new Random();
               // Generate random values for the red, green, and blue components
               int red = rand.nextInt(256);
               int green = rand.nextInt(256);
               int blue = rand.nextInt(256);
               // Create the color by combining the components
               return Color.rgb(red, green, blue);
           }

       });
    }
}