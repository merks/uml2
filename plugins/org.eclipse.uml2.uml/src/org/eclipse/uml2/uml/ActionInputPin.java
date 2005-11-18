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
 * $Id: ActionInputPin.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Input Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action input pin is a kind of pin that executes an action to determine the values to input to another.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.ActionInputPin#getFromAction <em>From Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getActionInputPin()
 * @model
 * @generated
 */
public interface ActionInputPin
		extends InputPin {

	/**
	 * Returns the value of the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action used to provide values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Action</em>' containment reference.
	 * @see #setFromAction(Action)
	 * @see org.eclipse.uml2.uml.UMLPackage#getActionInputPin_FromAction()
	 * @model containment="true" resolveProxies="false" required="true" ordered="false"
	 * @generated
	 */
	Action getFromAction();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.ActionInputPin#getFromAction <em>From Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Action</em>' containment reference.
	 * @see #getFromAction()
	 * @generated
	 */
	void setFromAction(Action value);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Action} and sets the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Action} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getFromAction()
	 * @generated
	 */
	Action createFromAction(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Action} and sets the '<em><b>From Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Action}.
	 * @see #getFromAction()
	 * @generated
	 */
	Action createFromAction();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an action input pin must have exactly one output pin.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateOneOutputPin(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an action input pin must only have action input pins as input pins.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateInputPin(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fromAction of an action input pin cannot have control or data flows coming into or out of it or its pins.
	 * true
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateNoControlOrDataFlow(DiagnosticChain diagnostics, Map context);

} // ActionInputPin