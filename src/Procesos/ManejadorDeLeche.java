package Procesos;

import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Ana Briones
 */
public class ManejadorDeLeche {

	private LecheEntera leche;

	public ManejadorDeLeche(LecheEntera tipo_Leche) {
		leche = tipo_Leche;
	}

	public void cambiarTipoLeche(Postre postre) {
		// Cambiar tipo de leche en la preparación de los postres, usar leche
		// deslactosada
		System.out.println(postre.getClass());
		// System.out.println(Helado.class);

		if (postre.getClass() == Pastel.class) {
			this.leche.usarPastel();
		} else {
			this.leche.usarHelado();
		}

	}

}
