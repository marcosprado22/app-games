package src.main.kotlin

data class InfoGame(

            val info: InfoApiShark
    ) {

    override fun toString(): String {
        return info.toString()
    }
}