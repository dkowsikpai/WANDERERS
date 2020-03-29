package com.example.wanderers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registeractivity extends AppCompatActivity {

    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    Button mButtonreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractivity);

        mTextUsername=(EditText)findViewById(R.id.editext_username);
        mTextPassword=(EditText)findViewById(R.id.editext_password);
        mButtonLogin=(Button) findViewById(R.id.button_login);
        mButtonreg=(Button) findViewById(R.id.buttonreg);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
    }


        public void openactivity2(){


            Intent intent = new Intent(this,loginclick.class);
            startActivity(intent);
        }


    };

