// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ErrorEntity;
import com.azure.resourcemanager.appservice.models.OperationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** An operation on a resource. */
@Fluent
public final class OperationInner {
    /*
     * Operation ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Operation name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The current status of the operation.
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /*
     * Any errors associate with the operation.
     */
    @JsonProperty(value = "errors")
    private List<ErrorEntity> errors;

    /*
     * Time when operation has started.
     */
    @JsonProperty(value = "createdTime")
    private OffsetDateTime createdTime;

    /*
     * Time when operation has been updated.
     */
    @JsonProperty(value = "modifiedTime")
    private OffsetDateTime modifiedTime;

    /*
     * Time when operation will expire.
     */
    @JsonProperty(value = "expirationTime")
    private OffsetDateTime expirationTime;

    /*
     * Applicable only for stamp operation ids.
     */
    @JsonProperty(value = "geoMasterOperationId")
    private UUID geoMasterOperationId;

    /**
     * Get the id property: Operation ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Operation ID.
     *
     * @param id the id value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name.
     *
     * @param name the name value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the status property: The current status of the operation.
     *
     * @return the status value.
     */
    public OperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The current status of the operation.
     *
     * @param status the status value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errors property: Any errors associate with the operation.
     *
     * @return the errors value.
     */
    public List<ErrorEntity> errors() {
        return this.errors;
    }

    /**
     * Set the errors property: Any errors associate with the operation.
     *
     * @param errors the errors value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withErrors(List<ErrorEntity> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Get the createdTime property: Time when operation has started.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: Time when operation has started.
     *
     * @param createdTime the createdTime value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the modifiedTime property: Time when operation has been updated.
     *
     * @return the modifiedTime value.
     */
    public OffsetDateTime modifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Set the modifiedTime property: Time when operation has been updated.
     *
     * @param modifiedTime the modifiedTime value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withModifiedTime(OffsetDateTime modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get the expirationTime property: Time when operation will expire.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: Time when operation will expire.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Get the geoMasterOperationId property: Applicable only for stamp operation ids.
     *
     * @return the geoMasterOperationId value.
     */
    public UUID geoMasterOperationId() {
        return this.geoMasterOperationId;
    }

    /**
     * Set the geoMasterOperationId property: Applicable only for stamp operation ids.
     *
     * @param geoMasterOperationId the geoMasterOperationId value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withGeoMasterOperationId(UUID geoMasterOperationId) {
        this.geoMasterOperationId = geoMasterOperationId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
    }
}
