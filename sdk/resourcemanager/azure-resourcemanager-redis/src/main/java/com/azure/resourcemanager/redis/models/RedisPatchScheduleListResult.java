// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.redis.fluent.models.RedisPatchScheduleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of list patch schedules Redis operation. */
@Fluent
public final class RedisPatchScheduleListResult {
    /*
     * Results of the list patch schedules operation.
     */
    @JsonProperty(value = "value")
    private List<RedisPatchScheduleInner> value;

    /*
     * Link for next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Results of the list patch schedules operation.
     *
     * @return the value value.
     */
    public List<RedisPatchScheduleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the list patch schedules operation.
     *
     * @param value the value value to set.
     * @return the RedisPatchScheduleListResult object itself.
     */
    public RedisPatchScheduleListResult withValue(List<RedisPatchScheduleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link for next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
