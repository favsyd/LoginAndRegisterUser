package com.appnucleus.loginandregisteruser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Frank Ilo on 20/01/2017.
 */

public class admin extends Activity {

    Button btn1,btn2,btn3;
    public void onCreate(Bundle sms) {
        super.onCreate(sms);
        setContentView(R.layout.layout);
        btn1= (Button)findViewById(R.id.button1);
        btn2= (Button)findViewById(R.id.button2);
        btn3= (Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v)
        { Intent intent=new Intent(admin.this, Activity_Login.class);
            startActivity(intent);
    }
});
    }}