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
                textView.setText(genMessage(editText.getText().toString()));
                editText.setText("");

            }
        });


    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public String genMessage(String input) {

        if(input.length()==0 | input ==null){
            return "No Input";
        }else if(input.length()<5){
            return "Input is to short";
        }

        if (isPalindrome(input)) {
            return input+" is a Palindrome!";
        }else {
            return input+ " is no Palindrome!";
        }
    }
}
