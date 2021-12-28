package io.quyunshuo.objectregister

import android.graphics.Bitmap
import org.json.JSONArray
import org.json.JSONObject
import java.util.ArrayList

/**
 * 对象寄存器
 *
 * @author Qu Yunshuo
 * @sine 2021/12/28 21:26
 */
class OR private constructor() {

    companion object {
        val instance by lazy { OR() }
    }

    private val mIntOR = ObjectRegisterImp<Int>()
    private val mLongOR = ObjectRegisterImp<Long>()
    private val mFloatOR = ObjectRegisterImp<Float>()
    private val mDoubleOR = ObjectRegisterImp<Double>()
    private val mBooleanOR = ObjectRegisterImp<Boolean>()
    private val mCharOR = ObjectRegisterImp<Char>()
    private val mStringOR = ObjectRegisterImp<String>()
    private val mListOR = ObjectRegisterImp<List<*>>()
    private val mMapOR = ObjectRegisterImp<Map<*, *>>()
    private val mArrayOR = ObjectRegisterImp<Array<*>>()
    private val mSetOR = ObjectRegisterImp<Set<*>>()
    private val mBitmapOR = ObjectRegisterImp<Bitmap>()
    private val mJSONObjectOR = ObjectRegisterImp<JSONObject>()
    private val mJSONArrayOR = ObjectRegisterImp<JSONArray>()
    private val mAnyOR = ObjectRegisterImp<Any>()

    fun getInt(key: String): Int? = mIntOR.get(key)
    fun getAndRemoveInt(key: String): Int? = mIntOR.getAndRemove(key)
    fun putInt(key: String, value: Int): Unit = mIntOR.put(key, value)
    fun containsInt(key: String): Boolean = mIntOR.contains(key)
    fun cleanAllInt(): Unit = mIntOR.clean()
    fun removeInt(key: String): Unit = mIntOR.remove(key)


    fun getLong(key: String): Long? = mLongOR.get(key)
    fun getAndRemoveLong(key: String): Long? = mLongOR.getAndRemove(key)
    fun putLong(key: String, value: Long): Unit = mLongOR.put(key, value)
    fun containsLong(key: String): Boolean = mLongOR.contains(key)
    fun cleanAllLong(): Unit = mLongOR.clean()
    fun removeLong(key: String): Unit = mLongOR.remove(key)


    fun getFloat(key: String): Float? = mFloatOR.get(key)
    fun getAndRemoveFloat(key: String): Float? = mFloatOR.getAndRemove(key)
    fun putFloat(key: String, value: Float): Unit = mFloatOR.put(key, value)
    fun containsFloat(key: String): Boolean = mFloatOR.contains(key)
    fun cleanAllFloat(): Unit = mFloatOR.clean()
    fun removeFloat(key: String): Unit = mFloatOR.remove(key)


    fun getDouble(key: String): Double? = mDoubleOR.get(key)
    fun getAndRemoveDouble(key: String): Double? = mDoubleOR.getAndRemove(key)
    fun putDouble(key: String, value: Double): Unit = mDoubleOR.put(key, value)
    fun containsDouble(key: String): Boolean = mDoubleOR.contains(key)
    fun cleanAllDouble(): Unit = mDoubleOR.clean()
    fun removeDouble(key: String): Unit = mDoubleOR.remove(key)


    fun getBoolean(key: String): Boolean? = mBooleanOR.get(key)
    fun getAndRemoveBoolean(key: String): Boolean? = mBooleanOR.getAndRemove(key)
    fun putBoolean(key: String, value: Boolean): Unit = mBooleanOR.put(key, value)
    fun containsBoolean(key: String): Boolean = mBooleanOR.contains(key)
    fun cleanAllBoolean(): Unit = mBooleanOR.clean()
    fun removeBoolean(key: String): Unit = mBooleanOR.remove(key)


    fun getChar(key: String): Char? = mCharOR.get(key)
    fun getAndRemoveChar(key: String): Char? = mCharOR.getAndRemove(key)
    fun putChar(key: String, value: Char): Unit = mCharOR.put(key, value)
    fun containsChar(key: String): Boolean = mCharOR.contains(key)
    fun cleanAllChar(): Unit = mCharOR.clean()
    fun removeChar(key: String): Unit = mCharOR.remove(key)


    fun getString(key: String): String? = mStringOR.get(key)
    fun getAndRemoveString(key: String): String? = mStringOR.getAndRemove(key)
    fun putString(key: String, value: String): Unit = mStringOR.put(key, value)
    fun containsString(key: String): Boolean = mStringOR.contains(key)
    fun cleanAllString(): Unit = mStringOR.clean()
    fun removeString(key: String): Unit = mStringOR.remove(key)


    fun getList(key: String): List<*>? = mListOR.get(key)
    fun getAndRemoveList(key: String): List<*>? = mListOR.getAndRemove(key)
    fun putList(key: String, value: List<*>): Unit = mListOR.put(key, value)
    fun containsList(key: String): Boolean = mListOR.contains(key)
    fun cleanAllList(): Unit = mListOR.clean()
    fun removeList(key: String): Unit = mListOR.remove(key)


    fun getMap(key: String): Map<*, *>? = mMapOR.get(key)
    fun getAndRemoveMap(key: String): Map<*, *>? = mMapOR.getAndRemove(key)
    fun putMap(key: String, value: Map<*, *>): Unit = mMapOR.put(key, value)
    fun containsMap(key: String): Boolean = mMapOR.contains(key)
    fun cleanAllMap(): Unit = mMapOR.clean()
    fun removeMap(key: String): Unit = mMapOR.remove(key)


    fun getSet(key: String): Set<*>? = mSetOR.get(key)
    fun getAndRemoveSet(key: String): Set<*>? = mSetOR.getAndRemove(key)
    fun putSet(key: String, value: Set<*>): Unit = mSetOR.put(key, value)
    fun containsSet(key: String): Boolean = mSetOR.contains(key)
    fun cleanAllSet(): Unit = mSetOR.clean()
    fun removeSet(key: String): Unit = mSetOR.remove(key)


    fun getArray(key: String): Array<*>? = mArrayOR.get(key)
    fun getAndRemoveArray(key: String): Array<*>? = mArrayOR.getAndRemove(key)
    fun putArray(key: String, value: Array<*>): Unit = mArrayOR.put(key, value)
    fun containsArray(key: String): Boolean = mArrayOR.contains(key)
    fun cleanAllArray(): Unit = mArrayOR.clean()
    fun removeArray(key: String): Unit = mArrayOR.remove(key)


    fun getBitmap(key: String): Bitmap? = mBitmapOR.get(key)
    fun getAndRemoveBitmap(key: String): Bitmap? = mBitmapOR.getAndRemove(key)
    fun putBitmap(key: String, value: Bitmap): Unit = mBitmapOR.put(key, value)
    fun containsBitmap(key: String): Boolean = mBitmapOR.contains(key)
    fun cleanAllBitmap(): Unit = mBitmapOR.clean()
    fun removeBitmap(key: String): Unit = mBitmapOR.remove(key)


    fun getJSONObject(key: String): JSONObject? = mJSONObjectOR.get(key)
    fun getAndRemoveJSONObject(key: String): JSONObject? = mJSONObjectOR.getAndRemove(key)
    fun putJSONObject(key: String, value: JSONObject): Unit = mJSONObjectOR.put(key, value)
    fun containsJSONObject(key: String): Boolean = mJSONObjectOR.contains(key)
    fun cleanAllJSONObject(): Unit = mJSONObjectOR.clean()
    fun removeJSONObject(key: String): Unit = mJSONObjectOR.remove(key)


    fun getJSONArray(key: String): JSONArray? = mJSONArrayOR.get(key)
    fun getAndRemoveJSONArray(key: String): JSONArray? = mJSONArrayOR.getAndRemove(key)
    fun putJSONArray(key: String, value: JSONArray): Unit = mJSONArrayOR.put(key, value)
    fun containsJSONArray(key: String): Boolean = mJSONArrayOR.contains(key)
    fun cleanAllJSONArray(): Unit = mJSONArrayOR.clean()
    fun removeJSONArray(key: String): Unit = mJSONArrayOR.remove(key)


    fun getAny(key: String): Any? = mAnyOR.get(key)
    fun getAndRemoveAny(key: String): Any? = mAnyOR.getAndRemove(key)
    fun putAny(key: String, value: Any): Unit = mAnyOR.put(key, value)
    fun containsAny(key: String): Boolean = mAnyOR.contains(key)
    fun cleanAllAny(): Unit = mAnyOR.clean()
    fun removeAny(key: String): Unit = mAnyOR.remove(key)
}