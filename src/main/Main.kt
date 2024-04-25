import com.google.gson.Gson
import src.main.kotlin.Game
import src.main.kotlin.InfoGame
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main () {

    val client = HttpClient.newHttpClient();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146")) // Rota de consumo api de jogos
        .build()
    val response = client
        .send(request, HttpResponse.BodyHandlers.ofString())

    val json = response.body()
    println(json)

    val gson = Gson()
    val myInfoGame = gson.fromJson(json, InfoGame::class.java)

    val myGame = Game(
            myInfoGame.info.title,
            myInfoGame.info.thumb
    )

    println(myGame)
}