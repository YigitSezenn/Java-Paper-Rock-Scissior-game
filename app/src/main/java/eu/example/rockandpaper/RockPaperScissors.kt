package eu.example.rockandpaper

fun main ()
{
 var computerChoice = ""
 var playerChoice =""
println("Welcome to Rock, Paper, Scissors")
 playerChoice= readln().toLowerCase().trim()
 val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice="rock"
        }
        2 -> {
            computerChoice="paper"
        }
        3 -> {
            computerChoice="scissors"
        }
    }

    println(computerChoice)



    val winner= when{

        playerChoice==computerChoice -> "It's a tie!"
        playerChoice=="rock" && computerChoice=="scissors" -> "Player"
        playerChoice=="paper" && computerChoice=="rock" -> "Player"
        playerChoice=="scissors" && computerChoice=="paper" -> "Player"
        playerChoice=="rock" && computerChoice=="rock" -> "Tie"
        playerChoice=="paper" && computerChoice=="paper" -> "Tie"
        playerChoice=="scissors" && computerChoice=="scissors" -> "Tie"
        playerChoice.trim().isEmpty() -> "Computer Wins "
        else -> "Computer Wins"


    }


    if (winner == "Tie!") {
        println("It's a tie!")
    }
    else
    {
        println("$winner won!")
    }

    return(main())
}