package com.example.android.intentexample;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class BuckysIntentService extends IntentService{

    private static final String TAG = "com.thenewboston.intenttest";

    public BuckysIntentService() {
        super("BuckysIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //this is what the service does
        Log.i(TAG, "The service has now started");
    }

}
