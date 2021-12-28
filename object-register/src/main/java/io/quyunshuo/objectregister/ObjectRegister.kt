package io.quyunshuo.objectregister

/**
 * 对象寄存器抽象
 *
 * @author Qu Yunshuo
 * @sine 2021/12/28 21:40
 */
internal interface ObjectRegister<O : Any> {

    /**
     * 通过指定[key]获取对象
     * @param key String 需要获取对象的 key
     * @return O?
     */
    fun get(key: String): O?

    /**
     * 通过指定[key]获取对象并移除此对象
     * @param key String 需要获取对象的 key
     * @return O?
     */
    fun getAndRemove(key: String): O?

    /**
     * 存入对象
     * @param key String 对象的key
     * @param value O 对象
     */
    fun put(key: String, value: O)

    /**
     * 是否包含指定[key]的对象
     * @param key String 对象的key
     * @return Boolean 是否包含
     */
    fun contains(key: String): Boolean

    /**
     * 清除所有对象
     */
    fun clean()

    /**
     * 移除指定[key]的对象
     * @param key String 对象的key
     */
    fun remove(key: String)
}