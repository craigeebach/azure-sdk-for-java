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

/** numberColumn. */
@Fluent
public final class MicrosoftGraphNumberColumn {
    /*
     * How many decimal places to display. See below for information about the
     * possible values.
     */
    @JsonProperty(value = "decimalPlaces")
    private String decimalPlaces;

    /*
     * How the value should be presented in the UX. Must be one of number or
     * percentage. If unspecified, treated as number.
     */
    @JsonProperty(value = "displayAs")
    private String displayAs;

    /*
     * The maximum permitted value.
     */
    @JsonProperty(value = "maximum")
    private Double maximum;

    /*
     * The minimum permitted value.
     */
    @JsonProperty(value = "minimum")
    private Double minimum;

    /*
     * numberColumn
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the decimalPlaces property: How many decimal places to display. See below for information about the possible
     * values.
     *
     * @return the decimalPlaces value.
     */
    public String decimalPlaces() {
        return this.decimalPlaces;
    }

    /**
     * Set the decimalPlaces property: How many decimal places to display. See below for information about the possible
     * values.
     *
     * @param decimalPlaces the decimalPlaces value to set.
     * @return the MicrosoftGraphNumberColumn object itself.
     */
    public MicrosoftGraphNumberColumn withDecimalPlaces(String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
        return this;
    }

    /**
     * Get the displayAs property: How the value should be presented in the UX. Must be one of number or percentage. If
     * unspecified, treated as number.
     *
     * @return the displayAs value.
     */
    public String displayAs() {
        return this.displayAs;
    }

    /**
     * Set the displayAs property: How the value should be presented in the UX. Must be one of number or percentage. If
     * unspecified, treated as number.
     *
     * @param displayAs the displayAs value to set.
     * @return the MicrosoftGraphNumberColumn object itself.
     */
    public MicrosoftGraphNumberColumn withDisplayAs(String displayAs) {
        this.displayAs = displayAs;
        return this;
    }

    /**
     * Get the maximum property: The maximum permitted value.
     *
     * @return the maximum value.
     */
    public Double maximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The maximum permitted value.
     *
     * @param maximum the maximum value to set.
     * @return the MicrosoftGraphNumberColumn object itself.
     */
    public MicrosoftGraphNumberColumn withMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the minimum property: The minimum permitted value.
     *
     * @return the minimum value.
     */
    public Double minimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The minimum permitted value.
     *
     * @param minimum the minimum value to set.
     * @return the MicrosoftGraphNumberColumn object itself.
     */
    public MicrosoftGraphNumberColumn withMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the additionalProperties property: numberColumn.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: numberColumn.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphNumberColumn object itself.
     */
    public MicrosoftGraphNumberColumn withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
