package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u0017\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0018\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0014\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020&8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020,8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00106\u001a\u0002018\u0005X\u0085\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0019\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00108"}, m31665d2 = {"Lcom/appsflyer/internal/AFf1tSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "Lcom/appsflyer/internal/AFh1pSDK;", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "p2", "<init>", "(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1bSDK;Ljava/lang/String;)V", "Lcom/appsflyer/internal/AFd1pSDK;", "AFLogger", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "e", "()Z", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "", "d", "(Lcom/appsflyer/internal/AFh1pSDK;)V", "registerClient", "unregisterClient", "AFKeystoreWrapper", "v", "force", "Lcom/appsflyer/internal/AFh1pSDK;", "Lcom/appsflyer/internal/AFf1hSDK;", "Lcom/appsflyer/internal/AFf1hSDK;", "Lcom/appsflyer/internal/AFd1jSDK;", "afInfoLog", "Lcom/appsflyer/internal/AFd1jSDK;", "Lcom/appsflyer/internal/AFf1eSDK;", "Lcom/appsflyer/internal/AFf1eSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "afDebugLog", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFc1iSDK;", "AppsFlyerLib", "()Lcom/appsflyer/internal/AFc1iSDK;", "i", "Lcom/appsflyer/internal/AFc1kSDK;", "afErrorLog", "Lcom/appsflyer/internal/AFc1kSDK;", "getLevel", "()Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFg1rSDK;", "valueOf", "Lcom/appsflyer/internal/AFg1rSDK;", "values", "()Lcom/appsflyer/internal/AFg1rSDK;", "w", "Lcom/appsflyer/internal/AFe1cSDK;", "Lcom/appsflyer/internal/AFe1cSDK;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class AFf1tSDK extends AFe1kSDK<String> {

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK i;

    /* JADX INFO: renamed from: afDebugLog, reason: from kotlin metadata */
    @NotNull
    private final AFd1zSDK d;

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK e;

    /* JADX INFO: renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final AFd1jSDK unregisterClient;

    /* JADX INFO: renamed from: afWarnLog, reason: from kotlin metadata */
    @NotNull
    private final AFf1eSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFh1pSDK registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFf1hSDK AFLogger;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    private final AFg1rSDK w;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    @NotNull
    private final AFe1cSDK v;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 com.appsflyer.internal.AFh1pSDK)
      (r2v0 com.appsflyer.internal.AFc1bSDK)
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
     A[MD:(com.appsflyer.internal.AFh1pSDK, com.appsflyer.internal.AFc1bSDK, java.lang.String):void (m)] (LINE:1) call: com.appsflyer.internal.AFf1tSDK.<init>(com.appsflyer.internal.AFh1pSDK, com.appsflyer.internal.AFc1bSDK, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AFf1tSDK(AFh1pSDK aFh1pSDK, AFc1bSDK aFc1bSDK, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFh1pSDK, aFc1bSDK, (i10 & 4) != 0 ? null : str);
    }

    public void AFKeystoreWrapper(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        this.w.registerClient(p8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String p8) {
        AFh1gSDK aFh1gSDK;
        AFi1zSDK aFi1zSDK;
        Intrinsics.checkNotNullParameter(p8, "");
        mo8849d(this.registerClient);
        if (this.registerClient.f7027d.containsKey("meta")) {
            AFh1aSDK aFh1aSDK = this.AFLogger.unregisterClient.AFLogger;
            if (AFh1pSDK.unregisterClient((aFh1aSDK == null || (aFh1gSDK = aFh1aSDK.registerClient) == null || (aFi1zSDK = aFh1gSDK.AFKeystoreWrapper) == null) ? 1.0d : aFi1zSDK.AFLogger)) {
                this.registerClient.f7027d.remove("meta");
            }
        }
        AFd1pSDK<String> aFd1pSDKAFLogger = getD().AFLogger(this.registerClient, p8, this.d);
        AFe1cSDK aFe1cSDK = this.v;
        String string = toString();
        Map<String, ? extends Object> map = this.registerClient.f7027d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFe1cSDK.registerClient(string, aFd1pSDKAFLogger, map);
        return aFd1pSDKAFLogger;
    }

    @NotNull
    /* JADX INFO: renamed from: AppsFlyerLib, reason: from getter */
    public final AFc1iSDK getI() {
        return this.i;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return this.registerClient.AFLogger;
    }

    /* JADX INFO: renamed from: d */
    public void mo8849d(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        try {
            try {
                AFLogger(p8);
                registerClient(p8);
                AFKeystoreWrapper(p8);
                unregisterClient(p8);
                mo8851v(p8);
                mo8850e(p8);
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.QUEUE, "Error while collecting payload params", th2, true, true, false, false, 64, null);
            }
            if (p8.mo8887d()) {
                AFf1fSDK unregisterClient = getUnregisterClient();
                p8.AFKeystoreWrapper((Map) AFf1fSDK.unregisterClient(new Object[]{unregisterClient, p8.f7027d}, 1953197941, -1953197940, System.identityHashCode(unregisterClient)));
                AFf1fSDK unregisterClient2 = getUnregisterClient();
                p8.AFKeystoreWrapper((Map) AFf1fSDK.unregisterClient(new Object[]{unregisterClient2, p8.f7027d}, 389111715, -389111715, System.identityHashCode(unregisterClient2)));
            }
            p8.AFKeystoreWrapper(getUnregisterClient().AFKeystoreWrapper());
            boolean z10 = this.AFLogger.contains(AFd1bSDK.LAUNCH) || this.AFLogger.contains(AFd1bSDK.CONVERSION);
            if (getW() && z10) {
                p8.unregisterClient(this.i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0));
            }
            if (p8.registerClient()) {
                Map<String, Object> map = p8.f7027d;
                Intrinsics.checkNotNullExpressionValue(map, "");
                Map<String, Object> mapAFLogger = AFj1iSDK.AFLogger(map);
                AFd1jSDK aFd1jSDK = this.unregisterClient;
                HostMeta hostMeta = new HostMeta(aFd1jSDK.m8779d(), aFd1jSDK.registerClient(), AFd1jSDK.f6905d == null ? AFd1dSDK.DEFAULT : AFd1dSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", hostMeta.name);
                AFd1dSDK aFd1dSDK = hostMeta.method;
                if (aFd1dSDK != AFd1dSDK.DEFAULT) {
                    jSONObject.put("method", aFd1dSDK.unregisterClient);
                }
                String str = hostMeta.prefix;
                if (str != null && !StringsKt.m32182p0(str)) {
                    jSONObject.put("prefix", hostMeta.prefix);
                }
                mapAFLogger.put("host", jSONObject);
            }
            String strAFLogger = this.i.AFLogger("AF_PREINSTALL_DISABLED");
            if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false) {
                Map<String, Object> map2 = p8.f7027d;
                Intrinsics.checkNotNullExpressionValue(map2, "");
                AFj1iSDK.AFLogger(map2).put("preinstall_disabled", Boolean.TRUE);
            }
            AFf1eSDK aFf1eSDK = this.AFKeystoreWrapper;
            Map<String, Object> map3 = p8.f7027d;
            Intrinsics.checkNotNullExpressionValue(map3, "");
            AFe1zSDK aFe1zSDKAFKeystoreWrapper = p8.AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(aFe1zSDKAFKeystoreWrapper, "");
            aFf1eSDK.mo8825d(map3, aFe1zSDKAFKeystoreWrapper);
        } catch (Throwable th3) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.QUEUE, "Error while preparing to send event", th3, true, true, false, false, 64, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: e */
    public boolean mo8803e() {
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: getLevel, reason: from getter */
    public final AFc1kSDK getE() {
        return this.e;
    }

    public void registerClient(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        AFg1rSDK aFg1rSDK = this.w;
        Map<String, Object> map = p8.f7027d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFg1rSDK.mo8883d(map);
    }

    public void unregisterClient(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        this.w.AFKeystoreWrapper(p8);
    }

    /* JADX INFO: renamed from: v */
    public void mo8851v(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        this.w.mo8882d(p8);
    }

    @NotNull
    /* JADX INFO: renamed from: values, reason: from getter */
    public final AFg1rSDK getW() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public AFf1tSDK(@NotNull AFh1pSDK aFh1pSDK, @NotNull AFc1bSDK aFc1bSDK, @Nullable String str) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFe1zSDK aFe1zSDKAFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFe1zSDKAFKeystoreWrapper, "");
        super(aFe1zSDKAFKeystoreWrapper, AFf1rSDK.unregisterClient, aFc1bSDK, str);
        this.registerClient = aFh1pSDK;
        AFf1hSDK aFf1hSDKMo8753i = aFc1bSDK.mo8753i();
        Intrinsics.checkNotNullExpressionValue(aFf1hSDKMo8753i, "");
        this.AFLogger = aFf1hSDKMo8753i;
        AFd1jSDK level = aFc1bSDK.getLevel();
        Intrinsics.checkNotNullExpressionValue(level, "");
        this.unregisterClient = level;
        AFf1eSDK oaidData = aFc1bSDK.setOaidData();
        Intrinsics.checkNotNullExpressionValue(oaidData, "");
        this.AFKeystoreWrapper = oaidData;
        AFd1zSDK aFd1zSDKValueOf = aFc1bSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1zSDKValueOf, "");
        this.d = aFd1zSDKValueOf;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.i = aFc1iSDKAFLogger;
        AFc1kSDK aFc1kSDKAFKeystoreWrapper = aFc1bSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAFKeystoreWrapper, "");
        this.e = aFc1kSDKAFKeystoreWrapper;
        AFg1rSDK aFg1rSDKForce = aFc1bSDK.force();
        Intrinsics.checkNotNullExpressionValue(aFg1rSDKForce, "");
        this.w = aFg1rSDKForce;
        this.v = new AFe1cSDK(getAFKeystoreWrapper());
        if (C7693m.m31838G(AFf1rSDK.AFKeystoreWrapper, this.unregisterClient)) {
            return;
        }
        if (aFh1pSDK.afWarnLog <= 0) {
            AFe1zSDK aFe1zSDK = this.unregisterClient;
            AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
            if (aFe1zSDK != aFd1bSDK) {
                Intrinsics.checkNotNullParameter(aFd1bSDK, "");
                this.AFLogger.add(aFd1bSDK);
                return;
            }
            return;
        }
        if (this.unregisterClient == AFd1bSDK.ATTR) {
            AFd1bSDK aFd1bSDK2 = AFd1bSDK.CONVERSION;
            Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
            this.AFLogger.add(aFd1bSDK2);
        } else {
            AFd1bSDK aFd1bSDK3 = AFd1bSDK.CONVERSION;
            Intrinsics.checkNotNullParameter(aFd1bSDK3, "");
            this.AFKeystoreWrapper.add(aFd1bSDK3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: e */
    public void mo8850e(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        AFg1rSDK aFg1rSDK = this.w;
        Map<String, Object> map = p8.f7027d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        aFg1rSDK.unregisterClient(map);
    }

    public void AFLogger(@NotNull AFh1pSDK p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        this.w.AFLogger(p8);
    }
}
