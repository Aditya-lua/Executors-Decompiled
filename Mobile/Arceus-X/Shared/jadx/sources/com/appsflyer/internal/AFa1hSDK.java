package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.util.Map;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1hSDK implements AFa1lSDK {

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFc1kSDK f6844d;

    public AFa1hSDK(@NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.f6844d = aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    /* JADX INFO: renamed from: d */
    public final void mo8703d(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.f6844d.mo8764d("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void registerClient() {
        this.f6844d.AFLogger("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    @NotNull
    public final Map<String, Object> unregisterClient() {
        if (this.f6844d.registerClient("deeplink_data")) {
            try {
                String strMo8762d = this.f6844d.mo8762d("deeplink_data");
                return strMo8762d == null ? C7690k0.m31795j() : JsonUtils.toMap(new JSONObject(strMo8762d));
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "Exception while parsing stored deeplink data", th2, false, true, false, false, 72, null);
            }
        }
        return C7690k0.m31795j();
    }
}
