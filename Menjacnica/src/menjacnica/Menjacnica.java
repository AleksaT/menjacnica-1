package menjacnica;



import java.util.LinkedList;

import menjacnica.sistemskeOperacije.SODodajValutu;
import menjacnica.sistemskeOperacije.SOIzvrsiTransakciju;
import menjacnica.sistemskeOperacije.SOObrisiValutu;
import menjacnica.sistemskeOperacije.SOSacuvajUFajl;
import menjacnica.sistemskeOperacije.SOUcitajIzFajla;

public class Menjacnica implements MenjacnicaInterface{
	
	
	public void dodajValutu(Valuta valuta) {
		SODodajValutu.dodajValutu(valuta, kursnaLista);		
	}

	
	public void obrisiValutu(Valuta valuta) {
		SOObrisiValutu.obrisiValutu(valuta, kursnaLista);
	}

	
	public double izvrsiTransakciju(Valuta valuta, boolean prodaja, double iznos) {
		return SOIzvrsiTransakciju.izvrsiTransakciju(valuta, prodaja, iznos);
	}

	@Override
	public LinkedList<Valuta> vratiKursnuListu() {
		return kursnaLista;
	}

	
	public void ucitajIzFajla(String putanja) {
		SOUcitajIzFajla.ucitajIzFajla(putanja, kursnaLista);
	}

	
	public void sacuvajUFajl(String putanja) {
		SOSacuvajUFajl.sacuvajUFajl(putanja, kursnaLista);
	}

	private LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();

	

}
