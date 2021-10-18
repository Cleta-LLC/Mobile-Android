package com.example.cleta_mobile_android
import android.app.Application

class CletaMobileAndroidApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}