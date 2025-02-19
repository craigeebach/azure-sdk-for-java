// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** teamsAppDefinition. */
@Fluent
public final class MicrosoftGraphTeamsAppDefinition extends MicrosoftGraphEntity {
    /*
     * The name of the app provided by the app developer.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The ID from the Teams app manifest.
     */
    @JsonProperty(value = "teamsAppId")
    private String teamsAppId;

    /*
     * The version number of the application.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * teamsAppDefinition
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the displayName property: The name of the app provided by the app developer.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the app provided by the app developer.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphTeamsAppDefinition object itself.
     */
    public MicrosoftGraphTeamsAppDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the teamsAppId property: The ID from the Teams app manifest.
     *
     * @return the teamsAppId value.
     */
    public String teamsAppId() {
        return this.teamsAppId;
    }

    /**
     * Set the teamsAppId property: The ID from the Teams app manifest.
     *
     * @param teamsAppId the teamsAppId value to set.
     * @return the MicrosoftGraphTeamsAppDefinition object itself.
     */
    public MicrosoftGraphTeamsAppDefinition withTeamsAppId(String teamsAppId) {
        this.teamsAppId = teamsAppId;
        return this;
    }

    /**
     * Get the version property: The version number of the application.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version number of the application.
     *
     * @param version the version value to set.
     * @return the MicrosoftGraphTeamsAppDefinition object itself.
     */
    public MicrosoftGraphTeamsAppDefinition withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: teamsAppDefinition.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamsAppDefinition.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamsAppDefinition object itself.
     */
    public MicrosoftGraphTeamsAppDefinition withAdditionalProperties(Map<String, Object> additionalProperties) {
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
    public MicrosoftGraphTeamsAppDefinition withId(String id) {
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
