package me.buck.viewbindingktxdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.buck.viewbindingktx.viewBinding
import me.buck.viewbindingktxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.tv.text = "by viewbinding-ktx"
    }
}