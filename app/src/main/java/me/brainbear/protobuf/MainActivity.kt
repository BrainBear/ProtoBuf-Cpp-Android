package me.brainbear.protobuf

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import me.brainbear.lite.Lite
import me.brainbear.nano.Nano

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nano().test()

        Lite().test()
    }
}
