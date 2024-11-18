package sintaxe_basica

/*
Faça um programa que acompanhe um set de uma partida de vôlei. O
programa deve ler o código da equipe (A ou B) que ganhou o ponto e
responder quem ganha a partida. O set chega ao final se uma das equipes
chega a 25 pontos e a diferença de pontos entre elas é maior ou igual a dois.
A equipe que conseguir isso é a vencedora do set.
*/

fun main(){
    var equipeA = 0
    var equipeB = 0
    var ponto = ""

    println("====================")
    println("- Placar:")
    println("- Equipe A: $equipeA")
    println("- Equipe B: $equipeB")
    println("====================")
    while (true) {
        print("Escolha (A) ou (B): ")
        ponto = readln().uppercase()
        if (ponto == "A") {
            equipeA += 1
        } else if (ponto == "B") {
            equipeB += 1
        } else {
            println("Essa opção não existe.")
        }

        println("====================")
        println("- Placar:")
        println("- Equipe A: $equipeA")
        println("- Equipe B: $equipeB")
        println("====================")

        if ((equipeA >= 25 && ((equipeA - equipeB) >= 2)) || (equipeB >= 25 && ((equipeB - equipeA) >= 2))) {
            if (equipeA > equipeB) {
                println("A Equipe (A) venceu o set.")
            } else {
                println("A Equipe (B) venceu o set.")
            }
            break
        }
    }
}