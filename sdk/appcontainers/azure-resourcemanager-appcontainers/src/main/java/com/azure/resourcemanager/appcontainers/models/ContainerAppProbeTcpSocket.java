// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported. */
@Fluent
public final class ContainerAppProbeTcpSocket {
    /*
     * Optional: Host name to connect to, defaults to the pod IP.
     */
    @JsonProperty(value = "host")
    private String host;

    /*
     * Number or name of the port to access on the container. Number must be in
     * the range 1 to 65535. Name must be an IANA_SVC_NAME.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Get the host property: Optional: Host name to connect to, defaults to the pod IP.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Optional: Host name to connect to, defaults to the pod IP.
     *
     * @param host the host value to set.
     * @return the ContainerAppProbeTcpSocket object itself.
     */
    public ContainerAppProbeTcpSocket withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: Number or name of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     *
     * @return the port value.
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port property: Number or name of the port to access on the container. Number must be in the range 1 to
     * 65535. Name must be an IANA_SVC_NAME.
     *
     * @param port the port value to set.
     * @return the ContainerAppProbeTcpSocket object itself.
     */
    public ContainerAppProbeTcpSocket withPort(int port) {
        this.port = port;
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
