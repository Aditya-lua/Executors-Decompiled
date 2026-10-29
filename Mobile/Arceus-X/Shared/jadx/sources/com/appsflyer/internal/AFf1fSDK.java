package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.OptionalFeaturesValidator;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1fSDK {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: e */
    private static int f6964e = 1;
    private static int force;

    /* JADX INFO: renamed from: v */
    private static char[] f6965v = {63555, 63508, 63517, 63515, 63504, 63505, 63514, 63517, 63512, 63514, 63519, 63488};
    Map<String, Object> AFKeystoreWrapper;

    @NonNull
    private final OptionalFeaturesValidator AFLogger;

    /* JADX INFO: renamed from: d */
    private long f6966d;

    /* JADX INFO: renamed from: i */
    private volatile String f6967i;

    @NonNull
    private final AFd1zSDK registerClient;
    private boolean unregisterClient = false;

    /* JADX INFO: renamed from: w */
    private volatile boolean f6968w = false;

    public AFf1fSDK(@NonNull AFd1zSDK aFd1zSDK, @NonNull OptionalFeaturesValidator optionalFeaturesValidator) {
        this.registerClient = aFd1zSDK;
        this.AFLogger = optionalFeaturesValidator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFf1fSDK aFf1fSDK = (AFf1fSDK) objArr[0];
        int i10 = f6964e + 17;
        force = i10 % 128;
        int i11 = i10 % 2;
        String str = aFf1fSDK.f6967i;
        if (i11 != 0) {
            throw null;
        }
        int i12 = f6964e + 83;
        force = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: a */
    private static void m8826a(int[] iArr, String str, boolean z10, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        int i10 = $10;
        int i11 = i10 + 37;
        $11 = i11 % 128;
        Object bytes = str2;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            $11 = (i10 + 51) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = f6965v;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i16 = 0; i16 < length; i16++) {
                cArr2[i16] = (char) (((long) cArr[i16]) ^ (-221298424148002701L));
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i13];
        System.arraycopy(cArr, i12, cArr3, 0, i13);
        if (bArr != null) {
            char[] cArr4 = new char[i13];
            aFk1mSDK.f7082d = 0;
            char c10 = 0;
            while (true) {
                int i17 = aFk1mSDK.f7082d;
                if (i17 >= i13) {
                    break;
                }
                if (bArr[i17] == 1) {
                    int i18 = $11 + 81;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        cArr4[i17] = (char) ((cArr3[i17] % 2) - c10);
                    } else {
                        cArr4[i17] = (char) (((cArr3[i17] * 2) + 1) - c10);
                    }
                } else {
                    cArr4[i17] = (char) ((cArr3[i17] * 2) - c10);
                }
                c10 = cArr4[i17];
                aFk1mSDK.f7082d = i17 + 1;
            }
            cArr3 = cArr4;
        }
        if (i15 > 0) {
            int i19 = $10 + 9;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                char[] cArr5 = new char[i13];
                System.arraycopy(cArr3, 1, cArr5, 1, i13);
                System.arraycopy(cArr5, 0, cArr3, i13 * i15, i15);
                System.arraycopy(cArr5, i15, cArr3, 0, i13 >>> i15);
            } else {
                char[] cArr6 = new char[i13];
                System.arraycopy(cArr3, 0, cArr6, 0, i13);
                int i20 = i13 - i15;
                System.arraycopy(cArr6, 0, cArr3, i20, i15);
                System.arraycopy(cArr6, i15, cArr3, 0, i20);
            }
        }
        if (z10) {
            char[] cArr7 = new char[i13];
            aFk1mSDK.f7082d = 0;
            while (true) {
                int i21 = aFk1mSDK.f7082d;
                if (i21 >= i13) {
                    break;
                }
                cArr7[i21] = cArr3[(i13 - i21) - 1];
                aFk1mSDK.f7082d = i21 + 1;
            }
            cArr3 = cArr7;
        }
        if (i14 > 0) {
            aFk1mSDK.f7082d = 0;
            while (true) {
                int i22 = aFk1mSDK.f7082d;
                if (i22 >= i13) {
                    break;
                }
                cArr3[i22] = (char) (cArr3[i22] - iArr[2]);
                aFk1mSDK.f7082d = i22 + 1;
                $11 = ($10 + 103) % 128;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    private static AFf1cSDK m8828e() {
        AFf1cSDK aFf1cSDK = new AFf1cSDK();
        int i10 = force + 123;
        f6964e = i10 % 128;
        if (i10 % 2 != 0) {
            return aFf1cSDK;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static /* synthetic */ Object registerClient(Object[] objArr) {
        try {
            try {
                Object[] objArr2 = {(Map) objArr[1], ((AFf1fSDK) objArr[0]).registerClient.f6933d};
                Map map = AFa1bSDK.getInstance;
                Object declaredConstructor = map.get(1578612921);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1bSDK.AFLogger((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 63903), 124 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 37 - TextUtils.getTrimmedLength(""))).getDeclaredConstructor(Map.class, Context.class);
                    map.put(1578612921, declaredConstructor);
                }
                Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
                int i10 = f6964e + 63;
                force = i10 % 128;
                if (i10 % 2 == 0) {
                    return objNewInstance;
                }
                throw null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            AFLogger.INSTANCE.m8963e(LogTag.ANTI_FRAUD, "AFCksmV3: reflection init failed", th3, false, false);
            return new HashMap();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (i10 * (-563)) + (i11 * 565) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + ((~(i12 | i13 | i11)) * 1128) + (((~(i10 | i11)) | (~(i13 | i15))) * 564);
        if (i16 != 1) {
            return i16 != 2 ? registerClient(objArr) : AFLogger(objArr);
        }
        AFc1hSDK aFc1hSDK = new AFc1hSDK((Map) objArr[1], ((AFf1fSDK) objArr[0]).registerClient.f6933d);
        f6964e = (force + 73) % 128;
        return aFc1hSDK;
    }

    /* JADX INFO: renamed from: v */
    private boolean m8829v() {
        Map<String, Object> map = this.AFKeystoreWrapper;
        if (map != null && !map.isEmpty()) {
            f6964e = (force + 53) % 128;
            return true;
        }
        int i10 = force + 85;
        f6964e = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: w */
    private long m8830w() {
        long j10;
        int i10 = f6964e;
        int i11 = i10 + 111;
        force = i11 % 128;
        if (i11 % 2 != 0) {
            j10 = this.f6966d;
            int i12 = 0 / 0;
        } else {
            j10 = this.f6966d;
        }
        force = (i10 + 75) % 128;
        return j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap map = new HashMap();
        if (m8829v()) {
            f6964e = (force + 57) % 128;
            map.put("lvl", this.AFKeystoreWrapper);
            f6964e = (force + 101) % 128;
            return map;
        }
        if (this.unregisterClient) {
            this.AFKeystoreWrapper = new HashMap();
            registerClient();
            this.AFKeystoreWrapper.put("error", "pending LVL response");
            map.put("lvl", this.AFKeystoreWrapper);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8832d(String str) {
        int i10 = force + 85;
        f6964e = i10 % 128;
        if (i10 % 2 == 0) {
            this.f6967i = str;
            int i11 = 92 / 0;
        } else {
            this.f6967i = str;
        }
        f6964e = (force + 5) % 128;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final boolean AFLogger() {
        int i10 = force + 83;
        f6964e = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f6968w;
        f6964e = (force + 81) % 128;
        return z10;
    }

    public final void AFLogger(boolean z10) {
        int i10 = force + 1;
        f6964e = i10 % 128;
        if (i10 % 2 != 0) {
            this.f6968w = z10;
            f6964e = (force + 29) % 128;
        } else {
            this.f6968w = z10;
            throw null;
        }
    }

    public final Map<String, Object> unregisterClient(Map<String, Object> map) {
        return (Map) unregisterClient(new Object[]{this, map}, 1953197941, -1953197940, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8833d() {
        int i10 = f6964e + 23;
        force = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (this.unregisterClient && !m8829v()) {
            force = (f6964e + 63) % 128;
            return true;
        }
        int i11 = f6964e + 1;
        force = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public final String unregisterClient() {
        return (String) unregisterClient(new Object[]{this}, -1660886869, 1660886871, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r5 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r5 = 86 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4.f6966d = java.lang.System.currentTimeMillis();
        r4.unregisterClient = m8828e().AFLogger(AFLogger(r5), r4.registerClient.f6933d, new com.appsflyer.internal.AFf1fSDK.C17743(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r4.AFLogger.isOptionalFeaturePresent(com.appsflyer.sdk_base.util.SupportedOptionalFeatures.LVL) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4.AFLogger.isOptionalFeaturePresent(com.appsflyer.sdk_base.util.SupportedOptionalFeatures.LVL) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r5 = com.appsflyer.internal.AFf1fSDK.force + 61;
        com.appsflyer.internal.AFf1fSDK.f6964e = r5 % 128;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8831d(AFc1iSDK aFc1iSDK) {
        int i10 = force + 119;
        f6964e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 82 / 0;
        }
    }

    private long AFLogger(AFc1iSDK aFc1iSDK) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFb1jSDK.AFLogger(aFc1iSDK.AFKeystoreWrapper));
        sb2.append(m8830w());
        long jAFLogger = AFj1nSDK.AFLogger(AFj1nSDK.unregisterClient(sb2.toString()));
        f6964e = (force + 57) % 128;
        return jAFLogger;
    }

    public static void registerClient(AFh1pSDK aFh1pSDK, byte[] bArr) throws Throwable {
        try {
            new AFb1sSDK(aFh1pSDK, bArr).afInfoLog();
            int i10 = f6964e + 85;
            force = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            aFLogger.m8963e(LogTag.SECURITY, "native: reflection init failed", e10, false, false);
            aFLogger.m8963e(LogTag.SECURITY_SDK, "the module detected but malfunctioning", e10, false, false);
        }
    }

    public final Map<String, Object> AFKeystoreWrapper(Map<String, Object> map) {
        return (Map) unregisterClient(new Object[]{this, map}, 389111715, -389111715, System.identityHashCode(this));
    }

    public final void registerClient() {
        int i10 = force + 89;
        f6964e = i10 % 128;
        int i11 = i10 % 2;
        this.AFKeystoreWrapper.put("ttr", Long.valueOf(System.currentTimeMillis() - this.f6966d));
        this.AFKeystoreWrapper.put("lvl_timestamp", Long.valueOf(m8830w()));
        int i12 = force + 43;
        f6964e = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX INFO: renamed from: d */
    public static boolean m8827d(AFh1pSDK aFh1pSDK, AFc1iSDK aFc1iSDK) {
        String strAFLogger;
        String str;
        String str2 = aFc1iSDK.unregisterClient;
        if (str2 != null) {
            f6964e = (force + 99) % 128;
            if (str2.length() != 0) {
                str = aFc1iSDK.unregisterClient;
            } else {
                force = (f6964e + 73) % 128;
                strAFLogger = aFc1iSDK.AFLogger("com.appsflyer.security.uuid");
                if (strAFLogger != null || strAFLogger.length() == 0) {
                    str = null;
                } else {
                    String strSubstring = strAFLogger.substring(0, 8);
                    aFc1iSDK.unregisterClient = strSubstring;
                    str = strSubstring;
                }
            }
        } else {
            force = (f6964e + 73) % 128;
            strAFLogger = aFc1iSDK.AFLogger("com.appsflyer.security.uuid");
            if (strAFLogger != null) {
                str = null;
            } else {
                str = null;
            }
        }
        if (str != null && !str.isEmpty()) {
            try {
                Map<String, Object> map = aFh1pSDK.f7027d;
                Object[] objArr = new Object[1];
                m8826a(new int[]{0, 12, 0, 3}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001", false, objArr);
                long j10 = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
                char[] charArray = str.toCharArray();
                int i10 = ((int) (j10 % 94)) + 33;
                for (int i11 = 0; i11 < charArray.length; i11++) {
                    charArray[i11] = (char) (charArray[i11] ^ i10);
                }
                aFh1pSDK.registerClient.put("af-sdk-sbid", Base64.encodeToString(new String(charArray).getBytes(Charset.defaultCharset()), 2));
                return true;
            } catch (Exception e10) {
                AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Exception occurred while generating sbid ", e10);
                return false;
            }
        }
        AFLogger.INSTANCE.m8960d(LogTag.SECURITY_SDK, "the module is not detected");
        return false;
    }
}
