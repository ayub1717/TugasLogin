package com.ayub.tugaslogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView usernameTextView = findViewById(R.id.tuser);
        TextView passwordTextView = findViewById(R.id.tpass);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("USERNAME");
            String password = intent.getStringExtra("PASSWORD");

            // Menampilkan data di TextView
            if (username != null) {
                usernameTextView.setText(username);
            }
            if (password != null) {
                passwordTextView.setText(password);
            }
        }
    }
}
