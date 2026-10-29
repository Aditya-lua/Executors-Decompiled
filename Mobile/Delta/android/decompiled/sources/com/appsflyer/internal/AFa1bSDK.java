package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AFa1bSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static byte[] enableTCFDataCollection;
    public static final Map getInstance;
    private static Object getSdkVersion;
    private static Object onPause;
    private static long setAndroidIdData;
    private static byte[] setCustomerUserId;
    private static long setDebugLog;
    private static int setImeiData;
    private static int setOaidData;
    private static int setUserFirstName;
    private static int setUserPhone;
    private static byte[] stop;
    private static long updateServerUninstallToken;
    public static final Map values;

    /* JADX WARN: Code duplicated, block: B:10:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0039 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0037
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r6 = 119 - r6
            int r8 = r8 + 4
            int r0 = 49 - r7
            byte[] r1 = com.appsflyer.internal.AFa1bSDK.$$a
            byte[] r0 = new byte[r0]
            int r7 = 48 - r7
            r2 = 0
            if (r1 != 0) goto L1b
            int r6 = com.appsflyer.internal.AFa1bSDK.$13
            int r6 = r6 + 117
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1bSDK.$12 = r6
            r3 = r7
            r6 = r8
            r4 = r2
            goto L3e
        L1b:
            r3 = r2
        L1c:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L39
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            int r7 = com.appsflyer.internal.AFa1bSDK.$12
            int r7 = r7 + 81
            int r8 = r7 % 128
            com.appsflyer.internal.AFa1bSDK.$13 = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L37
            return r6
        L37:
            r6 = 0
            throw r6
        L39:
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L3e:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            int r3 = com.appsflyer.internal.AFa1bSDK.$12
            int r3 = r3 + 51
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1bSDK.$13 = r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.$$c(byte, int, short):java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 72101. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    static {
        /*
            Method dump skipped, instruction units count: 7210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.<clinit>():void");
    }

    private AFa1bSDK() {
    }

    public static int AFKeystoreWrapper(Object obj) throws Throwable {
        int i10 = $11;
        Object obj2 = onPause;
        int i11 = (i10 + 65) % 128;
        $10 = i11;
        $11 = (i11 + 57) % 128;
        try {
            byte[] bArr = $$a;
            byte b = bArr[200];
            byte b10 = bArr[13];
            Class<?> cls = Class.forName($$c(b, b10, (short) ((b10 ^ 546) | (b10 & 546))), true, (ClassLoader) getSdkVersion);
            byte b11 = bArr[8];
            byte b12 = bArr[239];
            int iIntValue = ((Integer) cls.getMethod($$c(b11, b12, (short) ((b12 ^ 1100) | (b12 & 1100))), Object.class).invoke(obj2, obj)).intValue();
            int i12 = $10 + 11;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 82 / 0;
            }
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object AFLogger(char c10, int i10, int i11) throws Throwable {
        int i12 = $10;
        int i13 = (i12 & 41) + (i12 | 41);
        int i14 = i13 % 128;
        $11 = i14;
        if (i13 % 2 == 0) {
            throw null;
        }
        Object obj = onPause;
        $10 = ((i14 & 99) + (i14 | 99)) % 128;
        try {
            Object[] objArr = {Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)};
            byte[] bArr = $$a;
            byte b = bArr[200];
            byte b10 = bArr[13];
            Class<?> cls = Class.forName($$c(b, b10, (short) (b10 | 546)), true, (ClassLoader) getSdkVersion);
            String str$$c = $$c(bArr[7], bArr[170], (short) 1120);
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            return cls.getMethod(str$$c, cls2, cls3, cls3).invoke(obj, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static int d(int i10) throws Throwable {
        int i11 = $11;
        int i12 = ((i11 | 61) << 1) - (i11 ^ 61);
        int i13 = i12 % 128;
        $10 = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        Object obj = onPause;
        $11 = (i13 + 9) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            byte[] bArr = $$a;
            byte b = bArr[200];
            byte b10 = bArr[13];
            int iIntValue = ((Integer) Class.forName($$c(b, b10, (short) ((b10 ^ 546) | (b10 & 546))), true, (ClassLoader) getSdkVersion).getMethod($$c((byte) (-bArr[188]), bArr[797], (short) 594), Integer.TYPE).invoke(obj, objArr)).intValue();
            $11 = ($10 + 5) % 128;
            return iIntValue;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        $11 = ($10 + 85) % 128;
        byte[] bArr = new byte[1153];
        System.arraycopy("Sf\u009e\u0001ò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üü\f\u0000ó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúã0·%\u000eø÷ÿó\u0001>Ìðÿü\fùò\u0013òò\tñ\u0002\u0005\u00045ÌðÿAìÝî\nò\fôú$ëõ\f\u0003üí\u0002ÿ\föù2Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000ò\tñ\u0002\u0005\u00045ÌðÿAìÐÿ(Úü\f\u0000ôø\u0001ð*Ú\u0004ô\n\u0007ô*Ðÿ\u0003\u0002\u0005\u0001ì\nù\u0000\u0001ð-Üü\u0006ñ.Úö\u0001ð0Ó\nþ!áýú\u0002 Úö\u0001ð0áýú\u0002 ÚöÊ\u0002ì\u00121Ê\u0002ì\u00121\bê\u00142Äù@çÜü\u0006\bê\u00142Äù@¹\u0006ü\u000búö\bê\u00142Á\nò\u00068ÚÙ\u0005þ\u000e÷\u0001ð#Ý\u0002þ\nòýúó\nþ\u0005û\u0001ýú\u0002ò\tñ\u0002\u0005\u00045¾ûDëÌ\u000bü\u0007?Í\u0010òþ\tù\u0000\u000eøë\u0015úù\u0001ò\u0016ä\bô\u000e\u0014ù\u0015÷\bê\u00142Äù@äù\tÌ\u0014ýôû\nù\u0000í\u0002ÿ\föù\u001fêû\u0007\u0017ãüÿ\u0002õ\bê\u00142Äù@çÜü\u0006\u0015Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003óöüû\r\u0014ü\u0012÷Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<Í'\u0001Ò.Ï\u0003ü*\u0004û\u0001Ð/ÿ\u0001Ñ3\u0001ð!ìñ\u0003ù\u0002\u000eý\bê\u00142¿\bðEØ\u0002\u0005\u0001ð#îì\u000b\bê\u00142Äù@ëÌ\u000eÿ\u0000ò\f\u0000\u001aÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@äÚýú\u0000 Þ\u0001\f\u0003ó\bê\u00142Äù@éâì\u0012\u0017Úýú\u0000 Þ\u0001\f\u0003ó\f\u0003ü\u001dÐ\bÿò\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç/Úýú\u0000 Þ\u0001\f\u0003óó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúÛ8Ï\r\u000eøó\u0001>Ìðÿü\fùò\u0013òCÄúù\u000eò\u0003\fô=ìúã0·%\u000eø÷ÿúùÜ\u0007ÿ\u0001ò\u0007\u0001ø\f\u0003ü\rð!ì\u0003ü\u0014à\u0001ò\u0014û\u0013÷\u0004\bô\u000e\u0001ð-\u0001\bê\u00142Äù@çÜü\u0006 Þñ\u000fð\bøû\u0004üù\n\n\u0002ôõ\fý<ºù\u0005þ\u000e÷>éÞì1Üü\u0006ü\rü\u001fÞì\u0001ð2Þî\u0003\u0002ö\u0000\u000e\u0014îì\u000bþø\u0006ð\u000e\u0001ð0Ö\níÿ&Ü\rüþò\bê\u00142¸\u0000\nü=³\u0010øAÓðø&Úýú\u0000 Þ\u0001\f\u0003ó\u0001ð%èì\u0003.Öù\u0001ø\bê\u00142¸\u0000\nü=³\u0010øAÓðø*Öù\u0001ø\u0001ð éî\u0014\bê\u00142Äù@ëÈ\u0004\u000e#Îÿ\u0010ç)Ù\u0000\u0003ú\u0000 Þ\u0001\f\u0003ó\u0004,È\u0004\u000e#Îÿ\u0010ç\bê\u00142Äù@êÖüû\r\u0003þõ\u0006\u0002ôõ\fý<ºù\u0005þ\u000e÷>äÚ ç÷ýüø4Þì4Ö\níÿ&Ü\rüþò\bê\u00142¿\u0004ù@ëÈ\u0004\u000e\"Ì\u000eÿ\u0000ò\bê\u00142Á\nò\u00068êÖ\níÿ&Ü\rüþò\u0004\u0010ð\u0002ôõ\fý<ºù\u0005þ\u000e÷>ëàí\r Þì4Ö\níÿ&Ü\rüþò\u000eì\u000b\u001bâõþ\fì\nò\u0010\u0018â\u0006ï\u0010îø4Úö\f\u0001î\u0004ü\b\u0003ñ\fì\nò\u0010\u0018â\u0006ï\u0010îø(îì\u000b\"Ø\u0006÷\u0007öù\u0000\u0001ð0Ó\u0001ü\u0000\u0000\böù\u001fÚ\b\n\u0014÷\u0017÷ü\rü Ö\níÿó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<íúä/Î\u000e\u000eø&®Ííÿ\rð\u0000CËó\u0001=Íðÿü\fùò\u0013òBÅúù\u000eò\u0003\fô<÷þÔ.Î+\u0007Ê-\u0007øÒÿ.Ð/Ñ4\u0014ø\u0016÷¹þN¹\u0004ôÿ\t\u0000ý÷÷R³\u0006þñJ\u0006û\fýýõþ\u000eò.Ö\u0002\u0003öù\fýýõþ\u000eò.Ö\u0002\u0003öù".getBytes("ISO-8859-1"), 0, bArr, 0, 1153);
        $$a = bArr;
        $$b = 49;
        $10 = ($11 + 27) % 128;
    }

    private static void registerClient(int i10, int i11) {
        $11 = ($10 + 45) % 128;
    }
}
