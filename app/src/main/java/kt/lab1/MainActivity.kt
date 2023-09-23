package kt.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.Math.PI
import java.lang.Math.sin
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iddata: TextView = findViewById(R.id.iddata)
        val res: TextView = findViewById(R.id.res)
        val res2: TextView = findViewById(R.id.res2)
        val a:Double = 5.656
        val data:String = "G"


        iddata.setText(data)
        res.setText(res1(data,a))
        res2.setText(res2(data,a))




    }
    private fun res1(data:String, number:Double):String {
        val n = if (data == "K") kotlin.math.sqrt((number * number) + (number * number))
        else if (data == "G") kotlin.math.sin(45 * PI / 180) * number
        else if (data == "S") kotlin.math.sqrt(number / 0.5) else TODO()
        return ("Результат 1 - $n")
    }
    private fun res2(data: String, number: Double):String{
        val m = if (data=="K") 0.5*number*number
        else if (data == "G") 0.5*(kotlin.math.sin(45 * PI / 180) *number)*(kotlin.math.sin(45 * PI / 180) *number)
        else if (data == "S") kotlin.math.sqrt(
            ((kotlin.math.sqrt(number / 0.5) * kotlin.math.sqrt(number / 0.5)) + (kotlin.math.sqrt(
                number / 0.5
            ) * kotlin.math.sqrt(number / 0.5)))
        ) else TODO()
        return ("Результат 2 - $m")
    }

}