package com.provakotlin; // replace com.your-app-name with your app’s name

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class ProvaJava extends ReactContextBaseJavaModule {
    ProvaJava(ReactApplicationContext context) {
        super(context);
    }


    @Override
    public String getName() {
        return "ProvaJava";
    }

    @ReactMethod
    public void createCalendarEvent(String name, String location,Promise promise) {
        Log.d("CalendarModule", "Create event called with name: " + name
                + " and location: " + location);

        try {
            Integer eventId = 4;
            promise.resolve(eventId);
        } catch(Exception e) {
            promise.reject("Create Event Error", e);
        }
    }

}