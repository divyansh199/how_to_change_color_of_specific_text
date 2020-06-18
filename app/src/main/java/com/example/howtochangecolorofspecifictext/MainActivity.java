package com.example.howtochangecolorofspecifictext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_view);
        String text = "I want THIS and THIS to be colored";

        SpannableString ss = new SpannableString(text);

        ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan fcsGreen= new ForegroundColorSpan(Color.GREEN);

        ss.setSpan(fcsRed,7,11, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );
        ss.setSpan(fcsGreen,16,20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE );

        textView.setText(ss);


    }
}
