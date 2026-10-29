package com.appsflyer.internal;

import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AdRevenueScheme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFf1tSDK {

    /* JADX INFO: renamed from: v */
    @NotNull
    private final AFh1lSDK f6990v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(@NotNull AFh1lSDK aFh1lSDK, @NotNull AFc1bSDK aFc1bSDK) {
        super(aFh1lSDK, aFc1bSDK, null, 4, null);
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.f6990v = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    /* JADX INFO: renamed from: d */
    public final void mo8849d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        super.mo8849d(aFh1pSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.f6990v.afDebugLog;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.f6990v.AFLoggerLogLevel;
        if (map != null && !map.isEmpty()) {
            List listM31895n = C7699p.m31895n(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listM31895n.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("name", "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1pSDK.f7027d;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}
