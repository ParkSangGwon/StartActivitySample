package ted.startactivity.sample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("[Main]onCreate()")
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_detail).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        log("[Main]onStart()")
    }

    override fun onRestart() {
        super.onRestart()
        log("[Main]onRestart()")
    }
    override fun onResume() {
        super.onResume()
        log("[Main]onResume()")
    }

    override fun onPause() {
        super.onPause()
        log("[Main]onPause()")
    }

    override fun onStop() {
        super.onStop()
        log("[Main]onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("[Main]onDestroy()")
    }
}
