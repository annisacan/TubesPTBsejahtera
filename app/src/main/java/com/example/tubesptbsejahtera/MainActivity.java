package com.example.tubesptbsejahtera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;
    Button belumPunyaAkunButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.usernamelog);
        password = findViewById(R.id.passwordlog);
        loginButton = findViewById(R.id.masukTombol);
        belumPunyaAkunButton = findViewById(R.id.belumPunyaAkunButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user")&& password.getText().toString().equals("1234")){
                    Toast.makeText(MainActivity.this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show();

                    Intent intent;
                    intent = new Intent(MainActivity.this, Home_Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Email atau password anda salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

        belumPunyaAkunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}