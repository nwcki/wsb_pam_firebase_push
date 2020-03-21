package pl.knowicki.wsb.firebasepush

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        intent?.let {
            val title = it.getStringExtra(MyFirebaseMessagingService.NOTIFICATION_MESSAGE_TITLE)
            val body = it.getStringExtra(MyFirebaseMessagingService.NOTIFICATION_MESSAGE_BODY)

            some_text.text = "$title\n\n\n$body"
        }
    }
}