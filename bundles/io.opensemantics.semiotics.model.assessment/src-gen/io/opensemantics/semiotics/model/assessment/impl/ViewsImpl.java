/**
 * Copyright 2016 OpenSemantics.IO
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.opensemantics.semiotics.model.assessment.impl;

import io.opensemantics.semiotics.model.assessment.Application;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.View;
import io.opensemantics.semiotics.model.assessment.Views;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ViewsImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.ViewsImpl#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewsImpl extends MinimalEObjectImpl.Container implements Views {
	/**
   * The cached value of the '{@link #getViews() <em>Views</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
	protected EList<View> views;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ViewsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.VIEWS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Application getApplication() {
    if (eContainerFeatureID() != AssessmentPackage.VIEWS__APPLICATION) return null;
    return (Application)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newApplication, AssessmentPackage.VIEWS__APPLICATION, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setApplication(Application newApplication) {
    if (newApplication != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.VIEWS__APPLICATION && newApplication != null)) {
      if (EcoreUtil.isAncestor(this, newApplication))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newApplication != null)
        msgs = ((InternalEObject)newApplication).eInverseAdd(this, AssessmentPackage.APPLICATION__VIEWS, Application.class, msgs);
      msgs = basicSetApplication(newApplication, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.VIEWS__APPLICATION, newApplication, newApplication));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<View> getViews() {
    if (views == null) {
      views = new EObjectContainmentWithInverseEList<View>(View.class, this, AssessmentPackage.VIEWS__VIEWS, AssessmentPackage.VIEW__VIEWS);
    }
    return views;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetApplication((Application)otherEnd, msgs);
      case AssessmentPackage.VIEWS__VIEWS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getViews()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        return basicSetApplication(null, msgs);
      case AssessmentPackage.VIEWS__VIEWS:
        return ((InternalEList<?>)getViews()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
    switch (eContainerFeatureID()) {
      case AssessmentPackage.VIEWS__APPLICATION:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.APPLICATION__VIEWS, Application.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        return getApplication();
      case AssessmentPackage.VIEWS__VIEWS:
        return getViews();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        setApplication((Application)newValue);
        return;
      case AssessmentPackage.VIEWS__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends View>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        setApplication((Application)null);
        return;
      case AssessmentPackage.VIEWS__VIEWS:
        getViews().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID) {
      case AssessmentPackage.VIEWS__APPLICATION:
        return getApplication() != null;
      case AssessmentPackage.VIEWS__VIEWS:
        return views != null && !views.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ViewsImpl
