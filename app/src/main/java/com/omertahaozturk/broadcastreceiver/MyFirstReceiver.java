package com.omertahaozturk.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Asus on 31.05.2018.
 */

public class MyFirstReceiver extends BroadcastReceiver {




     @Override
    public void onReceive(Context context, Intent ıntent) {

         Toast.makeText(context,"First Broadcast",Toast.LENGTH_LONG).show();
    }
}
