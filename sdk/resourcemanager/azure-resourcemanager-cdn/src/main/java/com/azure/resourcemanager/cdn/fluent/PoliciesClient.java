// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.cdn.fluent.models.CdnWebApplicationFirewallPolicyInner;
import com.azure.resourcemanager.cdn.models.CdnWebApplicationFirewallPolicyPatchParameters;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public interface PoliciesClient
    extends InnerSupportsGet<CdnWebApplicationFirewallPolicyInner>, InnerSupportsDelete<Void> {
    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies for Azure CDN as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CdnWebApplicationFirewallPolicyInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies for Azure CDN as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CdnWebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all of the protection policies within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines a list of WebApplicationFirewallPolicies for Azure CDN as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CdnWebApplicationFirewallPolicyInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<CdnWebApplicationFirewallPolicyInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CdnWebApplicationFirewallPolicyInner> getByResourceGroupAsync(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner getByResourceGroup(String resourceGroupName, String policyName);

    /**
     * Retrieve protection policy with specified name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CdnWebApplicationFirewallPolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String policyName, Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner>
        beginCreateOrUpdateAsync(
            String resourceGroupName,
            String policyName,
            CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String policyName,
            CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner>
        beginCreateOrUpdate(
            String resourceGroupName,
            String policyName,
            CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy,
            Context context);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CdnWebApplicationFirewallPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy);

    /**
     * Create or update policy with specified rule set name within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicy Policy to be created.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner createOrUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyInner cdnWebApplicationFirewallPolicy,
        Context context);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner> beginUpdateAsync(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner> beginUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CdnWebApplicationFirewallPolicyInner>, CdnWebApplicationFirewallPolicyInner> beginUpdate(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters,
        Context context);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<CdnWebApplicationFirewallPolicyInner> updateAsync(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner update(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters);

    /**
     * Update an existing CdnWebApplicationFirewallPolicy with the specified policy name under the specified
     * subscription and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param cdnWebApplicationFirewallPolicyPatchParameters CdnWebApplicationFirewallPolicy parameters to be patched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines web application firewall policy for Azure CDN.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CdnWebApplicationFirewallPolicyInner update(
        String resourceGroupName,
        String policyName,
        CdnWebApplicationFirewallPolicyPatchParameters cdnWebApplicationFirewallPolicyPatchParameters,
        Context context);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String policyName);

    /**
     * Deletes Policy.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param policyName The name of the CdnWebApplicationFirewallPolicy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String policyName, Context context);
}
