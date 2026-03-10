public class VetorOrdenado {
    private int capacidade;
    private int ultimaPosicao;
    private String[] valores;

    public VetorOrdenado(int capacidade) {
        this.capacidade = capacidade;
        this.ultimaPosicao = -1;
        this.valores = new String[capacidade];
    }

    public void imprime() {
        if (ultimaPosicao == -1) {
            System.out.println("O vetor está vazio");
        } else {
            for (int i = 0; i <= ultimaPosicao; i++) {
                System.out.println(i + " - " + valores[i]);
            }
        }
    }

    public void inserir(String valor) {
        if (ultimaPosicao == capacidade - 1) {
            System.out.println("Capacidade máxima atingida");
            return;
        }

        int posicao = 0;
        for (int i = 0; i <= ultimaPosicao; i++) {
            posicao = i;
            // compareTo retorna > 0 se o valor atual for maior que o novo valor
            if (valores[i].compareTo(valor) > 0) {
                break;
            }
            if (i == ultimaPosicao) {
                posicao = i + 1;
            }
        }

        // Remaneja os elementos para a direita
        for (int x = ultimaPosicao; x >= posicao; x--) {
            valores[x + 1] = valores[x];
        }

        valores[posicao] = valor;
        ultimaPosicao++;
    }

    public int pesquisaLinear(String valor) {
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (valores[i].compareTo(valor) > 0) {
                return -1;
            }
            if (valores[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public int pesquisaBinaria(String valor) {
        int limiteInferior = 0;
        int limiteSuperior = ultimaPosicao;

        while (limiteInferior <= limiteSuperior) {
            int posicaoAtual = (limiteInferior + limiteSuperior) / 2;

            if (valores[posicaoAtual].equals(valor)) {
                return posicaoAtual;
            } else if (valores[posicaoAtual].compareTo(valor) < 0) {
                limiteInferior = posicaoAtual + 1;
            } else {
                limiteSuperior = posicaoAtual - 1;
            }
        }
        return -1;
    }

    public int excluir(String valor) {
        int posicao = pesquisaLinear(valor);
        if (posicao == -1) {
            return -1;
        } else {
            for (int i = posicao; i < ultimaPosicao; i++) {
                valores[i] = valores[i + 1];
            }
            ultimaPosicao--;
            return posicao;
        }
    }
}