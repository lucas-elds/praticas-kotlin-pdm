package sintaxe_basica

/*
Uma certa empresa pretende verificar se os seus empregados estarão
qualificados ou não para aposentadoria em 2025.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
• Ter no mínimo 65 anos de idade; ou
• Ter trabalhado no mínimo 30 anos; ou
• Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa para:
• Ler o nome do empregado, o ano de nascimento e o ano de seu ingresso
na empresa.
• Calcular e exibir a idade e o tempo de trabalho do empregado (estimado
ao final de 2024)
• Exibir a mensagem “Pode Requerer Aposentadoria” se atender aos
requisitos ou “Não Pode Requerer Aposentadoria” caso contrário.
Ao final de cada execução, o programa deverá perguntar se o usuário deseja
fazer nova verificação. Se sim, o programa deverá repetir tudo novamente,
caso contrário deverá encerrar.
*/

fun main(){
    var anoAtual = 2024

    print("Digite (0) para encerrar ou (1) para continuar: ")
    var cond = readln()
    while (cond != "0") {
        if (cond == "1"){
            // Entrada dos dados:
            print("Digite seu nome: ")
            var nomeEmp = readln()
            print("Digite seu ano de nascimento: ")
            var anoNasc = readln()
            print("Digite o ano de seu ingresso na empresa: ")
            var anoIngresso = readln()

            // Cálculos:
            var idadeEmp = anoAtual - anoNasc.toInt()
            var tempoTrabalho = anoAtual - anoIngresso.toInt()
            var conclusao = ""
            if (idadeEmp >= 65 || tempoTrabalho >= 30 || (idadeEmp >= 60 && tempoTrabalho >= 25) ) {
                conclusao = "Pode Requerer Aposentadoria."
            } else {
                conclusao = "Não pode Requerer Aposentadoria."
            }

            // Impressão:
            println("\n===================================")
            println("- Nome do empregado: $nomeEmp")
            println("- Idade do empregado: $idadeEmp")
            println("- Anos trabalhados: $tempoTrabalho")
            println("- $conclusao")
            println("===================================\n")

            print("Digite (0) para encerrar ou (1) para continuar: ")
            cond = readln()
        } else {
            println("A opção ($cond) não existe.")
            break
        }
    }
}