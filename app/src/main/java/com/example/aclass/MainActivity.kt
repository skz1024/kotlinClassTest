package com.example.aclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Kotlin();
        Kotlin("???")
        var kotlin = Kotlin()
        kotlin.one = "Hello"
        kotlin.printOne()

        Kotlin.printOne()
        Kotlin.one = "What"
        Kotlin.printOne()

        var dataUser = DataUser("스트링", 999)
        var newUser = dataUser.copy()
        newUser.name = "폭탄"
        Log.d("class", "원본 dataUser는 ${dataUser.toString()}")
        Log.d("class", "복사된 newUser는 ${newUser.toString()}")
    }
}

class Kotlin(){
    init {
        Log.d("class", "Kotlin 클래스 생성됨")
    }
    constructor(value: String) : this() {
        Log.d("class", "$value")
    }

    var one: String = "none"
    fun printOne(){
        Log.d("class", "Kotlinclass: one에 입력된 값은 ${one}입니다.")
    }

    companion object {
        var one: String = "None"
        fun printOne(){
            Log.d("class", "Kotlinclass: one에 입력된 값은 ${one}입니다.")
        }
    }
}

data class DataUser(var name: String, var age: Int)