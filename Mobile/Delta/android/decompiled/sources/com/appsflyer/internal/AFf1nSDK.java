package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1nSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 0;
    private static byte[] AFLogger = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5352d = 0;
    private static int force = 0;
    private static int registerClient = 0;
    private static short[] unregisterClient = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f5353v = 1;

    static {
        registerClient();
        Process.myTid();
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getWindowTouchSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        int i10 = force + 95;
        f5353v = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @NonNull
    private static AFi1uSDK AFLogger(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (str == null) {
            return new AFi1uSDK(aFh1aSDK.unregisterClient == AFh1iSDK.DEFAULT, AFh1dSDK.NA);
        }
        String string = "";
        Object[] objArr = new Object[1];
        a((-75) - ExpandableListView.getPackedPositionType(0L), (short) TextUtils.getTrimmedLength(""), (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 36), 2002986226 - TextUtils.indexOf((CharSequence) "", '0', 0), (-426765741) - (KeyEvent.getMaxKeyCode() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFh1aSDK.unregisterClient == AFh1iSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            str3 = strIntern;
        }
        boolean zEquals = d(new StringBuilder(str3).reverse().toString(), aFh1aSDK.f5388d, "android", "v1", string).equals(str);
        return new AFi1uSDK(zEquals, zEquals ? AFh1dSDK.SUCCESS : AFh1dSDK.FAILURE);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a A[PHI: r7
      0x009a: PHI (r7v6 int) = (r7v5 int), (r7v41 int) binds: [B:27:0x0098, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[PHI: r7
      0x009c: PHI (r7v38 int) = (r7v5 int), (r7v41 int) binds: [B:27:0x0098, B:24:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    private static void a(int i10, short s8, byte b, int i11, int i12, Object[] objArr) {
        int i13;
        int i14;
        boolean z10;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        StringBuilder sb2 = new StringBuilder();
        int i15 = i10 + ((int) (((long) registerClient) ^ (-6851507024414479503L)));
        boolean z11 = i15 == -1;
        if (z11) {
            int i16 = $11 + 95;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                throw null;
            }
            byte[] bArr = AFLogger;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i17 = 0; i17 < length; i17++) {
                    bArr2[i17] = (byte) (((long) bArr[i17]) ^ (-6851507024414479503L));
                }
                bArr = bArr2;
            }
            i15 = bArr != null ? (byte) (((byte) (((long) AFLogger[i12 + ((int) (((long) f5352d) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) registerClient) ^ (-6851507024414479503L)))) : (short) (((short) (((long) unregisterClient[i12 + ((int) (((long) f5352d) ^ (-6851507024414479503L)))]) ^ (-6851507024414479503L))) + ((int) (((long) registerClient) ^ (-6851507024414479503L))));
        }
        if (i15 > 0) {
            int i18 = $10 + 123;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                i13 = ((i12 >>> i15) - 5) + ((int) (((long) f5352d) % (-6851507024414479503L)));
                if (z11) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            } else {
                i13 = ((i12 + i15) - 2) + ((int) (((long) f5352d) ^ (-6851507024414479503L)));
                if (z11) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
            }
            aFk1rSDK.AFLogger = i13 + i14;
            char c10 = (char) (((int) (((long) AFKeystoreWrapper) ^ (-6851507024414479503L))) + i11);
            aFk1rSDK.registerClient = c10;
            sb2.append(c10);
            aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
            byte[] bArr3 = AFLogger;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i19 = 0; i19 < length2; i19++) {
                    bArr4[i19] = (byte) (((long) bArr3[i19]) ^ (-6851507024414479503L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i20 = $10 + 45;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            aFk1rSDK.f5456d = 1;
            while (aFk1rSDK.f5456d < i15) {
                if (z10) {
                    byte[] bArr5 = AFLogger;
                    int i21 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i21 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((byte) (((byte) (((long) bArr5[i21]) ^ (-6851507024414479503L))) + s8)) ^ b));
                } else {
                    short[] sArr = unregisterClient;
                    int i22 = aFk1rSDK.AFLogger;
                    aFk1rSDK.AFLogger = i22 - 1;
                    aFk1rSDK.registerClient = (char) (aFk1rSDK.AFKeystoreWrapper + (((short) (((short) (((long) sArr[i22]) ^ (-6851507024414479503L))) + s8)) ^ b));
                }
                sb2.append(aFk1rSDK.registerClient);
                aFk1rSDK.AFKeystoreWrapper = aFk1rSDK.registerClient;
                aFk1rSDK.f5456d++;
            }
        }
        objArr[0] = sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if ((r8 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r8 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r7.substring(0, 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        if (r7.length() < 14) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r7.length() < 12) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r8 = com.appsflyer.internal.AFf1nSDK.force + 33;
        com.appsflyer.internal.AFf1nSDK.f5353v = r8 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String d(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r0 = com.appsflyer.internal.AFf1nSDK.f5353v
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.appsflyer.internal.AFf1nSDK.force = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 12
            java.lang.String r3 = "\u2063"
            java.lang.String r4 = ""
            r5 = 0
            if (r0 == 0) goto L32
            r0 = 5
            java.lang.String[] r6 = new java.lang.String[r0]
            r6[r5] = r8
            r6[r5] = r9
            r6[r0] = r10
            r8 = 4
            r6[r8] = r11
            r6[r1] = r4
            java.lang.String r8 = android.text.TextUtils.join(r3, r6)
            java.lang.String r7 = com.appsflyer.internal.AFj1nSDK.d(r8, r7)
            int r8 = r7.length()
            r9 = 14
            if (r8 >= r9) goto L53
            goto L44
        L32:
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r10, r11, r4}
            java.lang.String r8 = android.text.TextUtils.join(r3, r8)
            java.lang.String r7 = com.appsflyer.internal.AFj1nSDK.d(r8, r7)
            int r8 = r7.length()
            if (r8 >= r2) goto L53
        L44:
            int r8 = com.appsflyer.internal.AFf1nSDK.force
            int r8 = r8 + 33
            int r9 = r8 % 128
            com.appsflyer.internal.AFf1nSDK.f5353v = r9
            int r8 = r8 % r1
            if (r8 != 0) goto L52
            r8 = 56
            int r8 = r8 / r5
        L52:
            return r7
        L53:
            java.lang.String r7 = r7.substring(r5, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1nSDK.d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void registerClient() {
        f5352d = -1732147492;
        registerClient = -2119275717;
        AFKeystoreWrapper = 154316849;
        AFLogger = new byte[]{-121, -94, 82, 82, 82, -82, 92, -89, -85, 82, 86, -83, -83, -87, 82, 80, -82, -84, -81, 87, 91, -95, 93, -94, 82, -81, 89, -90, -81, 82, 82, -83, -88, 81, -81, 80, 95, -67, -87, 81, 81, -87, 86, -86, 80, -84, 83, -87, -83, 83, -83, -81, 84, -81, 83, -85, 80, 82, -84, -82, -83, 81, -87, -83};
    }

    @NonNull
    public final AFi1uSDK AFKeystoreWrapper(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1aSDK != null && str2 != null && str3 != null) {
            force = (f5353v + 73) % 128;
            return AFLogger(aFh1aSDK, str, str2, str3);
        }
        AFi1uSDK aFi1uSDK = new AFi1uSDK(false, AFh1dSDK.INTERNAL_ERROR);
        force = (f5353v + 33) % 128;
        return aFi1uSDK;
    }
}
