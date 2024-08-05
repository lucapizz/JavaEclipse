/**
 * posso generare la documentazione del mio progetto java dalla voce della
 * barra principale di menu "Project" che fa comparire tra le altre la voce
 * "Generate Javadoc..." questa apre una finestra che genera un direttorio
 * di documentazione. Perche' funzioni bisogna che nei sorgenti ci siano i
 * commenti che iniziano con /** (ossia due asterischi) altimenti non va.
 * Poi ci sono alcune parole chiave che devono essere precedute dalla
 * chiocciola come @author Pippo e che si chiamano TAG (cercare in rete).
 * Inoltre nei commenti possiamo usare i vari tag del linguaggio html come
 * ad esempio  {@code <p> <h1> </h1> <b></b>} eccetera.
 * </p>
 * Infine tale documentazione compare automaticamente in ECLIPSE quando si
 * punta sul nome di una funzione documentata come fin qui descritto.
 *
 * VEDERE L'ESEMPIO QUI SOTTO
 *
 */
 
 /**
	 * Descrizione: ciao mondo
	 * 
	 * return Nothing.
	 * <p> che facciamo qui? spiegare meglio...</p>
	 *             
	 * @author Sempre io
	 * @version 1.1
	 * @since 14/08/2022
	 *
	 *
	 * @param args stringhe opzionali oppure none
	 * @throws IOException non esiste realmente, era una prova
	 * @exception IOException On input error.
	 * @see IOException
	 * 
	 */
	public static void main(String args[]) throws IOException {

	. . .
