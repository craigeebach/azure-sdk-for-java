// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Details of JobOutput errors. */
@Immutable
public final class JobError {
    /*
     * Error code describing the error.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorCode code;

    /*
     * A human-readable language-dependent representation of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Helps with categorization of errors.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorCategory category;

    /*
     * Indicates that it may be possible to retry the Job. If retry is
     * unsuccessful, please contact Azure support via Azure Portal.
     */
    @JsonProperty(value = "retry", access = JsonProperty.Access.WRITE_ONLY)
    private JobRetry retry;

    /*
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobErrorDetail> details;

    /**
     * Get the code property: Error code describing the error.
     *
     * @return the code value.
     */
    public JobErrorCode code() {
        return this.code;
    }

    /**
     * Get the message property: A human-readable language-dependent representation of the error.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the category property: Helps with categorization of errors.
     *
     * @return the category value.
     */
    public JobErrorCategory category() {
        return this.category;
    }

    /**
     * Get the retry property: Indicates that it may be possible to retry the Job. If retry is unsuccessful, please
     * contact Azure support via Azure Portal.
     *
     * @return the retry value.
     */
    public JobRetry retry() {
        return this.retry;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<JobErrorDetail> details() {
        return this.details;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
        }
    }
}
