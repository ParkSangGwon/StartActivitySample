package ted.startactivity.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("[Detail]onCreate()")
        setContentView(R.layout.activity_detail)
    }

    override fun onStart() {
        super.onStart()
        log("[Detail]onStart()")
    }

    override fun onResume() {
        super.onResume()
        log("[Detail]onResume()")
    }

    override fun onPause() {
        super.onPause()
        log("[Detail]onPause()")
    }

    override fun onStop() {
        super.onStop()
        log("[Detail]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("[Detail]onDestroy()")
    }
}
