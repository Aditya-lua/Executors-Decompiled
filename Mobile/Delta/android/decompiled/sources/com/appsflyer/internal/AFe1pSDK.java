package com.appsflyer.internal;

import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1pSDK extends AFe1kSDK<String> {

    @Nullable
    private final String AFLoggerLogLevel;

    @NotNull
    private final LinkGenerator afDebugLog;

    @Nullable
    private final LinkGenerator.ResponseListener afErrorLog;

    @NotNull
    private final Map<String, String> afInfoLog;

    @NotNull
    private final UUID force;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final String f5321v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1pSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull UUID uuid, @NotNull String str, @NotNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NotNull LinkGenerator linkGenerator) {
        super(AFd1bSDK.ONELINK, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, aFc1bSDK, uuid.toString());
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(linkGenerator, "");
        this.force = uuid;
        this.f5321v = str;
        this.AFLoggerLogLevel = str2;
        this.afErrorLog = responseListener;
        this.afDebugLog = linkGenerator;
        this.afInfoLog = kotlin.collections.k0.v(map);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFd1pSDK<String> aFd1pSDKUnregisterClient = getD().unregisterClient(this.f5321v, this.afInfoLog, this.AFLoggerLogLevel, this.force, str);
        Intrinsics.checkNotNullExpressionValue(aFd1pSDKUnregisterClient, "");
        return aFd1pSDKUnregisterClient;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return AFe1oSDK.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        LinkGenerator.ResponseListener responseListener = this.afErrorLog;
        if (responseListener != null) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
            if (this.e != AFd1cSDK.SUCCESS || responseNetwork == null) {
                responseListener.onResponseError(this.afDebugLog.generateLink());
            } else {
                responseListener.onResponse((String) responseNetwork.getBody());
            }
        }
    }
}
