package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\n\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0014\u0010\u0013\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcom/appsflyer/internal/AFf1qSDK;", "Lcom/appsflyer/internal/AFf1tSDK;", "", "p0", "Lcom/appsflyer/internal/AFc1bSDK;", "p1", "<init>", "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1bSDK;)V", "Lcom/appsflyer/internal/AFh1pSDK;", "", "d", "(Lcom/appsflyer/internal/AFh1pSDK;)V", "force", "()V", "v", "", "e", "()Z", "registerClient", "unregisterClient", "AFKeystoreWrapper", "AFLogger", "Landroid/content/pm/PackageManager;", "z_", "(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/pm/PackageManager;)V", "i", "Landroid/content/ContentResolver;", "A_", "(Lcom/appsflyer/internal/AFh1pSDK;Landroid/content/ContentResolver;)V", "w", "getEntries", "B_", "(Landroid/content/pm/PackageManager;)Ljava/lang/String;", "Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "Lcom/appsflyer/internal/AFc1eSDK;", "AFLoggerLogLevel", "Lcom/appsflyer/internal/AFc1eSDK;", "AFa1tSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFf1qSDK extends AFf1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int afDebugLog = 1;
    private static char[] afErrorLog;
    private static int afInfoLog;
    private static long afWarnLog;

    /* JADX INFO: renamed from: AFLoggerLogLevel, reason: from kotlin metadata */
    @NotNull
    private final AFc1eSDK unregisterClient;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    private final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFd1zSDK d;

    static {
        valueOf();
        INSTANCE = new Companion(null);
        int i10 = afInfoLog + 45;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1qSDK(@NotNull String str, @NotNull AFc1bSDK aFc1bSDK) {
        super(new AFg1uSDK(), aFc1bSDK, str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.AFKeystoreWrapper = str;
        AFd1zSDK aFd1zSDKValueOf = aFc1bSDK.valueOf();
        Intrinsics.checkNotNullExpressionValue(aFd1zSDKValueOf, "");
        this.d = aFd1zSDKValueOf;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.unregisterClient = androidIdData;
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[0];
        int i10 = afInfoLog + 5;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0) {
            super.force();
            throw null;
        }
        super.force();
        ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1qSDK).v;
        if (responseNetwork != null && responseNetwork.isSuccessful()) {
            int i11 = afDebugLog + 71;
            afInfoLog = i11 % 128;
            if (i11 % 2 != 0) {
                aFf1qSDK.getEntries();
                throw null;
            }
            aFf1qSDK.getEntries();
            afInfoLog = (afDebugLog + 15) % 128;
        }
        return null;
    }

    private final void A_(AFh1pSDK p8, ContentResolver p10) {
        int i10 = (afInfoLog + 33) % 128;
        afDebugLog = i10;
        if (this.unregisterClient.afInfoLog) {
            int i11 = i10 + 107;
            afInfoLog = i11 % 128;
            if (i11 % 2 != 0) {
                p8.AFKeystoreWrapper("deviceTrackingDisabled", "true");
                int i12 = 67 / 0;
            } else {
                p8.AFKeystoreWrapper("deviceTrackingDisabled", "true");
            }
        }
        AFb1lSDK aFb1lSDKH_ = AFb1iSDK.h_(p10);
        if (aFb1lSDKH_ != null) {
            p8.AFKeystoreWrapper("amazon_aid", aFb1lSDKH_.f5235d);
            p8.AFKeystoreWrapper("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
            afDebugLog = (afInfoLog + 93) % 128;
        }
    }

    private final String B_(PackageManager p8) {
        return (String) unregisterClient(new Object[]{this, p8}, -2090306498, 2090306499, System.identityHashCode(this));
    }

    private static void a(int i10, char c10, int i11, Object[] objArr) {
        int i12;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        long[] jArr = new long[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i13 = aFk1qSDK.unregisterClient;
            if (i13 >= i11) {
                break;
            }
            $10 = ($11 + 25) % 128;
            jArr[i13] = (((long) ((char) (((long) afErrorLog[i10 + i13]) ^ 7057235384081779850L))) ^ (((long) i13) * (7057235384081779850L ^ afWarnLog))) ^ ((long) c10);
            aFk1qSDK.unregisterClient = i13 + 1;
        }
        char[] cArr = new char[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i14 = aFk1qSDK.unregisterClient;
            if (i14 >= i11) {
                break;
            }
            int i15 = $10 + 85;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 >> 1;
            } else {
                cArr[i14] = (char) jArr[i14];
                i12 = i14 + 1;
            }
            aFk1qSDK.unregisterClient = i12;
        }
        String str = new String(cArr);
        int i16 = $10 + 27;
        $11 = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void force(AFh1pSDK p8) {
        afDebugLog = (afInfoLog + 9) % 128;
        try {
            p8.AFKeystoreWrapper("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a(Color.red(0), (char) (8240 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 4 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            p8.AFKeystoreWrapper(((String) objArr[0]).intern(), Build.BRAND);
            afInfoLog = (afDebugLog + 95) % 128;
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "Exception while collecting device brand and model.", th2, false, false, false, false, 120, null);
        }
    }

    private final void getEntries() {
        AFLogger aFLogger;
        LogTag logTag;
        int i10;
        int i11 = afInfoLog + 111;
        afDebugLog = i11 % 128;
        if (i11 % 2 == 0) {
            getE().registerClient("sentRegisterRequestToAF", false);
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.UNINSTALL;
            i10 = 5;
        } else {
            getE().registerClient("sentRegisterRequestToAF", true);
            aFLogger = AFLogger.INSTANCE;
            logTag = LogTag.UNINSTALL;
            i10 = 4;
        }
        AFLoggerBase.d$default(aFLogger, logTag, "[register] Successfully registered for Uninstall Tracking", false, i10, null);
    }

    private final void i(AFh1pSDK p8) {
        afInfoLog = (afDebugLog + 105) % 128;
        AFg1rSDK w5 = getW();
        Map<String, Object> map = p8.f5399d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        w5.AFLogger(map);
        p8.f5399d.remove("ivc");
        String str = this.unregisterClient.valueOf;
        if (str == null) {
            afDebugLog = (afInfoLog + 39) % 128;
            return;
        }
        int i10 = afInfoLog + 3;
        afDebugLog = i10 % 128;
        if (i10 % 2 != 0) {
            p8.AFKeystoreWrapper("appUserId", str);
        } else {
            p8.AFKeystoreWrapper("appUserId", str);
            int i11 = 2 / 0;
        }
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = (~((~i11) | i13)) | i12;
        int i15 = ~(i10 | i11);
        int i16 = (i10 * (-375)) + (i11 * (-375)) + ((i14 | i15) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + (((~(i13 | i12)) | i11) * 376);
        if (i16 != 1) {
            return i16 != 2 ? AFKeystoreWrapper(objArr) : unregisterClient(objArr);
        }
        return AFLogger(objArr);
    }

    public static void valueOf() {
        afErrorLog = new char[]{11480, 49039, 2645, 38145, 25026};
        afWarnLog = -3112331823455625267L;
    }

    private final void w(AFh1pSDK p8) {
        afDebugLog = (afInfoLog + 93) % 128;
        AFf1fSDK unregisterClient = getUnregisterClient();
        p8.AFKeystoreWrapper("devkey", (String) AFf1fSDK.unregisterClient(new Object[]{unregisterClient}, -1660886869, 1660886871, System.identityHashCode(unregisterClient)));
        p8.AFKeystoreWrapper("uid", AFb1jSDK.AFLogger(getI().AFKeystoreWrapper));
        p8.AFKeystoreWrapper("af_gcm_token", this.AFKeystoreWrapper);
        p8.AFKeystoreWrapper("launch_counter", String.valueOf(getI().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        p8.AFKeystoreWrapper("sdk", String.valueOf(Build.VERSION.SDK_INT));
        String strAFLogger = getI().AFLogger("CHANNEL");
        if (strAFLogger != null) {
            afDebugLog = (afInfoLog + 87) % 128;
            if (strAFLogger.equals("")) {
                int i10 = afDebugLog;
                int i11 = i10 + 55;
                afInfoLog = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                afInfoLog = (i10 + 49) % 128;
                strAFLogger = null;
            }
        }
        if (strAFLogger != null) {
            int i12 = afDebugLog + 15;
            afInfoLog = i12 % 128;
            if (i12 % 2 == 0) {
                p8.AFKeystoreWrapper("channel", strAFLogger);
            } else {
                p8.AFKeystoreWrapper("channel", strAFLogger);
                throw null;
            }
        }
    }

    private final void z_(AFh1pSDK p8, PackageManager p10) {
        try {
            p8.AFKeystoreWrapper("app_version_code", String.valueOf(getI().r_().versionCode));
            p8.AFKeystoreWrapper("app_version_name", getI().r_().versionName);
            p8.AFKeystoreWrapper("app_name", (String) unregisterClient(new Object[]{this, p10}, -2090306498, 2090306499, System.identityHashCode(this)));
            long j10 = getI().r_().firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            p8.AFKeystoreWrapper("installDate", simpleDateFormat.format(new Date(j10)));
            int i10 = afInfoLog + 27;
            afDebugLog = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "Exception while collecting application version info.", th2, false, false, false, false, 120, null);
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFLogger(@NotNull AFh1pSDK p8) {
        afInfoLog = (afDebugLog + 43) % 128;
        Intrinsics.checkNotNullParameter(p8, "");
        afDebugLog = (afInfoLog + 73) % 128;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void d(@NotNull AFh1pSDK p8) {
        int i10 = afDebugLog + 21;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p8, "");
            super.d(p8);
            Context context = this.d.f5305d;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p8, "");
        super.d(p8);
        Context context2 = this.d.f5305d;
        if (context2 == null) {
            throw new IllegalStateException("Context is not provided, can't send register request");
        }
        PackageManager packageManager = context2.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "");
        z_(p8, packageManager);
        i(p8);
        force(p8);
        ContentResolver contentResolver = context2.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "");
        A_(p8, contentResolver);
        w(p8);
        int i11 = afDebugLog + 83;
        afInfoLog = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFf1tSDK, com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        int i10 = afDebugLog + 107;
        int i11 = i10 % 128;
        afInfoLog = i11;
        boolean z10 = i10 % 2 != 0;
        afDebugLog = (i11 + 33) % 128;
        return z10;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void registerClient(@NotNull AFh1pSDK p8) {
        afInfoLog = (afDebugLog + 9) % 128;
        Intrinsics.checkNotNullParameter(p8, "");
        afDebugLog = (afInfoLog + 21) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if ((r2 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r5.AFKeystoreWrapper("advertiserId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r5.AFKeystoreWrapper("advertiserId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5 = com.appsflyer.internal.AFf1qSDK.afDebugLog + 47;
        com.appsflyer.internal.AFf1qSDK.afInfoLog = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r2 = com.appsflyer.internal.AFf1qSDK.afInfoLog + 25;
        com.appsflyer.internal.AFf1qSDK.afDebugLog = r2 % 128;
     */
    @Override // com.appsflyer.internal.AFf1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(@org.jetbrains.annotations.NotNull com.appsflyer.internal.AFh1pSDK r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFf1qSDK.afDebugLog
            int r0 = r0 + 59
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1qSDK.afInfoLog = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.appsflyer.internal.AFc1iSDK r0 = r4.getI()
            java.lang.String r0 = r0.AFLogger()
            r2 = 84
            int r2 = r2 / 0
            if (r0 == 0) goto L44
            goto L2e
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            com.appsflyer.internal.AFc1iSDK r0 = r4.getI()
            java.lang.String r0 = r0.AFLogger()
            if (r0 == 0) goto L44
        L2e:
            int r2 = com.appsflyer.internal.AFf1qSDK.afInfoLog
            int r2 = r2 + 25
            int r3 = r2 % 128
            com.appsflyer.internal.AFf1qSDK.afDebugLog = r3
            int r2 = r2 % 2
            java.lang.String r3 = "advertiserId"
            if (r2 == 0) goto L40
            r5.AFKeystoreWrapper(r3, r0)
            return
        L40:
            r5.AFKeystoreWrapper(r3, r0)
            throw r1
        L44:
            int r5 = com.appsflyer.internal.AFf1qSDK.afDebugLog
            int r5 = r5 + 47
            int r0 = r5 % 128
            com.appsflyer.internal.AFf1qSDK.afInfoLog = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L51
            return
        L51:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1qSDK.v(com.appsflyer.internal.AFh1pSDK):void");
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void e(@NotNull AFh1pSDK p8) {
        int i10 = afInfoLog + 67;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p8, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(p8, "");
        afInfoLog = (afDebugLog + 111) % 128;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void unregisterClient(@NotNull AFh1pSDK p8) {
        afInfoLog = (afDebugLog + 31) % 128;
        Intrinsics.checkNotNullParameter(p8, "");
        int i10 = afInfoLog + 103;
        afDebugLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFf1qSDK aFf1qSDK = (AFf1qSDK) objArr[0];
        PackageManager packageManager = (PackageManager) objArr[1];
        afInfoLog = (afDebugLog + 119) % 128;
        ApplicationInfo applicationInfo = aFf1qSDK.getI().r_().applicationInfo;
        if (applicationInfo == null) {
            int i10 = afDebugLog + 85;
            afInfoLog = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 3 / 0;
            }
            return "";
        }
        String string = packageManager.getApplicationLabel(applicationInfo).toString();
        int i12 = afDebugLog + 57;
        afInfoLog = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 96 / 0;
        }
        return string;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        int i10 = afDebugLog + 73;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        int i11 = afInfoLog + 47;
        afDebugLog = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        unregisterClient(new Object[]{this}, -1234839013, 1234839013, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void AFKeystoreWrapper(@NotNull AFh1pSDK p8) {
        unregisterClient(new Object[]{this, p8}, -1367939028, 1367939030, System.identityHashCode(this));
    }
}
