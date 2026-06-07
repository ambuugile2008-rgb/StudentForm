package com.example.assignment1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText Name, Phone, Email,
            Address, College,
            Technology, Year;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assignment1);

        Name = findViewById(R.id.Name);
        Phone = findViewById(R.id.Phone);
        Email = findViewById(R.id.Email);
        Address = findViewById(R.id.Address);
        College = findViewById(R.id.College);
        Technology = findViewById(R.id.Technology);
        Year = findViewById(R.id.Year);

        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {

            String name = Name.getText().toString().trim();
            String phone = Phone.getText().toString().trim();
            String email = Email.getText().toString().trim();

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {

                Toast.makeText(
                        MainActivity.this,
                        "Please fill all required fields",
                        Toast.LENGTH_SHORT
                ).show();

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Form Submitted Successfully",
                        Toast.LENGTH_LONG
                ).show();

                Name.setText("");
                Phone.setText("");
                Email.setText("");
                Address.setText("");
                College.setText("");
                Technology.setText("");
                Year.setText("");
            }
        });
    }
}