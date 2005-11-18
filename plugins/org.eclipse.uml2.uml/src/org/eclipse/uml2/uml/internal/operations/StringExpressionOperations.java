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
 * $Id: StringExpressionOperations.java,v 1.1 2005/11/14 22:25:56 khussey Exp $
 */
package org.eclipse.uml2.uml.internal.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.uml2.uml.StringExpression;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>String Expression</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#validateOperands(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operands</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#validateSubexpressions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subexpressions</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.StringExpression#stringValue() <em>String Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public final class StringExpressionOperations {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StringExpressionOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All the operands of a StringExpression must be LiteralStrings
	 * operand->forAll (op | op.oclIsKindOf (LiteralString))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateOperands(StringExpression stringExpression,
			DiagnosticChain diagnostics, Map context) {
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
						UMLValidator.STRING_EXPRESSION__OPERANDS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateOperands", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stringExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stringExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a StringExpression has sub-expressions, it cannot have operands and vice versa (this avoids the problem of having to
	 * define a collating sequence between operands and subexpressions).
	 * 
	 * if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty()
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSubexpressions(
			StringExpression stringExpression, DiagnosticChain diagnostics,
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
						UMLValidator.STRING_EXPRESSION__SUBEXPRESSIONS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE
							.getString(
								"_UI_GenericInvariant_diagnostic", new Object[]{"validateSubexpressions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(stringExpression, context)}), //$NON-NLS-1$ //$NON-NLS-2$
						new Object[]{stringExpression}));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query stringValue() returns the string that concatenates, in order, all the component string literals of all the subexpressions that are part of the StringExpression.
	 * 
	 * 
	 * result = if subExpression->notEmpty()
	 * then subExpression->iterate(se; stringValue = ?| stringValue.concat(se.stringValue()))
	 * else operand->iterate()(op; stringValue = ? | stringValue.concat(op.value))
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static String stringValue(StringExpression stringExpression) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} // StringExpressionOperations