package com.example.buttonsetlistener3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginButton,logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButtonId);
        logoutButton = findViewById(R.id.logoutButtonId);
        textView = findViewById(R.id.textViewId);

    }

    public void showMessage(View v){

        if (v.getId()==R.id.loginButtonId){
            textView.setText("Login Button is Click.");
        }
        else if(v.getId()==R.id.logoutButtonId){
            textView.setText("Logout Button is Click.");
        }
    }
}