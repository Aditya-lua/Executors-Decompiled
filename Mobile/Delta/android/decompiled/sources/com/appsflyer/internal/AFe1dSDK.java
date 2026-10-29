package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00182\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\u0012\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1dSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "Lcom/appsflyer/internal/AFi1oSDK;", "p0", "Lcom/appsflyer/internal/AFc1iSDK;", "p1", "Lcom/appsflyer/internal/AFc1bSDK;", "p2", "Lcom/appsflyer/internal/AFg1rSDK;", "p3", "Lcom/appsflyer/internal/AFd1zSDK;", "p4", "Lcom/appsflyer/internal/AFh1hSDK;", "p5", "<init>", "(Lcom/appsflyer/internal/AFi1oSDK;Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/internal/AFg1rSDK;Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFh1hSDK;)V", "", "AFLogger", "()Z", "e", "", "d", "()J", "Lcom/appsflyer/internal/AFd1pSDK;", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "force", "Lcom/appsflyer/internal/AFi1oSDK;", "AFKeystoreWrapper", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFc1iSDK;", "registerClient", "afDebugLog", "Lcom/appsflyer/internal/AFg1rSDK;", "unregisterClient", "afErrorLog", "Lcom/appsflyer/internal/AFd1zSDK;", "v", "Lcom/appsflyer/internal/AFh1hSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFe1dSDK extends AFe1kSDK<String> {

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK registerClient;

    /* JADX INFO: renamed from: afDebugLog, reason: from kotlin metadata */
    @NotNull
    private final AFg1rSDK unregisterClient;

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFd1zSDK AFLogger;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFi1oSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public AFh1hSDK d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1dSDK(@NotNull AFi1oSDK aFi1oSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1bSDK aFc1bSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFd1zSDK aFd1zSDK) {
        this(aFi1oSDK, aFc1iSDK, aFc1bSDK, aFg1rSDK, aFd1zSDK, null, 32, null);
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return TimeUnit.MINUTES.toMillis(1L);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    public /* synthetic */ AFe1dSDK(AFi1oSDK aFi1oSDK, AFc1iSDK aFc1iSDK, AFc1bSDK aFc1bSDK, AFg1rSDK aFg1rSDK, AFd1zSDK aFd1zSDK, AFh1hSDK aFh1hSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFi1oSDK, aFc1iSDK, aFc1bSDK, aFg1rSDK, aFd1zSDK, (i10 & 32) != 0 ? new AFh1hSDK() : aFh1hSDK);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String p8) throws JSONException {
        LinkedHashMap linkedHashMap;
        AFd1oSDK aFd1oSDK;
        String str;
        Intrinsics.checkNotNullParameter(p8, "");
        AFh1hSDK aFh1hSDK = this.d;
        Map<String, Object> map = aFh1hSDK.f5399d;
        Intrinsics.checkNotNull(map);
        map.put("app_id", this.registerClient.f5258d.f5305d.getPackageName());
        map.put("sdk_version", AFc1iSDK.unregisterClient());
        map.put("app_version_name", this.registerClient.r_().versionName);
        this.unregisterClient.AFKeystoreWrapper(map);
        if (AFj1qSDK.unregisterClient(this.AFLogger.f5305d)) {
            try {
                AFi1pSDK aFi1pSDKAFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper();
                if (aFi1pSDKAFKeystoreWrapper != null) {
                    linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("pia_timestamp", Long.valueOf(aFi1pSDKAFKeystoreWrapper.registerClient));
                    linkedHashMap2.put("ttr_millis", Long.valueOf(aFi1pSDKAFKeystoreWrapper.AFKeystoreWrapper));
                    String str2 = aFi1pSDKAFKeystoreWrapper.unregisterClient;
                    if (str2 != null) {
                        linkedHashMap2.put("pia_token", str2);
                    }
                    String str3 = aFi1pSDKAFKeystoreWrapper.f5423d;
                    if (str3 != null) {
                        linkedHashMap2.put("error_code", str3);
                    }
                    linkedHashMap.put("pia", linkedHashMap2);
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    aFh1hSDK.AFKeystoreWrapper(linkedHashMap);
                }
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.PLAY_INTEGRITY_API, "Error while adding PIA data to payload", th2, true, false, false, false, 96, null);
            }
        } else {
            Map<String, Object> map2 = aFh1hSDK.f5399d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            AFj1iSDK.AFLogger(map2).put("pia_disabled", Boolean.TRUE);
        }
        AFd1sSDK d10 = getD();
        AFh1hSDK aFh1hSDK2 = this.d;
        AFf1fSDK unregisterClient = getUnregisterClient();
        AFd1pSDK<String> aFd1pSDKAFLogger = d10.AFLogger(aFh1hSDK2, (String) AFf1fSDK.unregisterClient(new Object[]{unregisterClient}, -1660886869, 1660886871, System.identityHashCode(unregisterClient)), this.AFLogger);
        Map<String, Object> map3 = this.d.f5399d;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        if (aFd1pSDKAFLogger != null && (aFd1oSDK = aFd1pSDKAFLogger.unregisterClient) != null && (str = aFd1oSDK.f5281d) != null) {
            JSONObject jSONObject = new JSONObject(map3);
            if (jSONObject.has("pia")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("pia");
                if (jSONObject2.has("pia_token")) {
                    jSONObject2.put("pia_token", AFg1bSDK.unregisterClient(jSONObject2.getString("pia_token")));
                }
            }
            AFg1bSDK.registerClient(this + ": preparing data: ", jSONObject);
            AFd1uSDK aFKeystoreWrapper = getAFKeystoreWrapper();
            String string = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            aFKeystoreWrapper.AFKeystoreWrapper(str, string);
        }
        return aFd1pSDKAFLogger;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private AFe1dSDK(@NotNull AFi1oSDK aFi1oSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1bSDK aFc1bSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFh1hSDK aFh1hSDK) {
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFh1hSDK, "");
        AFd1bSDK aFd1bSDK = AFd1bSDK.PLAY_INTEGRITY_API;
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.CONVERSION;
        super(aFd1bSDK, new AFe1zSDK[]{aFd1bSDK2}, aFc1bSDK, "PIA");
        this.AFKeystoreWrapper = aFi1oSDK;
        this.registerClient = aFc1iSDK;
        this.unregisterClient = aFg1rSDK;
        this.AFLogger = aFd1zSDK;
        this.d = aFh1hSDK;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFLogger.add(aFd1bSDK2);
    }
}
