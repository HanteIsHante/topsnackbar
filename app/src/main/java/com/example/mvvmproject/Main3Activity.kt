package com.example.mvvmproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
//import com.topshow.snackbar.TopSnackbar
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main3)


//      show_snackbar.setOnClickListener {
//          val snackbar = TopSnackbar.make(root_view, "哈哈哈哈哈哈", TopSnackbar.LENGTH_INDEFINITE)
//          snackbar.setAction(ContextCompat.getDrawable(this, R.drawable.ic_cancel_black_24dp), object : View.OnClickListener{
//                  override fun onClick(v: View?){
//                      snackbar.dismiss()
//                  }
//              })
//          snackbar.show()
//      }
    }
}
