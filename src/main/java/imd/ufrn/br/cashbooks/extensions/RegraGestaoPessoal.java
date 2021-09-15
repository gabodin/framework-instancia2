package imd.ufrn.br.cashbooks.extensions;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import imd.ufrn.br.cashbooks.interfaces.IRestricoesComprasPrazo;
import imd.ufrn.br.cashbooks.model.Movimentacao;
import imd.ufrn.br.cashbooks.service.UsuarioService;

@Component
public class RegraGestaoPessoal implements IRestricoesComprasPrazo{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public LocalDate calcularDataLimite(Movimentacao mov) {
		Integer max = usuarioService.getUsuario().getMaxDias();
		if(max!=null) {
			return mov.getDataMovimentacao().plusDays(max);
		}
		return null;
	}

	@Override
	public boolean validarMovimentacao(Movimentacao mov) {
		if(this.calcularDataLimite(mov) != null) {
			if(!mov.getDataCobranca().isAfter(calcularDataLimite(mov))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Integer getLimite() {//Não tem limite
		return null;
	}
	
}
