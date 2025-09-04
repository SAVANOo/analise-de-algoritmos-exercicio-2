/*
1. Problema do Par de Soma

Descrição: Dado um array de inteiros e um valor alvo, encontre se há dois números no array cuja soma seja igual ao valor alvo.
Input: Um array de inteiros e um valor alvo.
Saída: Os índices dos dois números que somam ao valor alvo, ou uma indicação de que não existe um par.
*/

main()

public void main() {
    List<Integer> lista = [1, 3, 5, 6]
    Integer alvo = 8

    Optional<List<Integer>> resultadoParDeSoma = buscarParDeSomaIgualAoValor(lista, alvo)
    if (resultadoParDeSoma.isEmpty()) {
        println("Não foi encontrado nenhum par que somado era igual ao valor alvo: ${alvo}")
        return
    }

    List<Integer> parDeSoma = resultadoParDeSoma.get()
    println("Foi encontrado um par de valores que se somados resultam no valor alvo ${alvo}, os seus índices são: ${parDeSoma[0]} e ${parDeSoma[1]}")
}

public Optional<List<Integer>> buscarParDeSomaIgualAoValor(List<Integer> lista, Integer valorAlvo) {
    for (int j = 0; j < lista.size(); j++) {
        for (int i = j + 1; i < lista.size(); i++) {
            Integer soma = lista[i] + lista[j]
            if (soma != valorAlvo) continue

            List<Integer> listaDeIndicesDosParesQueResultamNoValorAlvo = [j, i]
            return Optional.of(listaDeIndicesDosParesQueResultamNoValorAlvo)
        }
    }

    return Optional.empty()
}

