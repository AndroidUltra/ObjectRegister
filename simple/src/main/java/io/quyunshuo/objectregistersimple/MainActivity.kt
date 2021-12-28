package io.quyunshuo.objectregistersimple

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.quyunshuo.objectregister.OR
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashMap

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.vTvJump).setOnClickListener {
            OR.instance.let {
                it.putInt("int_1", 10)
                it.putInt("int_2", 20)
                it.putInt("int_3", 30)
                it.putInt("int_4", 40)

                it.putLong("long_1", 1000L)
                it.putLong("long_2", 2000L)
                it.putLong("long_3", 3000L)
                it.putLong("long_4", 4000L)

                it.putFloat("float_1", 1.0F)
                it.putFloat("float_2", 2.0F)
                it.putFloat("float_3", 3.0F)
                it.putFloat("float_4", 4.0F)

                it.putDouble("long_1", 1.0)
                it.putDouble("long_2", 2.0)
                it.putDouble("long_3", 3.0)
                it.putDouble("long_4", 4.0)

                it.putBoolean("boolean_1", true)
                it.putBoolean("boolean_2", false)

                it.putChar("char_1", 'H')
                it.putChar("char_2", 'E')
                it.putChar("char_3", 'L')
                it.putChar("char_4", 'L')
                it.putChar("char_5", 'O')

                it.putString("string_1", "你好")
                it.putString("string_2", "我好")
                it.putString("string_3", "他好")
                it.putString("string_4", "大家好")

                it.putList("list_1", listOf("1", "2"))
                it.putList("list_2", mutableListOf(1, 2))
                it.putList("list_3", ArrayList<String>().apply { add("Hello") })
                it.putList("list_4", java.util.ArrayList<Date>().apply { add(Date()) })

                it.putMap("map_1", mapOf(Pair("key", "values")))
                it.putMap("map_2", hashMapOf(Pair(1, 1000L)))
                it.putMap("map_3", HashMap<Int, String>().apply { put(100, "100 string") })
                it.putMap("map_4", LinkedHashMap<Date, Long>().apply {
                    put(Date(), 10000L)
                    put(Date(), 20000L)
                })

                it.putSet("set_1", setOf(1000))
                it.putSet("set_2", hashSetOf("Hello", "World"))
                it.putSet("set_3", HashSet<Long>().apply { add(10000L) })
                it.putSet("set_4", HashSet<Char>().apply { add('A') })

                it.putAny("any_1", 1)
                it.putAny("any_2", "S")
                it.putAny("any_3", Date())
                it.putAny("any_4", SimpleDateFormat("HH", Locale.CHINESE))
            }
            startActivity(Intent(this, TwoActivity::class.java))
        }
    }
}