package com.ayub.tugaslogin;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private EditText usernameField, emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        usernameField = findViewById(R.id.username_field);
        emailField = findViewById(R.id.email_field);
        passwordField = findViewById(R.id.password_field);

        Button registerButton = findViewById(R.id.register_button);
        Button loginButton = findViewById(R.id.login);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameField.getText().toString();
                String email = emailField.getText().toString();
                String password = passwordField.getText().toString();

                // Pindah ke MainActivity4 dengan membawa username, email, dan password
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PASSWORD", password);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke MainActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
