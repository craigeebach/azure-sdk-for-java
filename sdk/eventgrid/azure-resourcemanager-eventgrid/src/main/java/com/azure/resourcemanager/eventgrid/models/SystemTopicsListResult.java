// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List System topics operation. */
@Fluent
public final class SystemTopicsListResult {
    /*
     * A collection of system Topics.
     */
    @JsonProperty(value = "value")
    private List<SystemTopicInner> value;

    /*
     * A link for the next page of topics.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of system Topics.
     *
     * @return the value value.
     */
    public List<SystemTopicInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of system Topics.
     *
     * @param value the value value to set.
     * @return the SystemTopicsListResult object itself.
     */
    public SystemTopicsListResult withValue(List<SystemTopicInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of topics.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of topics.
     *
     * @param nextLink the nextLink value to set.
     * @return the SystemTopicsListResult object itself.
     */
    public SystemTopicsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
