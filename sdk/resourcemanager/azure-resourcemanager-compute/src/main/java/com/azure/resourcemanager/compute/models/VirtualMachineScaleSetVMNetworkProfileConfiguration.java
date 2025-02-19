// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set VM network profile. */
@Fluent
public final class VirtualMachineScaleSetVMNetworkProfileConfiguration {
    /*
     * The list of network configurations.
     */
    @JsonProperty(value = "networkInterfaceConfigurations")
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /**
     * Get the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @return the networkInterfaceConfigurations value.
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations property: The list of network configurations.
     *
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set.
     * @return the VirtualMachineScaleSetVMNetworkProfileConfiguration object itself.
     */
    public VirtualMachineScaleSetVMNetworkProfileConfiguration withNetworkInterfaceConfigurations(
        List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaceConfigurations() != null) {
            networkInterfaceConfigurations().forEach(e -> e.validate());
        }
    }
}
