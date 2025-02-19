// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.models.ARecord;
import com.azure.resourcemanager.dns.models.AaaaRecord;
import com.azure.resourcemanager.dns.models.CaaRecord;
import com.azure.resourcemanager.dns.models.CnameRecord;
import com.azure.resourcemanager.dns.models.MxRecord;
import com.azure.resourcemanager.dns.models.NsRecord;
import com.azure.resourcemanager.dns.models.PtrRecord;
import com.azure.resourcemanager.dns.models.SoaRecord;
import com.azure.resourcemanager.dns.models.SrvRecord;
import com.azure.resourcemanager.dns.models.TxtRecord;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a DNS record set (a collection of DNS records with the same name and type). */
@Fluent
public final class RecordSetInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecordSetInner.class);

    /*
     * The etag of the record set.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The properties of the record set.
     */
    @JsonProperty(value = "properties")
    private RecordSetProperties innerProperties;

    /**
     * Get the etag property: The etag of the record set.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag of the record set.
     *
     * @param etag the etag value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the record set.
     *
     * @return the innerProperties value.
     */
    private RecordSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the metadata property: The metadata attached to the record set.
     *
     * @return the metadata value.
     */
    public Map<String, String> metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The metadata attached to the record set.
     *
     * @param metadata the metadata value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMetadata(Map<String, String> metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the ttl property: The TTL (time-to-live) of the records in the record set.
     *
     * @return the ttl value.
     */
    public Long ttl() {
        return this.innerProperties() == null ? null : this.innerProperties().ttl();
    }

    /**
     * Set the ttl property: The TTL (time-to-live) of the records in the record set.
     *
     * @param ttl the ttl value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTtl(Long ttl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withTtl(ttl);
        return this;
    }

    /**
     * Get the fqdn property: Fully qualified domain name of the record set.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.innerProperties() == null ? null : this.innerProperties().fqdn();
    }

    /**
     * Get the provisioningState property: provisioning State of the record set.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @return the targetResource value.
     */
    public SubResource targetResource() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResource();
    }

    /**
     * Set the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @param targetResource the targetResource value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTargetResource(SubResource targetResource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withTargetResource(targetResource);
        return this;
    }

    /**
     * Get the aRecords property: The list of A records in the record set.
     *
     * @return the aRecords value.
     */
    public List<ARecord> aRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().aRecords();
    }

    /**
     * Set the aRecords property: The list of A records in the record set.
     *
     * @param aRecords the aRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withARecords(List<ARecord> aRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withARecords(aRecords);
        return this;
    }

    /**
     * Get the aaaaRecords property: The list of AAAA records in the record set.
     *
     * @return the aaaaRecords value.
     */
    public List<AaaaRecord> aaaaRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().aaaaRecords();
    }

    /**
     * Set the aaaaRecords property: The list of AAAA records in the record set.
     *
     * @param aaaaRecords the aaaaRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withAaaaRecords(List<AaaaRecord> aaaaRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withAaaaRecords(aaaaRecords);
        return this;
    }

    /**
     * Get the mxRecords property: The list of MX records in the record set.
     *
     * @return the mxRecords value.
     */
    public List<MxRecord> mxRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().mxRecords();
    }

    /**
     * Set the mxRecords property: The list of MX records in the record set.
     *
     * @param mxRecords the mxRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withMxRecords(List<MxRecord> mxRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withMxRecords(mxRecords);
        return this;
    }

    /**
     * Get the nsRecords property: The list of NS records in the record set.
     *
     * @return the nsRecords value.
     */
    public List<NsRecord> nsRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().nsRecords();
    }

    /**
     * Set the nsRecords property: The list of NS records in the record set.
     *
     * @param nsRecords the nsRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withNsRecords(List<NsRecord> nsRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withNsRecords(nsRecords);
        return this;
    }

    /**
     * Get the ptrRecords property: The list of PTR records in the record set.
     *
     * @return the ptrRecords value.
     */
    public List<PtrRecord> ptrRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().ptrRecords();
    }

    /**
     * Set the ptrRecords property: The list of PTR records in the record set.
     *
     * @param ptrRecords the ptrRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withPtrRecords(List<PtrRecord> ptrRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withPtrRecords(ptrRecords);
        return this;
    }

    /**
     * Get the srvRecords property: The list of SRV records in the record set.
     *
     * @return the srvRecords value.
     */
    public List<SrvRecord> srvRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().srvRecords();
    }

    /**
     * Set the srvRecords property: The list of SRV records in the record set.
     *
     * @param srvRecords the srvRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSrvRecords(List<SrvRecord> srvRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withSrvRecords(srvRecords);
        return this;
    }

    /**
     * Get the txtRecords property: The list of TXT records in the record set.
     *
     * @return the txtRecords value.
     */
    public List<TxtRecord> txtRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().txtRecords();
    }

    /**
     * Set the txtRecords property: The list of TXT records in the record set.
     *
     * @param txtRecords the txtRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withTxtRecords(List<TxtRecord> txtRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withTxtRecords(txtRecords);
        return this;
    }

    /**
     * Get the cnameRecord property: The CNAME record in the record set.
     *
     * @return the cnameRecord value.
     */
    public CnameRecord cnameRecord() {
        return this.innerProperties() == null ? null : this.innerProperties().cnameRecord();
    }

    /**
     * Set the cnameRecord property: The CNAME record in the record set.
     *
     * @param cnameRecord the cnameRecord value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCnameRecord(CnameRecord cnameRecord) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withCnameRecord(cnameRecord);
        return this;
    }

    /**
     * Get the soaRecord property: The SOA record in the record set.
     *
     * @return the soaRecord value.
     */
    public SoaRecord soaRecord() {
        return this.innerProperties() == null ? null : this.innerProperties().soaRecord();
    }

    /**
     * Set the soaRecord property: The SOA record in the record set.
     *
     * @param soaRecord the soaRecord value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withSoaRecord(SoaRecord soaRecord) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withSoaRecord(soaRecord);
        return this;
    }

    /**
     * Get the caaRecords property: The list of CAA records in the record set.
     *
     * @return the caaRecords value.
     */
    public List<CaaRecord> caaRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().caaRecords();
    }

    /**
     * Set the caaRecords property: The list of CAA records in the record set.
     *
     * @param caaRecords the caaRecords value to set.
     * @return the RecordSetInner object itself.
     */
    public RecordSetInner withCaaRecords(List<CaaRecord> caaRecords) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecordSetProperties();
        }
        this.innerProperties().withCaaRecords(caaRecords);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
