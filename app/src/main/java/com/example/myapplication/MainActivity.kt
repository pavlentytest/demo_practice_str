package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.chip.Chip
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var edit: EditText
    private lateinit var btn: Button
    private lateinit var btn2: Button
    private var counter = 0
    private lateinit var chip: Chip


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        edit = findViewById(R.id.editText)
        btn = findViewById(R.id.button5)
        btn2 = findViewById(R.id.button6)
        chip = findViewById(R.id.chip)
        tv.text = counter.toString()
        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }
        Snackbar.make(findViewById(R.id.root),"Test message!", Snackbar.LENGTH_LONG).show()
        btn2.setOnClickListener {
            when {
                chip.isChecked -> {tv.text = "true"}
                else -> tv.text = "false"
            }
        }




        edit.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
               // TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
               // TODO("Not yet implemented")
            }

            override fun afterTextChanged(s: Editable?) {
                tv.text = s.toString()
            }

        })

    }
}