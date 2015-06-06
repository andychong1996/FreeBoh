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
public class YourTab extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_tab);

        final View FREE, BUSY, ALL;
        FREE = (View)findViewById(R.id.displayFree);
        BUSY = (View)findViewById(R.id.displayBusy);
        ALL = (View)findViewById(R.id.displayAll);

        ImageButton myTabButton, settingsButton;

        final Context context = this;

        myTabButton = (ImageButton)findViewById(R.id.myTab);
        myTabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MyTab.class);
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

        Button allButton, freeButton, busyButton;

        freeButton = (Button)findViewById(R.id.freeButton);
        freeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL.setVisibility(View.GONE);
                BUSY.setVisibility(View.GONE);
                FREE.setVisibility(View.VISIBLE);
            }
        });

        busyButton = (Button)findViewById(R.id.busyButton);
        busyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ALL.setVisibility(View.GONE);
                FREE.setVisibility(View.GONE);
                BUSY.setVisibility(View.VISIBLE);
            }
        });

        allButton = (Button)findViewById(R.id.allButton);
        allButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BUSY.setVisibility(View.GONE);
                FREE.setVisibility(View.GONE);
                ALL.setVisibility(View.VISIBLE);
            }
        });
    }
}
