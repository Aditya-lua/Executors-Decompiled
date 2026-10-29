package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\n\u001a\u00020\fH\u0010¢\u0006\u0004\b\n\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, m31665d2 = {"Lcom/appsflyer/internal/AFf1sSDK;", "Lcom/appsflyer/internal/AFe1kSDK;", "", "Lcom/appsflyer/internal/AFh1nSDK;", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFh1nSDK;Lcom/appsflyer/internal/AFc1bSDK;)V", "Lcom/appsflyer/internal/AFd1pSDK;", "AFLogger", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1pSDK;", "", "e", "()Z", "Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "afWarnLog", "()Lcom/appsflyer/share/attribution/AppsFlyerRequestListener;", "v", "Lcom/appsflyer/internal/AFh1nSDK;", "registerClient", "AFa1vSDK_"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFf1sSDK extends AFe1kSDK<String> {

    /* JADX INFO: renamed from: AFa1vSDK_, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    private final AFh1nSDK registerClient;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFf1sSDK$AFa1vSDK_, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b"}, m31665d2 = {"Lcom/appsflyer/internal/AFf1sSDK$AFa1vSDK_;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFh1nSDK;", "p0", "", "AFLogger", "(Lcom/appsflyer/internal/AFh1nSDK;)Ljava/lang/String;"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String AFLogger(AFh1nSDK p8) {
            try {
                return new URL(p8.f7029i).getHost();
            } catch (MalformedURLException unused) {
                return "";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.appsflyer.internal.AFf1sSDK.AFa1vSDK_.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFf1sSDK(@NotNull AFh1nSDK aFh1nSDK, @NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFh1nSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFe1zSDK aFe1zSDK = aFh1nSDK.AFLoggerLogLevel;
        AFe1zSDK aFe1zSDK2 = aFe1zSDK == null ? AFd1bSDK.CACHED_EVENT : aFe1zSDK;
        Intrinsics.checkNotNullExpressionValue(aFe1zSDK2, "");
        super(aFe1zSDK2, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, aFc1bSDK, aFh1nSDK.f7031w + "-" + Companion.AFLogger(aFh1nSDK), aFh1nSDK.f7031w);
        this.registerClient = aFh1nSDK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AFd1pSDK<String> AFLogger(@NotNull String p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        String strEncodeToString = Base64.encodeToString(this.registerClient.force, 2);
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.CACHE, "cached data: " + strEncodeToString, false, 4, null);
        AFd1uSDK aFKeystoreWrapper = getAFKeystoreWrapper();
        String str = this.registerClient.f7029i;
        Intrinsics.checkNotNull(strEncodeToString);
        aFKeystoreWrapper.AFKeystoreWrapper(str, strEncodeToString);
        return getD().unregisterClient(this.registerClient);
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return this.registerClient.AFLogger;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: e */
    public final boolean mo8803e() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        boolean z10;
        AFe1zSDK aFe1zSDK;
        boolean z11;
        ResponseNetwork responseNetwork;
        if (!super.AFLogger()) {
            Object obj = this.registerClient.AFLoggerLogLevel;
            if (obj == null) {
                obj = AFd1bSDK.CACHED_EVENT;
            }
            if (obj == AFd1bSDK.ARS_VALIDATE && (responseNetwork = ((AFe1kSDK) this).v) != null) {
                Intrinsics.checkNotNull(responseNetwork);
                if (responseNetwork.getStatusCode() != 424) {
                    ResponseNetwork responseNetwork2 = ((AFe1kSDK) this).v;
                    if (this.e == AFd1cSDK.FAILURE) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    aFe1zSDK = this.unregisterClient;
                    if (aFe1zSDK != AFd1bSDK.CONVERSION) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    if (z10) {
                    }
                    return false;
                }
            } else {
                ResponseNetwork responseNetwork3 = ((AFe1kSDK) this).v;
                if (this.e == AFd1cSDK.FAILURE || responseNetwork3 == null || responseNetwork3.getStatusCode() / 500 != 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                aFe1zSDK = this.unregisterClient;
                if (aFe1zSDK != AFd1bSDK.CONVERSION || aFe1zSDK == AFd1bSDK.ATTR) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 || !z11) {
                    return false;
                }
            }
        }
        return true;
    }
}
