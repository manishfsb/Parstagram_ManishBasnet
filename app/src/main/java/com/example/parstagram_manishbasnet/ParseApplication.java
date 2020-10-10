package com.example.parstagram_manishbasnet;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0Ai3eo52TgN7GDIz92aRYqAvf4tkxuj6y4qWJBuY")
                .clientKey("yqFvcsSw9Yl3vp2I0GXYoDNseUZphI4yuOn8LgEd")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
