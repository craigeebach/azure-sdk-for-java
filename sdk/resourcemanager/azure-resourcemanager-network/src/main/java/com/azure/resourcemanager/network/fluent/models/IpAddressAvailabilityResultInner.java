// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for CheckIPAddressAvailability API service call. */
@Fluent
public final class IpAddressAvailabilityResultInner {
    /*
     * Private IP address availability.
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /*
     * Contains other available private IP addresses if the asked for address
     * is taken.
     */
    @JsonProperty(value = "availableIPAddresses")
    private List<String> availableIpAddresses;

    /*
     * Private IP address platform reserved.
     */
    @JsonProperty(value = "isPlatformReserved")
    private Boolean isPlatformReserved;

    /**
     * Get the available property: Private IP address availability.
     *
     * @return the available value.
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available property: Private IP address availability.
     *
     * @param available the available value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     *
     * @return the availableIpAddresses value.
     */
    public List<String> availableIpAddresses() {
        return this.availableIpAddresses;
    }

    /**
     * Set the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     *
     * @param availableIpAddresses the availableIpAddresses value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withAvailableIpAddresses(List<String> availableIpAddresses) {
        this.availableIpAddresses = availableIpAddresses;
        return this;
    }

    /**
     * Get the isPlatformReserved property: Private IP address platform reserved.
     *
     * @return the isPlatformReserved value.
     */
    public Boolean isPlatformReserved() {
        return this.isPlatformReserved;
    }

    /**
     * Set the isPlatformReserved property: Private IP address platform reserved.
     *
     * @param isPlatformReserved the isPlatformReserved value to set.
     * @return the IpAddressAvailabilityResultInner object itself.
     */
    public IpAddressAvailabilityResultInner withIsPlatformReserved(Boolean isPlatformReserved) {
        this.isPlatformReserved = isPlatformReserved;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
