package imd.ufrn.br.cashbooks.model.enums;

public enum Categoria {
	ROUBO(1),
	TRANSPORTE(2),
	EDUCACAO(3),
	DESPESAS_DIVERSAS(4),
	TARIFAS_E_CONTAS(5),
	ALIMENTACAO(6),
	SAUDE(7),
	LAZER(8);
	
	private int code;
	
	private Categoria(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Categoria valueOf(int code) {
		for(Categoria value : Categoria.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid Categoria code");
	}
}