// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * extensionProperty Represents an Azure Active Directory object. The directoryObject type is the base type for many
 * other directory entity types.
 */
@Fluent
public final class MicrosoftGraphExtensionPropertyInner extends MicrosoftGraphDirectoryObjectInner {
    /*
     * Display name of the application object on which this extension property
     * is defined. Read-only.
     */
    @JsonProperty(value = "appDisplayName")
    private String appDisplayName;

    /*
     * Specifies the data type of the value the extension property can hold.
     * Following values are supported. Not nullable. Binary - 256 bytes
     * maximumBooleanDateTime - Must be specified in ISO 8601 format. Will be
     * stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String
     * - 256 characters maximum
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /*
     * Indicates if this extension property was sycned from onpremises
     * directory using Azure AD Connect. Read-only.
     */
    @JsonProperty(value = "isSyncedFromOnPremises")
    private Boolean isSyncedFromOnPremises;

    /*
     * Name of the extension property. Not nullable.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Following values are supported. Not nullable.
     * UserGroupOrganizationDeviceApplication
     */
    @JsonProperty(value = "targetObjects")
    private List<String> targetObjects;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the appDisplayName property: Display name of the application object on which this extension property is
     * defined. Read-only.
     *
     * @return the appDisplayName value.
     */
    public String appDisplayName() {
        return this.appDisplayName;
    }

    /**
     * Set the appDisplayName property: Display name of the application object on which this extension property is
     * defined. Read-only.
     *
     * @param appDisplayName the appDisplayName value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withAppDisplayName(String appDisplayName) {
        this.appDisplayName = appDisplayName;
        return this;
    }

    /**
     * Get the dataType property: Specifies the data type of the value the extension property can hold. Following values
     * are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format.
     * Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set the dataType property: Specifies the data type of the value the extension property can hold. Following values
     * are supported. Not nullable. Binary - 256 bytes maximumBooleanDateTime - Must be specified in ISO 8601 format.
     * Will be stored in UTC.Integer - 32-bit value.LargeInteger - 64-bit value.String - 256 characters maximum.
     *
     * @param dataType the dataType value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get the isSyncedFromOnPremises property: Indicates if this extension property was sycned from onpremises
     * directory using Azure AD Connect. Read-only.
     *
     * @return the isSyncedFromOnPremises value.
     */
    public Boolean isSyncedFromOnPremises() {
        return this.isSyncedFromOnPremises;
    }

    /**
     * Set the isSyncedFromOnPremises property: Indicates if this extension property was sycned from onpremises
     * directory using Azure AD Connect. Read-only.
     *
     * @param isSyncedFromOnPremises the isSyncedFromOnPremises value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withIsSyncedFromOnPremises(Boolean isSyncedFromOnPremises) {
        this.isSyncedFromOnPremises = isSyncedFromOnPremises;
        return this;
    }

    /**
     * Get the name property: Name of the extension property. Not nullable.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the extension property. Not nullable.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the targetObjects property: Following values are supported. Not nullable.
     * UserGroupOrganizationDeviceApplication.
     *
     * @return the targetObjects value.
     */
    public List<String> targetObjects() {
        return this.targetObjects;
    }

    /**
     * Set the targetObjects property: Following values are supported. Not nullable.
     * UserGroupOrganizationDeviceApplication.
     *
     * @param targetObjects the targetObjects value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withTargetObjects(List<String> targetObjects) {
        this.targetObjects = targetObjects;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphExtensionPropertyInner object itself.
     */
    public MicrosoftGraphExtensionPropertyInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphExtensionPropertyInner withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphExtensionPropertyInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
