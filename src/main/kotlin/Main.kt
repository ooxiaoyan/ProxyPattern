// Client调用处
fun main(args: Array<String>) {
    val houseOwner = HouseOwner()
    HouseAgent(houseOwner).run {
        setPrice()
        showingHouse()
        getDeposit()
        signContract()
        getRent()
        provideKey()
    }
}