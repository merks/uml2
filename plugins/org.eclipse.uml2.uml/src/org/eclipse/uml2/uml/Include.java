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
 * $Id: Include.java,v 1.1 2005/11/14 22:25:58 khussey Exp $
 */
package org.eclipse.uml2.uml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note that the included use case is not optional, and is always required for the  including use case to execute correctly.
 * 
 * 
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getInclude()
 * @model
 * @generated
 */
public interface Include
		extends NamedElement, DirectedRelationship {

	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case that is to be included.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInclude_Addition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.UseCase#getIncludes <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use case which will include the addition and owns the include relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Including Case</em>' container reference.
	 * @see #setIncludingCase(UseCase)
	 * @see org.eclipse.uml2.uml.UMLPackage#getInclude_IncludingCase()
	 * @see org.eclipse.uml2.uml.UseCase#getIncludes
	 * @model opposite="include" required="true" ordered="false"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.Include#getIncludingCase <em>Including Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' container reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

} // Include