package model;
/**
 * 
 */

import java.util.Date;
import java.time.LocalDate;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author postasze
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Pobyt implements Constants {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int IdentyfikatorPobytu;

	/** 
	 * @return the IdentyfikatorPobytu
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdentyfikatorPobytu() {
		// begin-user-code
		return IdentyfikatorPobytu;
		// end-user-code
	}

	/** 
	 * @param IdentyfikatorPobytu the IdentyfikatorPobytu to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdentyfikatorPobytu(int IdentyfikatorPobytu) {
		// begin-user-code
		this.IdentyfikatorPobytu = IdentyfikatorPobytu;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int dlugoscPobytu; // w dniach

	/** 
	 * @return the dlugoscPobytu
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getDlugoscPobytu() {
		// begin-user-code
		return dlugoscPobytu;
		// end-user-code
	}

	/** 
	 * @param dlugoscPobytu the dlugoscPobytu to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDlugoscPobytu(int dlugoscPobytu) {
		// begin-user-code
		this.dlugoscPobytu = dlugoscPobytu;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private LocalDate dataPoczatkuPobytu;

	/** 
	 * @return the dataPoczatkuPobytu
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public LocalDate getDataPoczatkuPobytu() {
		// begin-user-code
		return dataPoczatkuPobytu;
		// end-user-code
	}

	/** 
	 * @param dataPoczatkuPobytu the dataPoczatkuPobytu to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDataPoczatkuPobytu(LocalDate dataPoczatkuPobytu) {
		// begin-user-code
		this.dataPoczatkuPobytu = dataPoczatkuPobytu;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private LocalDate dataKoncaPobytu;

	/** 
	 * @return the dataKoncaPobytu
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public LocalDate getDataKoncaPobytu() {
		// begin-user-code
		return dataKoncaPobytu;
		// end-user-code
	}

	/** 
	 * @param dataKoncaPobytu the dataKoncaPobytu to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setDataKoncaPobytu(LocalDate dataKoncaPobytu) {
		// begin-user-code
		this.dataKoncaPobytu = dataKoncaPobytu;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Gosc goscPrzebywajacy;

	/** 
	 * @return the goscPrzebywajacy
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Gosc getGoscPrzebywajacy() {
		// begin-user-code
		return goscPrzebywajacy;
		// end-user-code
	}

	/** 
	 * @param goscPrzebywajacy the goscPrzebywajacy to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setGoscPrzebywajacy(Gosc goscPrzebywajacy) {
		// begin-user-code
		this.goscPrzebywajacy = goscPrzebywajacy;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Rezerwacja pobytNaRezerwacje;

	/** 
	 * @return the pobytNaRezerwacje
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Rezerwacja getPobytNaRezerwacje() {
		// begin-user-code
		return pobytNaRezerwacje;
		// end-user-code
	}

	/** 
	 * @param pobytNaRezerwacje the pobytNaRezerwacje to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPobytNaRezerwacje(Rezerwacja pobytNaRezerwacje) {
		// begin-user-code
		this.pobytNaRezerwacje = pobytNaRezerwacje;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Platnosc platnoscZaPobyt;

	/** 
	 * @return the platnoscZaPobyt
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Platnosc getPlatnoscZaPobyt() {
		// begin-user-code
		return platnoscZaPobyt;
		// end-user-code
	}

	/** 
	 * @param platnoscZaPobyt the platnoscZaPobyt to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPlatnoscZaPobyt(Platnosc platnoscZaPobyt) {
		// begin-user-code
		this.platnoscZaPobyt = platnoscZaPobyt;
		// end-user-code
	}
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Pokoj pobytWPokoju;

	/** 
	 * @return the pobytWPokoju
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Pokoj getPobytWPokoju() {
		// begin-user-code
		return pobytWPokoju;
		// end-user-code
	}

	/** 
	 * @param pobytWPokoju the pobytWPokoju to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPobytWPokoju(Pokoj pobytWPokoju) {
		// begin-user-code
		this.pobytWPokoju = pobytWPokoju;
		// end-user-code
	}
}