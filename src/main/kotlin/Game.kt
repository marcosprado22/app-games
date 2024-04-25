package src.main.kotlin

data class Game (
            val title: String,
            var cover: String
    ) {

    val description: String = ""


    override fun toString(): String {
        return "My Game:\n" +
               "Title: $title \n" +
               "Cover: $cover \n" +
               "Description: $description"
    }
}