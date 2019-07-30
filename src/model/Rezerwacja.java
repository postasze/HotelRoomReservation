package model;

import model.Constants.StandardPokoju;
import model.Constants.TypPokoju;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author postasze
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Rezerwacja implements Constants {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int IdentyfikatorRezerwacji;

	/** 
	 * @return the IdentyfikatorRezerwacji
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdentyfikatorRezerwacji() {
		// begin-user-code
		return IdentyfikatorRezerwacji;
		// end-user-code
	}

	/** 
	 * @param IdentyfikatorRezerwacji the IdentyfikatorRezerwacji to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdentyfikatorRezerwacji(int IdentyfikatorRezerwacji) {
		// begin-user-code
		this.IdentyfikatorRezerwacji = IdentyfikatorRezerwacji;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TypRezerwacji typRezerwacji;

	/** 
	 * @return the typRezerwacji
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TypRezerwacji getTypRezerwacji() {
		// begin-user-code
		return typRezerwacji;
		// end-user-code
	}

	/** 
	 * @param typRezerwacji the typRezerwacji to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTypRezerwacji(TypRezerwacji typRezerwacji) {
		// begin-user-code
		this.typRezerwacji = typRezerwacji;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Gosc goscRezerwujacy;

	/** 
	 * @return the goscRezerwujacy
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Gosc getGoscRezerwujacy() {
		// begin-user-code
		return goscRezerwujacy;
		// end-user-code
	}

	/** 
	 * @param goscRezerwujacy the goscRezerwujacy to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGoscRezerwujacy(Gosc goscRezerwujacy) {
		// begin-user-code
		this.goscRezerwujacy = goscRezerwujacy;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Pokoj zarezerwowanyPokoj;

	/** 
	 * @return the zarezerwowanyPokoj
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Pokoj getZarezerwowanyPokoj() {
		// begin-user-code
		return zarezerwowanyPokoj;
		// end-user-code
	}

	/** 
	 * @param zarezerwowanyPokoj the zarezerwowanyPokoj to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setZarezerwowanyPokoj(Pokoj zarezerwowanyPokoj) {
		// begin-user-code
		this.zarezerwowanyPokoj = zarezerwowanyPokoj;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Pobyt zarezerwowanyPobyt;

	/** 
	 * @return the zarezerwowanyPobyt
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Pobyt getZarezerwowanyPobyt() {
		// begin-user-code
		return zarezerwowanyPobyt;
		// end-user-code
	}

	/** 
	 * @param zarezerwowanyPobyt the zarezerwowanyPobyt to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setZarezerwowanyPobyt(Pobyt zarezerwowanyPobyt) {
		// begin-user-code
		this.zarezerwowanyPobyt = zarezerwowanyPobyt;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Platnosc platnoscZaRezerwacje;

	/** 
	 * @return the platnoscZaRezerwacje
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Platnosc getPlatnoscZaRezerwacje() {
		// begin-user-code
		return platnoscZaRezerwacje;
		// end-user-code
	}

	/** 
	 * @param platnoscZaRezerwacje the platnoscZaRezerwacje to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatnoscZaRezerwacje(Platnosc platnoscZaRezerwacje) {
		// begin-user-code
		this.platnoscZaRezerwacje = platnoscZaRezerwacje;
		// end-user-code
	}
	
	@Override
	public String toString()
	{
		int i, j;
		for(i = 0; i < TypRezerwacji.values().length; i++)
		{
			if(TypRezerwacji.values()[i].equals(typRezerwacji))
				break;
		}
		for(j = 0; j < TypPlatnosci.values().length; j++)
		{
			if(TypPlatnosci.values()[j].equals(platnoscZaRezerwacje.getTypPlatnosci()))
				break;
		}
		return "id: " + IdentyfikatorRezerwacji + " typ rezerwacji: " + TypyRezerwacji[i] + " typ platnosci: " + TypyPlatnosci[j] + " data poczatku pobytu: " + zarezerwowanyPobyt.getDataPoczatkuPobytu().toString() + " data konca pobytu: " + zarezerwowanyPobyt.getDataKoncaPobytu().toString();
	}
}