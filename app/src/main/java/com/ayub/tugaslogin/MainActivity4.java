package com.ayub.tugaslogin;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView usernameTextView = findViewById(R.id.tuser2);
        TextView emailTextView = findViewById(R.id.temail);
        TextView passwordTextView = findViewById(R.id.tpass2);

        // Mendapatkan data dari Intent
        Intent intent = getIntent();
        if (intent != null) {
            String username = intent.getStringExtra("USERNAME");
            String email = intent.getStringExtra("EMAIL");
            String password = intent.getStringExtra("PASSWORD");

            // Menampilkan data di TextView
            if (username != null) {
                usernameTextView.setText(username);
            }
            if (email != null) {
                emailTextView.setText(email);
            }
            if (password != null) {
                passwordTextView.setText(password);
            }
        }
    }
}
