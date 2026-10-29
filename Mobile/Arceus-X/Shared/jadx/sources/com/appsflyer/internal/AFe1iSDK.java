package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p213j9.C7089c;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p374q8.C10480a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)*B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\t\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\t\u001a\u00020\u0013*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\t\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0015J\u000f\u0010\u000f\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u000f\u0010\u0017R\u0014\u0010\u000f\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010'\u001a\u00020$8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010\u0019\u001a\u00020\r8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010\u001c\u001a\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015"}, m31665d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "Lcom/appsflyer/internal/AFe1ySDK;", "Lcom/appsflyer/internal/AFh1qSDK;", "Lcom/appsflyer/internal/AFc1bSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFc1bSDK;)V", "Landroid/content/Context;", "", "d", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "p1", "", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;)Z", "registerClient", "AFLogger", "(I)Z", "", "", "(Lcom/appsflyer/internal/AFh1qSDK;Ljava/lang/String;)V", "()Z", "Lcom/appsflyer/internal/AFd1cSDK;", "()Lcom/appsflyer/internal/AFd1cSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "i", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "v", "Lcom/appsflyer/internal/AFc1iSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "e", "Lcom/appsflyer/internal/AFc1eSDK;", "force", "Lcom/appsflyer/internal/AFh1qSDK;", "unregisterClient", "", "afErrorLog", "Ljt/h;", "AFKeystoreWrapper", "afInfoLog", "AFa1vSDK", "AFa1tSDK"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFe1iSDK extends AFe1ySDK<AdvertisingIdData> {

    /* JADX INFO: renamed from: afErrorLog, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC7341h AFKeystoreWrapper;

    /* JADX INFO: renamed from: afInfoLog, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC7341h i;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final AFc1eSDK d;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final AdvertisingIdData unregisterClient;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final AFd1zSDK registerClient;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFc1iSDK AFLogger;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1iSDK$AFa1tSDK, reason: from toString */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0013"}, m31665d2 = {"Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1iSDK$AFa1tSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final /* data */ class FetchGaidData {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public FetchGaidData() {
            this(null, null, false, null, 15, null);
        }

        public static /* synthetic */ FetchGaidData copy$default(FetchGaidData fetchGaidData, String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fetchGaidData.advertisingId;
            }
            if ((i10 & 2) != 0) {
                bool = fetchGaidData.isLimitAdTrackingEnabled;
            }
            if ((i10 & 4) != 0) {
                z10 = fetchGaidData.advertisingIdWithGps;
            }
            if ((i10 & 8) != 0) {
                sb2 = fetchGaidData.gaidError;
            }
            return fetchGaidData.copy(str, bool, z10, sb2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final FetchGaidData copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            return new FetchGaidData(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FetchGaidData)) {
                return false;
            }
            FetchGaidData fetchGaidData = (FetchGaidData) other;
            return Intrinsics.m31980c(this.advertisingId, fetchGaidData.advertisingId) && Intrinsics.m31980c(this.isLimitAdTrackingEnabled, fetchGaidData.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == fetchGaidData.advertisingIdWithGps && Intrinsics.m31980c(this.gaidError, fetchGaidData.gaidError);
        }

        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            return ((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.advertisingIdWithGps)) * 31) + this.gaidError.hashCode();
        }

        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z10) {
            this.advertisingIdWithGps = z10;
        }

        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public FetchGaidData(@Nullable String str, @Nullable Boolean bool, boolean z10, @NotNull StringBuilder gaidError) {
            Intrinsics.checkNotNullParameter(gaidError, "gaidError");
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z10;
            this.gaidError = gaidError;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
          (wrap java.lang.Boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
          (wrap boolean:?: TERNARY null = ((wrap int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
          (wrap java.lang.StringBuilder:?: TERNARY null = ((wrap int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap java.lang.StringBuilder:0x0016: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:7) call: java.lang.StringBuilder.<init>():void type: CONSTRUCTOR) : (r5v0 java.lang.StringBuilder))
         A[MD:(java.lang.String, java.lang.Boolean, boolean, java.lang.StringBuilder):void (m)] (LINE:8) call: com.appsflyer.internal.AFe1iSDK.AFa1tSDK.<init>(java.lang.String, java.lang.Boolean, boolean, java.lang.StringBuilder):void type: THIS */
        public /* synthetic */ FetchGaidData(String str, Boolean bool, boolean z10, StringBuilder sb2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new StringBuilder() : sb2);
        }
    }

    @Metadata(m31664d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, m31665d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "sdk_main_prodRelease"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class AFa1zSDK implements CloudDevCallback {
        final /* synthetic */ FetchGaidData $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1zSDK(FetchGaidData fetchGaidData, CountDownLatch countDownLatch) {
            this.$fetchGaidData = fetchGaidData;
            this.$latch = countDownLatch;
        }

        public final void onError(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Could not fetch GAID using CloudDevSdk: " + reason, false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(Map<String, String> kinds) {
            Intrinsics.checkNotNullParameter(kinds, "kinds");
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1iSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.FETCH_ADVERTISING_ID, new AFe1zSDK[0], "FetchAdvertisingIdTask");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFd1zSDK aFd1zSDKValueOf = aFc1bSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1zSDKValueOf, "");
        this.registerClient = aFd1zSDKValueOf;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.AFLogger = aFc1iSDKAFLogger;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.d = androidIdData;
        this.unregisterClient = new AdvertisingIdData(null, null, null, null, null, null, null, null, 255, null);
        this.AFKeystoreWrapper = C7342i.m30456b(new Function0() { // from class: com.appsflyer.internal.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(AFe1iSDK.registerClient(this.f7121a));
            }
        });
        this.i = C7342i.m30456b(new Function0() { // from class: com.appsflyer.internal.h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AFe1iSDK.m8811d(this.f7123a));
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final boolean m8811d(AFe1iSDK aFe1iSDK) {
        return Boolean.parseBoolean(aFe1iSDK.AFLogger.AFLogger("com.appsflyer.enable_instant_plays"));
    }

    /* JADX INFO: renamed from: e */
    private static boolean m8812e() {
        String str;
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            if (th2 instanceof ClassNotFoundException) {
                str = "CloudDevSdk not found";
            } else {
                str = "Unexpected exception while checking if running in cloud environment: " + th2.getMessage();
            }
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final long registerClient(AFe1iSDK aFe1iSDK) {
        Long lT;
        String strAFLogger = aFe1iSDK.AFLogger.AFLogger("com.appsflyer.fetch_ids.timeout");
        if (strAFLogger == null || (lT = StringsKt.m32118t(strAFLogger)) == null) {
            return 1000L;
        }
        return lT.longValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private final boolean AFLogger(int p8) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.ADVERTISING_ID;
        AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (m8812e()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.registerClient.f6933d;
            Intrinsics.checkNotNull(context);
            if (cloudDevSdk.isCloudEnvironment(context)) {
                FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.registerClient.f6933d;
                    Intrinsics.checkNotNull(context2);
                    cloudDevSdk2.request(context2, C7697o.m31878d("gaid"), new AFa1zSDK(fetchGaidData, countDownLatch));
                    countDownLatch.await(((Number) this.AFKeystoreWrapper.getValue()).longValue(), TimeUnit.MILLISECONDS);
                    if (fetchGaidData.getGaidError().length() > 0) {
                        m8809d(this.unregisterClient, fetchGaidData.getGaidError().toString());
                    }
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
                        StringBuilder gaidError = fetchGaidData.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (fetchGaidData.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (fetchGaidData.getGaidError().length() > 0) {
                            m8809d(this.unregisterClient, fetchGaidData.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                String advertisingId = fetchGaidData.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AdvertisingIdData advertisingIdData = this.unregisterClient;
                advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                advertisingIdData.isLimited = bool;
                Boolean bool2 = Boolean.TRUE;
                advertisingIdData.isEnabled = bool2;
                advertisingIdData.isGaidWithGps = bool;
                advertisingIdData.isGaidWithSamsungCloudDev = bool2;
                advertisingIdData.retry = Boolean.valueOf(p8 != 2);
                return true;
            }
        }
        AFLoggerBase.i$default(aFLogger, logTag, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    private static int m8808d(Context p8) {
        try {
            return C7089c.m29849o().mo29854g(p8);
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0134 A[LOOP:0: B:7:0x001f->B:50:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0138 A[EDGE_INSN: B:58:0x0138->B:51:0x0138 BREAK  A[LOOP:0: B:7:0x001f->B:50:0x0134], SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        Boolean boolIsLimitAdTrackingEnabled;
        Boolean boolValueOf;
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.d.setAndroidIdData) {
            AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFd1cSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z13 = false;
        for (int i10 = 2; i10 > 0; i10--) {
            if (((Boolean) this.i.getValue()).booleanValue() && AFLogger(i10)) {
                AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "GAID fetched using Samsung Cloud dev SDK", false, 4, null);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.ADVERTISING_ID;
                AFLoggerBase.i$default(aFLogger, logTag, "Trying to fetch GAID...", false, 4, null);
                FetchGaidData fetchGaidData = new FetchGaidData(null, null, false, null, 15, null);
                Context context = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context);
                int iM8808d = m8808d(context);
                Context context2 = this.registerClient.f6933d;
                Intrinsics.checkNotNull(context2);
                if (registerClient(context2, fetchGaidData)) {
                    AdvertisingIdData advertisingIdData = this.unregisterClient;
                    advertisingIdData.advertisingId = fetchGaidData.getAdvertisingId();
                    advertisingIdData.isLimited = fetchGaidData.isLimitAdTrackingEnabled();
                    boolIsLimitAdTrackingEnabled = fetchGaidData.isLimitAdTrackingEnabled();
                    if (boolIsLimitAdTrackingEnabled != null) {
                        boolValueOf = Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue());
                    } else {
                        boolValueOf = null;
                    }
                    advertisingIdData.isEnabled = boolValueOf;
                    advertisingIdData.isGaidWithGps = Boolean.valueOf(fetchGaidData.getAdvertisingIdWithGps());
                    advertisingIdData.isGaidWithSamsungCloudDev = Boolean.FALSE;
                    if (i10 != 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    advertisingIdData.retry = Boolean.valueOf(z10);
                    z11 = true;
                } else {
                    String strAFLogger = this.AFLogger.AFLogger("AF_ENABLE_GP_SERVICE_FALLBACK");
                    if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true) {
                        Context context3 = this.registerClient.f6933d;
                        Intrinsics.checkNotNull(context3);
                        if (m8810d(context3, fetchGaidData)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                    String string = fetchGaidData.getGaidError().toString();
                    if (!(string == null || StringsKt.m32182p0(string))) {
                        string = iM8808d + ": " + StringsKt.m32183p1(string).toString();
                    }
                    m8809d(this.unregisterClient, string);
                    if (z12) {
                        AdvertisingIdData advertisingIdData2 = this.unregisterClient;
                        advertisingIdData2.advertisingId = fetchGaidData.getAdvertisingId();
                        advertisingIdData2.isLimited = fetchGaidData.isLimitAdTrackingEnabled();
                        boolIsLimitAdTrackingEnabled = fetchGaidData.isLimitAdTrackingEnabled();
                        if (boolIsLimitAdTrackingEnabled != null) {
                            boolValueOf = Boolean.valueOf(!boolIsLimitAdTrackingEnabled.booleanValue());
                        } else {
                            boolValueOf = null;
                        }
                        advertisingIdData2.isEnabled = boolValueOf;
                        advertisingIdData2.isGaidWithGps = Boolean.valueOf(fetchGaidData.getAdvertisingIdWithGps());
                        advertisingIdData2.isGaidWithSamsungCloudDev = Boolean.FALSE;
                        if (i10 != 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        advertisingIdData2.retry = Boolean.valueOf(z10);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    AFLoggerBase.v$default(aFLogger, logTag, "GAID fetched using GMS", false, 4, null);
                } else {
                    AFLoggerBase.v$default(aFLogger, logTag, "Failed to fetch GAID", false, 4, null);
                    z13 = false;
                }
                if (!z13) {
                    break;
                }
            }
            z13 = true;
            if (!z13) {
                break;
                break;
            }
        }
        this.d.updateServerUninstallToken = this.unregisterClient;
        Boolean boolValueOf2 = Boolean.valueOf(z13);
        Boolean bool = Boolean.FALSE;
        AFd1cSDK aFd1cSDK = C7699p.m31895n(boolValueOf2, bool, bool).contains(Boolean.TRUE) ? AFd1cSDK.SUCCESS : AFd1cSDK.FAILURE;
        AFc1eSDK aFc1eSDK = this.d;
        AFd1nSDK aFd1nSDK = new AFd1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFLoggerBase.v$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "QUEUE: FetchAdvertisingIdTask: took " + aFd1nSDK.registerClient + "ms", false, 4, null);
        aFc1eSDK.registerClient(aFd1nSDK);
        return aFd1cSDK;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m8810d(Context p8, FetchGaidData p10) {
        try {
            AFb1kSDK.AFa1tSDK aFa1tSDKRegisterClient = AFb1kSDK.registerClient(p8);
            p10.setAdvertisingId(aFa1tSDKRegisterClient.f6862d);
            p10.setLimitAdTrackingEnabled(Boolean.valueOf(aFa1tSDKRegisterClient.AFLogger));
            String advertisingId = p10.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                return true;
            }
            p10.getGaidError().append("emptyOrNull (bypass) |");
            return true;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, "Failed to fetch GAID: " + th2.getMessage(), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = p10.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFLoggerBase.i$default(aFLogger, logTag, localizedMessage, false, 4, null);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m8809d(AdvertisingIdData advertisingIdData, String str) {
        if (str == null) {
            return;
        }
        String str2 = advertisingIdData.gaidError;
        if (str2 != null) {
            String str3 = str2 + " | " + str;
            if (str3 != null) {
                str = str3;
            }
        }
        advertisingIdData.gaidError = str;
    }

    @Override // com.appsflyer.internal.AFe1ySDK
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long mo8802d() {
        return ((Number) this.AFKeystoreWrapper.getValue()).longValue();
    }

    private final boolean registerClient(Context p8, FetchGaidData p10) {
        try {
            C10480a.a aVarM40279a = C10480a.m40279a(p8);
            if (aVarM40279a != null) {
                p10.setAdvertisingId(aVarM40279a.m40286a());
                p10.setLimitAdTrackingEnabled(Boolean.valueOf(aVarM40279a.m40287b()));
                p10.setAdvertisingIdWithGps(true);
                String advertisingId = p10.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p10.getGaidError().append("emptyOrNull |");
                }
                return true;
            }
            p10.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.ADVERTISING_ID;
            AFLoggerBase.e$default(aFLogger, logTag, "Google Play Services is missing " + th2.getMessage(), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = p10.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFLoggerBase.i$default(aFLogger, logTag, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }
}
