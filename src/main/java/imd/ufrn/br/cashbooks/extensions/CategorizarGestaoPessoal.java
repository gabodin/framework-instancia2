package imd.ufrn.br.cashbooks.extensions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import imd.ufrn.br.cashbooks.interfaces.ICategorizarAutomaticamente;
import imd.ufrn.br.cashbooks.model.Movimentacao;
import imd.ufrn.br.cashbooks.model.enums.Categoria;
import imd.ufrn.br.cashbooks.service.MovimentacaoService;

@Component
public class CategorizarGestaoPessoal implements ICategorizarAutomaticamente{
	
	@Autowired
	private MovimentacaoService service;

	@Override 
	public void categorizar(Movimentacao mov) {
		
		List<Movimentacao> movimentacoes = service.findAll();
		
		String descricao = mov.getDescricao().toLowerCase();
		
		for(Movimentacao m : movimentacoes) {
			if(m.getDescricao().equals(descricao)) {
				mov.setCategoria(m.getCategoria());
				return;
			}
		}
		
		
		if(descricao.contains("roubo") || descricao.contains("furto") || descricao.contains("assalto")) {
			mov.setCategoria(Categoria.ROUBO);
		}//ROUBO
		else if(descricao.contains("abastec") || descricao.contains("combust")
				|| descricao.contains("gasolina") || descricao.contains("ônibus")
				|| descricao.contains("uber") || descricao.contains("transporte")) {
			mov.setCategoria(Categoria.TRANSPORTE);
		}//TRANSPORTE
		else if(descricao.contains("escola") || descricao.contains("faculdade")
				|| descricao.contains("universidade") || descricao.contains("curso")
				|| descricao.contains("cursinho") || descricao.contains("matricula")) {
			mov.setCategoria(Categoria.EDUCACAO);
		}//EDUCACAO
		else if(descricao.contains("imposto") || descricao.contains("cobrança") || descricao.contains("conta") 
				|| descricao.contains("conta") || descricao.contains("taxa") || descricao.contains("tarifa")
				|| descricao.contains("mensal")) {
			mov.setCategoria(Categoria.TARIFAS_E_CONTAS);
		}//TARIFAS_E_CONTAS
		else if(descricao.contains("ifood") || descricao.contains("comida")
				|| descricao.contains("alimenta") || descricao.contains("alimento")
				|| descricao.contains("restaurante") || descricao.contains("pedido")
				|| descricao.contains("entrega")) {
			mov.setCategoria(Categoria.ALIMENTACAO);
		}//ALIMENTACAO
		else if(descricao.contains("hospital") || descricao.contains("plano de sa")
				|| descricao.contains("consulta") || descricao.contains("médic")
				|| descricao.contains("dentista") || descricao.contains("academia")) {
			mov.setCategoria(Categoria.SAUDE);
		}//SAUDE
		else if(descricao.contains("cinema") || descricao.contains("ingresso")
				|| descricao.contains("parque") || descricao.contains("esporte")
				|| descricao.contains("clube") || descricao.contains("entrada")) {
			mov.setCategoria(Categoria.LAZER);
		}//LAZER
		else {
			mov.setCategoria(Categoria.DESPESAS_DIVERSAS);
		}//DESPESAS_DIVERSAS
		
	}

}
