package com.example.moreviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        output = (TextView)findViewById(R.id.output);
    }

    public void isClicked(View view) {
        try {
            float num = Float.parseFloat(input.getText().toString());
        } catch (NumberFormatException | NullPointerException nfe) {
            Toast.makeText(this, "Enter a valid number!", Toast.LENGTH_SHORT).show();
            return;
        }

        output.setText(String.valueOf(Float.parseFloat(input.getText().toString()) * 2.0));
    }

    public void isClicked0(View view) {
        input.setText(input.getText() + "0");
    }
}
