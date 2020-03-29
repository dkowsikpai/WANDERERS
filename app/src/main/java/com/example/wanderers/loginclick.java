package com.example.wanderers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class loginclick extends AppCompatActivity {

    TextView textView;
    TextView ltextview;
    Button lbutton1;
    Button lbutton2;
    Button lbutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginclick);

        ltextview=(TextView)findViewById(R.id.textView);
        lbutton1=(Button)findViewById(R.id.button);
        lbutton2=(Button)findViewById(R.id.button2);
        lbutton3=(Button)findViewById(R.id.button3);
        textView=(TextView)findViewById(R.id.textView2);
        lbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starttrip=new Intent(loginclick.this,startatrip.class);

                startActivity(starttrip);
            }
        });

    }
}
