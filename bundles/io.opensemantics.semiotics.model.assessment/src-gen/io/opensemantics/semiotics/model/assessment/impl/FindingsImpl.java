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

import io.opensemantics.semiotics.model.assessment.Assessment;
import io.opensemantics.semiotics.model.assessment.AssessmentPackage;
import io.opensemantics.semiotics.model.assessment.Finding;
import io.opensemantics.semiotics.model.assessment.Findings;

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
 * An implementation of the model object '<em><b>Findings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingsImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link io.opensemantics.semiotics.model.assessment.impl.FindingsImpl#getAssessment <em>Assessment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingsImpl extends MinimalEObjectImpl.Container implements Findings {
	/**
   * The cached value of the '{@link #getFindings() <em>Findings</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFindings()
   * @generated
   * @ordered
   */
	protected EList<Finding> findings;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FindingsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return AssessmentPackage.Literals.FINDINGS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Finding> getFindings() {
    if (findings == null) {
      findings = new EObjectContainmentWithInverseEList<Finding>(Finding.class, this, AssessmentPackage.FINDINGS__FINDINGS, AssessmentPackage.FINDING__FINDINGS);
    }
    return findings;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Assessment getAssessment() {
    if (eContainerFeatureID() != AssessmentPackage.FINDINGS__ASSESSMENT) return null;
    return (Assessment)eInternalContainer();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAssessment(Assessment newAssessment, NotificationChain msgs) {
    msgs = eBasicSetContainer((InternalEObject)newAssessment, AssessmentPackage.FINDINGS__ASSESSMENT, msgs);
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAssessment(Assessment newAssessment) {
    if (newAssessment != eInternalContainer() || (eContainerFeatureID() != AssessmentPackage.FINDINGS__ASSESSMENT && newAssessment != null)) {
      if (EcoreUtil.isAncestor(this, newAssessment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newAssessment != null)
        msgs = ((InternalEObject)newAssessment).eInverseAdd(this, AssessmentPackage.ASSESSMENT__FINDINGS, Assessment.class, msgs);
      msgs = basicSetAssessment(newAssessment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AssessmentPackage.FINDINGS__ASSESSMENT, newAssessment, newAssessment));
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getFindings()).basicAdd(otherEnd, msgs);
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetAssessment((Assessment)otherEnd, msgs);
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        return basicSetAssessment(null, msgs);
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
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        return eInternalContainer().eInverseRemove(this, AssessmentPackage.ASSESSMENT__FINDINGS, Assessment.class, msgs);
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        return getFindings();
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        return getAssessment();
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        getFindings().clear();
        getFindings().addAll((Collection<? extends Finding>)newValue);
        return;
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        setAssessment((Assessment)newValue);
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        getFindings().clear();
        return;
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        setAssessment((Assessment)null);
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
      case AssessmentPackage.FINDINGS__FINDINGS:
        return findings != null && !findings.isEmpty();
      case AssessmentPackage.FINDINGS__ASSESSMENT:
        return getAssessment() != null;
    }
    return super.eIsSet(featureID);
  }

} //FindingsImpl
