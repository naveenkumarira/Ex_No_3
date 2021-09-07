package com.example.ex_no_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputTextOne;
    EditText inputTextTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextOne = findViewById(R.id.et_input_text_one);
        inputTextTwo = findViewById(R.id.et_input_text_two);
        final Button addButton = findViewById(R.id.btn_add);
        final Button subButton = findViewById(R.id.btn_sub);
        final Button mulButton = findViewById(R.id.btn_mul);
        final Button divButton = findViewById(R.id.btn_div);
        final Button clearButton = findViewById(R.id.btn_clear);
        final TextView outputText = findViewById(R.id.outputText);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int add = getInputOne() + getInputTwo();
                outputText.setText(getInputOne() + "+" + getInputTwo() + "=" + add);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sub = getInputOne() - getInputTwo();
                outputText.setText(getInputOne() + "-" + getInputTwo() + "=" + sub);
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul = getInputOne() * getInputTwo();
                outputText.setText(getInputOne() + "*" + getInputTwo() + "=" + mul);
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (getInputTwo() == 0) {
                    Toast.makeText(getBaseContext(), getInputOne() + " can't divided by zero", Toast.LENGTH_SHORT).show();
                    return;
                }

                int div = getInputOne() / getInputTwo();
                outputText.setText(getInputOne() + "/" + getInputTwo() + "=" + div);
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outputText.setText("");
                inputTextOne.setText("");
                inputTextTwo.setText("");
            }
        });


    }

    int getInputOne() {
        return Integer.parseInt(inputTextOne.getText().toString());
    }

    int getInputTwo() {
        return Integer.parseInt(inputTextTwo.getText().toString());
    }
}