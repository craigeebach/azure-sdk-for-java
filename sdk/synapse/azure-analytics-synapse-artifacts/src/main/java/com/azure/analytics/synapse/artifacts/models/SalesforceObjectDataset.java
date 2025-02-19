// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Salesforce object dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceObject")
@JsonFlatten
@Fluent
public class SalesforceObjectDataset extends Dataset {
    /*
     * The Salesforce object API name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.objectApiName")
    private Object objectApiName;

    /**
     * Get the objectApiName property: The Salesforce object API name. Type: string (or Expression with resultType
     * string).
     *
     * @return the objectApiName value.
     */
    public Object getObjectApiName() {
        return this.objectApiName;
    }

    /**
     * Set the objectApiName property: The Salesforce object API name. Type: string (or Expression with resultType
     * string).
     *
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceObjectDataset object itself.
     */
    public SalesforceObjectDataset setObjectApiName(Object objectApiName) {
        this.objectApiName = objectApiName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceObjectDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
