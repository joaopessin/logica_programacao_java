package _6_desafios;

public class ContaPagar_28_2 {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor_28_3 fornecedor;

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setFornecedor(Fornecedor_28_3 fornecedor) { this.fornecedor = fornecedor; }

    public ContaPagar_28_2() {}
    public ContaPagar_28_2(Fornecedor_28_3 fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        System.out.println("\n-------------------------");
        System.out.println("Fornecedor: " + this.fornecedor.getNome()
        + "\nDescrição: " + this.descricao
        + "\nValor: R$" + this.valor
        +"\nData de Vencimento: " + this.dataVencimento);
    }
}
