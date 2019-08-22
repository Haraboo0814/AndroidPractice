package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // このアクティビティを開始し String を展開する Intent を取得
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        // レイアウトのTextViewをキャプチャし、文字列をテキストとして設定します
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
