/**
 */
package ContenuPedagogique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type UE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ContenuPedagogique.ContenuPedagogiquePackage#getTypeUE()
 * @model
 * @generated
 */
public enum TypeUE implements Enumerator {
	/**
	 * The '<em><b>Obligatoire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATOIRE_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGATOIRE(0, "Obligatoire", "Obligatoire"),

	/**
	 * The '<em><b>Optionnelle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONNELLE_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONNELLE(1, "Optionnelle", "Optionnelle");

	/**
	 * The '<em><b>Obligatoire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATOIRE
	 * @model name="Obligatoire"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATOIRE_VALUE = 0;

	/**
	 * The '<em><b>Optionnelle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONNELLE
	 * @model name="Optionnelle"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONNELLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Type UE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeUE[] VALUES_ARRAY =
		new TypeUE[] {
			OBLIGATOIRE,
			OPTIONNELLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type UE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeUE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type UE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeUE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeUE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type UE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeUE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeUE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type UE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeUE get(int value) {
		switch (value) {
			case OBLIGATOIRE_VALUE: return OBLIGATOIRE;
			case OPTIONNELLE_VALUE: return OPTIONNELLE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeUE(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeUE
