// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GalleryPropertiesProvisioningState. */
public final class GalleryPropertiesProvisioningState extends ExpandableStringEnum<GalleryPropertiesProvisioningState> {
    /** Static value Creating for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState UPDATING = fromString("Updating");

    /** Static value Failed for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState FAILED = fromString("Failed");

    /** Static value Succeeded for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Deleting for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState DELETING = fromString("Deleting");

    /** Static value Migrating for GalleryPropertiesProvisioningState. */
    public static final GalleryPropertiesProvisioningState MIGRATING = fromString("Migrating");

    /**
     * Creates or finds a GalleryPropertiesProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GalleryPropertiesProvisioningState.
     */
    @JsonCreator
    public static GalleryPropertiesProvisioningState fromString(String name) {
        return fromString(name, GalleryPropertiesProvisioningState.class);
    }

    /**
     * Gets known GalleryPropertiesProvisioningState values.
     *
     * @return known GalleryPropertiesProvisioningState values.
     */
    public static Collection<GalleryPropertiesProvisioningState> values() {
        return values(GalleryPropertiesProvisioningState.class);
    }
}
