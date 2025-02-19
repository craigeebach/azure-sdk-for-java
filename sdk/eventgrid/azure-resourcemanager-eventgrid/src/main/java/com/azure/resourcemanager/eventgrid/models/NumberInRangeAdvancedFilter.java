// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** NumberInRange Advanced Filter. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType")
@JsonTypeName("NumberInRange")
@Fluent
public final class NumberInRangeAdvancedFilter extends AdvancedFilter {
    /*
     * The set of filter values.
     */
    @JsonProperty(value = "values")
    private List<List<Double>> values;

    /**
     * Get the values property: The set of filter values.
     *
     * @return the values value.
     */
    public List<List<Double>> values() {
        return this.values;
    }

    /**
     * Set the values property: The set of filter values.
     *
     * @param values the values value to set.
     * @return the NumberInRangeAdvancedFilter object itself.
     */
    public NumberInRangeAdvancedFilter withValues(List<List<Double>> values) {
        this.values = values;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NumberInRangeAdvancedFilter withKey(String key) {
        super.withKey(key);
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
