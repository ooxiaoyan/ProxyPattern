import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

// InvocationHandler是JDK提供的动态代理接口，对被代理类的方法进行代理。
// obj-被代理类的实例
class RentOutHouseIH(private val obj: Any) : InvocationHandler {

    // 调用被代理的方法
    // 因为传参不确定，所以用*args.orEmpty()
    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        return method?.invoke(obj, *args.orEmpty())
    }
}