package com.appsflyer.internal;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0013J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0013J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0013J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u001c\u0010\u000eJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010#\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b*\u00020\b2\b\b\u0002\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0013J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\u0013J\u000f\u0010+\u001a\u00020\bH\u0002¢\u0006\u0004\b+\u0010\u0013J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\u0013J\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\u0013J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\u0013J\u000f\u0010/\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\u0013J\u000f\u00101\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u0010\u0013J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0013J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\u0013J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0013J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106¨\u00068"}, m31665d2 = {"Lcom/appsflyer/internal/util/EventUrlResolver;", "", "Lcom/appsflyer/internal/components/IdProvider;", "idProvider", "<init>", "(Lcom/appsflyer/internal/components/IdProvider;)V", "Lcom/appsflyer/internal/model/event/AFEvent;", NotificationCompat.CATEGORY_EVENT, "", "getUrlForEvent", "(Lcom/appsflyer/internal/model/event/AFEvent;)Ljava/lang/String;", "devKey", "timestamp", "getUrlForDdlEvent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/net/Uri$Builder;", "appendSigQueryParam", "(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", "getUrlForViap", "()Ljava/lang/String;", "getUrlForArs", "getUrlForRegister", "getUrlForManualOneTimePurchaseValidation", "getUrlForManualSubscriptionPurchaseValidation", "getUrlForRdMonitor", "getUrlForPlayIntegrityReporting", "onelinkId", "shortLinkId", "getOnelinkUrl", "channelPostfix", "getGcdURL", "(Ljava/lang/String;)Ljava/lang/String;", "appendPackageName", "", "isAdRevenueEvent", "appendBuildNumber", "(Ljava/lang/String;Z)Ljava/lang/String;", "isRegisterEvent", "appendConfiguredChannel", "getLaunchUrl", "getReferrerTrackingUrl", "getAdRevenueUrl", "getFirstLaunchUrl", "getAppsTrackingUrl", "getEventsTrackingUrl", "getArsBilling5", "getViapBilling5", "getDdlUrl", "getManualValidateOneTimePurchaseUrl", "getManualValidateSubscriptionPurchaseUrl", "getRegisterUrl", "getPlayIntegrityUrl", "getOneLinkBaseUrl", "getGcdBaseUrl", "Lcom/appsflyer/internal/components/IdProvider;", "Companion", "sdk_main_prodRelease"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFj1mSDK {

    @NotNull
    public static String AFKeystoreWrapper;

    @NotNull
    public static String AFLogger;

    @NotNull
    private static final String afErrorLog;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static String f7068d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static String f7069e;

    @NotNull
    public static String force;

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final String f7070i;

    @NotNull
    public static final AFa1ySDK registerClient = new AFa1ySDK(null);

    @NotNull
    public static String unregisterClient;

    /* JADX INFO: renamed from: v */
    @NotNull
    public static String f7071v;

    /* JADX INFO: renamed from: w */
    @NotNull
    private final AFc1iSDK f7072w;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0016\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006"}, m31665d2 = {"Lcom/appsflyer/internal/AFj1mSDK$AFa1ySDK;", "", "<init>", "()V", "", "afErrorLog", "Ljava/lang/String;", "registerClient", "unregisterClient", "d", "AFLogger", "AFKeystoreWrapper", "force", "v", "e", "i", "w"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class AFa1ySDK {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private AFa1ySDK() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.appsflyer.internal.AFj1mSDK.AFa1ySDK.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1tSDK.registerClient + "/androidevent?app_id=";
        afErrorLog = str;
        unregisterClient = "https://%sattr.%s/api/v" + str;
        f7068d = "https://%sadrevenue.%s/api/v2/generic/v7.0.1/android?app_id=";
        AFLogger = "https://%sconversions.%s/api/v" + str;
        AFKeystoreWrapper = "https://%slaunches.%s/api/v" + str;
        force = "https://%sinapps.%s/api/v" + str;
        f7071v = "https://%sregister.%s/api/v" + str;
        f7069e = "https://%smonitorsdk.%s/remote-debug/exception-manager";
        f7070i = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    public AFj1mSDK(@NotNull AFc1iSDK aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.f7072w = aFc1iSDK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String AFKeystoreWrapper(String str, boolean z10) {
        return str + (!z10 ? "&buildnumber=7.0.1" : "");
    }

    public static String afInfoLog() {
        String str = String.format(Locale.US, "https://%spia.%s/api/v1.0/pia-android-event?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static String m8926e() {
        String str = String.format(Locale.US, "https://%svalidate-and-log.%s/api/v4.0/android/one_time_purchase/validateAndLog?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static String force() {
        String str = String.format(Locale.US, "https://%svalidate-and-log.%s/api/v4.0/android/subscription/validateAndLog?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static String m8927i() {
        String str = String.format(Locale.US, "https://%sars.%s/api/v2/android/validate_subscription_v2?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: v */
    public static String m8928v() {
        String str = String.format(Locale.US, "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id=", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: w */
    public static String m8929w() {
        String str = String.format(Locale.US, f7071v, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NotNull
    public final String AFLogger(@Nullable String str, @Nullable String str2) {
        String packageName = this.f7072w.f6886d.f6933d.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strAFLogger = this.f7072w.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        if (strAFLogger != null && !StringsKt.m32182p0(strAFLogger)) {
            strAFLogger = "-" + StringsKt.m32183p1(strAFLogger).toString();
        }
        if (strAFLogger == null) {
            strAFLogger = "";
        }
        String string = StringsKt.m32183p1(strAFLogger).toString();
        String str3 = String.format(Locale.US, "https://%sdlsdk.%s/v1.0/android/", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str3, "");
        Uri.Builder builderAppendPath = Uri.parse(str3).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str4 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.mo8697e(LogTag.GENERAL, str4 + " is null at attempt to generate ddl event url", new IllegalStateException(str4 + " is null"), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1nSDK.m8932d(str2 + str, str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.registerClient).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String unregisterClient(String str) {
        return str + this.f7072w.f6886d.f6933d.getPackageName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String AFKeystoreWrapper() {
        String str = String.format(Locale.US, AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static String registerClient() {
        String str = String.format(Locale.US, unregisterClient, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    public final String m8930d(String str, boolean z10) {
        if (z10) {
            return str;
        }
        String strAFLogger = this.f7072w.AFLogger("CHANNEL");
        String str2 = null;
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        if (strAFLogger != null) {
            str2 = "&channel=" + strAFLogger;
        }
        return str + (str2 != null ? str2 : "");
    }

    @NotNull
    public static String AFKeystoreWrapper(@NotNull String str, @Nullable String str2) {
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        String str4 = String.format(Locale.US, "https://%sonelink.%s/shortlink-sdk/v2", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str4, "");
        if (str2 != null) {
            str3 = "?id=" + str2;
        }
        return str4 + "/" + str + str3;
    }

    public static String unregisterClient() {
        String str = String.format(Locale.US, AFLogger, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static String m8924d() {
        String str = String.format(Locale.US, force, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    @NotNull
    public final String AFKeystoreWrapper(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = String.format(Locale.US, "https://%sgcdsdk.%s/install_data/v5.0/", AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2 + this.f7072w.f6886d.f6933d.getPackageName() + str + "?device_id=" + AFb1jSDK.AFLogger(this.f7072w.AFKeystoreWrapper);
    }

    public static String AFLogger() {
        String str = String.format(Locale.US, f7068d, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.m8724d().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
