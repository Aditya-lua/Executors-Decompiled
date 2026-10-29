package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1hSDK implements AFa1lSDK {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f5216d;

    public AFa1hSDK(@NotNull AFc1kSDK aFc1kSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        this.f5216d = aFc1kSDK;
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void d(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.f5216d.d("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    public final void registerClient() {
        this.f5216d.AFLogger("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1lSDK
    @NotNull
    public final Map<String, Object> unregisterClient() {
        if (this.f5216d.registerClient("deeplink_data")) {
            try {
                String strD = this.f5216d.d("deeplink_data");
                return strD == null ? kotlin.collections.k0.j() : JsonUtils.toMap(new JSONObject(strD));
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DDL, "Exception while parsing stored deeplink data", th2, false, true, false, false, 72, null);
            }
        }
        return kotlin.collections.k0.j();
    }
}
