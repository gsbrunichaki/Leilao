package Controllers;

import Model.Lances;
import Model.Leilao;

public class ProcessamentoLeilao {

	public Lances maiorLance(Leilao l) {
		Lances maior = null;
		for (int i = 0; i < l.getLances().size(); i++) {
			if (l.getLances().get(i).getValor() > maior.getValor()) {
				maior = l.getLances().get(i);
			}
		}
		
		return maior;
	}
	
}
