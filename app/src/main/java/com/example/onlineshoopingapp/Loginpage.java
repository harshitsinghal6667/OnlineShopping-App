package com.example.onlineshoopingapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class Loginpage extends AppCompatActivity {
    EditText email, password;
    Button login;
    TextView reg;
    TextInputLayout email_layout, pass_layout;
    private DBHelper databaseHelper;

    private InputValidation inputValidation;
    User user;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.already_account);
        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextpassword);
        login = (Button) findViewById(R.id.cirRegisterButton);
        reg = (TextView) findViewById(R.id.registration);

        email_layout = (TextInputLayout) findViewById(R.id.textInputEmail);
        pass_layout = (TextInputLayout) findViewById(R.id.textInputpassword);

        databaseHelper = new DBHelper(Loginpage.this);
        inputValidation = new InputValidation(Loginpage.this);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginpage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!inputValidation.isInputEditTextFilled(email, email_layout, "Enter Valid Emaiil")) {
                    return;
                }
                if (!inputValidation.isInputEditTextEmail(email, email_layout, "Enter Valid Emaiil")) {
                    return;
                }
                if (!inputValidation.isInputEditTextFilled(password, pass_layout, "Enter Valid Password")) {
                    return;
                }
                if (databaseHelper.checkUser(email.getText().toString().trim()
                        , password.getText().toString().trim())) {
                    Intent accountsIntent = new Intent(Loginpage.this, HomeActivity.class);
                    accountsIntent.putExtra("EMAIL", email.getText().toString().trim());
                    emptyInputEditText();
                    startActivity(accountsIntent);
                } else {
                    Toast.makeText(Loginpage.this, "Wrong Email or Password", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    private void emptyInputEditText(){
        email.setText(null);
        password.setText(null);
    }
}