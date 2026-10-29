package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.C1759R;
import com.appsflyer.sdk_base.logger.LogTag;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1wSDK implements AFd1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AFLoggerLogLevel = null;
    private static int afInfoLog = 1;
    private static int afWarnLog;

    /* JADX INFO: renamed from: d */
    private static final int f6927d;
    private int AFKeystoreWrapper;

    /* JADX INFO: renamed from: e */
    private final AFc1bSDK f6928e;

    /* JADX INFO: renamed from: i */
    private boolean f6929i;

    /* JADX INFO: renamed from: v */
    private boolean f6930v;

    /* JADX INFO: renamed from: w */
    private AppsFlyerProperties f6931w;
    private List<String> AFLogger = new ArrayList();
    private boolean unregisterClient = true;

    @NonNull
    private final Map<String, Object> registerClient = new HashMap();
    private SecureRandom force = new SecureRandom();

    static {
        force();
        f6927d = 98166;
        int i10 = afWarnLog + 43;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public AFd1wSDK(AFc1bSDK aFc1bSDK) {
        this.f6931w = aFc1bSDK.registerClient();
        String strAFLogger = aFc1bSDK.AFLogger().AFLogger("AF_DISABLE_REMOTE_DEBUGGER");
        this.f6930v = true ^ (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false);
        this.AFKeystoreWrapper = 0;
        this.f6929i = false;
        this.f6928e = aFc1bSDK;
    }

    @NonNull
    private synchronized Map<String, Object> AFLoggerLogLevel() {
        Map<String, Object> map;
        int i10 = afWarnLog + 101;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            this.registerClient.put("data", this.AFLogger);
            afDebugLog();
            throw null;
        }
        this.registerClient.put("data", this.AFLogger);
        afDebugLog();
        map = this.registerClient;
        afInfoLog = (afWarnLog + 59) % 128;
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m8790a(int[] iArr, int i10, Object[] objArr) {
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AFLoggerLogLevel;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            loop0: while (true) {
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break loop0;
                    }
                    int i12 = $11 + 115;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        iArr3[i11] = (int) (((long) iArr2[i11]) * 8546810173735754695L);
                    } else {
                        iArr3[i11] = (int) (((long) iArr2[i11]) ^ 8546810173735754695L);
                        i11++;
                    }
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFLoggerLogLevel;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                iArr6[i13] = (int) (((long) iArr5[i13]) ^ 8546810173735754695L);
                i13++;
                $11 = ($10 + 51) % 128;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1oSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i14 = aFk1oSDK.AFKeystoreWrapper;
            if (i14 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            $10 = ($11 + 3) % 128;
            int i15 = iArr[i14];
            char c10 = (char) (i15 >> 16);
            cArr[0] = c10;
            char c11 = (char) i15;
            cArr[1] = c11;
            char c12 = (char) (iArr[i14 + 1] >> 16);
            cArr[2] = c12;
            char c13 = (char) iArr[i14 + 1];
            cArr[3] = c13;
            aFk1oSDK.AFLogger = (c10 << 16) + c11;
            aFk1oSDK.f7083d = (c12 << 16) + c13;
            AFk1oSDK.unregisterClient(iArr4);
            for (int i16 = 0; i16 < 16; i16++) {
                $11 = ($10 + 33) % 128;
                int i17 = aFk1oSDK.AFLogger ^ iArr4[i16];
                aFk1oSDK.AFLogger = i17;
                int iM8959d = AFk1oSDK.m8959d(i17) ^ aFk1oSDK.f7083d;
                int i18 = aFk1oSDK.AFLogger;
                aFk1oSDK.AFLogger = iM8959d;
                aFk1oSDK.f7083d = i18;
            }
            int i19 = aFk1oSDK.AFLogger;
            int i20 = aFk1oSDK.f7083d;
            aFk1oSDK.AFLogger = i20;
            aFk1oSDK.f7083d = i19;
            int i21 = i19 ^ iArr4[16];
            aFk1oSDK.f7083d = i21;
            int i22 = i20 ^ iArr4[17];
            aFk1oSDK.AFLogger = i22;
            cArr[0] = (char) (i22 >>> 16);
            cArr[1] = (char) i22;
            cArr[2] = (char) (i21 >>> 16);
            cArr[3] = (char) i21;
            AFk1oSDK.unregisterClient(iArr4);
            int i23 = aFk1oSDK.AFKeystoreWrapper;
            cArr2[i23 * 2] = cArr[0];
            cArr2[(i23 * 2) + 1] = cArr[1];
            cArr2[(i23 * 2) + 2] = cArr[2];
            cArr2[(i23 * 2) + 3] = cArr[3];
            aFk1oSDK.AFKeystoreWrapper = i23 + 2;
        }
    }

    private synchronized void afDebugLog() {
        this.AFLogger = new ArrayList();
        this.AFKeystoreWrapper = 0;
        int i10 = afWarnLog + 19;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private boolean afErrorLog() {
        if (!this.f6930v || (!this.unregisterClient && !this.f6929i)) {
            afWarnLog = (afInfoLog + 95) % 128;
            return false;
        }
        int i10 = afWarnLog + 15;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 43 / 0;
        }
        return true;
    }

    private boolean afInfoLog() {
        afInfoLog = (afWarnLog + 81) % 128;
        boolean zAFKeystoreWrapper = this.f6928e.AFKeystoreWrapper().AFKeystoreWrapper("participantInProxy");
        int i10 = afInfoLog + C1759R.styleable.AppCompatTheme_windowMinWidthMinor;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 49 / 0;
        }
        return zAFKeystoreWrapper;
    }

    private void afWarnLog() {
        registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: e */
    private synchronized void m8798e() {
        afWarnLog = (afInfoLog + 11) % 128;
        if (this.f6929i) {
            return;
        }
        this.f6929i = true;
        try {
            AFLogger("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            afInfoLog = (afWarnLog + 13) % 128;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8964e(LogTag.PROXY, "Error while starting remote debugger", th2, true, true, true);
        }
    }

    public static void force() {
        AFLoggerLogLevel = new int[]{-568377693, 1688322947, 854413037, -687779850, -1810683974, 1583969886, -2000849430, -146928909, 707207527, -2090776958, -563356009, 1806852058, -1348460850, 177728571, -1217440324, -910513204, -1775435922, 1154080255};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object registerClient(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (i10 * 50) + (i11 * (-97)) + (((~(i13 | i14)) | (~(i13 | i10))) * 98) + (((~(i14 | (~i10))) | i13 | (~(i10 | i12))) * (-49)) + (((~(i10 | i11)) | (~(i12 | i13))) * 49);
        int i16 = 1;
        if (i15 == 1) {
            return m8791d(objArr);
        }
        if (i15 == 2) {
            AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
            afWarnLog = (afInfoLog + 39) % 128;
            aFd1wSDK.f6928e.AFKeystoreWrapper().AFLogger("participantInProxy");
            afWarnLog = (afInfoLog + 59) % 128;
            return null;
        }
        if (i15 != 3) {
            AFd1wSDK aFd1wSDK2 = (AFd1wSDK) objArr[0];
            float fFloatValue = ((Number) objArr[1]).floatValue();
            afWarnLog = (afInfoLog + 61) % 128;
            double d10 = fFloatValue;
            if (d10 >= 1.0d) {
                return Boolean.TRUE;
            }
            if (d10 <= 0.0d) {
                return Boolean.FALSE;
            }
            if (aFd1wSDK2.m8800w() > fFloatValue) {
                return Boolean.FALSE;
            }
            afInfoLog = (afWarnLog + 115) % 128;
            return Boolean.TRUE;
        }
        String str = (String) objArr[0];
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) objArr[1];
        int i17 = (afInfoLog + 123) % 128;
        afWarnLog = i17;
        if (stackTraceElementArr == null) {
            int i18 = i17 + 57;
            afInfoLog = i18 % 128;
            if (i18 % 2 != 0) {
                return new String[]{str};
            }
            String[] strArr = new String[0];
            strArr[1] = str;
            return strArr;
        }
        String[] strArr2 = new String[stackTraceElementArr.length + 1];
        strArr2[0] = str;
        while (i16 < stackTraceElementArr.length) {
            int i19 = afWarnLog + 73;
            afInfoLog = i19 % 128;
            if (i19 % 2 == 0) {
                strArr2[i16] = stackTraceElementArr[i16].toString();
                i16 += 50;
            } else {
                strArr2[i16] = stackTraceElementArr[i16].toString();
                i16++;
            }
        }
        return strArr2;
    }

    /* JADX INFO: renamed from: v */
    private static String m8799v() {
        int i10 = (afWarnLog + 57) % 128;
        afInfoLog = i10;
        int i11 = i10 + 13;
        afWarnLog = i11 % 128;
        if (i11 % 2 == 0) {
            return "7.0.1";
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    private float m8800w() {
        float fNextFloat;
        int i10 = afWarnLog + 91;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            fNextFloat = this.force.nextFloat();
            int i11 = 72 / 0;
        } else {
            fNextFloat = this.force.nextFloat();
        }
        int i12 = afWarnLog + 33;
        afInfoLog = i12 % 128;
        if (i12 % 2 != 0) {
            return fNextFloat;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, String str2) {
        afWarnLog = (afInfoLog + 115) % 128;
        AFLogger("server_request", str, str2);
        int i10 = afInfoLog + 51;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFd1uSDK
    public final boolean AFLogger() {
        afInfoLog = (afWarnLog + 23) % 128;
        boolean zM8795d = m8795d(AFKeystoreWrapper(this.f6928e.mo8753i().unregisterClient.AFLogger), AFKeystoreWrapper(this.f6928e.mo8753i().unregisterClient.f6978d));
        if (!zM8795d) {
            registerClient();
            mo8786d();
            afWarnLog = (afInfoLog + 25) % 128;
            return zM8795d;
        }
        int i10 = afInfoLog + 49;
        afWarnLog = i10 % 128;
        if (i10 % 2 == 0) {
            m8798e();
            return zM8795d;
        }
        m8798e();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x0028 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #2 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0018, B:18:0x0028, B:13:0x0021, B:16:0x0024, B:24:0x0036, B:26:0x0056, B:31:0x0062, B:25:0x003a, B:9:0x001c, B:23:0x0035), top: B:40:0x0001, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0032 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0032, please report this as an issue */
    @Override // com.appsflyer.internal.AFd1uSDK
    /* JADX INFO: renamed from: d */
    public final synchronized void mo8786d() {
        int i10;
        try {
            int i11 = afWarnLog;
            afInfoLog = (i11 + 81) % 128;
            if (!this.f6929i) {
                int i12 = i11 + 123;
                afInfoLog = i12 % 128;
                if (i12 % 2 != 0) {
                    if (!this.unregisterClient) {
                        i10 = i11 + 17;
                        afInfoLog = i10 % 128;
                        if (i10 % 2 != 0) {
                            return;
                        } else {
                            throw null;
                        }
                    }
                    throw th;
                }
                int i13 = 80 / 0;
                if (!this.unregisterClient) {
                    i10 = i11 + 17;
                    afInfoLog = i10 % 128;
                    if (i10 % 2 != 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
                throw th;
                throw th;
            }
            this.f6929i = false;
            this.unregisterClient = false;
            try {
                AFLogger("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
                afWarnLog = (afInfoLog + 31) % 128;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.m8964e(LogTag.PROXY, "Error while stopping remote debugger", th2, true, true, true);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    /* JADX INFO: renamed from: i */
    public final boolean mo8788i() {
        int i10 = (afWarnLog + 61) % 128;
        afInfoLog = i10;
        boolean z10 = this.f6929i;
        afWarnLog = (i10 + 63) % 128;
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void unregisterClient() {
        try {
            int i10 = afInfoLog + 13;
            afWarnLog = i10 % 128;
            if (i10 % 2 != 0) {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 1;
            } else {
                this.registerClient.clear();
                this.AFLogger.clear();
                this.AFKeystoreWrapper = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007b, code lost:
    
        if (r7 == null) goto L11;
     */
    @Override // com.appsflyer.internal.AFd1uSDK
    /* JADX INFO: renamed from: v_ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8789v_(String str, PackageManager packageManager) {
        final AFd1vSDK aFd1vSDKM8785d;
        int i10 = afWarnLog + 73;
        afInfoLog = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Map<String, Object> map = (Map) registerClient(new Object[]{this, str}, 1483898607, -1483898606, System.identityHashCode(this));
                AFf1fSDK aFf1fSDKAppsFlyerLib = this.f6928e.AppsFlyerLib();
                aFd1vSDKM8785d = this.f6928e.unregisterClient().m8785d(map, (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib)));
                int i11 = 40 / 0;
                if (aFd1vSDKM8785d == null) {
                    AFLogger.INSTANCE.m8963e(LogTag.PROXY, "Could not send proxy data: request is null", new NullPointerException("request was null"), false, false);
                    return;
                }
                this.f6928e.mo8751d().execute(new Runnable() { // from class: com.appsflyer.internal.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        aFd1vSDKM8785d.unregisterClient();
                    }
                });
                afInfoLog = (afWarnLog + 17) % 128;
                return;
            }
            Map<String, Object> map2 = (Map) registerClient(new Object[]{this, str}, 1483898607, -1483898606, System.identityHashCode(this));
            AFf1fSDK aFf1fSDKAppsFlyerLib2 = this.f6928e.AppsFlyerLib();
            aFd1vSDKM8785d = this.f6928e.unregisterClient().m8785d(map2, (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib2}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib2)));
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8963e(LogTag.PROXY, "Could not send proxy data", th2, false, false);
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper(String str, int i10, String str2) {
        int i11 = afInfoLog + 123;
        afWarnLog = i11 % 128;
        if (i11 % 2 != 0) {
            String[] strArr = new String[5];
            strArr[0] = String.valueOf(i10);
            strArr[0] = str2;
            AFLogger("server_response", str, strArr);
        } else {
            AFLogger("server_response", str, String.valueOf(i10), str2);
        }
        int i12 = afInfoLog + 119;
        afWarnLog = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 52 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFKeystoreWrapper() {
        int i10 = (afInfoLog + 105) % 128;
        afWarnLog = i10;
        this.f6930v = false;
        int i11 = i10 + 71;
        afInfoLog = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void unregisterClient(boolean z10) {
        afInfoLog = (afWarnLog + 121) % 128;
        this.f6928e.AFKeystoreWrapper().registerClient("participantInProxy", z10);
        int i10 = afWarnLog + 89;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 31 / 0;
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3) {
        try {
            Map<String, Object> map = this.registerClient;
            Object[] objArr = new Object[1];
            m8790a(new int[]{579646829, 1366893693, -1057920183, -376234262}, 5 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
            map.put(((String) objArr[0]).intern(), Build.BRAND);
            this.registerClient.put("model", Build.MODEL);
            this.registerClient.put("platform", "Android");
            this.registerClient.put("platform_version", Build.VERSION.RELEASE);
            if (str != null) {
                try {
                    afInfoLog = (afWarnLog + 121) % 128;
                    if (str.length() > 0) {
                        int i10 = afWarnLog + 119;
                        afInfoLog = i10 % 128;
                        if (i10 % 2 == 0) {
                            this.registerClient.put("advertiserId", str);
                            int i11 = 57 / 0;
                        } else {
                            this.registerClient.put("advertiserId", str);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (str2 != null && str2.length() > 0) {
                int i12 = afWarnLog + 37;
                afInfoLog = i12 % 128;
                if (i12 % 2 != 0) {
                    this.registerClient.put("imei", str2);
                } else {
                    this.registerClient.put("imei", str2);
                    throw null;
                }
            }
            if (str3 != null && str3.length() > 0) {
                this.registerClient.put("android_id", str3);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    /* JADX INFO: renamed from: d */
    public final void mo8787d(String str, String... strArr) {
        int i10 = afWarnLog + 87;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            AFLogger("public_api_call", str, strArr);
            afInfoLog = (afWarnLog + 97) % 128;
        } else {
            AFLogger("public_api_call", str, strArr);
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void AFLogger(String str, String str2) {
        int i10 = afWarnLog + 115;
        afInfoLog = i10 % 128;
        if (i10 % 2 == 0) {
            AFLogger(null, str, str2);
        } else {
            AFLogger(null, str, str2);
        }
    }

    /* JADX INFO: renamed from: d */
    private static /* synthetic */ Object m8791d(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        int i10 = afWarnLog + 5;
        afInfoLog = i10 % 128;
        if (i10 % 2 != 0) {
            aFd1wSDK.m8792d(str, aFd1wSDK.f6928e.setAndroidIdData());
            return aFd1wSDK.AFLoggerLogLevel();
        }
        aFd1wSDK.m8792d(str, aFd1wSDK.f6928e.setAndroidIdData());
        aFd1wSDK.AFLoggerLogLevel();
        throw null;
    }

    private synchronized void AFLogger(String str, String str2, String str3, String str4) {
        int i10 = afWarnLog + 117;
        afInfoLog = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.registerClient.put("sdk_version", str);
                if (str2 != null) {
                    int i11 = afWarnLog + 119;
                    afInfoLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("devkey", str2);
                        }
                    } else {
                        str2.length();
                        throw null;
                    }
                }
                if (str3 != null) {
                    int i12 = afInfoLog + 81;
                    afWarnLog = i12 % 128;
                    if (i12 % 2 == 0) {
                        if (str3.length() > 0) {
                            this.registerClient.put("originalAppsFlyerId", str3);
                        }
                    } else {
                        str3.length();
                        throw null;
                    }
                }
                if (str4 != null) {
                    afWarnLog = (afInfoLog + 89) % 128;
                    if (str4.length() > 0) {
                        this.registerClient.put("uid", str4);
                    }
                }
            } else {
                this.registerClient.put("sdk_version", str);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final void registerClient(Throwable th2) {
        String message;
        Throwable cause = th2.getCause();
        String simpleName = th2.getClass().getSimpleName();
        if (cause == null) {
            int i10 = afInfoLog + 121;
            afWarnLog = i10 % 128;
            if (i10 % 2 == 0) {
                message = th2.getMessage();
            } else {
                th2.getMessage();
                throw null;
            }
        } else {
            message = cause.getMessage();
        }
        AFLogger("exception", simpleName, (String[]) registerClient(new Object[]{message, cause == null ? th2.getStackTrace() : cause.getStackTrace()}, -1008260537, 1008260540, (int) System.currentTimeMillis()));
        int i11 = afInfoLog + 17;
        afWarnLog = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:9:0x0016, B:11:0x0025, B:18:0x0036, B:28:0x0060, B:30:0x006a), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0050 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0004, B:9:0x0016, B:11:0x0025, B:18:0x0036, B:28:0x0060, B:30:0x006a), top: B:43:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:7:0x0010, B:10:0x001e, B:15:0x0030, B:16:0x0033, B:20:0x0042, B:22:0x0048, B:23:0x0050, B:25:0x0053, B:27:0x0059, B:32:0x0076, B:34:0x007c, B:35:0x0084), top: B:42:0x0002 }] */
    /* JADX INFO: renamed from: d */
    private synchronized void m8793d(String str, String str2, String str3, String str4) {
        int i10;
        int i11;
        try {
            if (str != null) {
                int i12 = afInfoLog + 9;
                afWarnLog = i12 % 128;
                if (i12 % 2 != 0) {
                    str.length();
                    throw null;
                }
                if (str.length() > 0) {
                    afInfoLog = (afWarnLog + 3) % 128;
                    this.registerClient.put("app_id", str);
                    afWarnLog = (afInfoLog + 27) % 128;
                }
                if (str2 != null) {
                    i11 = afWarnLog + 55;
                    afInfoLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("app_version", str2);
                        }
                    } else {
                        throw null;
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.registerClient.put("channel", str3);
                    afWarnLog = (afInfoLog + 53) % 128;
                }
                if (str4 != null) {
                    i10 = afWarnLog + 107;
                    afInfoLog = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (str4.length() > 0) {
                            this.registerClient.put("preInstall", str4);
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                if (str2 != null) {
                    i11 = afWarnLog + 55;
                    afInfoLog = i11 % 128;
                    if (i11 % 2 != 0) {
                        if (str2.length() > 0) {
                            this.registerClient.put("app_version", str2);
                        }
                    } else {
                        throw null;
                    }
                }
                if (str3 != null) {
                    this.registerClient.put("channel", str3);
                    afWarnLog = (afInfoLog + 53) % 128;
                }
                if (str4 != null) {
                    i10 = afWarnLog + 107;
                    afInfoLog = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (str4.length() > 0) {
                            this.registerClient.put("preInstall", str4);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            throw th;
        } catch (Throwable unused) {
        }
    }

    private boolean AFKeystoreWrapper(String str) {
        int i10 = (afInfoLog + 5) % 128;
        afWarnLog = i10;
        if (str == null) {
            return true;
        }
        afInfoLog = (i10 + 25) % 128;
        if (str.trim().length() == 0) {
            return true;
        }
        return str.equals(this.f6928e.AFLogger().m8769r_().versionName);
    }

    @Override // com.appsflyer.internal.AFd1uSDK
    public final synchronized void registerClient() {
        afInfoLog = (afWarnLog + 51) % 128;
        this.unregisterClient = false;
        unregisterClient();
        afDebugLog();
        afWarnLog = (afInfoLog + 63) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    private static AFh1cSDK AFKeystoreWrapper(AFh1aSDK aFh1aSDK) {
        AFh1gSDK aFh1gSDK;
        AFh1cSDK aFh1cSDK;
        int i10;
        int i11 = afWarnLog;
        int i12 = i11 + 93;
        int i13 = i12 % 128;
        afInfoLog = i13;
        if (i12 % 2 == 0) {
            int i14 = 20 / 0;
            if (aFh1aSDK != null) {
                aFh1gSDK = aFh1aSDK.registerClient;
                if (aFh1gSDK != null) {
                    aFh1cSDK = aFh1gSDK.unregisterClient;
                    i10 = i13 + 51;
                    afWarnLog = i10 % 128;
                    if (i10 % 2 == 0) {
                        return aFh1cSDK;
                    }
                    throw null;
                }
            }
        } else if (aFh1aSDK != null) {
            aFh1gSDK = aFh1aSDK.registerClient;
            if (aFh1gSDK != null) {
                aFh1cSDK = aFh1gSDK.unregisterClient;
                i10 = i13 + 51;
                afWarnLog = i10 % 128;
                if (i10 % 2 == 0) {
                    return aFh1cSDK;
                }
                throw null;
            }
        }
        afInfoLog = (i11 + 1) % 128;
        return null;
    }

    private synchronized void AFLogger(String str, String str2, String... strArr) {
        String string;
        if (afErrorLog()) {
            int i10 = afWarnLog + 79;
            afInfoLog = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (this.AFKeystoreWrapper < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_7.0.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(jCurrentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_7.0.1 ");
                        sb3.append(strJoin);
                        string = sb3.toString();
                    }
                    int length = this.AFKeystoreWrapper + (string.length() << 1);
                    int i11 = f6927d;
                    boolean z10 = false;
                    if (length > i11) {
                        string = string.substring(0, (i11 - this.AFKeystoreWrapper) / 2);
                        z10 = true;
                    }
                    this.AFLogger.add(string);
                    this.AFKeystoreWrapper += string.length() << 1;
                    if (z10) {
                        afInfoLog = (afWarnLog + 49) % 128;
                        this.AFLogger.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                        this.AFKeystoreWrapper += 138;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private Map<String, Object> registerClient(String str) {
        return (Map) registerClient(new Object[]{this, str}, 1483898607, -1483898606, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m8792d(String str, AFc1eSDK aFc1eSDK) {
        try {
            String string = this.f6931w.getString("remote_debug_static_data");
            this.registerClient.clear();
            if (string != null) {
                try {
                    this.registerClient.putAll(AFg1dSDK.unregisterClient(new JSONObject(string)));
                    afInfoLog = (afWarnLog + 121) % 128;
                } catch (Throwable unused) {
                }
            } else {
                AFKeystoreWrapper(this.f6928e.AFLogger().AFLogger(), aFc1eSDK.AFLoggerLogLevel, aFc1eSDK.force);
                StringBuilder sb2 = new StringBuilder("7.0.1.");
                sb2.append(AFa1tSDK.unregisterClient);
                String string2 = sb2.toString();
                AFf1fSDK aFf1fSDKAppsFlyerLib = this.f6928e.AppsFlyerLib();
                AFLogger(string2, (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib)), this.f6931w.getString("KSAppsFlyerId"), AFb1jSDK.AFLogger(this.f6928e.AFLogger().AFKeystoreWrapper));
                try {
                    int i10 = this.f6928e.AFLogger().m8769r_().versionCode;
                    String strAFLogger = this.f6928e.AFLogger().AFLogger("CHANNEL");
                    if (strAFLogger != null) {
                        int i11 = afInfoLog + 15;
                        afWarnLog = i11 % 128;
                        if (i11 % 2 == 0) {
                            if (strAFLogger.equals("")) {
                                strAFLogger = null;
                            }
                        } else {
                            strAFLogger.equals("");
                            throw null;
                        }
                    }
                    m8793d(str, String.valueOf(i10), strAFLogger, this.f6931w.getString("preInstallName"));
                    afWarnLog = (afInfoLog + 77) % 128;
                } catch (Throwable unused2) {
                }
                this.f6931w.set("remote_debug_static_data", new JSONObject(this.registerClient).toString());
            }
            this.registerClient.put("launch_counter", String.valueOf(this.f6928e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0)));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean AFLogger(@NonNull AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        if (aFh1cSDK.equals(aFh1cSDK2)) {
            afWarnLog = (afInfoLog + 79) % 128;
            return afInfoLog();
        }
        boolean zBooleanValue = ((Boolean) registerClient(new Object[]{this, Float.valueOf(aFh1cSDK.AFKeystoreWrapper)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
        unregisterClient(zBooleanValue);
        afInfoLog = (afWarnLog + 33) % 128;
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: d */
    private synchronized boolean m8795d(AFh1cSDK aFh1cSDK, AFh1cSDK aFh1cSDK2) {
        try {
            if (aFh1cSDK == null) {
                registerClient(new Object[]{this}, -811614036, 811614038, System.identityHashCode(this));
                return false;
            }
            if (TimeUnit.SECONDS.toMillis(aFh1cSDK.AFLogger) <= AFh1cSDK.registerClient()) {
                return false;
            }
            afInfoLog = (afWarnLog + 93) % 128;
            if (this.f6928e.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) > aFh1cSDK.unregisterClient) {
                return false;
            }
            if (!AFLogger(aFh1cSDK, aFh1cSDK2)) {
                afWarnLog = (afInfoLog + 45) % 128;
                return false;
            }
            if (!AFKeystoreWrapper(aFh1cSDK.d)) {
                return false;
            }
            if (!m8796d(aFh1cSDK.i)) {
                afInfoLog = (afWarnLog + 57) % 128;
                return false;
            }
            int i10 = afWarnLog + 73;
            afInfoLog = i10 % 128;
            if (i10 % 2 != 0) {
                return true;
            }
            int i11 = 72 / 0;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    private static boolean m8796d(String str) {
        int i10 = afInfoLog + 75;
        afWarnLog = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
            if (str != null) {
                if (str.trim().length() != 0) {
                    new AFd1ySDK();
                    return AFd1ySDK.registerClient(m8799v(), str);
                }
            }
        } else if (str != null) {
            if (str.trim().length() != 0) {
                new AFd1ySDK();
                return AFd1ySDK.registerClient(m8799v(), str);
            }
        }
        int i12 = afInfoLog + 41;
        afWarnLog = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 68 / 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m8794d(float f10) {
        return ((Boolean) registerClient(new Object[]{this, Float.valueOf(f10)}, 830139978, -830139978, System.identityHashCode(this))).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    private static String[] m8797d(String str, StackTraceElement[] stackTraceElementArr) {
        return (String[]) registerClient(new Object[]{str, stackTraceElementArr}, -1008260537, 1008260540, (int) System.currentTimeMillis());
    }
}
