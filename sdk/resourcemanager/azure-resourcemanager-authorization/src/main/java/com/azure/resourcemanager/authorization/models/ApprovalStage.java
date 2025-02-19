// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The approval stage. */
@Fluent
public final class ApprovalStage {
    /*
     * The time in days when approval request would be timed out
     */
    @JsonProperty(value = "approvalStageTimeOutInDays")
    private Integer approvalStageTimeOutInDays;

    /*
     * Determines whether approver need to provide justification for his
     * decision.
     */
    @JsonProperty(value = "isApproverJustificationRequired")
    private Boolean isApproverJustificationRequired;

    /*
     * The time in minutes when the approval request would be escalated if the
     * primary approver does not approve
     */
    @JsonProperty(value = "escalationTimeInMinutes")
    private Integer escalationTimeInMinutes;

    /*
     * The primary approver of the request.
     */
    @JsonProperty(value = "primaryApprovers")
    private List<UserSet> primaryApprovers;

    /*
     * The value determine whether escalation feature is enabled.
     */
    @JsonProperty(value = "isEscalationEnabled")
    private Boolean isEscalationEnabled;

    /*
     * The escalation approver of the request.
     */
    @JsonProperty(value = "escalationApprovers")
    private List<UserSet> escalationApprovers;

    /**
     * Get the approvalStageTimeOutInDays property: The time in days when approval request would be timed out.
     *
     * @return the approvalStageTimeOutInDays value.
     */
    public Integer approvalStageTimeOutInDays() {
        return this.approvalStageTimeOutInDays;
    }

    /**
     * Set the approvalStageTimeOutInDays property: The time in days when approval request would be timed out.
     *
     * @param approvalStageTimeOutInDays the approvalStageTimeOutInDays value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withApprovalStageTimeOutInDays(Integer approvalStageTimeOutInDays) {
        this.approvalStageTimeOutInDays = approvalStageTimeOutInDays;
        return this;
    }

    /**
     * Get the isApproverJustificationRequired property: Determines whether approver need to provide justification for
     * his decision.
     *
     * @return the isApproverJustificationRequired value.
     */
    public Boolean isApproverJustificationRequired() {
        return this.isApproverJustificationRequired;
    }

    /**
     * Set the isApproverJustificationRequired property: Determines whether approver need to provide justification for
     * his decision.
     *
     * @param isApproverJustificationRequired the isApproverJustificationRequired value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withIsApproverJustificationRequired(Boolean isApproverJustificationRequired) {
        this.isApproverJustificationRequired = isApproverJustificationRequired;
        return this;
    }

    /**
     * Get the escalationTimeInMinutes property: The time in minutes when the approval request would be escalated if the
     * primary approver does not approve.
     *
     * @return the escalationTimeInMinutes value.
     */
    public Integer escalationTimeInMinutes() {
        return this.escalationTimeInMinutes;
    }

    /**
     * Set the escalationTimeInMinutes property: The time in minutes when the approval request would be escalated if the
     * primary approver does not approve.
     *
     * @param escalationTimeInMinutes the escalationTimeInMinutes value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withEscalationTimeInMinutes(Integer escalationTimeInMinutes) {
        this.escalationTimeInMinutes = escalationTimeInMinutes;
        return this;
    }

    /**
     * Get the primaryApprovers property: The primary approver of the request.
     *
     * @return the primaryApprovers value.
     */
    public List<UserSet> primaryApprovers() {
        return this.primaryApprovers;
    }

    /**
     * Set the primaryApprovers property: The primary approver of the request.
     *
     * @param primaryApprovers the primaryApprovers value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withPrimaryApprovers(List<UserSet> primaryApprovers) {
        this.primaryApprovers = primaryApprovers;
        return this;
    }

    /**
     * Get the isEscalationEnabled property: The value determine whether escalation feature is enabled.
     *
     * @return the isEscalationEnabled value.
     */
    public Boolean isEscalationEnabled() {
        return this.isEscalationEnabled;
    }

    /**
     * Set the isEscalationEnabled property: The value determine whether escalation feature is enabled.
     *
     * @param isEscalationEnabled the isEscalationEnabled value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withIsEscalationEnabled(Boolean isEscalationEnabled) {
        this.isEscalationEnabled = isEscalationEnabled;
        return this;
    }

    /**
     * Get the escalationApprovers property: The escalation approver of the request.
     *
     * @return the escalationApprovers value.
     */
    public List<UserSet> escalationApprovers() {
        return this.escalationApprovers;
    }

    /**
     * Set the escalationApprovers property: The escalation approver of the request.
     *
     * @param escalationApprovers the escalationApprovers value to set.
     * @return the ApprovalStage object itself.
     */
    public ApprovalStage withEscalationApprovers(List<UserSet> escalationApprovers) {
        this.escalationApprovers = escalationApprovers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (primaryApprovers() != null) {
            primaryApprovers().forEach(e -> e.validate());
        }
        if (escalationApprovers() != null) {
            escalationApprovers().forEach(e -> e.validate());
        }
    }
}
