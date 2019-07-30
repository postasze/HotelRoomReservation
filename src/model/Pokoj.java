package model;
/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author postasze
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Pokoj implements Constants {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private int IdentyfikatorPokoju;

	/** 
	 * @return the IdentyfikatorPokoju
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int getIdentyfikatorPokoju() {
		// begin-user-code
		return IdentyfikatorPokoju;
		// end-user-code
	}

	/** 
	 * @param IdentyfikatorPokoju the IdentyfikatorPokoju to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIdentyfikatorPokoju(int IdentyfikatorPokoju) {
		// begin-user-code
		this.IdentyfikatorPokoju = IdentyfikatorPokoju;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private StandardPokoju standardPokoju;

	/** 
	 * @return the standardPokoju
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public StandardPokoju getStandardPokoju() {
		// begin-user-code
		return standardPokoju;
		// end-user-code
	}

	/** 
	 * @param standardPokoju the standardPokoju to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStandardPokoju(StandardPokoju standardPokoju) {
		// begin-user-code
		this.standardPokoju = standardPokoju;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private TypPokoju typPokoju;

	/** 
	 * @return the typPokoju
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public TypPokoju getTypPokoju() {
		// begin-user-code
		return typPokoju;
		// end-user-code
	}

	/** 
	 * @param typPokoju the typPokoju to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTypPokoju(TypPokoju typPokoju) {
		// begin-user-code
		this.typPokoju = typPokoju;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private StatusPokoju statusPokoju;

	/** 
	 * @return the statusPokoju
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public StatusPokoju getStatusPokoju() {
		// begin-user-code
		return statusPokoju;
		// end-user-code
	}

	/** 
	 * @param statusPokoju the statusPokoju to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setStatusPokoju(StatusPokoju statusPokoju) {
		// begin-user-code
		this.statusPokoju = statusPokoju;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private LiczbaMiejsc liczbaMiejsc;

	/** 
	 * @return the liczbaMiejsc
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public LiczbaMiejsc getLiczbaMiejsc() {
		// begin-user-code
		return liczbaMiejsc;
		// end-user-code
	}

	/** 
	 * @param liczbaMiejsc the liczbaMiejsc to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setLiczbaMiejsc(LiczbaMiejsc liczbaMiejsc) {
		// begin-user-code
		this.liczbaMiejsc = liczbaMiejsc;
		// end-user-code
	}
	
	@Override
	public String toString()
	{
		int i, j;
		for(i = 0; i < StandardPokoju.values().length; i++)
		{
			if(StandardPokoju.values()[i].equals(standardPokoju))
				break;
		}
		for(j = 0; j < TypPokoju.values().length; j++)
		{
			if(TypPokoju.values()[j].equals(typPokoju))
				break;
		}
		return "id: " + IdentyfikatorPokoju + " klasa: " + StandardyPokojow[i] + " typ pokoju: " + TypyPokojow[j] + " liczba miejsc: " + liczbaMiejsc;
	}
}