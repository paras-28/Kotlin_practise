fun main() {
    var data: String? = null

    data?.uppercase()

    data?.let {
        data.uppercase()
    }
    data!!.uppercase()
}