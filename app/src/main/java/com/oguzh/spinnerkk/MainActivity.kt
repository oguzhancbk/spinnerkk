package com.example.toggleswitch5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import com.oguzh.spinnerkk.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sw = findViewById<Switch>(R.id.switch1)
        var tg = findViewById<ToggleButton>(R.id.toggleButton)

        sw.setOnCheckedChangeListener { compoundButton, a ->
            if(a) {
                Toast.makeText(applicationContext,"Açık",Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(applicationContext,"Kapalı",Toast.LENGTH_LONG).show()

            }
        }

        tg.setOnCheckedChangeListener { compoundButton, b ->
            if(b) {
                Toast.makeText(applicationContext,"Açık",Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(applicationContext,"Kapalı",Toast.LENGTH_LONG).show()

            }
        }
    }
}