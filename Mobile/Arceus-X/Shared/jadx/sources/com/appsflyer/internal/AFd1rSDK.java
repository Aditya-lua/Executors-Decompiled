package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\b\u0010\t"}, m31665d2 = {"Lcom/appsflyer/internal/AFd1rSDK;", "Lcom/appsflyer/internal/AFd1iSDK;", "", "", "", "<init>", "()V", "p0", "AFLogger", "(Ljava/lang/String;)Ljava/util/Map;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFd1rSDK implements AFd1iSDK<Map<String, Object>> {

    @NotNull
    public static final AFd1rSDK INSTANCE = new AFd1rSDK();

    private AFd1rSDK() {
    }

    @NotNull
    public static Map<String, Object> AFLogger(@NotNull String p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(p8);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
            }
            map.remove("is_cache");
            return map;
        } catch (JSONException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GCD, "Error while parsing GCD response", e10, false, false, false, false, 96, null);
            return C7690k0.m31799n(C7352s.m30477a("string_response", p8));
        }
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.appsflyer.internal.AFd1iSDK
    public final /* synthetic */ Map<String, Object> registerClient(String str) {
        return AFLogger(str);
    }
}
