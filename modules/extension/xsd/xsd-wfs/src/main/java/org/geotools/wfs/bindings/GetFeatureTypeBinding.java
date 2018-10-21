/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.wfs.bindings;

import javax.xml.namespace.QName;
import net.opengis.wfs.WfsFactory;
import org.geotools.wfs.WFS;
import org.geotools.xml.AbstractComplexEMFBinding;

/**
 * Binding object for the type http://www.opengis.net/wfs:GetFeatureType.
 *
 * <p>
 *
 * <pre>
 *         <code>
 *  &lt;xsd:complexType name="GetFeatureType"&gt;
 *      &lt;xsd:annotation&gt;
 *          &lt;xsd:documentation&gt;
 *              A GetFeature element contains one or more Query elements
 *              that describe a query operation on one feature type.  In
 *              response to a GetFeature request, a Web Feature Service
 *              must be able to generate a GML3 response that validates
 *              using a schema generated by the DescribeFeatureType request.
 *              A Web Feature Service may support other possibly non-XML
 *              (and even binary) output formats as long as those formats
 *              are advertised in the capabilities document.
 *           &lt;/xsd:documentation&gt;
 *      &lt;/xsd:annotation&gt;
 *      &lt;xsd:complexContent&gt;
 *          &lt;xsd:extension base="wfs:BaseRequestType"&gt;
 *              &lt;xsd:sequence&gt;
 *                  &lt;xsd:element maxOccurs="unbounded" ref="wfs:Query"/&gt;
 *              &lt;/xsd:sequence&gt;
 *              &lt;xsd:attribute default="results" name="resultType"
 *                  type="wfs:ResultTypeType" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       The resultType attribute is used to indicate
 *                       what response a WFS should return to user once
 *                       a GetFeature request is processed.
 *                       Possible values are:
 *                          results - meaning that the full response set
 *                                    (i.e. all the feature instances)
 *                                    should be returned.
 *                          hits    - meaning that an empty response set
 *                                    should be returned (i.e. no feature
 *                                    instances should be returned) but
 *                                    the "numberOfFeatures" attribute
 *                                    should be set to the number of feature
 *                                    instances that would be returned.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute default="text/xml; subtype=gml/3.1.1"
 *                  name="outputFormat" type="xsd:string" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       The outputFormat attribute is used to specify the output
 *                       format that the Web Feature Service should generate in
 *                       response to a GetFeature or GetFeatureWithLock element.
 *                       The default value of 'text/xml; subtype=gml/3.1.1'
 *                       indicates that the output is an XML document that
 *                       conforms to the Geography Markup Language (GML)
 *                       Implementation Specification V3.1.1.
 *                       For the purposes of experimentation, vendor extension,
 *                       or even extensions that serve a specific community of
 *                       interest, other acceptable output format values may be
 *                       used to specify other formats as long as those values
 *                       are advertised in the capabilities document.
 *                       For example, the value WKB may be used to indicate that a
 *                       Well Known Binary format be used to encode the output.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="maxFeatures" type="xsd:positiveInteger" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       The maxFeatures attribute is used to specify the maximum
 *                       number of features that a GetFeature operation should
 *                       generate (regardless of the actual number of query hits).
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="traverseXlinkDepth" type="xsd:string" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       This attribute indicates the depth to which nested property
 *                       XLink linking element locator attribute (href) XLinks are
 *                       traversed and resolved if possible.  A value of "1"
 *                       indicates that one linking element locator attribute
 *                       (href) Xlink will be traversed and the referenced element
 *                       returned if possible, but nested property XLink linking
 *                       element locator attribute (href) XLinks in the returned
 *                       element are not traversed.  A value of "*" indicates that
 *                       all nested property XLink linking element locator attribute
 *                       (href) XLinks will be traversed and the referenced elements
 *                       returned if possible.  The range of valid values for this
 *                       attribute consists of positive integers plus "*".
 *                       If this attribute is not specified then no xlinks shall be
 *                       resolved and the value of traverseXlinkExpiry attribute (if
 *                       it specified) may be ignored.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *              &lt;xsd:attribute name="traverseXlinkExpiry"
 *                  type="xsd:positiveInteger" use="optional"&gt;
 *                  &lt;xsd:annotation&gt;
 *                      &lt;xsd:documentation&gt;
 *                       The traverseXlinkExpiry attribute value is specified in
 *                       minutes.  It indicates how long a Web Feature Service
 *                       should wait to receive a response to a nested GetGmlObject
 *                       request.
 *                       This attribute is only relevant if a value is specified
 *                       for the traverseXlinkDepth attribute.
 *                    &lt;/xsd:documentation&gt;
 *                  &lt;/xsd:annotation&gt;
 *              &lt;/xsd:attribute&gt;
 *          &lt;/xsd:extension&gt;
 *      &lt;/xsd:complexContent&gt;
 *  &lt;/xsd:complexType&gt;
 *
 *          </code>
 *         </pre>
 *
 * @generated
 */
public class GetFeatureTypeBinding extends AbstractComplexEMFBinding {
    public GetFeatureTypeBinding(WfsFactory factory) {
        super(factory);
    }

    /** @generated */
    public QName getTarget() {
        return WFS.GetFeatureType;
    }
}
