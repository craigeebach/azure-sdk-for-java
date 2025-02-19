// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Snowflake export command settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SnowflakeExportCopyCommand")
@Fluent
public final class SnowflakeExportCopyCommand extends ExportSettings {
    /*
     * Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with
     * resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT":
     * "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     */
    @JsonProperty(value = "additionalCopyOptions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> additionalCopyOptions;

    /*
     * Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with
     * resultType object). Example: "additionalFormatOptions": { "OVERWRITE":
     * "TRUE", "MAX_FILE_SIZE": "'FALSE'" }
     */
    @JsonProperty(value = "additionalFormatOptions")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> additionalFormatOptions;

    /**
     * Get the additionalCopyOptions property: Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @return the additionalCopyOptions value.
     */
    public Map<String, Object> additionalCopyOptions() {
        return this.additionalCopyOptions;
    }

    /**
     * Set the additionalCopyOptions property: Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @param additionalCopyOptions the additionalCopyOptions value to set.
     * @return the SnowflakeExportCopyCommand object itself.
     */
    public SnowflakeExportCopyCommand withAdditionalCopyOptions(Map<String, Object> additionalCopyOptions) {
        this.additionalCopyOptions = additionalCopyOptions;
        return this;
    }

    /**
     * Get the additionalFormatOptions property: Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalFormatOptions": { "OVERWRITE": "TRUE", "MAX_FILE_SIZE": "'FALSE'" }.
     *
     * @return the additionalFormatOptions value.
     */
    public Map<String, Object> additionalFormatOptions() {
        return this.additionalFormatOptions;
    }

    /**
     * Set the additionalFormatOptions property: Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalFormatOptions": { "OVERWRITE": "TRUE", "MAX_FILE_SIZE": "'FALSE'" }.
     *
     * @param additionalFormatOptions the additionalFormatOptions value to set.
     * @return the SnowflakeExportCopyCommand object itself.
     */
    public SnowflakeExportCopyCommand withAdditionalFormatOptions(Map<String, Object> additionalFormatOptions) {
        this.additionalFormatOptions = additionalFormatOptions;
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
