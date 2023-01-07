// 房屋中介
// 在Kotlin中实现代理模式有天然优势，只需要一行代码就可以消除Java代理类中所有样板代码
// 通过by关键字实现代理，省略了大量的样板代码，需要get✔️
class HouseAgent(private val houseOwner: HouseOwner) : IRentOutHouse by houseOwner {
    override fun showingHouse() {
        houseOwner.showingHouse()
        println("HouseAgent 领看房")
    }

    override fun getDeposit() {
        println("HouseAgent 代收定金")
        houseOwner.getDeposit()
    }

    override fun signContract() {
        println("HouseAgent 提供租房协议")
        houseOwner.signContract()
    }

    override fun getRent() {
        houseOwner.getRent()
        println("HouseAgent 获取佣金")
    }

    override fun provideKey() {
        houseOwner.provideKey()
        println("HouseAgent 代房东交接钥匙")
    }
}