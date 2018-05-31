package com.omertahaozturk.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button firsButton;
    Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firsButton = findViewById(R.id.button);
        secondButton = findViewById(R.id.button1);
    }

public void broadcast(View view){

        Intent intent = new Intent(this,MyFirstReceiver.class);
        sendBroadcast(intent);

    }


public static class MySecondReceiver extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent ıntent) {
        Toast.makeText(context,"Second Broadcast",Toast.LENGTH_LONG).show();
    }
}

public void broadcast2(View view){

    Intent intent = new Intent(this,MySecondReceiver.class);
    sendBroadcast(intent);
}

}
