package com.example.cleta

import android.app.Application

class AndroidGettingStartedApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // initialize Amplify when application is starting
        Backend.initialize(applicationContext)
    }
}