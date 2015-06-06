package com.application.freeboh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Marcus on 06/06/15.
 */
public class MyTab extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton yourTabButton, settingsButton;

        final Context context = this;

        yourTabButton = (ImageButton)findViewById(R.id.yourTab);
        yourTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, YourTab.class);
                startActivity(intent);
            }
        });

        settingsButton = (ImageButton)findViewById(R.id.settingsTab);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SettingsTab.class);
                startActivity(intent);
            }
        });
    }
}
