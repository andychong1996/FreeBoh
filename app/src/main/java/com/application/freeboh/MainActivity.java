package com.application.freeboh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_screen);

        final Context context = this;

//         String Username= ((EditText)findViewById(R.id.UsernameText)).getText().toString();
//         String Password=((EditText)findViewById(R.id.DisplayNameText)).getText().toString();
         //String parsedUsername= Register.getUsername();
       // String parsedPassword= Register.getPassword();


        Button loginButton, registerButton;

        loginButton = (Button)findViewById(R.id.loginButton);
        registerButton = (Button)findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username= ((EditText)findViewById(R.id.UsernameText)).getText().toString();
                String Password=((EditText)findViewById(R.id.PasswordText)).getText().toString();
                String parsedUsername= getIntent().getStringExtra("parsedUsername");
                String parsedPassword= getIntent().getStringExtra("parsedPassword");
                if(!Username.equals(parsedUsername)&& !Password.equals(parsedPassword)){

                    Toast.makeText(context, "Username or Password doesn't match! Please Try Again", Toast.LENGTH_LONG).show();

                }else {

                    Intent intent = new Intent(context, MyTab.class);

                    startActivity(intent);
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, Register.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
