package com.continuum.downloadmangerjetpack.services;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiverDownloadManager extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.v("MY_APP","!!! onReceive !!!");

        if (DownloadManager.ACTION_NOTIFICATION_CLICKED.equals(action))
        {
            /*Intent i = new Intent(context,MainActivity.class);
            i.setFlags( Intent.FLAG_ACTIVITY_NEW_TASK);
            i.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
            context.startActivity(i);*/

            Intent i = new Intent();
            i.setFlags( Intent.FLAG_ACTIVITY_NEW_TASK);
            i.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
            context.startActivity(i);
        }
    }
}