/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import net.opengis.fes20.FilterCapabilitiesType;

import net.opengis.wfs20.FeatureTypeListType;
import net.opengis.wfs20.WSDLType;

/**
 * A sample validator interface for {@link net.opengis.wfs20.WFSCapabilitiesType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WFSCapabilitiesTypeValidator {
  boolean validate();

  boolean validateWSDL(WSDLType value);
  boolean validateFeatureTypeList(FeatureTypeListType value);
  boolean validateFilterCapabilities(FilterCapabilitiesType value);
}
