// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExtractiveSummarizationSortingCriteria. */
public final class ExtractiveSummarizationSortingCriteria
        extends ExpandableStringEnum<ExtractiveSummarizationSortingCriteria> {
    /** Static value Offset for ExtractiveSummarizationSortingCriteria. */
    public static final ExtractiveSummarizationSortingCriteria OFFSET = fromString("Offset");

    /** Static value Rank for ExtractiveSummarizationSortingCriteria. */
    public static final ExtractiveSummarizationSortingCriteria RANK = fromString("Rank");

    /**
     * Creates or finds a ExtractiveSummarizationSortingCriteria from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExtractiveSummarizationSortingCriteria.
     */
    @JsonCreator
    public static ExtractiveSummarizationSortingCriteria fromString(String name) {
        return fromString(name, ExtractiveSummarizationSortingCriteria.class);
    }

    /** @return known ExtractiveSummarizationSortingCriteria values. */
    public static Collection<ExtractiveSummarizationSortingCriteria> values() {
        return values(ExtractiveSummarizationSortingCriteria.class);
    }
}
