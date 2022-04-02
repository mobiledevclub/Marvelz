package ir.mobdevclub.marvelz

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ir.mobdevclub.marvelz.common.Prefs

val prefs: Prefs by lazy {
    AndroidApplication.prefs!!
}

@HiltAndroidApp
class AndroidApplication : Application() {

    companion object {
        var prefs: Prefs? = null
        lateinit var instance: AndroidApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
        prefs = Prefs(applicationContext)

    }
}