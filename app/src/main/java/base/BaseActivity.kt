package base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.tms_prokhorenko.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityBaseBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            setSupportActionBar(it.toolbar)
        }
    }
}