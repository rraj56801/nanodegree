package com.example.android.singlescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button menuButton, orderButton,locationButton,submitButton;
    EditText editTexts;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ScrollView scrollViews=(ScrollView)findViewById(R.id.scrollView);
        scrollViews.setVerticalScrollBarEnabled(true);
        menuButton =(Button) findViewById(R.id.menu_button);
        orderButton=(Button)findViewById(R.id.order_button);
        locationButton=(Button)findViewById(R.id.location_button);
        submitButton=(Button)findViewById(R.id.submit_button);
        editTexts=(EditText)findViewById(R.id.editText);
        editTexts.setHint("Write your review here");
        textView=(TextView)findViewById(R.id.review_text);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Function will be added shortly",Toast.LENGTH_LONG).show();
            }
        });
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Function will be added shortly",Toast.LENGTH_LONG).show();
            }
        });
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Function will be added shortly",Toast.LENGTH_LONG).show();
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String s= (editTexts.getText().toString()).trim();
                textView.setText("@"+s);
              editTexts.setText("");

            }
        });
    }
}
