package me.buck.viewbindingktx

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ActivityViewBindingDelegate<T : ViewBinding>(
    val viewBindingFactory: (View) -> T
) : ReadOnlyProperty<AppCompatActivity, T> {

    private var binding: T? = null


    override fun getValue(thisRef: AppCompatActivity, property: KProperty<*>): T {
        if (binding == null) {
            binding = viewBindingFactory(thisRef.contentView)
        }
        return binding!!
    }
}

fun <T : ViewBinding> AppCompatActivity.viewBinding(viewBindingFactory: (View) -> T) =
    ActivityViewBindingDelegate(viewBindingFactory)

val AppCompatActivity.contentView: View
    get() = (findViewById<View>(android.R.id.content) as ViewGroup).getChildAt(0)

