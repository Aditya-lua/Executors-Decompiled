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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001+BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0019J9\u0010\u001b\u001a\u000e\u0012\b\u0012\u0006*\u00020\u00070\u0007\u0018\u00010\u001a2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\u0005\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\"\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/appsflyer/internal/AFe1eSDK;", "Lcom/appsflyer/internal/AFe1lSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "Lcom/appsflyer/share/AFPurchaseDetails;", "p1", "", "", "p2", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "p3", "Lcom/appsflyer/internal/AFj1tSDK;", "p4", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;Lcom/appsflyer/share/AFPurchaseDetails;Ljava/util/Map;Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;Lcom/appsflyer/internal/AFj1tSDK;)V", "", "e", "()Z", "", "force", "()V", "", "", "registerClient", "(Ljava/util/Map;Ljava/lang/String;)V", "(Ljava/util/Map;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1pSDK;", "d", "(Ljava/util/Map;Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "AFLogger", "(Ljava/lang/String;I)V", "v", "Lcom/appsflyer/internal/AFc1bSDK;", "unregisterClient", "Lcom/appsflyer/share/AFPurchaseDetails;", "afDebugLog", "Ljava/util/Map;", "afErrorLog", "Lcom/appsflyer/share/AppsFlyerInAppPurchaseValidationCallback;", "AFKeystoreWrapper", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFj1tSDK;", "AFa1ySDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFe1eSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, null, 16, null);
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFPurchaseDetails, "");
    }

    private final void AFLogger(String p8, int p10) {
        AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback = this.AFKeystoreWrapper;
        if (appsFlyerInAppPurchaseValidationCallback != null) {
            appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(kotlin.collections.k0.m(jt.s.a("error_code", Integer.valueOf(p10)), jt.s.a("error_message", p8)));
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    public final AFd1pSDK<String> d(@NotNull Map<String, Object> p8, @NotNull String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p10, "");
        int i10 = AFa1tSDK.unregisterClient[this.registerClient.getPurchaseType().ordinal()];
        if (i10 == 1) {
            return getD().AFLogger(p8, p10);
        }
        if (i10 == 2) {
            return getD().registerClient(p8, p10);
        }
        throw new jt.l();
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        Object objB;
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
                    appsFlyerInAppPurchaseValidationCallback.onInAppPurchaseValidationError(kotlin.collections.k0.m(jt.s.a("error_code", Integer.valueOf(responseNetwork.getStatusCode())), jt.s.a("error_message", responseNetwork.getBody())));
                    return;
                }
                return;
            }
            try {
                jt.n.Companion companion = jt.n.INSTANCE;
                AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback2 = this.AFKeystoreWrapper;
                if (appsFlyerInAppPurchaseValidationCallback2 != null) {
                    appsFlyerInAppPurchaseValidationCallback2.onInAppPurchaseValidationFinished(JsonUtils.toMap(new JSONObject((String) responseNetwork.getBody())));
                    unit = Unit.f22483a;
                } else {
                    unit = null;
                }
                objB = jt.n.b(unit);
            } catch (Throwable th2) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                objB = jt.n.b(jt.o.a(th2));
            }
            if (jt.n.e(objB) != null) {
                AFLogger("Error while trying to parse JSON response", responseNetwork.getStatusCode());
            }
            jt.n.a(objB);
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final void registerClient(@NotNull Map<String, Object> p8, @Nullable String p10) {
        Intrinsics.checkNotNullParameter(p8, "");
        super.registerClient(p8, p10);
        List listN = kotlin.collections.p.n(this.registerClient.getPurchaseToken(), this.registerClient.getProductId());
        if (!(listN instanceof Collection) || !listN.isEmpty()) {
            Iterator it = listN.iterator();
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
        p8.put("custom_data", (str == null || str.length() == 0) ? kotlin.collections.k0.j() : JsonUtils.toMap(new JSONObject(str)));
    }

    public /* synthetic */ AFe1eSDK(AFc1bSDK aFc1bSDK, AFPurchaseDetails aFPurchaseDetails, Map map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, AFj1tSDK aFj1tSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1bSDK, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback, (i10 & 16) != 0 ? new AFj1oSDK() : aFj1tSDK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFe1eSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback, @NotNull AFj1tSDK aFj1tSDK) {
        super(AFd1bSDK.MANUAL_PURCHASE_VALIDATION, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, null, kotlin.collections.k0.j());
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
