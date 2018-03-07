package com.example.jopihabich.einzelabgabev1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                editText = (EditText) findViewById(R.id.editText);
                textView = (TextView) findViewById(R.id.textView3);
                textView.setText(editText.getText().toString());


            }
        });


    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public String genMessage() {

        if(editText.getText().toString().length()==0 | editText.getText().toString() ==null){
            return "No Input";
        }else if(editText.getText().toString().length()<5){
            return "Input is to short";
        }

        if (isPalindrome(editText.getText().toString())) {
            return "It is a Palindrome!";
        }else {
            return "No Palindrome!";
        }
    }
}
