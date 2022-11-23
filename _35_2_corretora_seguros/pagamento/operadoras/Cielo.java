package _11_exercises._47_2_exercicio_interface.pagamento.operadoras;

import _11_exercises._47_2_exercicio_interface.pagamento.Autorizavel;
import _11_exercises._47_2_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_2_exercicio_interface.pagamento.Operadora;

public class Cielo implements Operadora {
    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }
}
