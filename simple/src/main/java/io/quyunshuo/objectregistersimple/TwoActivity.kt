package io.quyunshuo.objectregistersimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.quyunshuo.objectregister.OR
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet
import kotlin.collections.LinkedHashMap

class TwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
        OR.instance.let {
            val int = it.getAndRemoveInt("int_1")
            val int1 = it.getAndRemoveInt("int_2")
            val int2 = it.getAndRemoveInt("int_3")
            val int3 = it.getAndRemoveInt("int_4")
            Log.d("qqq", "Int:$int $int1 $int2 $int3 ")

            val long = it.getAndRemoveLong("long_1")
            val long1 = it.getAndRemoveLong("long_2")
            val long2 = it.getAndRemoveLong("long_3")
            val long3 = it.getAndRemoveLong("long_4")
            Log.d("qqq", "Long:$long $long1 $long2 $long3 ")

            val float = it.getAndRemoveFloat("float_1")
            val float1 = it.getAndRemoveFloat("float_2")
            val float2 = it.getAndRemoveFloat("float_3")
            val float3 = it.getAndRemoveFloat("float_4")
            Log.d("qqq", "Float:$float $float1 $float2 $float3 ")

            val double = it.getAndRemoveDouble("long_1")
            val double1 = it.getAndRemoveDouble("long_2")
            val double2 = it.getAndRemoveDouble("long_3")
            val double3 = it.getAndRemoveDouble("long_4")
            Log.d("qqq", "Double:$double $double1 $double2 $double3 ")

            val boolean = it.getAndRemoveBoolean("boolean_1")
            val boolean1 = it.getAndRemoveBoolean("boolean_2")
            Log.d("qqq", "Boolean:$boolean $boolean1 ")

            val char = it.getAndRemoveChar("char_1")
            val char1 = it.getAndRemoveChar("char_2")
            val char2 = it.getAndRemoveChar("char_3")
            val char3 = it.getAndRemoveChar("char_4")
            val char4 = it.getAndRemoveChar("char_5")
            Log.d("qqq", "Char:$char $char1 $char2 $char3 $char4 ")

            val string = it.getAndRemoveString("string_1")
            val string1 = it.getAndRemoveString("string_2")
            val string2 = it.getAndRemoveString("string_3")
            val string3 = it.getAndRemoveString("string_4")
            Log.d("qqq", "String:$string $string1 $string2 $string3 ")

            val list = it.getAndRemoveList("list_1")
            val list1 = it.getAndRemoveList("list_2")
            val list2 = it.getAndRemoveList("list_3")
            val list3 = it.getAndRemoveList("list_4")
            Log.d("qqq", "List:$list $list1 $list2 $list3 ")

            val map = it.getAndRemoveMap("map_1")
            val map1 = it.getAndRemoveMap("map_2")
            val map2 = it.getAndRemoveMap("map_3")
            val map3 = it.getAndRemoveMap("map_4")
            Log.d("qqq", "Map:$map $map1 $map2 $map3 ")

            val set = it.getAndRemoveSet("set_1")
            val set1 = it.getAndRemoveSet("set_2")
            val set2 = it.getAndRemoveSet("set_3")
            val set3 = it.getAndRemoveSet("set_4")
            Log.d("qqq", "Set:$set $set1 $set2 $set3 ")

            val any = it.getAndRemoveAny("any_1")
            val any1 = it.getAndRemoveAny("any_2")
            val any2 = it.getAndRemoveAny("any_3")
            val any3 = it.getAndRemoveAny("any_4")
            Log.d("qqq", "Any:$any $any1 $any2 $any3 ")


            // D/qqq: Int:10 20 30 40
            // D/qqq: Long:1000 2000 3000 4000
            // D/qqq: Float:1.0 2.0 3.0 4.0
            // D/qqq: Double:1.0 2.0 3.0 4.0
            // D/qqq: Boolean:true false
            // D/qqq: Char:H E L L O
            // D/qqq: String:你好 我好 他好 大家好
            // D/qqq: List:[1, 2] [1, 2] [Hello] [Tue Dec 28 23:31:16 GMT+08:00 2021]
            // D/qqq: Map:{key=values} {1=1000} {100=100 string} {Tue Dec 28 23:31:16 GMT+08:00 2021=20000}
            // D/qqq: Set:[1000] [Hello, World] [10000] [A]
            // D/qqq: Any:1 S Tue Dec 28 23:31:16 GMT+08:00 2021 java.text.SimpleDateFormat@900
        }
    }
}