// 房东
class HouseOwner: IRentOutHouse {

    override fun setPrice() {
        println("HouseOwner 设定租金为2000/月")
    }

    override fun showingHouse() {
        println("HouseOwner 同意来看房子")
    }

    override fun getDeposit() {
        println("HouseOwner 获取定金")
    }

    override fun signContract() {
        println("HouseOwner 签合同")
    }

    override fun getRent() {
        println("HouseOwner 获取租金")
    }

    override fun provideKey() {
        println("HouseOwner 交接钥匙")
    }
}