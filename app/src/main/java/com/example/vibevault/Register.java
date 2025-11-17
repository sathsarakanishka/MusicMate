package com.example.vibevault;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button pop,rock,jazz,classical,edm,signUp;
    EditText username,email,password,confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        pop = findViewById(R.id.pop);
        rock =findViewById(R.id.Rock);
        jazz = findViewById(R.id.Jazz);
        classical = findViewById(R.id.Classical);
        edm = findViewById(R.id.EDM);
        signUp = findViewById(R.id.SignUp);
        username = findViewById(R.id.userName);
        email = findViewById(R.id.txtEmail);
        password = findViewById(R.id.Password);
        confirmPass = findViewById(R.id.Cpass);

        pop.setOnClickListener(this);
        rock.setOnClickListener(this);
        jazz.setOnClickListener(this);
        classical.setOnClickListener(this);
        edm.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}