// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.models.Sim;
import java.util.HashMap;
import java.util.Map;

/** Samples for Sims UpdateTags. */
public final class SimsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/preview/2022-03-01-preview/examples/SimUpdateTags.json
     */
    /**
     * Sample code: Update sim tags.
     *
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void updateSimTags(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        Sim resource = manager.sims().getByResourceGroupWithResponse("rg1", "testSim", Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
