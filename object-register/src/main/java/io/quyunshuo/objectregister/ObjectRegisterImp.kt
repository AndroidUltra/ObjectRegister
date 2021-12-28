package io.quyunshuo.objectregister

/**
 * 对象寄存器
 *
 * @param O 对象泛型
 *
 * @author Qu Yunshuo
 * @sine 2021/12/28 21:37
 */
internal class ObjectRegisterImp<O : Any> : ObjectRegister<O> {

    private val mObjectsMap = HashMap<String, O>()

    override fun get(key: String): O? = mObjectsMap[key]

    override fun getAndRemove(key: String): O? {
        val value = get(key)
        if (value != null) {
            mObjectsMap.remove(key)
        }
        return value
    }

    override fun put(key: String, value: O) {
        mObjectsMap[key] = value
    }

    override fun contains(key: String): Boolean = mObjectsMap.containsKey(key)

    override fun clean() {
        mObjectsMap.clear()
    }

    override fun remove(key: String) {
        mObjectsMap.remove(key)
    }
}