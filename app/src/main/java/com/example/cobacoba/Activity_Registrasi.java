package com.example.cobacoba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Registrasi extends AppCompatActivity {
    EditText emailText, passwordText;
    String nama, password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);



            emailText = findViewById(R.id.edEmail);
            passwordText=findViewById(R.id.edPassword);
            login = findViewById(R.id.btSignin);

            Bundle bundle = getIntent().getExtras();

            nama = bundle.getString("data1");
            password = bundle.getString("data2");
            emailText.setText(bundle.getString("data1"));
            passwordText.setText(bundle.getString("data2"));
    }
}