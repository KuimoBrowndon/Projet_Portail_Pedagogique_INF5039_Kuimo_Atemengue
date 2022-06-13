/**
 *
 * $Id$
 */
package ContenuPedagogique.validation;

import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Programmation;
import ContenuPedagogique.Ressource;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.TypeUE;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ContenuPedagogique.Ue}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface UeValidator {
	boolean validate();

	boolean validateCode(String value);
	boolean validateNom(String value);
	boolean validateObjectif(String value);
	boolean validateType(TypeUE value);
	boolean validateRessources(EList<Ressource> value);
	boolean validateSemestres(EList<Semestre> value);
	boolean validateEstEnseigne(Enseignant value);
	boolean validateContenu(String value);
	boolean validateCredit(int value);
	boolean validateProgrammations(EList<Programmation> value);
}
