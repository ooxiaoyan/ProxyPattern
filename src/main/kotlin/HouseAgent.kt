// 房屋中介
// 在Kotlin中实现代理模式有天然优势，只需要一行代码就可以消除Java代理类中所有样板代码
// 通过by关键字实现代理，省略了大量的样板代码，需要get✔️
class HouseAgent(private val houseOwner: HouseOwner) : IRentOutHouse by houseOwner