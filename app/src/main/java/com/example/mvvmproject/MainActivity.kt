package com.example.mvvmproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.MainThread
import androidx.lifecycle.*
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {

    private lateinit var model: NameViewM
    private var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        model =  ViewModelProvider.NewInstanceFactory().create(NameViewM::class.java)

        val newObserver = object : Observer<String>{
            override fun onChanged(t: String?){
                show_text.text = t.toString()
            }
        } // 监听变化
        model.mName.observe(this, newObserver) // 订阅

        change_tv.setOnClickListener {
            val p = i++
            model.mName.value = "this is LiveData $p" // 赋值

        }

//        val transformation: LiveData<String> = Transformations.map(newObserver, )
//        tv_seconde.text = "ABCD $it"


//        transformation.observe(this, newObserver)

        gainPermission()

    }

    private fun gainPermission(){
        val rxPermission = RxPermissions(this)
        rxPermission.requestEach(android.Manifest.permission.CAMERA, android.Manifest.permission.READ_PHONE_STATE)
            .subscribe {
                it ->
                if (it.granted){
                    val name = it.name
                    Log.d("<=", "<=========granted: ${name}")
                } else if (it.shouldShowRequestPermissionRationale) {
                    Log.d("<=", "<========= ${it.name}")
                } else {
                    val name = it.name
                    Log.d("<=", "<=========!granted: ${name}")
                }
            }
    }
}

class MyLiveData :LiveData<String>(){

    override fun onActive(){
        super.onActive()
    }

    override fun onInactive(){
        super.onInactive()


    }
}



