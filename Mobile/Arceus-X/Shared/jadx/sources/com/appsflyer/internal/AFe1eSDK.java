package com.appsflyer.internal;

import com.appsflyer.sdk_base.util.JsonUtils;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPurchaseType;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001+BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0019J9\u0010\u001b\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00070\u0007\u0018\u00010\u001a2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, m31665d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1lSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "Lcom/appsflyer/share/AFPurchaseDetails;", "p1", "", "", "p2", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "p3", "Lcom/appsflyer/internal/AFj1tSDK;", "p4", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1tSDK;)V", "", "e", "()Z", "", "force", "()V", "", "", "registerClient", "(Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", "d", "(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "AFLogger", "(Ljava/lang/String;I)V", "v", "Lcom/appsflyer/internal/AFc1bSDK;", "unregisterClient", "Lcom/appsflyer/share/AFPurchaseDetails;", "afDebugLog", "Ljava/util/Map;", "afErrorLog", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "AFKeystoreWrapper", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFj1tSDK;", "AFa1ySDK"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFe1eSDK extends AFe1lSDK {

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFj1tSDK d;

    /* JADX INFO: renamed from: afDebugLog, reason: from kotlin metadata */
    @Nullable
    private final Map<String, String> AFLogger;

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @Nullable
    private final AppsFlyerInAppPurchaseValidationCallback AFKeystoreWrapper;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AFPurchaseDetails registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFc1bSDK unregisterClient;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] unregisterClient;

        static {
            int[] iArr = new int[AFPurchaseType.values().length];
            try {
                iArr[AFPurchaseType.SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFPurchaseType.ONE_TIME_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            unregisterClient = iArr;
        }
    }

    public static final class AFa1ySDK extends RuntimeException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 16, null);
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void AFLogger(String p8, int p10) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C7690k0.m31798m(C7352s.m30477a("error_code", Integer.valueOf(p10)), C7352s.m30477a("error_message", p8)));
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    /* JADX INFO: renamed from: d */
    public final AFd1pSDK<String> mo8804d(@NotNull Map<String, Object> p8, @NotNull String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        int i10 = AFa1tSDK.unregisterClient[this.registerClient.getPurchaseType().ordinal()];
        if (i10 == 1) {
            return getD().AFLogger(p8, p10);
        }
        if (i10 == 2) {
            return getD().registerClient(p8, p10);
        }
        throw new C7345l();
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: e */
    public final boolean mo8803e() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        Object objM30460b;
        Unit unit;
        super.force();
        Throwable v5 = getV();
        if (v5 != null && !(v5 instanceof AFe1qSDK)) {
            if (v5 instanceof AFe1uSDK) {
                AFLogger("No dev key", -1);
            } else if (v5 instanceof AFa1ySDK) {
                AFLogger("One or more of provided arguments is empty", -1);
            } else {
                AFLogger("Error while sending request to server", -1);
            }
        }
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
        if (responseNetwork != null) {
            if (responseNetwork.getStatusCode() != 200) {
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback != null) {
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(C7690k0.m31798m(C7352s.m30477a("error_code", Integer.valueOf(responseNetwork.getStatusCode())), C7352s.m30477a("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(JsonUtils.toMap(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.f29331a;
                } else {
                    unit = null;
                }
                objM30460b = C7347n.m30460b(unit);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            if (C7347n.m30463e(objM30460b) != null) {
                AFLogger("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            C7347n.m30459a(objM30460b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1lSDK
    public final void registerClient(@NotNull Map<String, Object> p8, @Nullable String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        super.registerClient(p8, p10);
        List listM31895n = C7699p.m31895n(this.registerClient.getPurchaseToken(), this.registerClient.getProductId());
        if (!(listM31895n instanceof Collection) || !listM31895n.isEmpty()) {
            Iterator it = listM31895n.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    throw new AFa1ySDK();
                }
            }
        }
        p8.put("purchase_token", this.registerClient.getPurchaseToken());
        p8.put("product_id", this.registerClient.getProductId());
        p8.put("purchase_type", this.registerClient.getPurchaseType().getValue());
        Map<String, String> map = this.AFLogger;
        if (map != null && !map.isEmpty()) {
            p8.put("purchase_additional_details", this.AFLogger);
        }
        String str = this.unregisterClient.setAndroidIdData().getSdkVersion;
        p8.put("custom_data", (str == null || str.length() == 0) ? C7690k0.m31795j() : JsonUtils.toMap(new JSONObject(str)));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
      (r7v0 com.appsflyer.internal.AFc1bSDK)
      (r8v0 com.appsflyer.share.AFPurchaseDetails)
      (r9v0 java.util.Map)
      (r10v0 com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback)
      (wrap com.appsflyer.internal.AFj1tSDK:?: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap com.appsflyer.internal.AFj1tSDK:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:2) call: com.appsflyer.internal.AFj1oSDK.<init>():void type: CONSTRUCTOR) : (r11v0 com.appsflyer.internal.AFj1tSDK))
     A[MD:(com.appsflyer.internal.AFc1bSDK, com.appsflyer.share.AFPurchaseDetails, java.util.Map<java.lang.String, java.lang.String>, com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback, com.appsflyer.internal.AFj1tSDK):void (m)] (LINE:3) call: com.appsflyer.internal.AFe1eSDK.<init>(com.appsflyer.internal.AFc1bSDK, com.appsflyer.share.AFPurchaseDetails, java.util.Map, com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback, com.appsflyer.internal.AFj1tSDK):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ AFe1eSDK(AFc1bSDK aFc1bSDK, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1tSDK aFj1tSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i10 & 16) != 0 ? new AFj1oSDK() : aFj1tSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1eSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1tSDK aFj1tSDK) {
        super(AFd1bSDK.MANUAL_PURCHASE_VALIDATION, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, null, C7690k0.m31795j());
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
        Intrinsics.checkNotNullParameter(aFj1tSDK, "");
        this.unregisterClient = aFc1bSDK;
        this.registerClient = aFPurchaseDetails;
        this.AFLogger = map;
        this.AFKeystoreWrapper = appsFlyerInAppPurchaseValidationCallback;
        this.d = aFj1tSDK;
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NotNull
    public final String registerClient(@NotNull Map<String, Object> p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        return this.d.registerClient();
    }
}
