package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    Button doneButton;
    Button enterButton;
    EditText nameText;
    EditText emailText;
    EditText mobileText;
    EditText passwordText;
    EditText dobText;
    CheckBox checkBox;
    ConstraintLayout constraintLayout;
    LinearLayout linearLayout;

    public void clickMe(View view) {


        linearLayout.setVisibility(View.INVISIBLE);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterButton.setVisibility(View.INVISIBLE);
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
        done(doneButton);

    }

    public void done(View view) {
        Toast.makeText(this, nameText.getText().toString() + " info submitted ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = findViewById(R.id.enterButton);
        nameText = findViewById(R.id.nameText);
        mobileText = findViewById(R.id.mobileText);
        emailText = findViewById(R.id.emailText);
        passwordText = findViewById(R.id.passwordText);
        dobText = findViewById(R.id.dobText);
        checkBox = findViewById(R.id.checkBox);
        doneButton = findViewById(R.id.doneButton);
        linearLayout = findViewById(R.id.linearLayout);
        constraintLayout = findViewById(R.id.constriantLayout);


        clickMe(enterButton);


    }
}