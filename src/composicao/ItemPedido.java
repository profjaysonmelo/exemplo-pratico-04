package composicao;

public class ItemPedido {

	private int qtde;
	private Double valorTotal;
	private Produto produto;
	
	public ItemPedido(int qtde, Produto produto) {
		this.qtde = qtde;
		this.produto = produto;
		this.valorTotal = calcularValorTotal();
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	private Double calcularValorTotal() {
		return qtde * this.produto.getValor();
	}
	
}
