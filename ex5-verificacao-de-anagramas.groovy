/*
5. Verificação de Anagramas

Descrição: Dadas duas strings, determine se uma é um anagrama da outra.

        Input: Duas strings.

Saída: Sim, se são anagramas, ou Não, caso contrário.
*/

public String saoAnagramas(String primeiraPalavra, String segundaPalavra) {
    if (primeiraPalavra.size() != segundaPalavra.size()) return "Não"

    List<String> lista1 = primeiraPalavra.toList()
    List<String> lista2 = segundaPalavra.toList()

    for (c in lista1) {
        Integer index = lista2.indexOf(c)

        if (index == -1) return "Não"

        lista2.remove(index)
    }

    return lista2.isEmpty() ? "Sim" : "Não"
}

println(saoAnagramas("amor", "roma"))
println(saoAnagramas("teste", "tsete"))
println(saoAnagramas("casa", "saco"))
