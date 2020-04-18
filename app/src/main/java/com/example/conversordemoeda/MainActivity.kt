package com.example.conversordemoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener(View.OnClickListener {
            var base = edtBase.text.toString().toDouble()
            var valor = edtBase2.text.toString().toDouble()
            var conversao = valor/base
            result.text = conversao.toString()
        })
    }
}
