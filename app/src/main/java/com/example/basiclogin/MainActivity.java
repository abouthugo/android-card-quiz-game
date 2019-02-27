package com.example.basiclogin;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    configureButtons();
  }


  protected void configureButtons() {
    Button login_btn = findViewById(R.id.login_btn);
    Button signup_btn = findViewById(R.id.signup_btn);

    login_btn.setOnClickListener((View v) -> {
      startActivity(new Intent(MainActivity.this, Login.class));
    });

    signup_btn.setOnClickListener((View v) -> {
      startActivity(new Intent(MainActivity.this, SignUp.class));
    });

  }

}
