package com.example.basiclogin;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button login_btn;
  Button signup_btn;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    login_btn = findViewById(R.id.login_btn);
    signup_btn = findViewById(R.id.signup_btn);
  }

  // Signup-btn event handler
  public void signUp(View view) {

  }


  // Login-btn event handler
  public void login(View view) {

  }
}
