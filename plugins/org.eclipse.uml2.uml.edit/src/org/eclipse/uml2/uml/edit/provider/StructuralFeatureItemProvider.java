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
 * $Id: StructuralFeatureItemProvider.java,v 1.1 2005/11/14 22:11:33 khussey Exp $
 */
package org.eclipse.uml2.uml.edit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.UMLEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.uml.StructuralFeature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuralFeatureItemProvider
		extends FeatureItemProvider
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuralFeatureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
			addIsOrderedPropertyDescriptor(object);
			addIsUniquePropertyDescriptor(object);
			addUpperPropertyDescriptor(object);
			addLowerPropertyDescriptor(object);
			addUpperValuePropertyDescriptor(object);
			addLowerValuePropertyDescriptor(object);
			addIsReadOnlyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_TypedElement_type_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_TypedElement_type_feature", "_UI_TypedElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getTypedElement_Type(), true, null, null,
				null));
	}

	/**
	 * This adds a property descriptor for the Is Ordered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsOrderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_isOrdered_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isOrdered_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_IsOrdered(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Unique feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsUniquePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_isUnique_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_isUnique_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_IsUnique(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Upper feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_upper_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upper_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_Upper(), true,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Lower feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_lower_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lower_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_Lower(), true,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Upper Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpperValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_upperValue_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_upperValue_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_UpperValue(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Lower Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLowerValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MultiplicityElement_lowerValue_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_MultiplicityElement_lowerValue_feature", "_UI_MultiplicityElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getMultiplicityElement_LowerValue(), true,
				null, null,
				new String[]{"org.eclipse.ui.views.properties.expert" //$NON-NLS-1$
				}));
	}

	/**
	 * This adds a property descriptor for the Is Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_StructuralFeature_isReadOnly_feature"), //$NON-NLS-1$
				getString(
					"_UI_PropertyDescriptor_description", "_UI_StructuralFeature_isReadOnly_feature", "_UI_StructuralFeature_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				UMLPackage.eINSTANCE.getStructuralFeature_IsReadOnly(), true,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getMultiplicityElement_UpperValue());
			childrenFeatures.add(UMLPackage.eINSTANCE
				.getMultiplicityElement_LowerValue());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((StructuralFeature) object).getName();
		return label == null || label.length() == 0
			? getString("_UI_StructuralFeature_type") : //$NON-NLS-1$
			getString("_UI_StructuralFeature_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(StructuralFeature.class)) {
			case UMLPackage.STRUCTURAL_FEATURE__IS_ORDERED :
			case UMLPackage.STRUCTURAL_FEATURE__IS_UNIQUE :
			case UMLPackage.STRUCTURAL_FEATURE__UPPER :
			case UMLPackage.STRUCTURAL_FEATURE__LOWER :
			case UMLPackage.STRUCTURAL_FEATURE__IS_READ_ONLY :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
				return;
			case UMLPackage.STRUCTURAL_FEATURE__UPPER_VALUE :
			case UMLPackage.STRUCTURAL_FEATURE__LOWER_VALUE :
				fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_UpperValue(), UMLFactory.eINSTANCE
			.createTimeInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createOpaqueExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createStringExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createLiteralInteger()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createLiteralString()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createLiteralBoolean()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createLiteralNull()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createInstanceValue()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createLiteralUnlimitedNatural()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createTimeExpression()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createDuration()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createDurationInterval()));

		newChildDescriptors.add(createChildParameter(UMLPackage.eINSTANCE
			.getMultiplicityElement_LowerValue(), UMLFactory.eINSTANCE
			.createTimeInterval()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == UMLPackage.eINSTANCE
			.getNamedElement_NameExpression()
			|| childFeature == UMLPackage.eINSTANCE
				.getMultiplicityElement_UpperValue()
			|| childFeature == UMLPackage.eINSTANCE
				.getMultiplicityElement_LowerValue();

		if (qualify) {
			return getString("_UI_CreateChild_text2", //$NON-NLS-1$
				new Object[]{getTypeText(childObject),
					getFeatureText(childFeature), getTypeText(owner)});
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return UMLEditPlugin.INSTANCE;
	}

}