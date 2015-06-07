package com.application.freeboh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by andy__000 on 07-Jun-15.
 */
public class Upload_Photo_Page extends Activity{

    @Override
    protected void onCreate(Bundle saveInstanceState){

        super.onCreate(saveInstanceState);

        setContentView(R.layout.upload_photo_page);

        final Context context= this;

        Button photo_upload_button= (Button)findViewById(R.id.uploadphoto_button);

        photo_upload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(context, MyTab.class);
                Upload_Photo_Page.this.startActivity(intent);
            }
        });

        }


    }

