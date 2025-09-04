/*
2. Verificação de Palíndromo

Descrição: Dada uma string, verifique se ela é um palíndromo (lê-se da mesma forma de trás para frente).
Input: Uma string.

Saída: Sim, se é um palíndromo, ou Não, caso contrário.

*/

public Boolean ehPalindromo(String palavra) {
    String palavraInvertida = ""

    for (i in palavra.size()-1..0) {
        palavraInvertida += palavra[i]
    }

    return palavra == palavraInvertida ? "Sim" : "Não"
}

println(ehPalindromo("arara"))
println(ehPalindromo("casa"))
