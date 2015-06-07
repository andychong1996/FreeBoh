package com.application.freeboh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Marcus on 06/06/15.
 */


public class Register extends Activity {

    static String[] userinfo= new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.register_screen);



        final Context context = this;

        Button registerAfterButton;

        registerAfterButton = (Button)findViewById(R.id.registerAfter);

        registerAfterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userinfo[0]= ((EditText)findViewById(R.id.UsernameText)).getText().toString();
                userinfo[1]=((EditText)findViewById(R.id.DisplayNameText)).getText().toString();
                userinfo[2]=((EditText)findViewById(R.id.phoneNumberText)).getText().toString();
                userinfo[3]=((EditText)findViewById(R.id.PasswordText)).getText().toString();
                userinfo[4]=((EditText)findViewById(R.id.confirmPWText)).getText().toString();
                if (!userinfo[3].equals(userinfo[4])){
                    Toast.makeText(context, "Passwords do not matched! Please Try Again", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(context, MainActivity.class);

                    intent.putExtra("First Time Login", true);
                    intent.putExtra("parsedUsername",userinfo[0] );
                    intent. putExtra("parsedPassword",userinfo[3] );
                    startActivity(intent);
                }


            }
        });

    }

//    public static String getUsername(){
//        return userinfo[0];
//    }
//
//    public static String getPassword(){
//        return userinfo[3];
//    }
}
