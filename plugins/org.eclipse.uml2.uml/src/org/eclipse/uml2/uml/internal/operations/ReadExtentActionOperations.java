/*
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - initial API and implementation
 *
 * $Id: ReadExtentActionOperations.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.ReadExtentAction;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Read Extent Action</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Type Is Classifier</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Multiplicity Of Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class ReadExtentActionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReadExtentActionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the result output pin is the classifier.
	 * true
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateTypeIsClassifier(
			ReadExtentAction readExtentAction, DiagnosticChain diagnostics,
			Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_EXTENT_ACTION__TYPE_IS_CLASSIFIER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateTypeIsClassifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readExtentAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readExtentAction}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the result output pin is 0..*.
	 * self.result.multiplicity.is(0,#null)
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateMultiplicityOfResult(
			ReadExtentAction readExtentAction, DiagnosticChain diagnostics,
			Map context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics
					.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						UMLValidator.DIAGNOSTIC_SOURCE,
						UMLValidator.READ_EXTENT_ACTION__MULTIPLICITY_OF_RESULT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateMultiplicityOfResult", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(readExtentAction, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{readExtentAction}));
			}
			return false;
		}
		return true;
	}

} // ReadExtentActionOperations