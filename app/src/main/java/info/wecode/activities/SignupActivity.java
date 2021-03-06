package info.wecode.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.wecode.MainActivity;
import info.wecode.R;
import info.wecode.database.UserDatabase;

public class SignupActivity extends MainActivity {

    /**
     * This activity will help the donor user to do registration, user is asked to enter username, password and confirm password.
     */
    EditText userNameET;
    EditText firstNameET;
    EditText lastNameET;
    EditText donorIdET;
    EditText emailIdET;
    EditText mobileET;
    EditText passwordET;
    EditText confirmpasswordET;
    Button createBtn;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_signup, null, false);
        mDrawer.addView(contentView, 0);
        userNameET = (EditText) findViewById(R.id.usernameET);
        firstNameET = (EditText) findViewById(R.id.firstNameET);
        lastNameET = (EditText) findViewById(R.id.lastNameET);
        donorIdET = (EditText) findViewById(R.id.donorIdET);
        emailIdET = (EditText) findViewById(R.id.emailET);
        mobileET = (EditText) findViewById(R.id.mobileET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        confirmpasswordET = (EditText) findViewById(R.id.confirmpasswordET);
        createBtn = (Button) findViewById(R.id.createBtn);

        createBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameET.getText().toString();
                String firstName = firstNameET.getText().toString();
                String lastName = lastNameET.getText().toString();
                String donorId = donorIdET.getText().toString();
                String email = emailIdET.getText().toString();
                String mobile = mobileET.getText().toString();
                String password = passwordET.getText().toString();
                String confirmPwd = confirmpasswordET.getText().toString();

                if (userName.equals("") || password.equals("") || confirmPwd.equals("") ||
                    firstName.equals("") || lastName.equals("") || donorId.equals("")||
                        email.equals("") || mobile.equals("")

                        ) {
                    Toast.makeText(getApplicationContext(), "Please provide all fields", Toast.LENGTH_LONG).show();
                } else if (!password.equals(confirmPwd)) {
                    Toast.makeText(getApplicationContext(), "Passwords does not match", Toast.LENGTH_LONG).show();
                } else {
                    //Saves UserModel Data too
                    //creates Account
                    UserDatabase.store(userName, password);
                    Toast.makeText(getApplicationContext(), "Account Creation successful", Toast.LENGTH_LONG).show();
                    /*
                    On successful registration, user is redirected to login activity
                     */
                    Intent mainActivityIntent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(mainActivityIntent);
                    finish();
                }
            }
        });

    }
}