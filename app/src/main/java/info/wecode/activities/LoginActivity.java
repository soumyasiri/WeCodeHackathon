package info.wecode.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.wecode.AppConstants;
import info.wecode.MainActivity;
import info.wecode.R;
import info.wecode.database.UserDatabase;

public class LoginActivity extends MainActivity {

    EditText userNameET;
    EditText passwordET;
    Button loginBtn;
    TextView signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_login, null, false);
        mDrawer.addView(contentView, 0);
        userNameET = (EditText) findViewById(R.id.loginUserNameET);
        passwordET = (EditText) findViewById(R.id.loginPasswordET);
        loginBtn = (Button) findViewById(R.id.loginBtn);
        signUpBtn = (TextView) findViewById(R.id.signupBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameET.getText().toString();
                String pwd = passwordET.getText().toString();

                if (userNameET.equals("") || pwd.equals("")) {

                    Toast.makeText(getApplicationContext(), "Please provide all fields", Toast.LENGTH_LONG).show();
                } else {
                    String pass = UserDatabase.getpassword(userName);
                    if (!pass.equals(pwd)) {
                        Toast.makeText(getApplicationContext(), "No such user registered.", Toast.LENGTH_LONG).show();
                        ((EditText) findViewById(R.id.loginUserNameET)).setText("");
                        ((EditText) findViewById(R.id.loginPasswordET)).setText("");
                    } else {
                        /*
                        On successful login, user is redirected to MainActivity
                         */
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(AppConstants.LOGIN_FLAG, true);
                        Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_LONG).show();
                        Intent mainActivityIntent = new Intent(LoginActivity.this, MainActivity.class);
                        mainActivityIntent.putExtras(bundle);
                        startActivity(mainActivityIntent);
                        finish();
                    }

                }
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, SignupActivity.class));
            }
        });

    }

}
