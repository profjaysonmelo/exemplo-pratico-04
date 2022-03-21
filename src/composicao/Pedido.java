package composicao;

public class Pedido {

	private String cliente;
	private ItemPedido[] itens;
	
	public Pedido(String cliente) {
		this.cliente = cliente;
		this.itens = new ItemPedido[2];
	}

	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public ItemPedido[] getItens() {
		return itens;
	}
	public void setItens(ItemPedido[] itens) {
		this.itens = itens;
	}
	
}
