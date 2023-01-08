import java.lang.reflect.Proxy

// Client调用处
fun main(args: Array<String>) {
    val houseOwner = HouseOwner()
    val rentOutHouseIH = RentOutHouseIH(houseOwner)
    // 动态产生一个代理者
    // Proxy.newProxyInstance方法动态构造一个代理中介，需要传入被代理类的ClassLoader、共同接口集合和rentOutHouseIH实例对象
    val dynamicProxy = Proxy.newProxyInstance(
        houseOwner.javaClass.classLoader,
        arrayOf(IRentOutHouse::class.java),
        rentOutHouseIH
    ) as? IRentOutHouse
    dynamicProxy?.run {
        setPrice()
        showingHouse()
        getDeposit()
        signContract()
        getRent()
        provideKey()
    }

    // 静态代理
//    HouseAgent(houseOwner).run {
//        setPrice()
//        showingHouse()
//        getDeposit()
//        signContract()
//        getRent()
//        provideKey()
//    }
}