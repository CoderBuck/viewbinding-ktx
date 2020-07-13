package me.buck.viewbindingktxdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.buck.viewbindingktx.viewBinding
import me.buck.viewbindingktxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tv.text = "activity by viewbinding-ktx"
    }
}