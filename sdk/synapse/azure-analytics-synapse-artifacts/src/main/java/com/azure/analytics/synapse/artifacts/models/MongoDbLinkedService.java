// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for MongoDb data source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MongoDb")
@JsonFlatten
@Fluent
public class MongoDbLinkedService extends LinkedService {
    /*
     * The IP address or server name of the MongoDB server. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.server", required = true)
    private Object server;

    /*
     * The authentication type to be used to connect to the MongoDB database.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private MongoDbAuthenticationType authenticationType;

    /*
     * The name of the MongoDB database that you want to access. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.databaseName", required = true)
    private Object databaseName;

    /*
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Database to verify the username and password. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authSource")
    private Object authSource;

    /*
     * The TCP port number that the MongoDB server uses to listen for client
     * connections. The default value is 27017. Type: integer (or Expression
     * with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * Specifies whether the connections to the server are encrypted using SSL.
     * The default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * Specifies whether to allow self-signed certificates from the server. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     *
     * @return the server value.
     */
    public Object getServer() {
        return this.server;
    }

    /**
     * Set the server property: The IP address or server name of the MongoDB server. Type: string (or Expression with
     * resultType string).
     *
     * @param server the server value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     *
     * @return the authenticationType value.
     */
    public MongoDbAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the MongoDB database.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAuthenticationType(MongoDbAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @return the databaseName value.
     */
    public Object getDatabaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the MongoDB database that you want to access. Type: string (or
     * Expression with resultType string).
     *
     * @param databaseName the databaseName value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setDatabaseName(Object databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     *
     * @return the authSource value.
     */
    public Object getAuthSource() {
        return this.authSource;
    }

    /**
     * Set the authSource property: Database to verify the username and password. Type: string (or Expression with
     * resultType string).
     *
     * @param authSource the authSource value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAuthSource(Object authSource) {
        this.authSource = authSource;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the MongoDB server uses to listen for client connections. The
     * default value is 27017. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param enableSsl the enableSsl value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the MongoDbLinkedService object itself.
     */
    public MongoDbLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MongoDbLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
