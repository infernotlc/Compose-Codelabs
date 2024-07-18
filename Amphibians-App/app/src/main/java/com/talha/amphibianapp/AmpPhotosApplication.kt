package com.talha.amphibianapp

import android.app.Application
import com.talha.amphibianapp.data.AppContainer
import com.talha.amphibianapp.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}