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
 * $Id: BehavioredClassifier.java,v 1.1 2005/11/14 22:26:02 khussey Exp $
 */
package org.eclipse.uml2.uml;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BehavioredClassifier may have an interface realization.
 * A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link org.eclipse.uml2.uml.BehavioredClassifier#getOwnedTriggers <em>Owned Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier
		extends Classifier {

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References behavior specifications owned by a classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_OwnedBehavior()
	 * @model type="org.eclipse.uml2.uml.Behavior" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedBehaviors();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Behavior} and appends it to the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.Behavior} to create.
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior createOwnedBehavior(EClass eClass);

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Behavior} and appends it to the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Behavior}.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior createOwnedBehavior();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Behavior} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Behavior} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBehaviors()
	 * @generated
	 */
	Behavior getOwnedBehavior(String name);

	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior specification that specifies the behavior of the classifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_ClassifierBehavior()
	 * @model resolveProxies="false" ordered="false"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.uml.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Realization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_InterfaceRealization()
	 * @see org.eclipse.uml2.uml.InterfaceRealization#getImplementingClassifier
	 * @model type="org.eclipse.uml2.uml.InterfaceRealization" opposite="implementingClassifier" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getInterfaceRealizations();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.InterfaceRealization} and appends it to the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.InterfaceRealization}.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization createInterfaceRealization();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>' from the '<em><b>Interface Realization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.InterfaceRealization} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.InterfaceRealization} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInterfaceRealizations()
	 * @generated
	 */
	InterfaceRealization getInterfaceRealization(String name);

	/**
	 * Returns the value of the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References Trigger descriptions owned by a Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Trigger</em>' containment reference list.
	 * @see org.eclipse.uml2.uml.UMLPackage#getBehavioredClassifier_OwnedTrigger()
	 * @model type="org.eclipse.uml2.uml.Trigger" containment="true" resolveProxies="false" ordered="false"
	 * @generated
	 */
	List getOwnedTriggers();

	/**
	 * Creates a {@link org.eclipse.uml2.uml.Trigger} and appends it to the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The new {@link org.eclipse.uml2.uml.Trigger}.
	 * @see #getOwnedTriggers()
	 * @generated
	 */
	Trigger createOwnedTrigger();

	/**
	 * Retrieves the {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Trigger} to retrieve.
	 * @return The {@link org.eclipse.uml2.uml.Trigger} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTriggers()
	 * @generated
	 */
	Trigger getOwnedTrigger(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a behavior is classifier behavior, it does not have a specification.
	 * self.classifierBehavior.notEmpty() implies self.specification.isEmpty()
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean validateClassBehavior(DiagnosticChain diagnostics, Map context);

} // BehavioredClassifier