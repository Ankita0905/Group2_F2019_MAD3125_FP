package com.example.group2_f2019_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName=findViewById(R.id.edtUserName);
        password=findViewById(R.id.edtPassword);
        btnlogin=findViewById(R.id.btnLogin);



        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().equals("user@employee.com") &&
                        password.getText().toString().equals("s3cr3t")) {
                    Intent i=new Intent(LoginActivity.this,SplashActivity.class);
                    startActivity(i);
                }else{
                    userName.setError("Invalid UserName");
                    password.setError("Invalid Password");
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();



                }
            }
        });
    }

}
