package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {

	public static ProdutoTO consultarProduto(int codigo) {
		if (codigo == 401) {

			return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
		} else if (codigo == 402) {

			return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
		} else if (codigo == 403) {

			return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
		} else {

			return new ProdutoTO(-1, "Produto não encontrado", 0, 0);
		}
	}
	
	
	
	public List<ProdutoTO> listar(){
		ArrayList<ProdutoTO> lista = new ArrayList<>();
		lista.add(ProdutoBO.consultarProduto(401));
		lista.add(ProdutoBO.consultarProduto(402));
		lista.add(ProdutoBO.consultarProduto(403));
		
		return lista;
		
	}

}
