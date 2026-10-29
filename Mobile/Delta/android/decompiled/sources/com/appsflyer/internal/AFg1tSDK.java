package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1tSDK implements AFf1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLoggerLogLevel = -1754894492;
    private static int AppsFlyerLib = 0;
    private static byte[] afDebugLog = {114, 125, -100, 112, 127, -119, 117, -124, 100, -120, 116, 113};
    private static int afErrorLog = -2119275651;
    private static int afInfoLog = -929107346;
    private static short[] afWarnLog = null;
    private static int getLevel = 1;

    @NotNull
    private final AFc1bSDK AFKeystoreWrapper;

    @NotNull
    private final AFc1iSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFa1aSDK f5382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFf1fSDK f5383e;

    @NotNull
    private final ScheduledExecutorService force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFg1rSDK f5384i;

    @NotNull
    private final AFc1eSDK registerClient;

    @NotNull
    private final AFi1aSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final AppsFlyerProperties f5385v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFd1zSDK f5386w;

    public AFg1tSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull AFa1aSDK aFa1aSDK, @NotNull AFi1aSDK aFi1aSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFg1rSDK aFg1rSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull ScheduledExecutorService scheduledExecutorService) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(aFa1aSDK, "");
        Intrinsics.checkNotNullParameter(aFi1aSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFg1rSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.AFKeystoreWrapper = aFc1bSDK;
        this.f5382d = aFa1aSDK;
        this.unregisterClient = aFi1aSDK;
        this.AFLogger = aFc1iSDK;
        this.registerClient = aFc1eSDK;
        this.f5386w = aFd1zSDK;
        this.f5384i = aFg1rSDK;
        this.f5383e = aFf1fSDK;
        this.f5385v = appsFlyerProperties;
        this.force = scheduledExecutorService;
    }

    private boolean AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (!aFh1pSDK.AFLogger() && aFh1pSDK.f5402v == null) {
            int i10 = (AppsFlyerLib + 61) % 128;
            getLevel = i10;
            if (aFh1pSDK.f5403w == null) {
                AppsFlyerLib = (i10 + 99) % 128;
                String strAFLogger = this.AFLogger.AFLogger("AF_LAUNCH_PROTECT_ENABLED");
                if (!(strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true)) {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(this.registerClient.setDebugLog);
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Allowing multiple launches within a " + seconds + " second time window.", false, 4, null);
                } else if (AFKeystoreWrapper()) {
                    AppsFlyerRequestListener appsFlyerRequestListener = aFh1pSDK.AFLogger;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        getLevel = (AppsFlyerLib + 39) % 128;
                    }
                    return true;
                }
                this.registerClient.getInstance = System.currentTimeMillis();
            }
        }
        return false;
    }

    private void AFLogger(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        AFc1bSDK aFc1bSDK = this.AFKeystoreWrapper;
        AFh1pSDK aFh1pSDKUnregisterClient = aFh1pSDK.unregisterClient(this.AFLogger.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0));
        Intrinsics.checkNotNullExpressionValue(aFh1pSDKUnregisterClient, "");
        AFa1pSDK aFa1pSDK = new AFa1pSDK(aFc1bSDK, aFh1pSDKUnregisterClient, this.f5382d.d());
        long j10 = 0;
        if (aFh1pSDK.f5402v == null && aFh1pSDK.f5403w == null) {
            for (Referrer referrer : (Referrer[]) this.unregisterClient.unregisterClient.toArray(new Referrer[0])) {
                AppsFlyerLib = (getLevel + 113) % 128;
                if (referrer.getState() == Referrer.State.STARTED) {
                    getLevel = (AppsFlyerLib + 95) % 128;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "Failed to get " + referrer.getSource() + " referrer, wait ...", false, 4, null);
                    j10 = 500L;
                }
            }
            if (this.f5382d.registerClient()) {
                int i10 = getLevel + 15;
                AppsFlyerLib = i10 % 128;
                if (i10 % 2 != 0) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", true, 4, null);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REFERRER, "fetching Facebook deferred AppLink data, wait ...", false, 4, null);
                }
                j10 = 500;
            }
            if (this.f5383e.d()) {
                int i11 = AppsFlyerLib + 5;
                getLevel = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                j10 = 500;
            }
        }
        AFj1iSDK.AFLogger(this.force, aFa1pSDK, j10, TimeUnit.MILLISECONDS);
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AFg1tSDK aFg1tSDK = (AFg1tSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5399d;
        if (!aFg1tSDK.registerClient.afWarnLog) {
            getLevel = (AppsFlyerLib + 9) % 128;
            if (map.get("advertiserId") != null) {
                try {
                    String str = aFg1tSDK.registerClient.force;
                    if (str == null || str.length() == 0) {
                        if (map.remove("android_id") != null) {
                            getLevel = (AppsFlyerLib + 99) % 128;
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "validateGaidAndAndroidId :: removing: android_id", false, 4, null);
                            return null;
                        }
                    }
                } catch (Exception e10) {
                    AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "failed to remove AndroidID key from params; ", e10, false, false, false, false, 120, null);
                }
            }
        }
        return null;
    }

    @NotNull
    private Map<String, Object> unregisterClient(@NotNull Context context, @NotNull AFh1pSDK aFh1pSDK) {
        String str;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        boolean z10 = aFh1pSDK.f5402v == null && aFh1pSDK.f5403w == null;
        Map<String, Object> map = aFh1pSDK.f5399d;
        long time = new Date().getTime();
        Intrinsics.checkNotNull(map);
        Object[] objArr = new Object[1];
        a(TextUtils.getTrimmedLength(""), (short) View.MeasureSpec.getSize(0), (byte) View.resolveSize(0, 0), (-382206900) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1227921695) - TextUtils.indexOf("", "", 0, 0), objArr);
        map.put(((String) objArr[0]).intern(), String.valueOf(time));
        try {
            if (this.f5383e.AFLogger()) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                if (z10) {
                    str = "Launch";
                } else {
                    str = aFh1pSDK.f5402v;
                    AppsFlyerLib = (getLevel + 9) % 128;
                }
                AFLogger.INSTANCE.i(LogTag.GENERAL, "******* sendTrackingWithEvent: " + str, true);
            }
            unregisterClient(context);
            AFc1iSDK aFc1iSDK = this.AFLogger;
            int iAFLogger = aFc1iSDK.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
            if (z10) {
                iAFLogger++;
                aFc1iSDK.AFKeystoreWrapper.d("appsFlyerCount", iAFLogger);
            }
            AFc1iSDK aFc1iSDK2 = this.AFLogger;
            int iAFLogger2 = aFc1iSDK2.AFKeystoreWrapper.AFLogger("appsFlyerInAppEventCount", 0);
            if (!z10) {
                iAFLogger2++;
                aFc1iSDK2.AFKeystoreWrapper.d("appsFlyerInAppEventCount", iAFLogger2);
                AppsFlyerLib = (getLevel + 109) % 128;
            }
            this.f5384i.unregisterClient(map, iAFLogger, iAFLogger2);
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Error while preparing to send event", th2, true, true, true, false, 64, null);
        }
        int i10 = AppsFlyerLib + 95;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 74 / 0;
        }
        return map;
    }

    @Override // com.appsflyer.internal.AFf1aSDK
    public final void d(@NotNull final AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        if (AFKeystoreWrapper(aFh1pSDK)) {
            AppsFlyerLib = (getLevel + 97) % 128;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.registerClient.setDebugLog);
            AFLogger.INSTANCE.d(LogTag.GENERAL, "Blocking multiple consecutive Launch events within " + seconds + " seconds time window", true);
            return;
        }
        final Context context = this.f5386w.f5305d;
        if (context == null) {
            int i10 = AppsFlyerLib + 59;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", false);
                return;
            } else {
                AFLogger.INSTANCE.d(LogTag.ATTRIBUTION, "sendWithEvent - got null context. skipping event/launch.", true);
                return;
            }
        }
        AFf1fSDK aFf1fSDK = this.f5383e;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str != null && str.length() != 0) {
            AFj1iSDK.AFLogger(this.force, new Runnable() { // from class: com.appsflyer.internal.s0
                @Override // java.lang.Runnable
                public final void run() {
                    AFg1tSDK.AFLogger(this.f5518a, aFh1pSDK, context);
                }
            }, 0L, TimeUnit.MILLISECONDS);
            return;
        }
        int i11 = (AppsFlyerLib + 61) % 128;
        getLevel = i11;
        AppsFlyerLib = (i11 + 111) % 128;
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.GENERAL;
        aFLogger.i(logTag, "AppsFlyer dev key is missing! AppsFlyer's SDK cannot send any events without providing the dev key.", true);
        aFLogger.i(logTag, "AppsFlyer will not track this event.", true);
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1pSDK.AFLogger;
        if (appsFlyerRequestListener != null) {
            appsFlyerRequestListener.onError(41, "No dev key");
        }
    }

    private static void a(int i10, short s8, byte b, int i11, int i12, Object[] objArr) {
        int i13;
        boolean z10;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        StringBuilder sb2 = new StringBuilder();
        int i14 = i10 + ((int) (((long) afErrorLog) ^ (-6851507024414479503L)));
        if (i14 == -1) {
            $11 = ($10 + 21) % 128;
            i13 = 1;
        } else {
            $10 = ($11 + 23) % 128;
            i13 = 0;
        }
        if (i13 != 0) {
            byte[] bArr = afDebugLog;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i15 = 0;
                while (i15 < length) {
                    int i16 = $11 + 93;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        bArr2[i15] = (byte) (((long) bArr[i15]) * (-6851507024414479503L));
                    } else {
                        bArr2[i15] = (byte) (((long) bArr[i15]) ^ (-6851507024414479503L));
                        i15++;
                    }
                }
                bArr = bArr2;
            }
            i14 = bArr != null ? (byte) (((byte) (((long) afDebugLog[i12 + ((int) (((long) afInfoLog) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) afErrorLog) ^ (-6851507024414479503L)))) : (short) (((short) (((long) afWarnLog[i12 + ((int) (((long) afInfoLog) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) afErrorLog) ^ (-6851507024414479503L))));
        }
        if (i14 > 0) {
            aFk1rSDK.AFLogger = ((i12 + i14) - 2) + ((int) (((long) afInfoLog) ^ (-6851507024414479503L))) + i13;
            char c10 = (char) (((int) (((long) AFLoggerLogLevel) ^ (-6851507024414479503L))) + i11);
            aFk1rSDK.registerClient = c10;
            sb2.append(c10);
            aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
            byte[] bArr3 = afDebugLog;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $11 = ($10 + 7) % 128;
                for (int i17 = 0; i17 < length2; i17++) {
                    bArr4[i17] = (byte) (((long) bArr3[i17]) ^ (-6851507024414479503L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $11 = ($10 + 37) % 128;
                z10 = true;
            } else {
                z10 = false;
            }
            aFk1rSDK.f5456d = 1;
            while (aFk1rSDK.f5456d < i14) {
                if (z10) {
                    byte[] bArr5 = afDebugLog;
                    int i18 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i18 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((byte) (((byte) (((long) bArr5[i18]) ^ (-6851507024414479503L))) + s8)) ^ b));
                } else {
                    short[] sArr = afWarnLog;
                    int i19 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i19 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((short) (((short) (((long) sArr[i19]) ^ (-6851507024414479503L))) + s8)) ^ b));
                }
                sb2.append(aFk1rSDK.registerClient);
                aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
                aFk1rSDK.f5456d++;
            }
        }
        objArr[0] = sb2.toString();
    }

    private void d(@NotNull AFh1pSDK aFh1pSDK, @NotNull Context context) {
        getLevel = (AppsFlyerLib + 45) % 128;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f5385v.saveProperties();
        if (!this.f5383e.AFLogger()) {
            AFLogger.INSTANCE.i(LogTag.GENERAL, "sendTrackingWith with context: " + context.getClass().getName(), true);
            getLevel = (AppsFlyerLib + 69) % 128;
        }
        aFh1pSDK.AFKeystoreWrapper(unregisterClient(context, aFh1pSDK));
        AFLogger(new Object[]{this, aFh1pSDK}, 1204709251, -1204709251, System.identityHashCode(this));
        AFLogger(aFh1pSDK);
        AppsFlyerLib = (getLevel + 61) % 128;
    }

    private boolean AFKeystoreWrapper() {
        int i10 = getLevel + 43;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0 ? this.registerClient.getInstance > 0 : this.registerClient.getInstance > 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.registerClient.getInstance;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            long j10 = this.registerClient.getInstance;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(new Date(j10));
            long j11 = this.registerClient.onPause;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str2 = simpleDateFormat.format(new Date(j11));
            if (jCurrentTimeMillis < this.registerClient.setDebugLog) {
                int i11 = getLevel + 83;
                AppsFlyerLib = i11 % 128;
                if (i11 % 2 == 0) {
                    if (!this.f5383e.AFLogger()) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.SDK_LIFECYCLE;
                        kotlin.jvm.internal.g0 g0Var = kotlin.jvm.internal.g0.f22559a;
                        String str3 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", Arrays.copyOf(new Object[]{str, str2, Long.valueOf(jCurrentTimeMillis), Long.valueOf(this.registerClient.setDebugLog)}, 4));
                        Intrinsics.checkNotNullExpressionValue(str3, "");
                        AFLoggerBase.i$default(aFLogger, logTag, str3, false, 4, null);
                        return true;
                    }
                } else {
                    this.f5383e.AFLogger();
                    throw null;
                }
            }
            if (this.f5383e.AFLogger()) {
                return false;
            }
            getLevel = (AppsFlyerLib + 59) % 128;
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SDK_LIFECYCLE;
            kotlin.jvm.internal.g0 g0Var2 = kotlin.jvm.internal.g0.f22559a;
            String str4 = String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", Arrays.copyOf(new Object[]{str, str2, Long.valueOf(jCurrentTimeMillis)}, 3));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            AFLoggerBase.i$default(aFLogger2, logTag2, str4, false, 4, null);
            getLevel = (AppsFlyerLib + 13) % 128;
            return false;
        }
        if (this.f5383e.AFLogger()) {
            return false;
        }
        AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Sending first launch for this session!", false, 4, null);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    private static void unregisterClient(Context context) {
        String[] strArr;
        List listK;
        int i10 = AppsFlyerLib + 13;
        getLevel = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 24626).requestedPermissions;
                if (strArr != null) {
                    listK = kotlin.collections.m.j0(strArr);
                } else {
                    listK = null;
                }
            } else {
                strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), Barcode.FORMAT_AZTEC).requestedPermissions;
                if (strArr != null) {
                    listK = kotlin.collections.m.j0(strArr);
                } else {
                    listK = null;
                }
            }
            if (listK == null) {
                getLevel = (AppsFlyerLib + 17) % 128;
                listK = kotlin.collections.p.k();
            }
            if (!listK.contains("android.permission.INTERNET")) {
                AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml", false, 4, null);
            }
            if (!listK.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i11 = getLevel + 31;
                AppsFlyerLib = i11 % 128;
                if (i11 % 2 != 0) {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", true, 5, null);
                } else {
                    AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml", false, 4, null);
                }
            }
            if (Build.VERSION.SDK_INT <= 32 || listK.contains("com.google.android.gms.permission.AD_ID")) {
                return;
            }
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml", false, 4, null);
            int i12 = getLevel + 27;
            AppsFlyerLib = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 89 / 0;
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Exception while validation permissions. ", e10, false, false, false, false, 120, null);
        }
    }

    public static /* synthetic */ Object AFLogger(Object[] objArr, int i10, int i11, int i12) {
        return registerClient(objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFg1tSDK aFg1tSDK, AFh1pSDK aFh1pSDK, Context context) {
        int i10 = getLevel + 107;
        AppsFlyerLib = i10 % 128;
        int i11 = i10 % 2;
        aFg1tSDK.d(aFh1pSDK, context);
        if (i11 != 0) {
            int i12 = 28 / 0;
        }
        getLevel = (AppsFlyerLib + 69) % 128;
    }

    private void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        AFLogger(new Object[]{this, aFh1pSDK}, 1204709251, -1204709251, System.identityHashCode(this));
    }
}
