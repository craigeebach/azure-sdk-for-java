// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for DiskAccesses GetByResourceGroup. */
public final class DiskAccessesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/GetInformationAboutADiskAccess.json
     */
    /**
     * Sample code: Get information about a disk access resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getInformationAboutADiskAccessResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-12-01/examples/GetInformationAboutADiskAccessWithPrivateEndpoints.json
     */
    /**
     * Sample code: Get information about a disk access resource with private endpoints.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getInformationAboutADiskAccessResourceWithPrivateEndpoints(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
