package com.example.newcriminalintent

import android.app.Application

class CriminalIntentnApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}