package com.example.vanoverveld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var liczba1 = 0;
        var liczba2 = 0;
        var wynik = 0;

        findViewById<Button>(R.id.zastosujbtn).setOnClickListener {
            findViewById<TextView>(R.id.wyniktxt).text = findViewById<TextInputEditText>(R.id.wprowadzanie).text;
        }

        findViewById<Button>(R.id.dodajbtn).setOnClickListener {
            findViewById<TextView>(R.id.wyniktxt).text = findViewById<TextView>(R.id.wyniktxt).text.toString() + findViewById<TextInputEditText>(R.id.wprowadzanie).text;
        }

        findViewById<Button>(R.id.dodawaniebtn).setOnClickListener {
            liczba1 = findViewById<EditText>(R.id.Liczba1Edit).text.toString().toInt();
            liczba2 = findViewById<EditText>(R.id.Liczba2Edit).text.toString().toInt();
            wynik = liczba1 + liczba2;
            findViewById<TextView>(R.id.wyniktxt).text = wynik.toString();
        }
    }
}