/*3. Busca de Número Duplicado

Descrição: Dado um array de números inteiros, descubra se existe algum número que aparece mais de uma vez.

        Input: Um array de inteiros.

Saída: O número duplicado, ou uma indicação de que não existe números duplicados.
*/

public String encontrarDuplicado(List<Integer> lista) {
    for (i in 0..<lista.size()) {
        for (j in i+1..<lista.size()) {
            if (lista[i] == lista[j]) {
                return "Duplicado encontrado: ${lista[i]}"
            }
        }
    }

    return "Não existem duplicados"
}

println(encontrarDuplicado([1, 2, 3, 4, 2]))