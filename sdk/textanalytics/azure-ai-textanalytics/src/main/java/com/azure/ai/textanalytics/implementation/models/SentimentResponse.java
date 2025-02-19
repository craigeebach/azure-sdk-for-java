// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SentimentResponse model. */
@Fluent
public final class SentimentResponse extends PreBuiltResult {
    /*
     * Sentiment analysis per document.
     */
    @JsonProperty(value = "documents", required = true)
    private List<SentimentResponseDocumentsItem> documents;

    /**
     * Get the documents property: Sentiment analysis per document.
     *
     * @return the documents value.
     */
    public List<SentimentResponseDocumentsItem> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Sentiment analysis per document.
     *
     * @param documents the documents value to set.
     * @return the SentimentResponse object itself.
     */
    public SentimentResponse setDocuments(List<SentimentResponseDocumentsItem> documents) {
        this.documents = documents;
        return this;
    }
}
