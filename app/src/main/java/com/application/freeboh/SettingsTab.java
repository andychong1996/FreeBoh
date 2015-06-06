package com.application.freeboh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Marcus on 06/06/15.
 */
public class SettingsTab extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        ImageButton yourTabButton, myTabButton;

        final Context context = this;

        yourTabButton = (ImageButton)findViewById(R.id.yourTab);
        yourTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, YourTab.class);
                startActivity(intent);
            }
        });

        myTabButton = (ImageButton)findViewById(R.id.myTab);
        myTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MyTab.class);
                startActivity(intent);
            }
        });
    }
}
