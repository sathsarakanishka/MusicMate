package com.example.vibevault;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    Button btnEditProfile,btnChangePass,btnLogout;
    TextView username,email,txtF1,txtF2,txtF3,txtBio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        btnChangePass = findViewById(R.id.btnChangePass);
        btnEditProfile = findViewById(R.id.btnEditeProfile);
        btnLogout = findViewById(R.id.btnLogOut);
        txtBio = findViewById(R.id.txtBio);
        username = findViewById(R.id.userName);
        email = findViewById(R.id.txtEmail);
        txtF1 = findViewById(R.id.txtF1);
        txtF2 = findViewById(R.id.txtF2);
        txtF3 = findViewById(R.id.txtF3);
    }

    @Override
    public void onClick(View v) {

    }
}