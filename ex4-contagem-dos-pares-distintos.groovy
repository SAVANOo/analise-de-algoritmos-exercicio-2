/*
4. Contagem de Pares Distintos

Descrição: Dado um array de números, conte quantos pares distintos (a, b) existem, onde a ≠ b.
        Input: Um array de inteiros.

        Saída: O número de pares distintos.
*/

public String contarParesDistintos(List<Integer> lista) {
    Integer contador = 0

    for (i in 0..<lista.size()) {
        for (j in i+1..<lista.size()) {
            if (lista[i] != lista[j]) contador++
        }
    }

    return contador
}

println(contarParesDistintos([1, 2, 3]))