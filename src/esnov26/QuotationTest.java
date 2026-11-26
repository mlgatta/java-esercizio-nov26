package esnov26;

public class QuotationTest {

	public static void main(String[] args) {
		Quotation myQuotation; // dichiaro un oggetto di tipo quotation
		myQuotation = new Quotation(); // creo l'oggetto myQuotation riferito alla classe Quotation
		
		// inizializzazione dell'oggetto
		myQuotation.quote = "So programmare in Java!"; // assegno il valore di quote
		
		myQuotation.display(); // stampo il messaggio
	}

}
