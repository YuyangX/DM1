import java.io.Serializable;

public class ControlleurVisiteur extends Controller implements Serializable{

    
	public static final long serialVersionUID = 1523452003275L;
	private RepertoireVisiteur repertoire;

	/**
	 * 
	 * @param infos
	 */
	public Boolean createRDV(String[] infos) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param infos
	 */
	public Boolean addWalkin(String[] infos) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numeroDeCompte
	 */
	public int removeRDV(String numeroDeCompte) {
		// TODO - implement ControlleurVisiteur.removeRDV
		throw new UnsupportedOperationException();
	}

	public void envoyerRappel() {
		// TODO - implement ControlleurVisiteur.envoyerRappel
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numeroDeReservation
	 */
	public String[] confirmerRDV(String numeroDeReservation) {
		// TODO - implement ControlleurVisiteur.confirmerRDV
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param tel
	 */
	public String[] confirmerWalkin(String nom, String tel) {
		// TODO - implement ControlleurVisiteur.confirmerWalkin
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param info
	 */
}