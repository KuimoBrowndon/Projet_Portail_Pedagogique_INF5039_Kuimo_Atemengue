/**
 *
 * $Id$
 */
package ContenuPedagogique.validation;

import ContenuPedagogique.Enseignant;
import ContenuPedagogique.Semestre;
import ContenuPedagogique.Specialite;
import ContenuPedagogique.Ue;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ContenuPedagogique.Niveau}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NiveauValidator {
	boolean validate();

	boolean validateNiveau(int value);
	boolean validateDescription(String value);
	boolean validateResponsablite(Enseignant value);
	boolean validateUes(EList<Ue> value);
	boolean validateSpecialites(EList<Specialite> value);
	boolean validateSemestres(EList<Semestre> value);
	boolean validateNom(String value);
}