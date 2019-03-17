package com.example.basiclogin;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.basiclogin.Shared.EMAIL_REGEX;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    configureButtons();
  }

  /**
   * Sets click handlers on buttons
   */
  protected void configureButtons() {
    Button login_btn = findViewById(R.id.login_btn);
    Button signup_btn = findViewById(R.id.signup_btn);

    login_btn.setOnClickListener((View v) -> {
      if(validEmail() && validPassword())
        startActivity(new Intent(MainActivity.this, Rules.class));
    });

    signup_btn.setOnClickListener((View v) -> {
      startActivity(new Intent(MainActivity.this, SignUp.class));
    });

  }

  /**
   * Validates the email with the help of a regular expression found online
   * @return
   */
  protected boolean validEmail(){
    TextInputLayout usernameText = findViewById(R.id.username);
    String username = usernameText.getEditText().getText().toString().trim();
    if(username.length() < 10){
      usernameText.setError("Invalid Email");
      return false;
    }
    if(usernameText.getError() != null) usernameText.setError(null);
    return EMAIL_REGEX.matcher(username).matches();
  }

  /**
   * Checks if the password is at least 5 characters long
   * @return
   */
  protected boolean validPassword(){
    TextInputLayout passwdText = findViewById(R.id.password);
    String passwd = passwdText.getEditText().getText().toString();
    boolean flag = passwd.length()>=5;
    if(!flag) passwdText.setError("Password must be at least 5 characters long");
    if(passwdText.getError()!=null && flag) passwdText.setError(null);
    return flag;
  }
}
