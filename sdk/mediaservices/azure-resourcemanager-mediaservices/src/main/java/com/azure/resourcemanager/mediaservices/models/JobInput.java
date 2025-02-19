// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for inputs to a Job. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "@odata.type",
    defaultImpl = JobInput.class)
@JsonTypeName("JobInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputClip", value = JobInputClip.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputs", value = JobInputs.class),
    @JsonSubTypes.Type(name = "#Microsoft.Media.JobInputSequence", value = JobInputSequence.class)
})
@Immutable
public class JobInput {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
