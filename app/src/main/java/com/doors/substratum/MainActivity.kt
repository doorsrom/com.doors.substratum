package com.doors.substratum

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.doors.styles.DoorsTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        DoorsTheme.checkTheme(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.subs).setOnClickListener {
            val i = Intent()
            val n = ComponentName("projekt.substratum",
                    "projekt.substratum.LauncherActivity")
            i.component = n
            startActivity(i)
        }
        findViewById<Button>(R.id.repo).setOnClickListener {
            startActivity(Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://github.com/doorsrom/com.doors.substratum")
            ))
        }
    }
}
