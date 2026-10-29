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
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.lang.Class<byte[]> r2 = byte[].class
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            init$0()
            int r0 = com.appsflyer.internal.AFa1bSDK.$11
            r5 = r0 ^ 103(0x67, float:1.44E-43)
            r0 = r0 & 103(0x67, float:1.44E-43)
            r6 = 1
            int r0 = r0 << r6
            int r5 = r5 + r0
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r5
            r0 = 23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1c05
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1c05
            byte[] r5 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L1c05
            r7 = 287(0x11f, float:4.02E-43)
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L1c05
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1c05
            r9 = 945(0x3b1, float:1.324E-42)
            r10 = r5[r9]     // Catch: java.lang.Throwable -> L1c05
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1c05
            r11 = 32
            r11 = r5[r11]     // Catch: java.lang.Throwable -> L1c05
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L1c05
            java.lang.String r8 = $$c(r8, r10, r11)     // Catch: java.lang.Throwable -> L1c05
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L1c05
            r10 = 8
            r11 = r5[r10]     // Catch: java.lang.Throwable -> L1c05
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1c05
            r12 = 161(0xa1, float:2.26E-43)
            r12 = r5[r12]     // Catch: java.lang.Throwable -> L1c05
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L1c05
            r13 = 200(0xc8, float:2.8E-43)
            r14 = r5[r13]     // Catch: java.lang.Throwable -> L1c05
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L1c05
            java.lang.String r11 = $$c(r11, r12, r14)     // Catch: java.lang.Throwable -> L1c05
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1c05
            java.lang.Class[] r12 = new java.lang.Class[]{r12}     // Catch: java.lang.Throwable -> L1c05
            java.lang.reflect.Method r8 = r8.getMethod(r11, r12)     // Catch: java.lang.Throwable -> L1c05
            r11 = 0
            java.lang.Object r0 = r8.invoke(r11, r0)     // Catch: java.lang.Throwable -> L1c05
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L1c05
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L1c05
            long r14 = java.lang.System.currentTimeMillis()
            int r8 = (int) r14
            r12 = -37900329(0xfffffffffdbdafd7, float:-3.1517138E37)
            int r14 = ~r8
            r12 = r12 | r14
            int r12 = ~r12
            r14 = -2130409452(0xffffffff81048814, float:-2.4342202E-38)
            r15 = r12 ^ r14
            r12 = r12 & r14
            r12 = r12 | r15
            int r12 = r12 * (-591)
            r14 = -1848967962(0xffffffff91cafce6, float:-3.2025841E-28)
            r15 = r14 & r12
            r12 = r12 | r14
            int r15 = r15 + r12
            r12 = -1992447401(0xffffffff893daa57, float:-2.283014E-33)
            r8 = r8 | r12
            r12 = -175862380(0xfffffffff5848d94, float:-3.3606188E32)
            r14 = r8 ^ r12
            r8 = r8 & r12
            r8 = r8 | r14
            int r8 = r8 * 591
            int r8 = -r8
            int r8 = -r8
            r12 = r15 ^ r8
            r8 = r8 & r15
            int r8 = r8 << r6
            int r12 = r12 + r8
            r8 = -137429121(0xfffffffff7ceff7f, float:-8.396838E33)
            int r14 = ~r0
            r8 = r8 | r14
            int r14 = r8 * (-490)
            r15 = r9
            r16 = r10
            long r9 = java.lang.System.currentTimeMillis()
            int r9 = (int) r9
            r10 = -69090(0xfffffffffffef21e, float:NaN)
            int r8 = r8 * r10
            int r10 = r12 * (-139)
            int r8 = r8 + r10
            int r10 = ~r14
            r17 = r10 ^ r12
            r18 = r10 & r12
            r19 = r13
            r13 = r17 | r18
            int r13 = ~r13
            r17 = r10 ^ r9
            r18 = r10 & r9
            r20 = r15
            r15 = r17 | r18
            int r15 = ~r15
            r17 = r13 ^ r15
            r13 = r13 & r15
            r13 = r17 | r13
            int r13 = r13 * (-280)
            int r13 = -r13
            int r13 = -r13
            r17 = r8 | r13
            int r17 = r17 << 1
            r8 = r8 ^ r13
            int r17 = r17 - r8
            int r8 = ~r12
            r13 = r8 ^ r9
            r18 = r8 & r9
            r13 = r13 | r18
            int r13 = ~r13
            r18 = r15 ^ r13
            r13 = r13 & r15
            r13 = r18 | r13
            int r13 = r13 * 140
            r15 = r17 | r13
            int r15 = r15 << r6
            r13 = r17 ^ r13
            int r15 = r15 - r13
            int r13 = ~r14
            r17 = r13 ^ r8
            r13 = r13 & r8
            r13 = r17 | r13
            r17 = r13 ^ r9
            r13 = r13 & r9
            r13 = r17 | r13
            int r13 = ~r13
            r17 = r3
            int r3 = ~r9
            r18 = r10 ^ r3
            r3 = r3 & r10
            r3 = r18 | r3
            r10 = r3 ^ r12
            r3 = r3 & r12
            r3 = r3 | r10
            int r3 = ~r3
            r10 = r13 ^ r3
            r3 = r3 & r13
            r3 = r3 | r10
            int r9 = ~r9
            r10 = r8 ^ r9
            r8 = r8 & r9
            r8 = r8 | r10
            r9 = r8 ^ r14
            r8 = r8 & r14
            r8 = r8 | r9
            int r8 = ~r8
            r3 = r3 | r8
            int r3 = r3 * 140
            int r15 = r15 + r3
            r3 = -1480280217(0xffffffffa7c4b767, float:-5.4599773E-15)
            r8 = r3 ^ r0
            r0 = r0 & r3
            r0 = r0 | r8
            int r0 = ~r0
            r3 = 1342851096(0x500a4818, float:9.2799222E9)
            r0 = r0 | r3
            int r3 = r0 * 490
            long r8 = java.lang.System.currentTimeMillis()
            int r8 = (int) r8
            r9 = -325850(0xfffffffffffb0726, float:NaN)
            int r0 = r0 * r9
            int r9 = r15 * 334
            int r9 = -r9
            int r9 = -r9
            int r9 = ~r9
            int r0 = r0 - r9
            int r0 = r0 - r6
            int r3 = ~r3
            int r9 = r3 * (-333)
            int r0 = r0 + r9
            int r9 = ~r8
            r10 = r3 ^ r9
            r9 = r9 & r3
            r9 = r9 | r10
            int r9 = ~r9
            r10 = r15 ^ r8
            r12 = r15 & r8
            r10 = r10 | r12
            int r10 = ~r10
            r9 = r9 | r10
            int r9 = r9 * 333
            int r0 = r0 + r9
            r9 = r3 ^ r8
            r3 = r3 & r8
            r3 = r3 | r9
            int r3 = ~r3
            int r8 = ~r8
            r8 = r8 | r15
            int r8 = ~r8
            r9 = r3 ^ r8
            r3 = r3 & r8
            r3 = r3 | r9
            int r3 = r3 * 333
            r8 = r0 | r3
            int r8 = r8 << r6
            r0 = r0 ^ r3
            int r8 = r8 - r0
            r0 = 2143666900(0x7fc5c2d4, float:NaN)
            int r8 = r8 - r0
            if (r8 != 0) goto L159
            goto L1be2
        L159:
            r8 = -3110477135973670270(0xd4d55d865c50a282, double:-4.673133665579411E100)
            com.appsflyer.internal.AFa1bSDK.setDebugLog = r8
            com.appsflyer.internal.AFa1bSDK.setUserFirstName = r17
            r3 = 2
            com.appsflyer.internal.AFa1bSDK.setUserPhone = r3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.AFa1bSDK.values = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.appsflyer.internal.AFa1bSDK.getInstance = r0
            r0 = r5[r19]     // Catch: java.lang.Exception -> L1bfe
            byte r0 = (byte) r0     // Catch: java.lang.Exception -> L1bfe
            r8 = 13
            r9 = r5[r8]     // Catch: java.lang.Exception -> L1bfe
            byte r9 = (byte) r9     // Catch: java.lang.Exception -> L1bfe
            r10 = r5[r7]     // Catch: java.lang.Exception -> L1bfe
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r9 = $$c(r0, r9, r10)     // Catch: java.lang.Exception -> L1bfe
            java.lang.Object r0 = com.appsflyer.internal.AFa1bSDK.onPause     // Catch: java.lang.Exception -> L1bfe
            if (r0 != 0) goto L199
            r0 = r5[r19]     // Catch: java.lang.Exception -> L1bfe
            byte r0 = (byte) r0     // Catch: java.lang.Exception -> L1bfe
            r10 = 90
            r10 = r5[r10]     // Catch: java.lang.Exception -> L1bfe
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L1bfe
            r12 = 188(0xbc, float:2.63E-43)
            r12 = r5[r12]     // Catch: java.lang.Exception -> L1bfe
            int r12 = -r12
            short r12 = (short) r12     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r0 = $$c(r0, r10, r12)     // Catch: java.lang.Exception -> L1bfe
            goto L19a
        L199:
            r0 = r11
        L19a:
            r10 = 288(0x120, float:4.04E-43)
            r12 = r5[r7]     // Catch: java.lang.Exception -> L1cb
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L1cb
            r13 = 324(0x144, float:4.54E-43)
            r13 = r5[r13]     // Catch: java.lang.Exception -> L1cb
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1cb
            r14 = 39
            r14 = r5[r14]     // Catch: java.lang.Exception -> L1cb
            short r14 = (short) r14     // Catch: java.lang.Exception -> L1cb
            java.lang.String r12 = $$c(r12, r13, r14)     // Catch: java.lang.Exception -> L1cb
            java.lang.Class r12 = java.lang.Class.forName(r12)     // Catch: java.lang.Exception -> L1cb
            r13 = r5[r19]     // Catch: java.lang.Exception -> L1cb
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1cb
            r14 = 320(0x140, float:4.48E-43)
            r5 = r5[r14]     // Catch: java.lang.Exception -> L1cb
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L1cb
            r14 = 91
            short r14 = (short) r14     // Catch: java.lang.Exception -> L1cb
            java.lang.String r5 = $$c(r13, r5, r14)     // Catch: java.lang.Exception -> L1cb
            java.lang.reflect.Method r5 = r12.getMethod(r5, r11)     // Catch: java.lang.Exception -> L1cb
            java.lang.Object r5 = r5.invoke(r11, r11)     // Catch: java.lang.Exception -> L1cb
            if (r5 == 0) goto L1cc
            goto L1f5
        L1cb:
            r5 = r11
        L1cc:
            byte[] r12 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1f5
            r13 = r12[r7]     // Catch: java.lang.Exception -> L1f5
            byte r13 = (byte) r13     // Catch: java.lang.Exception -> L1f5
            r14 = r12[r20]     // Catch: java.lang.Exception -> L1f5
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L1f5
            int r15 = r14 << 2
            short r15 = (short) r15     // Catch: java.lang.Exception -> L1f5
            java.lang.String r13 = $$c(r13, r14, r15)     // Catch: java.lang.Exception -> L1f5
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch: java.lang.Exception -> L1f5
            r14 = r12[r8]     // Catch: java.lang.Exception -> L1f5
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L1f5
            r12 = r12[r10]     // Catch: java.lang.Exception -> L1f5
            int r12 = -r12
            byte r12 = (byte) r12     // Catch: java.lang.Exception -> L1f5
            r15 = 129(0x81, float:1.81E-43)
            short r15 = (short) r15     // Catch: java.lang.Exception -> L1f5
            java.lang.String r12 = $$c(r14, r12, r15)     // Catch: java.lang.Exception -> L1f5
            java.lang.reflect.Method r12 = r13.getMethod(r12, r11)     // Catch: java.lang.Exception -> L1f5
            java.lang.Object r5 = r12.invoke(r11, r11)     // Catch: java.lang.Exception -> L1f5
        L1f5:
            r12 = 710(0x2c6, float:9.95E-43)
            if (r5 == 0) goto L225
            int r13 = com.appsflyer.internal.AFa1bSDK.$10
            r14 = r13 ^ 111(0x6f, float:1.56E-43)
            r13 = r13 & 111(0x6f, float:1.56E-43)
            int r13 = r13 << r6
            int r14 = r14 + r13
            int r14 = r14 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r14
            java.lang.Class r13 = r5.getClass()     // Catch: java.lang.Exception -> L225
            byte[] r14 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L225
            r15 = r14[r8]     // Catch: java.lang.Exception -> L225
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L225
            r14 = r14[r12]     // Catch: java.lang.Exception -> L225
            byte r14 = (byte) r14
            r18 = r8
            r8 = 149(0x95, float:2.09E-43)
            short r8 = (short) r8
            java.lang.String r8 = $$c(r15, r14, r8)     // Catch: java.lang.Exception -> L223
            java.lang.reflect.Method r8 = r13.getMethod(r8, r11)     // Catch: java.lang.Exception -> L223
            java.lang.Object r8 = r8.invoke(r5, r11)     // Catch: java.lang.Exception -> L223
            goto L228
        L223:
            r8 = r11
            goto L228
        L225:
            r18 = r8
            goto L223
        L228:
            if (r5 == 0) goto L24c
            java.lang.Class r13 = r5.getClass()     // Catch: java.lang.Exception -> L24c
            byte[] r14 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L24c
            r15 = r14[r18]     // Catch: java.lang.Exception -> L24c
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L24c
            r21 = 882(0x372, float:1.236E-42)
            r14 = r14[r21]     // Catch: java.lang.Exception -> L24c
            byte r14 = (byte) r14
            r21 = r10
            r10 = 159(0x9f, float:2.23E-43)
            short r10 = (short) r10
            java.lang.String r10 = $$c(r15, r14, r10)     // Catch: java.lang.Exception -> L24a
            java.lang.reflect.Method r10 = r13.getMethod(r10, r11)     // Catch: java.lang.Exception -> L24a
            java.lang.Object r10 = r10.invoke(r5, r11)     // Catch: java.lang.Exception -> L24a
            goto L24f
        L24a:
            r10 = r11
            goto L24f
        L24c:
            r21 = r10
            goto L24a
        L24f:
            if (r5 == 0) goto L271
            java.lang.Class r13 = r5.getClass()     // Catch: java.lang.Exception -> L271
            byte[] r14 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L271
            r15 = r14[r18]     // Catch: java.lang.Exception -> L271
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L271
            r14 = r14[r12]     // Catch: java.lang.Exception -> L271
            byte r14 = (byte) r14
            r22 = r12
            r12 = 173(0xad, float:2.42E-43)
            short r12 = (short) r12
            java.lang.String r12 = $$c(r15, r14, r12)     // Catch: java.lang.Exception -> L26f
            java.lang.reflect.Method r12 = r13.getMethod(r12, r11)     // Catch: java.lang.Exception -> L26f
            java.lang.Object r5 = r12.invoke(r5, r11)     // Catch: java.lang.Exception -> L26f
            goto L274
        L26f:
            r5 = r11
            goto L274
        L271:
            r22 = r12
            goto L26f
        L274:
            r12 = 193(0xc1, float:2.7E-43)
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r8 == 0) goto L283
            r26 = r6
            r27 = r7
        L27e:
            r24 = 356(0x164, float:4.99E-43)
            r25 = 54
            goto L2d6
        L283:
            if (r0 != 0) goto L28b
            r26 = r6
            r27 = r7
            r8 = r11
            goto L27e
        L28b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1bfe
            r8.<init>()     // Catch: java.lang.Exception -> L1bfe
            byte[] r23 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1bfe
            r24 = 720(0x2d0, float:1.009E-42)
            r25 = 54
            r14 = r23[r24]     // Catch: java.lang.Exception -> L1bfe
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Exception -> L1bfe
            r24 = 356(0x164, float:4.99E-43)
            r15 = r23[r22]     // Catch: java.lang.Exception -> L1bfe
            byte r15 = (byte) r15     // Catch: java.lang.Exception -> L1bfe
            r26 = r6
            r6 = r15 ^ 145(0x91, float:2.03E-43)
            r27 = r7
            r7 = r15 & 145(0x91, float:2.03E-43)
            r6 = r6 | r7
            short r6 = (short) r6     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r6 = $$c(r14, r15, r6)     // Catch: java.lang.Exception -> L1bfe
            r8.append(r6)     // Catch: java.lang.Exception -> L1bfe
            r8.append(r0)     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L1bfe
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L1bf5
            r6 = r23[r24]     // Catch: java.lang.Throwable -> L1bf5
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1bf5
            r7 = r23[r25]     // Catch: java.lang.Throwable -> L1bf5
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1bf5
            short r8 = (short) r12     // Catch: java.lang.Throwable -> L1bf5
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L1bf5
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1bf5
            java.lang.Class[] r7 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L1bf5
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L1bf5
            java.lang.Object r8 = r6.newInstance(r0)     // Catch: java.lang.Throwable -> L1bf5
        L2d6:
            r6 = 239(0xef, float:3.35E-43)
            if (r5 == 0) goto L2dd
            r23 = r6
            goto L33d
        L2dd:
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1bfe
            r5 = r0[r24]     // Catch: java.lang.Exception -> L1bfe
            byte r5 = (byte) r5     // Catch: java.lang.Exception -> L1bfe
            r7 = r0[r6]     // Catch: java.lang.Exception -> L1bfe
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L1bfe
            r14 = 204(0xcc, float:2.86E-43)
            short r14 = (short) r14     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r5 = $$c(r5, r7, r14)     // Catch: java.lang.Exception -> L1bfe
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L1bec
            r7 = r0[r24]     // Catch: java.lang.Throwable -> L1bec
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1bec
            r14 = 170(0xaa, float:2.38E-43)
            r14 = r0[r14]     // Catch: java.lang.Throwable -> L1bec
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1bec
            r15 = 217(0xd9, float:3.04E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1bec
            java.lang.String r7 = $$c(r7, r14, r15)     // Catch: java.lang.Throwable -> L1bec
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1bec
            r14 = r0[r18]     // Catch: java.lang.Throwable -> L1bec
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1bec
            r15 = r0[r22]     // Catch: java.lang.Throwable -> L1bec
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1bec
            r23 = r6
            r6 = 232(0xe8, float:3.25E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1bec
            java.lang.String r6 = $$c(r14, r15, r6)     // Catch: java.lang.Throwable -> L1bec
            java.lang.Class[] r14 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L1bec
            java.lang.reflect.Method r6 = r7.getMethod(r6, r14)     // Catch: java.lang.Throwable -> L1bec
            java.lang.Object r5 = r6.invoke(r11, r5)     // Catch: java.lang.Throwable -> L1bec
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L1be3
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L1be3
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1be3
            r0 = r0[r25]     // Catch: java.lang.Throwable -> L1be3
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1be3
            short r7 = (short) r12     // Catch: java.lang.Throwable -> L1be3
            java.lang.String r0 = $$c(r6, r0, r7)     // Catch: java.lang.Throwable -> L1be3
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1be3
            java.lang.Class[] r6 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L1be3
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch: java.lang.Throwable -> L1be3
            java.lang.Object r5 = r0.newInstance(r5)     // Catch: java.lang.Throwable -> L1be3
        L33d:
            if (r10 != 0) goto L3a1
            int r0 = com.appsflyer.internal.AFa1bSDK.$11
            r6 = r0 ^ 59
            r7 = r0 & 59
            int r7 = r7 << 1
            int r6 = r6 + r7
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r6
            if (r8 == 0) goto L3a1
            r6 = r0 & 101(0x65, float:1.42E-43)
            r0 = r0 | 101(0x65, float:1.42E-43)
            int r6 = r6 + r0
            int r6 = r6 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r6
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1bfe
            r6 = r0[r19]     // Catch: java.lang.Exception -> L1bfe
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L1bfe
            r7 = 392(0x188, float:5.5E-43)
            r7 = r0[r7]     // Catch: java.lang.Exception -> L1bfe
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L1bfe
            r10 = 242(0xf2, float:3.39E-43)
            short r10 = (short) r10     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r6 = $$c(r6, r7, r10)     // Catch: java.lang.Exception -> L1bfe
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L398
            r7[r26] = r6     // Catch: java.lang.Throwable -> L398
            r7[r17] = r8     // Catch: java.lang.Throwable -> L398
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L398
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L398
            r10 = r0[r25]     // Catch: java.lang.Throwable -> L398
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L398
            short r14 = (short) r12     // Catch: java.lang.Throwable -> L398
            java.lang.String r6 = $$c(r6, r10, r14)     // Catch: java.lang.Throwable -> L398
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L398
            r10 = r0[r24]     // Catch: java.lang.Throwable -> L398
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L398
            r0 = r0[r25]     // Catch: java.lang.Throwable -> L398
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L398
            java.lang.String r0 = $$c(r10, r0, r14)     // Catch: java.lang.Throwable -> L398
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L398
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r13}     // Catch: java.lang.Throwable -> L398
            java.lang.reflect.Constructor r0 = r6.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L398
            java.lang.Object r10 = r0.newInstance(r7)     // Catch: java.lang.Throwable -> L398
            goto L3a1
        L398:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1bfe
            if (r1 == 0) goto L3a0
            throw r1     // Catch: java.lang.Exception -> L1bfe
        L3a0:
            throw r0     // Catch: java.lang.Exception -> L1bfe
        L3a1:
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1bfe
            r6 = r0[r24]     // Catch: java.lang.Exception -> L1bfe
            byte r6 = (byte) r6     // Catch: java.lang.Exception -> L1bfe
            r7 = r0[r25]     // Catch: java.lang.Exception -> L1bfe
            byte r7 = (byte) r7     // Catch: java.lang.Exception -> L1bfe
            short r12 = (short) r12     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r6 = $$c(r6, r7, r12)     // Catch: java.lang.Exception -> L1bfe
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Exception -> L1bfe
            r7 = 7
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r7)     // Catch: java.lang.Exception -> L1bfe
            java.lang.Object[] r6 = (java.lang.Object[]) r6     // Catch: java.lang.Exception -> L1bfe
            r6[r17] = r11     // Catch: java.lang.Exception -> L1bfe
            r6[r26] = r10     // Catch: java.lang.Exception -> L1bfe
            r6[r3] = r8     // Catch: java.lang.Exception -> L1bfe
            r14 = 3
            r6[r14] = r5     // Catch: java.lang.Exception -> L1bfe
            r15 = 4
            r6[r15] = r10     // Catch: java.lang.Exception -> L1bfe
            r10 = 5
            r6[r10] = r8     // Catch: java.lang.Exception -> L1bfe
            r8 = 6
            r6[r8] = r5     // Catch: java.lang.Exception -> L1bfe
            boolean[] r5 = new boolean[r7]     // Catch: java.lang.Exception -> L1bfe
            r5 = {x1c0e: FILL_ARRAY_DATA , data: [0, 1, 1, 1, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L1bfe
            r28 = r15
            boolean[] r15 = new boolean[r7]     // Catch: java.lang.Exception -> L1bfe
            r15 = {x1c16: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 1, 1, 1} // fill-array     // Catch: java.lang.Exception -> L1bfe
            r29 = r8
            boolean[] r8 = new boolean[r7]     // Catch: java.lang.Exception -> L1bfe
            r8[r17] = r17     // Catch: java.lang.Exception -> L1bfe
            r8[r26] = r17     // Catch: java.lang.Exception -> L1bfe
            r8[r3] = r26     // Catch: java.lang.Exception -> L1bfe
            r8[r14] = r26     // Catch: java.lang.Exception -> L1bfe
            r8[r28] = r17     // Catch: java.lang.Exception -> L1bfe
            r8[r10] = r26     // Catch: java.lang.Exception -> L1bfe
            r8[r29] = r26     // Catch: java.lang.Exception -> L1bfe
            r30 = 136(0x88, float:1.9E-43)
            r31 = 205(0xcd, float:2.87E-43)
            r7 = 26
            r14 = r0[r27]     // Catch: java.lang.ClassNotFoundException -> L44e java.lang.Exception -> L1bfe
            byte r14 = (byte) r14     // Catch: java.lang.ClassNotFoundException -> L44e java.lang.Exception -> L1bfe
            r10 = r0[r31]     // Catch: java.lang.ClassNotFoundException -> L44e java.lang.Exception -> L1bfe
            int r10 = -r10
            byte r10 = (byte) r10
            r34 = r3
            r3 = r10 ^ 226(0xe2, float:3.17E-43)
            r11 = r10 & 226(0xe2, float:3.17E-43)
            r3 = r3 | r11
            short r3 = (short) r3
            java.lang.String r3 = $$c(r14, r10, r3)     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            r10 = 90
            r10 = r0[r10]     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            byte r10 = (byte) r10     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            r0 = r0[r30]     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            byte r0 = (byte) r0     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            r11 = 274(0x112, float:3.84E-43)
            short r11 = (short) r11     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            java.lang.String r0 = $$c(r10, r0, r11)     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            int r0 = r0.getInt(r3)     // Catch: java.lang.ClassNotFoundException -> L44b java.lang.Exception -> L1bfe
            r3 = 34
            if (r0 < r3) goto L424
            r3 = r26
            goto L426
        L424:
            r3 = r17
        L426:
            r10 = 29
            if (r0 != r10) goto L42b
            goto L430
        L42b:
            if (r0 < r7) goto L430
            r10 = r26
            goto L432
        L430:
            r10 = r17
        L432:
            r8[r17] = r10     // Catch: java.lang.ClassNotFoundException -> L451 java.lang.Exception -> L1bfe
            r10 = 21
            if (r0 < r10) goto L43b
            r10 = r26
            goto L43d
        L43b:
            r10 = r17
        L43d:
            r8[r26] = r10     // Catch: java.lang.ClassNotFoundException -> L451 java.lang.Exception -> L1bfe
            r10 = 21
            if (r0 < r10) goto L446
            r0 = r26
            goto L448
        L446:
            r0 = r17
        L448:
            r8[r28] = r0     // Catch: java.lang.ClassNotFoundException -> L451 java.lang.Exception -> L1bfe
            goto L451
        L44b:
            r3 = r17
            goto L451
        L44e:
            r34 = r3
            goto L44b
        L451:
            r10 = r17
            r11 = r10
        L454:
            if (r10 != 0) goto L1be2
            r14 = 9
            if (r11 >= r14) goto L1be2
            boolean r0 = r8[r11]     // Catch: java.lang.Exception -> L1bfe
            if (r0 == 0) goto L1ba0
            int r0 = com.appsflyer.internal.AFa1bSDK.$10
            r36 = r0 | 93
            int r36 = r36 << 1
            r0 = r0 ^ 93
            int r0 = r36 - r0
            r36 = r14
            int r14 = r0 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r14
            int r0 = r0 % 2
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            r38 = r3
            r39 = 102(0x66, float:1.43E-43)
            r40 = 451(0x1c3, float:6.32E-43)
            r41 = 488(0x1e8, float:6.84E-43)
            if (r0 == 0) goto L1aa5
            boolean r42 = r5[r11]     // Catch: java.lang.Throwable -> L1a89
            r0 = r6[r11]     // Catch: java.lang.Throwable -> L1a89
            boolean r43 = r15[r11]     // Catch: java.lang.Throwable -> L1a89
            r44 = 1109(0x455, float:1.554E-42)
            r45 = 52
            r46 = 810(0x32a, float:1.135E-42)
            if (r42 == 0) goto L56c
            if (r0 == 0) goto L4f5
            int r14 = r14 + 17
            int r14 = r14 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r14
            byte[] r14 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L4d0
            r3 = r14[r24]     // Catch: java.lang.Throwable -> L4d0
            byte r3 = (byte) r3
            r47 = r5
            r5 = r14[r25]     // Catch: java.lang.Throwable -> L4cc
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L4cc
            java.lang.String r3 = $$c(r3, r5, r12)     // Catch: java.lang.Throwable -> L4cc
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L4cc
            r5 = r14[r19]     // Catch: java.lang.Throwable -> L4cc
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L4cc
            r48 = 797(0x31d, float:1.117E-42)
            r14 = r14[r48]     // Catch: java.lang.Throwable -> L4cc
            byte r14 = (byte) r14
            r48 = r6
            r6 = 280(0x118, float:3.92E-43)
            short r6 = (short) r6
            java.lang.String r5 = $$c(r5, r14, r6)     // Catch: java.lang.Throwable -> L4ca
            r6 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L4ca
            java.lang.Object r3 = r3.invoke(r0, r6)     // Catch: java.lang.Throwable -> L4ca
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L4ca
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L4ca
            if (r3 == 0) goto L4f9
        L4c6:
            r49 = r8
            goto L572
        L4ca:
            r0 = move-exception
            goto L4d4
        L4cc:
            r0 = move-exception
        L4cd:
            r48 = r6
            goto L4d4
        L4d0:
            r0 = move-exception
            r47 = r5
            goto L4cd
        L4d4:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L4db
            if (r3 == 0) goto L4f4
            throw r3     // Catch: java.lang.Throwable -> L4db
        L4db:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r49 = r8
            r50 = r9
            r53 = r10
            r57 = r11
            r63 = r12
            r54 = r15
        L4ec:
            r32 = 3
            r33 = 5
        L4f0:
            r37 = 26
            goto L1ac8
        L4f4:
            throw r0     // Catch: java.lang.Throwable -> L4db
        L4f5:
            r47 = r5
            r48 = r6
        L4f9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L568
            r3.<init>()     // Catch: java.lang.Throwable -> L568
            byte[] r5 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L568
            r6 = r5[r39]     // Catch: java.lang.Throwable -> L568
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L568
            r14 = r5[r46]     // Catch: java.lang.Throwable -> L568
            byte r14 = (byte) r14
            r36 = r5
            r49 = r8
            r5 = r27
            short r8 = (short) r5
            java.lang.String r5 = $$c(r6, r14, r8)     // Catch: java.lang.Throwable -> L555
            r3.append(r5)     // Catch: java.lang.Throwable -> L555
            r3.append(r0)     // Catch: java.lang.Throwable -> L555
            r0 = r36[r44]     // Catch: java.lang.Throwable -> L555
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L555
            r5 = r36[r45]     // Catch: java.lang.Throwable -> L555
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L555
            r6 = 291(0x123, float:4.08E-43)
            short r8 = (short) r6     // Catch: java.lang.Throwable -> L555
            java.lang.String r0 = $$c(r0, r5, r8)     // Catch: java.lang.Throwable -> L555
            r3.append(r0)     // Catch: java.lang.Throwable -> L555
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L555
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L54d
            r3 = r36[r24]     // Catch: java.lang.Throwable -> L54d
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L54d
            r5 = r36[r41]     // Catch: java.lang.Throwable -> L54d
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L54d
            java.lang.String r3 = $$c(r3, r5, r8)     // Catch: java.lang.Throwable -> L54d
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L54d
            java.lang.Class[] r5 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L54d
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L54d
            java.lang.Object r0 = r3.newInstance(r0)     // Catch: java.lang.Throwable -> L54d
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L54d
            throw r0     // Catch: java.lang.Throwable -> L54d
        L54d:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L555
            if (r3 == 0) goto L567
            throw r3     // Catch: java.lang.Throwable -> L555
        L555:
            r0 = move-exception
        L556:
            r5 = r1
            r62 = r2
            r1 = r7
            r50 = r9
        L55c:
            r53 = r10
        L55e:
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            goto L4ec
        L567:
            throw r0     // Catch: java.lang.Throwable -> L555
        L568:
            r0 = move-exception
            r49 = r8
            goto L556
        L56c:
            r47 = r5
            r48 = r6
            goto L4c6
        L572:
            if (r42 == 0) goto L8fb
            java.util.Random r5 = new java.util.Random     // Catch: java.lang.Throwable -> L8f7
            r5.<init>()     // Catch: java.lang.Throwable -> L8f7
            byte[] r6 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L8eb
            r8 = r6[r24]     // Catch: java.lang.Throwable -> L8eb
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L8eb
            r14 = 170(0xaa, float:2.38E-43)
            r14 = r6[r14]     // Catch: java.lang.Throwable -> L8eb
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L8eb
            r3 = 217(0xd9, float:3.04E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L8eb
            java.lang.String r3 = $$c(r8, r14, r3)     // Catch: java.lang.Throwable -> L8eb
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L8eb
            r8 = r6[r19]     // Catch: java.lang.Throwable -> L8eb
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L8eb
            r14 = 175(0xaf, float:2.45E-43)
            r6 = r6[r14]     // Catch: java.lang.Throwable -> L8eb
            byte r6 = (byte) r6
            r14 = r6 ^ 277(0x115, float:3.88E-43)
            r50 = r9
            r9 = r6 & 277(0x115, float:3.88E-43)
            r9 = r9 | r14
            short r9 = (short) r9
            java.lang.String r6 = $$c(r8, r6, r9)     // Catch: java.lang.Throwable -> L8e7
            r8 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r6, r8)     // Catch: java.lang.Throwable -> L8e7
            java.lang.Object r3 = r3.invoke(r8, r8)     // Catch: java.lang.Throwable -> L8e7
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L8e7
            long r8 = r3.longValue()     // Catch: java.lang.Throwable -> L8e7
            r51 = -1617731152(0xffffffff9f9361b0, double:NaN)
            long r8 = r8 ^ r51
            r5.setSeed(r8)     // Catch: java.lang.Throwable -> L8d8
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 0
        L5bd:
            if (r3 != 0) goto L8dc
            if (r6 != 0) goto L5c6
            r51 = r3
            r3 = r29
            goto L5e1
        L5c6:
            if (r8 != 0) goto L5db
            int r14 = com.appsflyer.internal.AFa1bSDK.$11
            int r14 = r14 + 49
            r51 = r3
            int r3 = r14 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r3
            int r14 = r14 % 2
            if (r14 == 0) goto L5d9
        L5d6:
            r3 = r28
            goto L5e1
        L5d9:
            r3 = 5
            goto L5e1
        L5db:
            r51 = r3
            if (r9 != 0) goto L5e0
            goto L5d6
        L5e0:
            r3 = 3
        L5e1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d8
            r52 = r6
            int r6 = r3 + 1
            r14.<init>(r6)     // Catch: java.lang.Throwable -> L8d8
            r6 = 46
            r14.append(r6)     // Catch: java.lang.Throwable -> L8d8
            r6 = r17
        L5f1:
            if (r6 >= r3) goto L6d4
            r53 = r3
            r54 = r6
            if (r43 == 0) goto L661
            r3 = 26
            int r6 = r5.nextInt(r3)     // Catch: java.lang.Throwable -> L65a
            boolean r3 = r5.nextBoolean()     // Catch: java.lang.Throwable -> L65a
            if (r3 == 0) goto L613
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            int r3 = ~r6
            int r3 = 64 - r3
            r56 = r8
            r55 = r9
            goto L653
        L613:
            r3 = r8
            r55 = r9
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65a
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L65a
            int r9 = r6 * 217
            r56 = r3
            r3 = r9 | (-20640(0xffffffffffffaf60, float:NaN))
            int r3 = r3 << 1
            r9 = r9 ^ (-20640(0xffffffffffffaf60, float:NaN))
            int r3 = r3 - r9
            r9 = r6 ^ r8
            r57 = r6 & r8
            r9 = r9 | r57
            int r9 = ~r9     // Catch: java.lang.Throwable -> L65a
            int r9 = r9 * 216
            int r3 = r3 + r9
            r9 = r6 ^ (-97)
            r57 = r6 & (-97)
            r9 = r9 | r57
            r57 = r3
            int r3 = ~r8     // Catch: java.lang.Throwable -> L65a
            r3 = r3 | r9
            int r3 = r3 * (-216)
            int r3 = ~r3     // Catch: java.lang.Throwable -> L65a
            int r3 = r57 - r3
            int r3 = r3 + (-1)
            int r8 = ~r8     // Catch: java.lang.Throwable -> L65a
            r6 = r6 | r8
            int r6 = ~r6     // Catch: java.lang.Throwable -> L65a
            r8 = r6 ^ 96
            r6 = r6 & 96
            r6 = r6 | r8
            int r6 = r6 * 216
            int r6 = -r6
            int r6 = -r6
            r8 = r3 ^ r6
            r3 = r3 & r6
            int r3 = r3 << 1
            int r3 = r3 + r8
        L653:
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L65a
            r14.append(r3)     // Catch: java.lang.Throwable -> L65a
            r57 = r5
            goto L6c8
        L65a:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            goto L55c
        L661:
            r56 = r8
            r55 = r9
            r3 = 12
            int r3 = r5.nextInt(r3)     // Catch: java.lang.Throwable -> L65a
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L65a
            int r6 = (int) r8     // Catch: java.lang.Throwable -> L65a
            int r8 = r3 * 165
            r9 = 1335296(0x146000, float:1.871148E-39)
            int r8 = r8 - r9
            int r9 = ~r6     // Catch: java.lang.Throwable -> L65a
            r57 = r5
            r5 = r9 ^ 8192(0x2000, float:1.14794E-41)
            r58 = r5
            r5 = r9 & 8192(0x2000, float:1.14794E-41)
            r5 = r58 | r5
            int r5 = ~r5     // Catch: java.lang.Throwable -> L65a
            r58 = r3 ^ r5
            r5 = r5 & r3
            r5 = r58 | r5
            int r5 = r5 * (-328)
            r58 = r8 & r5
            r5 = r5 | r8
            int r58 = r58 + r5
            r5 = r3 ^ r6
            r8 = r3 & r6
            r5 = r5 | r8
            int r5 = r5 * 164
            int r5 = ~r5     // Catch: java.lang.Throwable -> L65a
            int r58 = r58 - r5
            int r58 = r58 + (-1)
            int r5 = ~r3     // Catch: java.lang.Throwable -> L65a
            r8 = r5 ^ (-8193(0xffffffffffffdfff, float:NaN))
            r59 = r3
            r3 = -8193(0xffffffffffffdfff, float:NaN)
            r5 = r5 & r3
            r5 = r5 | r8
            int r5 = ~r5     // Catch: java.lang.Throwable -> L65a
            r8 = r3 ^ r6
            r3 = r3 & r6
            r3 = r3 | r8
            int r3 = ~r3     // Catch: java.lang.Throwable -> L65a
            r6 = r5 ^ r3
            r3 = r3 & r5
            r3 = r3 | r6
            r5 = r9 ^ r59
            r6 = r9 & r59
            r5 = r5 | r6
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            int r5 = ~r5     // Catch: java.lang.Throwable -> L65a
            r6 = r3 ^ r5
            r3 = r3 & r5
            r3 = r3 | r6
            int r3 = r3 * 164
            int r3 = -r3
            int r3 = -r3
            r5 = r58 | r3
            int r5 = r5 << 1
            r3 = r58 ^ r3
            int r5 = r5 - r3
            char r3 = (char) r5     // Catch: java.lang.Throwable -> L65a
            r14.append(r3)     // Catch: java.lang.Throwable -> L65a
        L6c8:
            int r6 = r54 + 1
            r3 = r53
            r9 = r55
            r8 = r56
            r5 = r57
            goto L5f1
        L6d4:
            r57 = r5
            r56 = r8
            r55 = r9
            java.lang.String r3 = r14.toString()     // Catch: java.lang.Throwable -> L8d8
            if (r52 != 0) goto L72e
            int r5 = com.appsflyer.internal.AFa1bSDK.$11
            int r5 = r5 + 65
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r5
            r5 = r34
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L725
            r6[r26] = r3     // Catch: java.lang.Throwable -> L725
            r6[r17] = r0     // Catch: java.lang.Throwable -> L725
            byte[] r3 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L725
            r5 = r3[r24]     // Catch: java.lang.Throwable -> L725
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L725
            r8 = r3[r25]     // Catch: java.lang.Throwable -> L725
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L725
            java.lang.String r5 = $$c(r5, r8, r12)     // Catch: java.lang.Throwable -> L725
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L725
            r8 = r3[r24]     // Catch: java.lang.Throwable -> L725
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L725
            r3 = r3[r25]     // Catch: java.lang.Throwable -> L725
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L725
            java.lang.String r3 = $$c(r8, r3, r12)     // Catch: java.lang.Throwable -> L725
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L725
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r13}     // Catch: java.lang.Throwable -> L725
            java.lang.reflect.Constructor r3 = r5.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L725
            java.lang.Object r3 = r3.newInstance(r6)     // Catch: java.lang.Throwable -> L725
            r6 = r3
            r53 = r10
            r3 = r51
        L71f:
            r9 = r55
        L721:
            r8 = r56
            goto L848
        L725:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L65a
            if (r3 == 0) goto L72d
            throw r3     // Catch: java.lang.Throwable -> L65a
        L72d:
            throw r0     // Catch: java.lang.Throwable -> L65a
        L72e:
            if (r56 != 0) goto L775
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L76c
            r6[r26] = r3     // Catch: java.lang.Throwable -> L76c
            r6[r17] = r0     // Catch: java.lang.Throwable -> L76c
            byte[] r3 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L76c
            r5 = r3[r24]     // Catch: java.lang.Throwable -> L76c
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L76c
            r8 = r3[r25]     // Catch: java.lang.Throwable -> L76c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L76c
            java.lang.String r5 = $$c(r5, r8, r12)     // Catch: java.lang.Throwable -> L76c
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L76c
            r8 = r3[r24]     // Catch: java.lang.Throwable -> L76c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L76c
            r3 = r3[r25]     // Catch: java.lang.Throwable -> L76c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L76c
            java.lang.String r3 = $$c(r8, r3, r12)     // Catch: java.lang.Throwable -> L76c
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L76c
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r13}     // Catch: java.lang.Throwable -> L76c
            java.lang.reflect.Constructor r3 = r5.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L76c
            java.lang.Object r3 = r3.newInstance(r6)     // Catch: java.lang.Throwable -> L76c
            r8 = r3
            r53 = r10
            r3 = r51
            r6 = r52
            r9 = r55
            goto L848
        L76c:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L65a
            if (r3 == 0) goto L774
            throw r3     // Catch: java.lang.Throwable -> L65a
        L774:
            throw r0     // Catch: java.lang.Throwable -> L65a
        L775:
            if (r55 != 0) goto L7ba
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L7b1
            r6[r26] = r3     // Catch: java.lang.Throwable -> L7b1
            r6[r17] = r0     // Catch: java.lang.Throwable -> L7b1
            byte[] r3 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L7b1
            r5 = r3[r24]     // Catch: java.lang.Throwable -> L7b1
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L7b1
            r8 = r3[r25]     // Catch: java.lang.Throwable -> L7b1
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L7b1
            java.lang.String r5 = $$c(r5, r8, r12)     // Catch: java.lang.Throwable -> L7b1
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L7b1
            r8 = r3[r24]     // Catch: java.lang.Throwable -> L7b1
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L7b1
            r3 = r3[r25]     // Catch: java.lang.Throwable -> L7b1
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L7b1
            java.lang.String r3 = $$c(r8, r3, r12)     // Catch: java.lang.Throwable -> L7b1
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L7b1
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r13}     // Catch: java.lang.Throwable -> L7b1
            java.lang.reflect.Constructor r3 = r5.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L7b1
            java.lang.Object r3 = r3.newInstance(r6)     // Catch: java.lang.Throwable -> L7b1
            r9 = r3
            r53 = r10
            r3 = r51
            r6 = r52
            goto L721
        L7b1:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L65a
            if (r3 == 0) goto L7b9
            throw r3     // Catch: java.lang.Throwable -> L65a
        L7b9:
            throw r0     // Catch: java.lang.Throwable -> L65a
        L7ba:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8cd
            r6[r26] = r3     // Catch: java.lang.Throwable -> L8cd
            r6[r17] = r0     // Catch: java.lang.Throwable -> L8cd
            byte[] r3 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L8cd
            r5 = r3[r24]     // Catch: java.lang.Throwable -> L8cd
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L8cd
            r8 = r3[r25]     // Catch: java.lang.Throwable -> L8cd
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L8cd
            java.lang.String r5 = $$c(r5, r8, r12)     // Catch: java.lang.Throwable -> L8cd
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L8cd
            r8 = r3[r24]     // Catch: java.lang.Throwable -> L8cd
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L8cd
            r9 = r3[r25]     // Catch: java.lang.Throwable -> L8cd
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L8cd
            java.lang.String r8 = $$c(r8, r9, r12)     // Catch: java.lang.Throwable -> L8cd
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L8cd
            java.lang.Class[] r8 = new java.lang.Class[]{r8, r13}     // Catch: java.lang.Throwable -> L8cd
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r8)     // Catch: java.lang.Throwable -> L8cd
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.Throwable -> L8cd
            java.lang.Object[] r6 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L866
            r8 = r3[r24]     // Catch: java.lang.Throwable -> L866
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L866
            r9 = r3[r31]     // Catch: java.lang.Throwable -> L866
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L866
            r14 = 325(0x145, float:4.55E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L866
            java.lang.String r8 = $$c(r8, r9, r14)     // Catch: java.lang.Throwable -> L866
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L866
            r9 = r3[r24]     // Catch: java.lang.Throwable -> L866
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L866
            r51 = r3
            r3 = r51[r25]     // Catch: java.lang.Throwable -> L866
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L866
            java.lang.String r3 = $$c(r9, r3, r12)     // Catch: java.lang.Throwable -> L866
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L866
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L866
            java.lang.reflect.Constructor r3 = r8.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L866
            java.lang.Object r3 = r3.newInstance(r6)     // Catch: java.lang.Throwable -> L866
            r6 = r51[r24]     // Catch: java.lang.Throwable -> L852
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L852
            r8 = r51[r31]     // Catch: java.lang.Throwable -> L852
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L852
            java.lang.String r6 = $$c(r6, r8, r14)     // Catch: java.lang.Throwable -> L852
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L852
            r8 = r51[r19]     // Catch: java.lang.Throwable -> L852
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L852
            r9 = r51[r46]     // Catch: java.lang.Throwable -> L852
            byte r9 = (byte) r9
            r53 = r10
            r14 = 348(0x15c, float:4.88E-43)
            short r10 = (short) r14
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L850
            r9 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L850
            r6.invoke(r3, r9)     // Catch: java.lang.Throwable -> L850
            r3 = r5
            r6 = r52
            goto L71f
        L848:
            r10 = r53
            r5 = r57
            r34 = 2
            goto L5bd
        L850:
            r0 = move-exception
            goto L855
        L852:
            r0 = move-exception
            r53 = r10
        L855:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
            if (r3 == 0) goto L865
            throw r3     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
        L85c:
            r0 = move-exception
        L85d:
            r5 = r1
            r62 = r2
            r1 = r7
            goto L55e
        L863:
            r0 = move-exception
            goto L871
        L865:
            throw r0     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
        L866:
            r0 = move-exception
            r53 = r10
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
            if (r3 == 0) goto L870
            throw r3     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
        L870:
            throw r0     // Catch: java.lang.Throwable -> L85c java.lang.Exception -> L863
        L871:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85c
            r3.<init>()     // Catch: java.lang.Throwable -> L85c
            byte[] r6 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L85c
            r8 = r6[r39]     // Catch: java.lang.Throwable -> L85c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L85c
            r9 = r6[r46]     // Catch: java.lang.Throwable -> L85c
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L85c
            r10 = 352(0x160, float:4.93E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L85c
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L85c
            r3.append(r8)     // Catch: java.lang.Throwable -> L85c
            r3.append(r5)     // Catch: java.lang.Throwable -> L85c
            r5 = r6[r44]     // Catch: java.lang.Throwable -> L85c
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L85c
            r8 = r6[r45]     // Catch: java.lang.Throwable -> L85c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L85c
            r9 = 291(0x123, float:4.08E-43)
            short r10 = (short) r9     // Catch: java.lang.Throwable -> L85c
            java.lang.String r5 = $$c(r5, r8, r10)     // Catch: java.lang.Throwable -> L85c
            r3.append(r5)     // Catch: java.lang.Throwable -> L85c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L85c
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L8c4
            r8[r26] = r0     // Catch: java.lang.Throwable -> L8c4
            r8[r17] = r3     // Catch: java.lang.Throwable -> L8c4
            r0 = r6[r24]     // Catch: java.lang.Throwable -> L8c4
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L8c4
            r3 = r6[r41]     // Catch: java.lang.Throwable -> L8c4
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L8c4
            java.lang.String r0 = $$c(r0, r3, r10)     // Catch: java.lang.Throwable -> L8c4
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L8c4
            java.lang.Class[] r3 = new java.lang.Class[]{r13, r7}     // Catch: java.lang.Throwable -> L8c4
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L8c4
            java.lang.Object r0 = r0.newInstance(r8)     // Catch: java.lang.Throwable -> L8c4
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L8c4
            throw r0     // Catch: java.lang.Throwable -> L8c4
        L8c4:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L85c
            if (r3 == 0) goto L8cc
            throw r3     // Catch: java.lang.Throwable -> L85c
        L8cc:
            throw r0     // Catch: java.lang.Throwable -> L85c
        L8cd:
            r0 = move-exception
            r53 = r10
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L85c
            if (r3 == 0) goto L8d7
            throw r3     // Catch: java.lang.Throwable -> L85c
        L8d7:
            throw r0     // Catch: java.lang.Throwable -> L85c
        L8d8:
            r0 = move-exception
        L8d9:
            r53 = r10
            goto L85d
        L8dc:
            r51 = r3
            r52 = r6
            r56 = r8
            r55 = r9
        L8e4:
            r53 = r10
            goto L906
        L8e7:
            r0 = move-exception
        L8e8:
            r53 = r10
            goto L8ef
        L8eb:
            r0 = move-exception
            r50 = r9
            goto L8e8
        L8ef:
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> L85c
            if (r3 == 0) goto L8f6
            throw r3     // Catch: java.lang.Throwable -> L85c
        L8f6:
            throw r0     // Catch: java.lang.Throwable -> L85c
        L8f7:
            r0 = move-exception
            r50 = r9
            goto L8d9
        L8fb:
            r50 = r9
            r51 = 0
            r52 = 0
            r55 = 0
            r56 = 0
            goto L8e4
        L906:
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L85c
            r3 = 720(0x2d0, float:1.009E-42)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L85c
            int r3 = -r3
            byte r3 = (byte) r3
            r37 = 26
            r5 = r0[r37]     // Catch: java.lang.Throwable -> L1a77
            byte r5 = (byte) r5
            r6 = r5 ^ 356(0x164, float:4.99E-43)
            r8 = r5 & 356(0x164, float:4.99E-43)
            r6 = r6 | r8
            short r6 = (short) r6
            java.lang.String r3 = $$c(r3, r5, r6)     // Catch: java.lang.Throwable -> L85c
            java.lang.Class<com.appsflyer.internal.AFa1bSDK> r5 = com.appsflyer.internal.AFa1bSDK.class
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L1a5c
            r8 = r0[r18]     // Catch: java.lang.Throwable -> L1a5c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1a5c
            r9 = r0[r22]     // Catch: java.lang.Throwable -> L1a5c
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a5c
            r10 = 404(0x194, float:5.66E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1a5c
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1a5c
            java.lang.Class[] r9 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L1a5c
            java.lang.reflect.Method r8 = r1.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L1a5c
            java.lang.Object r5 = r8.invoke(r5, r6)     // Catch: java.lang.Throwable -> L1a5c
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L1a41
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1a41
            r8 = r0[r25]     // Catch: java.lang.Throwable -> L1a41
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1a41
            r9 = 414(0x19e, float:5.8E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L1a41
            java.lang.String r6 = $$c(r6, r8, r9)     // Catch: java.lang.Throwable -> L1a41
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1a41
            r8 = r0[r18]     // Catch: java.lang.Throwable -> L1a41
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1a41
            r9 = r0[r30]     // Catch: java.lang.Throwable -> L1a41
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1a41
            r10 = 425(0x1a9, float:5.96E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1a41
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1a41
            r9 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L1a41
            java.lang.Object r5 = r6.invoke(r5, r9)     // Catch: java.lang.Throwable -> L1a41
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L1a41
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85c
            r6.<init>()     // Catch: java.lang.Throwable -> L85c
            r8 = 86
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L85c
            r9 = r0[r45]     // Catch: java.lang.Throwable -> L85c
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L85c
            r10 = 431(0x1af, float:6.04E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L85c
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L85c
            r6.append(r8)     // Catch: java.lang.Throwable -> L85c
            r6.append(r3)     // Catch: java.lang.Throwable -> L85c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L85c
            int r6 = r5.lastIndexOf(r6)     // Catch: java.lang.Throwable -> L85c
            r8 = 5
            java.lang.String r5 = r5.substring(r8, r6)     // Catch: java.lang.Throwable -> L1a2e
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L85c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L85c
            r5 = 7542(0x1d76, float:1.0569E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1a14
            r8 = r26
            java.lang.String r3 = r3.substring(r8)     // Catch: java.lang.Throwable -> L1a14
            java.util.zip.ZipEntry r3 = r6.getEntry(r3)     // Catch: java.lang.Throwable -> L1a14
            java.io.InputStream r3 = r6.getInputStream(r3)     // Catch: java.lang.Throwable -> L1a14
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L19ea
            r8 = r0[r24]     // Catch: java.lang.Throwable -> L19ea
            byte r8 = (byte) r8
            r27 = 287(0x11f, float:4.02E-43)
            r9 = r0[r27]     // Catch: java.lang.Throwable -> L19ff
            byte r9 = (byte) r9
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L19ea
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L19ea
            r9 = r0[r24]     // Catch: java.lang.Throwable -> L19ea
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19ea
            r14 = r0[r41]     // Catch: java.lang.Throwable -> L19ea
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L19ea
            r43 = r5
            r5 = 457(0x1c9, float:6.4E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L19ea
            java.lang.String r9 = $$c(r9, r14, r5)     // Catch: java.lang.Throwable -> L19ea
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> L19ea
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L19ea
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L19ea
            java.lang.Object r3 = r8.newInstance(r3)     // Catch: java.lang.Throwable -> L19ea
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L19ce
            r8 = r0[r24]     // Catch: java.lang.Throwable -> L19ce
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L19ce
            r9 = r0[r40]     // Catch: java.lang.Throwable -> L19ce
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19ce
            r14 = r9 ^ 449(0x1c1, float:6.29E-43)
            r54 = r14
            r14 = r9 & 449(0x1c1, float:6.29E-43)
            r14 = r54 | r14
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L19ce
            java.lang.String r8 = $$c(r8, r9, r14)     // Catch: java.lang.Throwable -> L19ce
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L19ce
            r9 = r0[r24]     // Catch: java.lang.Throwable -> L19ce
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19ce
            r14 = r0[r41]     // Catch: java.lang.Throwable -> L19ce
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L19ce
            java.lang.String r5 = $$c(r9, r14, r5)     // Catch: java.lang.Throwable -> L19ce
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L19ce
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L19ce
            java.lang.reflect.Constructor r5 = r8.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> L19ce
            java.lang.Object r3 = r5.newInstance(r3)     // Catch: java.lang.Throwable -> L19ce
            java.lang.Object[] r5 = new java.lang.Object[]{r43}     // Catch: java.lang.Throwable -> L19b9
            r8 = r0[r24]     // Catch: java.lang.Throwable -> L19b9
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L19b9
            r9 = r0[r40]     // Catch: java.lang.Throwable -> L19b9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19b9
            r14 = r9 | 449(0x1c1, float:6.29E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L19b9
            java.lang.String r8 = $$c(r8, r9, r14)     // Catch: java.lang.Throwable -> L19b9
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L19b9
            r9 = r0[r16]     // Catch: java.lang.Throwable -> L19b9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L19b9
            r14 = 127(0x7f, float:1.78E-43)
            r14 = r0[r14]     // Catch: java.lang.Throwable -> L19b9
            byte r14 = (byte) r14
            r54 = r15
            int r15 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L19a6
            r15 = r15 | 448(0x1c0, float:6.28E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L19a6
            java.lang.String r9 = $$c(r9, r14, r15)     // Catch: java.lang.Throwable -> L19a6
            java.lang.Class[] r14 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L19a6
            java.lang.reflect.Method r8 = r8.getMethod(r9, r14)     // Catch: java.lang.Throwable -> L19a6
            r8.invoke(r3, r5)     // Catch: java.lang.Throwable -> L19a6
            int r5 = com.appsflyer.internal.AFa1bSDK.$10
            r8 = r5 ^ 35
            r5 = r5 & 35
            r26 = 1
            int r5 = r5 << 1
            int r8 = r8 + r5
            int r8 = r8 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r8
            r5 = r0[r24]     // Catch: java.lang.Throwable -> L198c
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L198c
            r8 = r0[r40]     // Catch: java.lang.Throwable -> L198c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L198c
            r9 = r8 ^ 449(0x1c1, float:6.29E-43)
            r14 = r8 & 449(0x1c1, float:6.29E-43)
            r9 = r9 | r14
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L198c
            java.lang.String r5 = $$c(r5, r8, r9)     // Catch: java.lang.Throwable -> L198c
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L198c
            r8 = r0[r19]     // Catch: java.lang.Throwable -> L198c
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L198c
            r0 = r0[r46]     // Catch: java.lang.Throwable -> L198c
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L198c
            r14 = 348(0x15c, float:4.88E-43)
            short r9 = (short) r14     // Catch: java.lang.Throwable -> L198c
            java.lang.String r0 = $$c(r8, r0, r9)     // Catch: java.lang.Throwable -> L198c
            r9 = 0
            java.lang.reflect.Method r0 = r5.getMethod(r0, r9)     // Catch: java.lang.Throwable -> L198c
            r0.invoke(r3, r9)     // Catch: java.lang.Throwable -> L198c
            r0 = 22
            r3 = 7502(0x1d4e, float:1.0513E-41)
            r5 = r3
            r3 = r0
            r0 = r5
            r5 = r43
            r43 = r50
            r15 = 0
        La82:
            r14 = 1
            long r8 = (long) r14
            int r14 = r5.length     // Catch: java.lang.Throwable -> La9f
            r57 = r8
            r8 = r17
        La89:
            if (r8 >= r14) goto Lab4
            r59 = 16
            r9 = r5[r8]     // Catch: java.lang.Throwable -> La9f
            r60 = r8
            long r8 = (long) r9     // Catch: java.lang.Throwable -> La9f
            long r61 = r57 << r29
            long r8 = r8 + r61
            long r61 = r57 << r59
            long r8 = r8 + r61
            long r57 = r8 - r57
            int r8 = r60 + 1
            goto La89
        La9f:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
        Laa9:
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
        Laad:
            r33 = 5
            r37 = 26
        Lab1:
            r2 = r0
            goto L1a22
        Lab4:
            r59 = 16
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La9f
            int r8 = (int) r8     // Catch: java.lang.Throwable -> La9f
            int r9 = r3 * 603
            r14 = 33824(0x8420, float:4.7398E-41)
            r60 = r14 & r9
            r9 = r9 | r14
            int r60 = r60 + r9
            int r9 = ~r8     // Catch: java.lang.Throwable -> La9f
            r61 = -113(0xffffffffffffff8f, float:NaN)
            r14 = r61 | r9
            int r14 = ~r14     // Catch: java.lang.Throwable -> La9f
            r62 = r3 ^ r14
            r14 = r14 & r3
            r14 = r62 | r14
            int r14 = r14 * (-602)
            int r14 = -r14
            int r14 = -r14
            r62 = r60 | r14
            r26 = 1
            int r62 = r62 << 1
            r14 = r60 ^ r14
            int r62 = r62 - r14
            int r14 = ~r3     // Catch: java.lang.Throwable -> La9f
            r14 = r61 | r14
            int r14 = ~r14     // Catch: java.lang.Throwable -> La9f
            r60 = r61 ^ r8
            r61 = r61 & r8
            r63 = r9
            r9 = r60 | r61
            int r9 = ~r9     // Catch: java.lang.Throwable -> La9f
            r60 = r14 ^ r9
            r9 = r9 & r14
            r9 = r60 | r9
            r14 = r63 | 112(0x70, float:1.57E-43)
            r14 = r14 | r3
            int r14 = ~r14     // Catch: java.lang.Throwable -> La9f
            r60 = r9 ^ r14
            r9 = r9 & r14
            r9 = r60 | r9
            int r9 = r9 * (-301)
            r14 = r62 ^ r9
            r9 = r62 & r9
            r26 = 1
            int r9 = r9 << 1
            int r14 = r14 + r9
            int r8 = ~r8     // Catch: java.lang.Throwable -> La9f
            r9 = r8 ^ r3
            r8 = r8 & r3
            r8 = r8 | r9
            int r8 = ~r8     // Catch: java.lang.Throwable -> La9f
            int r8 = r8 * 301
            r9 = r14 ^ r8
            r8 = r8 & r14
            int r8 = r8 << 1
            int r9 = r9 + r8
            r8 = r3 & 7519(0x1d5f, float:1.0536E-41)
            r14 = r3 | 7519(0x1d5f, float:1.0536E-41)
            int r8 = r8 + r14
            r8 = r5[r8]     // Catch: java.lang.Throwable -> La9f
            int r8 = r8 + 3
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> La9f
            r5[r9] = r8     // Catch: java.lang.Throwable -> La9f
            int r8 = r5.length     // Catch: java.lang.Throwable -> La9f
            int r8 = r8 - r3
            r9 = 3
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L1975
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L1962
            r34 = 2
            r14[r34] = r8     // Catch: java.lang.Throwable -> L1962
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1962
            r26 = 1
            r14[r26] = r8     // Catch: java.lang.Throwable -> L1962
            r14[r17] = r5     // Catch: java.lang.Throwable -> L1962
            byte[] r5 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L1962
            r8 = r5[r24]     // Catch: java.lang.Throwable -> L1962
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1962
            r9 = 282(0x11a, float:3.95E-43)
            r9 = r5[r9]     // Catch: java.lang.Throwable -> L1962
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1962
            r60 = r3
            int r3 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L1962
            r3 = r3 | 456(0x1c8, float:6.39E-43)
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1962
            java.lang.String r3 = $$c(r8, r9, r3)     // Catch: java.lang.Throwable -> L1962
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1962
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1962
            java.lang.Class[] r9 = new java.lang.Class[]{r2, r8, r8}     // Catch: java.lang.Throwable -> L1962
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r9)     // Catch: java.lang.Throwable -> L1962
            java.lang.Object r3 = r3.newInstance(r14)     // Catch: java.lang.Throwable -> L1962
            java.lang.Object r9 = com.appsflyer.internal.AFa1bSDK.onPause     // Catch: java.lang.Throwable -> La9f
            r14 = 48
            if (r9 != 0) goto Lcee
            com.appsflyer.internal.AFa1bSDK.updateServerUninstallToken = r57     // Catch: java.lang.Throwable -> La9f
            int r9 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch: java.lang.Throwable -> La9f
            int r9 = r9 >> 16
            r57 = -99652427(0xfffffffffa0f6cb5, float:-1.8617582E35)
            r58 = r9 | r57
            r26 = 1
            int r58 = r58 << 1
            r9 = r9 ^ r57
            int r9 = r58 - r9
            long r57 = com.appsflyer.internal.AFa1bSDK.updateServerUninstallToken     // Catch: java.lang.Throwable -> La9f
            long r61 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> La9f
            long r61 = r61 >> r14
            r63 = 1252064985364614760(0x11603a78705cce68, double:5.480358363309107E-225)
            long r61 = r61 + r63
            r63 = r14
            r67 = r15
            long r14 = r57 ^ r61
            int r14 = (int) r14     // Catch: java.lang.Throwable -> La9f
            long r57 = com.appsflyer.internal.AFa1bSDK.updateServerUninstallToken     // Catch: java.lang.Throwable -> La9f
            long r61 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch: java.lang.Throwable -> La9f
            r15 = 32
            long r61 = r61 >> r15
            r64 = 1252064985364614767(0x11603a78705cce6f, double:5.480358363309116E-225)
            long r61 = r61 + r64
            r64 = r14
            long r14 = r57 ^ r61
            int r14 = (int) r14     // Catch: java.lang.Throwable -> La9f
            int[] r14 = new int[r14]     // Catch: java.lang.Throwable -> La9f
            char r15 = android.text.AndroidCharacter.getMirror(r63)     // Catch: java.lang.Throwable -> La9f
            r57 = r15 & (-48)
            r15 = r15 | (-48)
            int r57 = r57 + r15
            long r61 = com.appsflyer.internal.AFa1bSDK.setDebugLog     // Catch: java.lang.Throwable -> La9f
            java.lang.String r15 = ""
            r65 = r3
            r68 = r5
            r5 = r17
            r3 = r63
            int r3 = android.text.TextUtils.indexOf(r15, r3, r5, r5)     // Catch: java.lang.Throwable -> La9f
            int r3 = -r3
            r5 = r14
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> La9f
            int r14 = (int) r14     // Catch: java.lang.Throwable -> La9f
            int r15 = r3 * 569
            int r15 = r15 + 17639
            r58 = r5
            int r5 = ~r3     // Catch: java.lang.Throwable -> La9f
            r63 = r5 ^ (-32)
            r66 = r5 & (-32)
            r69 = r3
            r3 = r63 | r66
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r63 = r3
            int r3 = ~r14     // Catch: java.lang.Throwable -> La9f
            r66 = r5 ^ r3
            r70 = r5 & r3
            r71 = r3
            r3 = r66 | r70
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r66 = r63 ^ r3
            r3 = r63 & r3
            r3 = r66 | r3
            r63 = -32
            r66 = r3
            r3 = r63 | r71
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r70 = r66 ^ r3
            r3 = r66 & r3
            r3 = r70 | r3
            int r3 = r3 * (-1136)
            r66 = r15 ^ r3
            r3 = r3 & r15
            r26 = 1
            int r3 = r3 << 1
            int r66 = r66 + r3
            r3 = r5 | r14
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r15 = r63 ^ r14
            r70 = r63 & r14
            r15 = r15 | r70
            int r15 = ~r15     // Catch: java.lang.Throwable -> La9f
            r3 = r3 | r15
            int r15 = ~r14     // Catch: java.lang.Throwable -> La9f
            r70 = r15 ^ r69
            r69 = r15 & r69
            r71 = r3
            r3 = r70 | r69
            r69 = r3 ^ 31
            r70 = r3 & 31
            r72 = r5
            r5 = r69 | r70
            int r5 = ~r5     // Catch: java.lang.Throwable -> La9f
            r5 = r71 | r5
            int r5 = r5 * (-568)
            int r5 = -r5
            int r5 = -r5
            r69 = r66 | r5
            r26 = 1
            int r69 = r69 << 1
            r5 = r66 ^ r5
            int r69 = r69 - r5
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r5 = r15 | 31
            int r5 = ~r5     // Catch: java.lang.Throwable -> La9f
            r15 = r3 ^ r5
            r3 = r3 & r5
            r3 = r3 | r15
            r5 = r72 ^ (-32)
            r15 = r72 & (-32)
            r5 = r5 | r15
            r15 = r5 ^ r14
            r5 = r5 & r14
            r5 = r5 | r15
            int r5 = ~r5     // Catch: java.lang.Throwable -> La9f
            r3 = r3 | r5
            int r3 = r3 * 568
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            int r69 = r69 - r3
            r26 = 1
            int r3 = r69 + (-1)
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> La9f
            long r14 = r61 >>> r3
            int r3 = (int) r14     // Catch: java.lang.Throwable -> La9f
            r5 = r3 & r9
            int r5 = ~r5     // Catch: java.lang.Throwable -> La9f
            r3 = r3 | r9
            r3 = r3 & r5
            r58[r57] = r3     // Catch: java.lang.Throwable -> La9f
            int r3 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch: java.lang.Throwable -> La9f
            int r3 = r3 >> 16
            int r3 = -r3
            r5 = r3 ^ 1
            r26 = 1
            r3 = r3 & 1
            int r3 = r3 << 1
            int r5 = r5 + r3
            long r14 = com.appsflyer.internal.AFa1bSDK.setDebugLog     // Catch: java.lang.Throwable -> La9f
            int r3 = (int) r14     // Catch: java.lang.Throwable -> La9f
            int r14 = ~r9     // Catch: java.lang.Throwable -> La9f
            r14 = r14 & r3
            int r3 = ~r3     // Catch: java.lang.Throwable -> La9f
            r3 = r3 & r9
            r3 = r3 | r14
            r58[r5] = r3     // Catch: java.lang.Throwable -> La9f
            int r3 = com.appsflyer.internal.AFa1bSDK.setUserFirstName     // Catch: java.lang.Throwable -> La9f
            byte[] r5 = com.appsflyer.internal.AFa1bSDK.setCustomerUserId     // Catch: java.lang.Throwable -> La9f
            int r9 = com.appsflyer.internal.AFa1bSDK.setUserPhone     // Catch: java.lang.Throwable -> La9f
            int r14 = com.appsflyer.internal.AFa1bSDK.$10
            int r14 = r14 + 95
            int r14 = r14 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r14
            r14 = r29
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch: java.lang.Throwable -> Lce5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lce5
            r33 = 5
            r15[r33] = r9     // Catch: java.lang.Throwable -> Lce5
            java.lang.Integer r9 = java.lang.Integer.valueOf(r64)     // Catch: java.lang.Throwable -> Lce5
            r15[r28] = r9     // Catch: java.lang.Throwable -> Lce5
            r32 = 3
            r15[r32] = r5     // Catch: java.lang.Throwable -> Lce5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lce5
            r34 = 2
            r15[r34] = r3     // Catch: java.lang.Throwable -> Lce5
            r26 = 1
            r15[r26] = r58     // Catch: java.lang.Throwable -> Lce5
            r17 = 0
            r15[r17] = r65     // Catch: java.lang.Throwable -> Lce5
            r3 = r68[r19]     // Catch: java.lang.Throwable -> Lce5
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> Lce5
            r5 = 191(0xbf, float:2.68E-43)
            r5 = r68[r5]     // Catch: java.lang.Throwable -> Lce5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> Lce5
            r9 = 532(0x214, float:7.45E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> Lce5
            java.lang.String r3 = $$c(r3, r5, r9)     // Catch: java.lang.Throwable -> Lce5
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> Lce5
            r5 = r68[r24]     // Catch: java.lang.Throwable -> Lce5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> Lce5
            r9 = r68[r41]     // Catch: java.lang.Throwable -> Lce5
            int r9 = -r9
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Lce5
            r14 = 457(0x1c9, float:6.4E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> Lce5
            java.lang.String r5 = $$c(r5, r9, r14)     // Catch: java.lang.Throwable -> Lce5
            java.lang.Class r61 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> Lce5
            java.lang.Class<int[]> r62 = int[].class
            java.lang.Class<byte[]> r64 = byte[].class
            r65 = r8
            r66 = r8
            r63 = r8
            java.lang.Class[] r5 = new java.lang.Class[]{r61, r62, r63, r64, r65, r66}     // Catch: java.lang.Throwable -> Lce5
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Throwable -> Lce5
            java.lang.Object r3 = r3.newInstance(r15)     // Catch: java.lang.Throwable -> Lce5
            r58 = r6
            r57 = r11
            r32 = 3
            goto Ld9e
        Lce5:
            r0 = move-exception
            java.lang.Throwable r3 = r0.getCause()     // Catch: java.lang.Throwable -> La9f
            if (r3 == 0) goto Lced
            throw r3     // Catch: java.lang.Throwable -> La9f
        Lced:
            throw r0     // Catch: java.lang.Throwable -> La9f
        Lcee:
            r65 = r3
            r68 = r5
            r67 = r15
            com.appsflyer.internal.AFa1bSDK.setAndroidIdData = r57     // Catch: java.lang.Throwable -> La9f
            long r14 = android.os.Process.getElapsedCpuTime()     // Catch: java.lang.Throwable -> La9f
            r63 = 48
            long r14 = r14 >> r63
            r61 = 6535508364628220148(0x5ab2ca3b244258f4, double:8.14036973661956E128)
            long r61 = r61 - r14
            long r14 = r57 ^ r61
            int r3 = (int) r14
            r5 = r59
            byte[] r14 = new byte[r5]     // Catch: java.lang.Throwable -> L1952
            r14 = {x1c1e: FILL_ARRAY_DATA , data: [-105, 69, 100, -36, -101, 60, -120, 24, -81, -55, -125, 48, 6, 36, -50, 76} // fill-array     // Catch: java.lang.Throwable -> L1952
            long r57 = com.appsflyer.internal.AFa1bSDK.setAndroidIdData     // Catch: java.lang.Throwable -> La9f
            long r61 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La9f
            r63 = 48
            long r61 = r61 >> r63
            r63 = 6535508365469389164(0x5ab2ca3b5665916c, double:8.140371031297168E128)
            long r61 = r61 + r63
            r5 = r14
            long r14 = r57 ^ r61
            int r14 = (int) r14
            int r15 = com.appsflyer.internal.AFa1bSDK.$11
            r57 = r15 & 117(0x75, float:1.64E-43)
            r15 = r15 | 117(0x75, float:1.64E-43)
            int r15 = r57 + r15
            int r15 = r15 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r15
            r15 = r28
            r28 = r3
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch: java.lang.Throwable -> L193b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L193b
            r32 = 3
            r3[r32] = r14     // Catch: java.lang.Throwable -> L1932
            r34 = 2
            r3[r34] = r5     // Catch: java.lang.Throwable -> L1932
            java.lang.Integer r5 = java.lang.Integer.valueOf(r28)     // Catch: java.lang.Throwable -> L1932
            r26 = 1
            r3[r26] = r5     // Catch: java.lang.Throwable -> L1932
            r17 = 0
            r3[r17] = r65     // Catch: java.lang.Throwable -> L1932
            r5 = r68[r19]     // Catch: java.lang.Throwable -> L1932
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1932
            r14 = r68[r18]     // Catch: java.lang.Throwable -> L1932
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1932
            r15 = r14 ^ 546(0x222, float:7.65E-43)
            r57 = r15
            r15 = r14 & 546(0x222, float:7.65E-43)
            r15 = r57 | r15
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1932
            java.lang.String r5 = $$c(r5, r14, r15)     // Catch: java.lang.Throwable -> L1932
            java.lang.Object r14 = com.appsflyer.internal.AFa1bSDK.getSdkVersion     // Catch: java.lang.Throwable -> L1932
            java.lang.ClassLoader r14 = (java.lang.ClassLoader) r14     // Catch: java.lang.Throwable -> L1932
            r15 = 1
            java.lang.Class r5 = java.lang.Class.forName(r5, r15, r14)     // Catch: java.lang.Throwable -> L1932
            r14 = 188(0xbc, float:2.63E-43)
            r14 = r68[r14]     // Catch: java.lang.Throwable -> L1932
            int r14 = -r14
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1932
            r15 = 797(0x31d, float:1.117E-42)
            r15 = r68[r15]     // Catch: java.lang.Throwable -> L1932
            byte r15 = (byte) r15
            r57 = r11
            r11 = 594(0x252, float:8.32E-43)
            short r11 = (short) r11
            java.lang.String r11 = $$c(r14, r15, r11)     // Catch: java.lang.Throwable -> L1929
            r14 = r68[r24]     // Catch: java.lang.Throwable -> L1929
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1929
            r15 = r68[r41]     // Catch: java.lang.Throwable -> L1929
            int r15 = -r15
            byte r15 = (byte) r15
            r58 = r6
            r6 = 457(0x1c9, float:6.4E-43)
            short r6 = (short) r6
            java.lang.String r6 = $$c(r14, r15, r6)     // Catch: java.lang.Throwable -> L1919
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1919
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r8, r2, r8}     // Catch: java.lang.Throwable -> L1919
            java.lang.reflect.Method r5 = r5.getMethod(r11, r6)     // Catch: java.lang.Throwable -> L1919
            java.lang.Object r3 = r5.invoke(r9, r3)     // Catch: java.lang.Throwable -> L1919
        Ld9e:
            r5 = r68[r24]     // Catch: java.lang.Throwable -> L1913
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1913
            r6 = r68[r41]     // Catch: java.lang.Throwable -> L1913
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1913
            r9 = 457(0x1c9, float:6.4E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L1913
            java.lang.String r5 = $$c(r5, r6, r9)     // Catch: java.lang.Throwable -> L1913
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1913
            r6 = r68[r36]     // Catch: java.lang.Throwable -> L1913
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1913
            r11 = 156(0x9c, float:2.19E-43)
            r14 = r68[r11]     // Catch: java.lang.Throwable -> L1913
            byte r14 = (byte) r14     // Catch: java.lang.Throwable -> L1913
            r15 = 601(0x259, float:8.42E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1913
            java.lang.String r6 = $$c(r6, r14, r15)     // Catch: java.lang.Throwable -> L1913
            java.lang.Class r14 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L1913
            java.lang.Class[] r14 = new java.lang.Class[]{r14}     // Catch: java.lang.Throwable -> L1913
            java.lang.reflect.Method r5 = r5.getMethod(r6, r14)     // Catch: java.lang.Throwable -> L1913
            r59 = 16
            java.lang.Integer r6 = java.lang.Integer.valueOf(r59)     // Catch: java.lang.Throwable -> L1913
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1913
            r5.invoke(r3, r6)     // Catch: java.lang.Throwable -> L1913
            if (r42 == 0) goto L124c
            int r6 = com.appsflyer.internal.AFa1bSDK.$10
            r14 = r6 & 33
            r6 = r6 | 33
            int r14 = r14 + r6
            int r14 = r14 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r14
            java.lang.Object r6 = com.appsflyer.internal.AFa1bSDK.onPause     // Catch: java.lang.Throwable -> L1247
            if (r6 != 0) goto Ldf3
            r15 = r14 & 7
            r14 = r14 | 7
            int r15 = r15 + r14
            int r15 = r15 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r15
            r14 = r52
            goto Ldf5
        Ldf3:
            r14 = r56
        Ldf5:
            if (r6 != 0) goto Ldfa
            r6 = r55
            goto Ldfc
        Ldfa:
            r6 = r51
        Ldfc:
            r15 = r68[r24]     // Catch: java.lang.Throwable -> L1247
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1247
            r59 = 37
            r5 = r68[r41]     // Catch: java.lang.Throwable -> L1247
            int r5 = -r5
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1247
            java.lang.String r5 = $$c(r15, r5, r9)     // Catch: java.lang.Throwable -> L1247
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1247
            r15 = r68[r16]     // Catch: java.lang.Throwable -> L1247
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L1247
            r61 = r11
            r11 = r68[r61]     // Catch: java.lang.Throwable -> L1247
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1247
            r62 = r10
            r10 = 604(0x25c, float:8.46E-43)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1247
            java.lang.String r10 = $$c(r15, r11, r10)     // Catch: java.lang.Throwable -> L1247
            java.lang.Class[] r11 = new java.lang.Class[]{r2, r8, r8}     // Catch: java.lang.Throwable -> L1247
            java.lang.reflect.Method r5 = r5.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L1247
            r10 = r68[r24]     // Catch: java.lang.Throwable -> L1247
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L1247
            r11 = r68[r31]     // Catch: java.lang.Throwable -> L1247
            int r11 = -r11
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1247
            r15 = 325(0x145, float:4.55E-43)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L1247
            java.lang.String r10 = $$c(r10, r11, r15)     // Catch: java.lang.Throwable -> L1247
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L1247
            r11 = r68[r24]     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            r15 = r68[r25]     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.String r11 = $$c(r11, r15, r12)     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.reflect.Constructor r11 = r10.getConstructor(r11)     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.Object[] r15 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            java.lang.Object r11 = r11.newInstance(r15)     // Catch: java.lang.Throwable -> L114f java.lang.Exception -> L1155
            if (r38 == 0) goto Lea9
            r15 = r68[r24]     // Catch: java.lang.Throwable -> Le8e
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> Le8e
            r63 = r9
            r9 = r68[r25]     // Catch: java.lang.Throwable -> Le8e
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> Le8e
            java.lang.String r9 = $$c(r15, r9, r12)     // Catch: java.lang.Throwable -> Le8e
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.Throwable -> Le8e
            r15 = r68[r36]     // Catch: java.lang.Throwable -> Le8e
            byte r15 = (byte) r15
            r64 = r7
            r7 = r68[r22]     // Catch: java.lang.Throwable -> Le8a
            byte r7 = (byte) r7
            r65 = r1
            r1 = 607(0x25f, float:8.5E-43)
            short r1 = (short) r1
            java.lang.String r1 = $$c(r15, r7, r1)     // Catch: java.lang.Throwable -> Le88
            r7 = 0
            java.lang.reflect.Method r1 = r9.getMethod(r1, r7)     // Catch: java.lang.Throwable -> Le88
            java.lang.Object r1 = r1.invoke(r14, r7)     // Catch: java.lang.Throwable -> Le88
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> Le88
            r1.getClass()     // Catch: java.lang.Throwable -> Le88
            goto Leaf
        Le88:
            r0 = move-exception
            goto Le93
        Le8a:
            r0 = move-exception
            r65 = r1
            goto Le93
        Le8e:
            r0 = move-exception
            r65 = r1
            r64 = r7
        Le93:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> Le9a java.lang.Exception -> Lea2
            if (r1 == 0) goto Lea8
            throw r1     // Catch: java.lang.Throwable -> Le9a java.lang.Exception -> Lea2
        Le9a:
            r0 = move-exception
            r9 = r2
        Le9c:
            r1 = r64
            r5 = r65
            goto L11c2
        Lea2:
            r0 = move-exception
            r9 = r2
            r5 = r65
            goto L115a
        Lea8:
            throw r0     // Catch: java.lang.Throwable -> Le9a java.lang.Exception -> Lea2
        Lea9:
            r65 = r1
            r64 = r7
            r63 = r9
        Leaf:
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r1]     // Catch: java.lang.Throwable -> L114c
            r37 = 26
            r9 = r68[r37]     // Catch: java.lang.Throwable -> L114c
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L114c
            r15 = r68[r46]     // Catch: java.lang.Throwable -> L114c
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L114c
            r1 = r15 ^ 577(0x241, float:8.09E-43)
            r68 = r1
            r1 = r15 & 577(0x241, float:8.09E-43)
            r1 = r68 | r1
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L114c
            java.lang.String r1 = $$c(r9, r15, r1)     // Catch: java.lang.Throwable -> L114c
            java.lang.Class[] r8 = new java.lang.Class[]{r2, r8, r8}     // Catch: java.lang.Throwable -> L114c
            java.lang.reflect.Method r1 = r10.getMethod(r1, r8)     // Catch: java.lang.Throwable -> L114c
        Led6:
            if (r0 <= 0) goto Lf65
            r8 = 1024(0x400, float:1.435E-42)
            int r9 = java.lang.Math.min(r8, r0)     // Catch: java.lang.Throwable -> Le9a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le9a
            java.lang.Object[] r9 = new java.lang.Object[]{r7, r4, r9}     // Catch: java.lang.Throwable -> Le9a
            java.lang.Object r9 = r5.invoke(r3, r9)     // Catch: java.lang.Throwable -> Le9a
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> Le9a
            int r15 = r9.intValue()     // Catch: java.lang.Throwable -> Le9a
            r8 = -1
            if (r15 == r8) goto Lf65
            java.lang.Object[] r8 = new java.lang.Object[]{r7, r4, r9}     // Catch: java.lang.Throwable -> Le9a
            r1.invoke(r11, r8)     // Catch: java.lang.Throwable -> Le9a
            int r8 = -r15
            r15 = r1
            r9 = r2
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lf62
            int r1 = (int) r1
            int r2 = r8 * (-751)
            r68 = r1
            int r1 = r0 * (-751)
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            r26 = 1
            int r2 = r2 + (-1)
            int r1 = ~r8
            r69 = r1
            int r1 = ~r0
            r70 = r69 ^ r1
            r71 = r69 & r1
            r72 = r1
            r1 = r70 | r71
            int r1 = ~r1
            r70 = r69 ^ r68
            r71 = r69 & r68
            r73 = r1
            r1 = r70 | r71
            int r1 = ~r1
            r1 = r73 | r1
            int r1 = r1 * 1504
            int r1 = -r1
            int r1 = -r1
            int r1 = ~r1
            int r2 = r2 - r1
            r26 = 1
            int r2 = r2 + (-1)
            r1 = r69 ^ r0
            r0 = r69 & r0
            r0 = r0 | r1
            r1 = r0 ^ r68
            r68 = r0 & r68
            r1 = r1 | r68
            int r1 = ~r1
            int r1 = r1 * (-1504)
            int r1 = ~r1
            int r2 = r2 - r1
            r26 = 1
            int r2 = r2 + (-1)
            int r0 = ~r0
            r1 = r72 ^ r8
            r8 = r72 & r8
            r1 = r1 | r8
            int r1 = ~r1
            r8 = r0 ^ r1
            r0 = r0 & r1
            r0 = r0 | r8
            int r0 = r0 * 752
            int r0 = -r0
            int r0 = -r0
            r1 = r2 | r0
            r26 = 1
            int r1 = r1 << 1
            r0 = r0 ^ r2
            int r0 = r1 - r0
            r2 = r9
            r1 = r15
            goto Led6
        Lf62:
            r0 = move-exception
            goto Le9c
        Lf65:
            r9 = r2
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L112d
            r1 = r0[r18]     // Catch: java.lang.Throwable -> L112d
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L112d
            r2 = r0[r46]     // Catch: java.lang.Throwable -> L112d
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L112d
            int r3 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L112d
            r5 = r3 ^ 576(0x240, float:8.07E-43)
            r7 = r3 & 576(0x240, float:8.07E-43)
            r5 = r5 | r7
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L112d
            java.lang.String r1 = $$c(r1, r2, r5)     // Catch: java.lang.Throwable -> L112d
            r7 = 0
            java.lang.reflect.Method r1 = r10.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L112d
            java.lang.Object r1 = r1.invoke(r11, r7)     // Catch: java.lang.Throwable -> L112d
            r2 = r0[r24]     // Catch: java.lang.Throwable -> L112d
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L112d
            r5 = r0[r20]     // Catch: java.lang.Throwable -> L112d
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L112d
            r7 = r3 ^ 580(0x244, float:8.13E-43)
            r8 = r3 & 580(0x244, float:8.13E-43)
            r7 = r7 | r8
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L112d
            java.lang.String r2 = $$c(r2, r5, r7)     // Catch: java.lang.Throwable -> L112d
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L112d
            r5 = r0[r36]     // Catch: java.lang.Throwable -> L112d
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L112d
            r7 = r0[r61]     // Catch: java.lang.Throwable -> L112d
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L112d
            r8 = 650(0x28a, float:9.11E-43)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L112d
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch: java.lang.Throwable -> L112d
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L112d
            r2.invoke(r1, r7)     // Catch: java.lang.Throwable -> L112d
            r1 = r0[r19]     // Catch: java.lang.Throwable -> L112d
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L112d
            r2 = r0[r46]     // Catch: java.lang.Throwable -> L112d
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L112d
            r5 = 348(0x15c, float:4.88E-43)
            short r8 = (short) r5     // Catch: java.lang.Throwable -> L112d
            java.lang.String r1 = $$c(r1, r2, r8)     // Catch: java.lang.Throwable -> L112d
            java.lang.reflect.Method r1 = r10.getMethod(r1, r7)     // Catch: java.lang.Throwable -> L112d
            r1.invoke(r11, r7)     // Catch: java.lang.Throwable -> L112d
            r1 = r0[r59]     // Catch: java.lang.Throwable -> L112d
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L112d
            r2 = r0[r21]     // Catch: java.lang.Throwable -> L112d
            int r2 = -r2
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L112d
            r5 = 653(0x28d, float:9.15E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L112d
            java.lang.String r1 = $$c(r1, r2, r5)     // Catch: java.lang.Throwable -> L112d
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L112d
            r2 = 219(0xdb, float:3.07E-43)
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L112d
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L112d
            r5 = r0[r30]     // Catch: java.lang.Throwable -> L112d
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L112d
            r7 = 673(0x2a1, float:9.43E-43)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L112d
            java.lang.String r2 = $$c(r2, r5, r7)     // Catch: java.lang.Throwable -> L112d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L112d
            java.lang.Class[] r5 = new java.lang.Class[]{r13, r13, r5}     // Catch: java.lang.Throwable -> L112d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.Throwable -> L112d
            int r2 = com.appsflyer.internal.AFa1bSDK.$10
            r5 = r2 & 69
            r2 = r2 | 69
            int r5 = r5 + r2
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r5
            r2 = r0[r24]     // Catch: java.lang.Throwable -> L1141
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1141
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L1141
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1141
            java.lang.String r2 = $$c(r2, r5, r12)     // Catch: java.lang.Throwable -> L1141
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1141
            r5 = r0[r18]     // Catch: java.lang.Throwable -> L1141
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1141
            r7 = 882(0x372, float:1.236E-42)
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L1141
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1141
            r8 = r7 ^ 645(0x285, float:9.04E-43)
            r10 = r7 & 645(0x285, float:9.04E-43)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1141
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch: java.lang.Throwable -> L1141
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L1141
            java.lang.Object r2 = r2.invoke(r14, r7)     // Catch: java.lang.Throwable -> L1141
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r5 = r0[r24]     // Catch: java.lang.Throwable -> L1134
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1134
            r7 = r0[r25]     // Catch: java.lang.Throwable -> L1134
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1134
            java.lang.String r5 = $$c(r5, r7, r12)     // Catch: java.lang.Throwable -> L1134
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L1134
            r7 = r0[r18]     // Catch: java.lang.Throwable -> L1134
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1134
            r8 = 882(0x372, float:1.236E-42)
            r8 = r0[r8]     // Catch: java.lang.Throwable -> L1134
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1134
            r10 = r8 ^ 645(0x285, float:9.04E-43)
            r11 = r8 & 645(0x285, float:9.04E-43)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1134
            java.lang.String r7 = $$c(r7, r8, r10)     // Catch: java.lang.Throwable -> L1134
            r8 = 0
            java.lang.reflect.Method r5 = r5.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L1134
            java.lang.Object r5 = r5.invoke(r6, r8)     // Catch: java.lang.Throwable -> L1134
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r5, r4}     // Catch: java.lang.Throwable -> L112d
            java.lang.Object r1 = r1.invoke(r8, r2)     // Catch: java.lang.Throwable -> L112d
            int r2 = com.appsflyer.internal.AFa1bSDK.$11
            int r2 = r2 + 75
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r2
            r2 = r0[r24]     // Catch: java.lang.Throwable -> L1122
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1122
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L1122
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1122
            java.lang.String r2 = $$c(r2, r5, r12)     // Catch: java.lang.Throwable -> L1122
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1122
            r5 = r0[r59]     // Catch: java.lang.Throwable -> L1122
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1122
            r7 = 1090(0x442, float:1.527E-42)
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L1122
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1122
            r8 = r3 ^ 644(0x284, float:9.02E-43)
            r10 = r3 & 644(0x284, float:9.02E-43)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1122
            java.lang.String r5 = $$c(r5, r7, r8)     // Catch: java.lang.Throwable -> L1122
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L1122
            java.lang.Object r2 = r2.invoke(r14, r7)     // Catch: java.lang.Throwable -> L1122
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1122
            r2.getClass()     // Catch: java.lang.Throwable -> L1122
            int r2 = com.appsflyer.internal.AFa1bSDK.$10
            r5 = r2 & 27
            r2 = r2 | 27
            int r5 = r5 + r2
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r5
            r2 = r0[r24]     // Catch: java.lang.Throwable -> L1117
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1117
            r5 = r0[r25]     // Catch: java.lang.Throwable -> L1117
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1117
            java.lang.String r2 = $$c(r2, r5, r12)     // Catch: java.lang.Throwable -> L1117
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1117
            r5 = r0[r59]     // Catch: java.lang.Throwable -> L1117
            byte r5 = (byte) r5     // Catch: java.lang.Throwable -> L1117
            r7 = 1090(0x442, float:1.527E-42)
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L1117
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1117
            r8 = r3 ^ 644(0x284, float:9.02E-43)
            r3 = r3 & 644(0x284, float:9.02E-43)
            r3 = r3 | r8
            short r3 = (short) r3     // Catch: java.lang.Throwable -> L1117
            java.lang.String r3 = $$c(r5, r7, r3)     // Catch: java.lang.Throwable -> L1117
            r7 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r7)     // Catch: java.lang.Throwable -> L1117
            java.lang.Object r2 = r2.invoke(r6, r7)     // Catch: java.lang.Throwable -> L1117
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1117
            r2.getClass()     // Catch: java.lang.Throwable -> L1117
            java.lang.Object r2 = com.appsflyer.internal.AFa1bSDK.getSdkVersion     // Catch: java.lang.Throwable -> L1105
            if (r2 != 0) goto L1109
            java.lang.Class<com.appsflyer.internal.AFa1bSDK> r2 = com.appsflyer.internal.AFa1bSDK.class
            r3 = r0[r18]     // Catch: java.lang.Throwable -> L10fa
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L10fa
            r0 = r0[r23]     // Catch: java.lang.Throwable -> L10fa
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L10fa
            r5 = 698(0x2ba, float:9.78E-43)
            short r5 = (short) r5     // Catch: java.lang.Throwable -> L10fa
            java.lang.String r0 = $$c(r3, r0, r5)     // Catch: java.lang.Throwable -> L10fa
            r5 = r65
            r7 = 0
            java.lang.reflect.Method r0 = r5.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L10f8
            java.lang.Object r0 = r0.invoke(r2, r7)     // Catch: java.lang.Throwable -> L10f8
            com.appsflyer.internal.AFa1bSDK.getSdkVersion = r0     // Catch: java.lang.Throwable -> L10e6
            goto L110b
        L10e6:
            r0 = move-exception
        L10e7:
            r2 = r0
            r62 = r9
            r63 = r12
        L10ec:
            r3 = r58
            r1 = r64
        L10f0:
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
        L10f4:
            r37 = 26
            goto L1a22
        L10f8:
            r0 = move-exception
            goto L10fd
        L10fa:
            r0 = move-exception
            r5 = r65
        L10fd:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L10e6
            if (r1 == 0) goto L1104
            throw r1     // Catch: java.lang.Throwable -> L10e6
        L1104:
            throw r0     // Catch: java.lang.Throwable -> L10e6
        L1105:
            r0 = move-exception
            r5 = r65
            goto L10e7
        L1109:
            r5 = r65
        L110b:
            r66 = r62
            r65 = r63
            r33 = 5
            r62 = r9
            r63 = r12
            goto L1574
        L1117:
            r0 = move-exception
            r5 = r65
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L10e6
            if (r1 == 0) goto L1121
            throw r1     // Catch: java.lang.Throwable -> L10e6
        L1121:
            throw r0     // Catch: java.lang.Throwable -> L10e6
        L1122:
            r0 = move-exception
            r5 = r65
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L10e6
            if (r1 == 0) goto L112c
            throw r1     // Catch: java.lang.Throwable -> L10e6
        L112c:
            throw r0     // Catch: java.lang.Throwable -> L10e6
        L112d:
            r0 = move-exception
        L112e:
            r5 = r65
        L1130:
            r1 = r64
            goto L11c2
        L1134:
            r0 = move-exception
            r5 = r65
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L113e
            if (r1 == 0) goto L1140
            throw r1     // Catch: java.lang.Throwable -> L113e
        L113e:
            r0 = move-exception
            goto L1130
        L1140:
            throw r0     // Catch: java.lang.Throwable -> L113e
        L1141:
            r0 = move-exception
            r5 = r65
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L113e
            if (r1 == 0) goto L114b
            throw r1     // Catch: java.lang.Throwable -> L113e
        L114b:
            throw r0     // Catch: java.lang.Throwable -> L113e
        L114c:
            r0 = move-exception
            r9 = r2
            goto L112e
        L114f:
            r0 = move-exception
            r5 = r1
            r9 = r2
            r64 = r7
            goto L1130
        L1155:
            r0 = move-exception
            r5 = r1
            r9 = r2
            r64 = r7
        L115a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L113e
            r1.<init>()     // Catch: java.lang.Throwable -> L113e
            byte[] r2 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L113e
            r3 = r2[r39]     // Catch: java.lang.Throwable -> L113e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L113e
            r7 = r2[r46]     // Catch: java.lang.Throwable -> L113e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L113e
            r8 = 617(0x269, float:8.65E-43)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L113e
            java.lang.String r3 = $$c(r3, r7, r8)     // Catch: java.lang.Throwable -> L113e
            r1.append(r3)     // Catch: java.lang.Throwable -> L113e
            r1.append(r14)     // Catch: java.lang.Throwable -> L113e
            r3 = r2[r44]     // Catch: java.lang.Throwable -> L113e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L113e
            r7 = r2[r45]     // Catch: java.lang.Throwable -> L113e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L113e
            r8 = 291(0x123, float:4.08E-43)
            short r10 = (short) r8     // Catch: java.lang.Throwable -> L113e
            java.lang.String r3 = $$c(r3, r7, r10)     // Catch: java.lang.Throwable -> L113e
            r1.append(r3)     // Catch: java.lang.Throwable -> L113e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L113e
            r3 = 2
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L11b5
            r26 = 1
            r7[r26] = r0     // Catch: java.lang.Throwable -> L11b5
            r17 = 0
            r7[r17] = r1     // Catch: java.lang.Throwable -> L11b5
            r0 = r2[r24]     // Catch: java.lang.Throwable -> L11b5
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L11b5
            r1 = r2[r41]     // Catch: java.lang.Throwable -> L11b5
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L11b5
            java.lang.String r0 = $$c(r0, r1, r10)     // Catch: java.lang.Throwable -> L11b5
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11b5
            r1 = r64
            java.lang.Class[] r2 = new java.lang.Class[]{r13, r1}     // Catch: java.lang.Throwable -> L11b3
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L11b3
            java.lang.Object r0 = r0.newInstance(r7)     // Catch: java.lang.Throwable -> L11b3
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L11b3
            throw r0     // Catch: java.lang.Throwable -> L11b3
        L11b3:
            r0 = move-exception
            goto L11b8
        L11b5:
            r0 = move-exception
            r1 = r64
        L11b8:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L11bf
            if (r2 == 0) goto L11c1
            throw r2     // Catch: java.lang.Throwable -> L11bf
        L11bf:
            r0 = move-exception
            goto L11c2
        L11c1:
            throw r0     // Catch: java.lang.Throwable -> L11bf
        L11c2:
            byte[] r2 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L123e
            r3 = r2[r24]     // Catch: java.lang.Throwable -> L123e
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L123e
            r7 = r2[r25]     // Catch: java.lang.Throwable -> L123e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L123e
            java.lang.String r3 = $$c(r3, r7, r12)     // Catch: java.lang.Throwable -> L123e
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L123e
            r7 = r2[r59]     // Catch: java.lang.Throwable -> L123e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L123e
            r8 = 1090(0x442, float:1.527E-42)
            r8 = r2[r8]     // Catch: java.lang.Throwable -> L123e
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L123e
            int r10 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L123e
            r11 = r10 ^ 644(0x284, float:9.02E-43)
            r15 = r10 & 644(0x284, float:9.02E-43)
            r11 = r11 | r15
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L123e
            java.lang.String r7 = $$c(r7, r8, r11)     // Catch: java.lang.Throwable -> L123e
            r8 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r7, r8)     // Catch: java.lang.Throwable -> L123e
            java.lang.Object r3 = r3.invoke(r14, r8)     // Catch: java.lang.Throwable -> L123e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L123e
            r3.getClass()     // Catch: java.lang.Throwable -> L123e
            int r3 = com.appsflyer.internal.AFa1bSDK.$11
            int r3 = r3 + 51
            int r3 = r3 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r3
            r3 = r2[r24]     // Catch: java.lang.Throwable -> L1235
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1235
            r7 = r2[r25]     // Catch: java.lang.Throwable -> L1235
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1235
            java.lang.String r3 = $$c(r3, r7, r12)     // Catch: java.lang.Throwable -> L1235
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L1235
            r7 = r2[r59]     // Catch: java.lang.Throwable -> L1235
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1235
            r8 = 1090(0x442, float:1.527E-42)
            r2 = r2[r8]     // Catch: java.lang.Throwable -> L1235
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1235
            r8 = r10 ^ 644(0x284, float:9.02E-43)
            r10 = r10 & 644(0x284, float:9.02E-43)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1235
            java.lang.String r2 = $$c(r7, r2, r8)     // Catch: java.lang.Throwable -> L1235
            r7 = 0
            java.lang.reflect.Method r2 = r3.getMethod(r2, r7)     // Catch: java.lang.Throwable -> L1235
            java.lang.Object r2 = r2.invoke(r6, r7)     // Catch: java.lang.Throwable -> L1235
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1235
            r2.getClass()     // Catch: java.lang.Throwable -> L1235
            throw r0     // Catch: java.lang.Throwable -> L122b
        L122b:
            r0 = move-exception
        L122c:
            r2 = r0
            r62 = r9
            r63 = r12
            r3 = r58
            goto L10f0
        L1235:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L122b
            if (r2 == 0) goto L123d
            throw r2     // Catch: java.lang.Throwable -> L122b
        L123d:
            throw r0     // Catch: java.lang.Throwable -> L122b
        L123e:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L122b
            if (r2 == 0) goto L1246
            throw r2     // Catch: java.lang.Throwable -> L122b
        L1246:
            throw r0     // Catch: java.lang.Throwable -> L122b
        L1247:
            r0 = move-exception
            r5 = r1
            r9 = r2
            r1 = r7
            goto L122c
        L124c:
            r5 = r1
            r1 = r7
            r63 = r9
            r62 = r10
            r61 = r11
            r59 = 37
            r9 = r2
            r0 = r68[r24]     // Catch: java.lang.Throwable -> L18f1
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L18f1
            r2 = 282(0x11a, float:3.95E-43)
            r2 = r68[r2]     // Catch: java.lang.Throwable -> L18f1
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L18f1
            r6 = 711(0x2c7, float:9.96E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L18f1
            java.lang.String r0 = $$c(r0, r2, r6)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L18f1
            r2 = r68[r24]     // Catch: java.lang.Throwable -> L18f1
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L18f1
            r6 = r68[r41]     // Catch: java.lang.Throwable -> L18f1
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18f1
            r7 = r63
            java.lang.String r2 = $$c(r2, r6, r7)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Class[] r6 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L18f1
            java.lang.reflect.Constructor r6 = r0.getConstructor(r6)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L18f1
            java.lang.Object r3 = r6.newInstance(r3)     // Catch: java.lang.Throwable -> L18f1
            r6 = r68[r18]     // Catch: java.lang.Throwable -> L18f1
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18f1
            r10 = r68[r25]     // Catch: java.lang.Throwable -> L18f1
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18f1
            r11 = 738(0x2e2, float:1.034E-42)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L18f1
            java.lang.String r6 = $$c(r6, r10, r11)     // Catch: java.lang.Throwable -> L18f1
            r10 = 0
            java.lang.reflect.Method r0 = r0.getMethod(r6, r10)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Object r0 = r0.invoke(r3, r10)     // Catch: java.lang.Throwable -> L18f1
            r6 = r68[r24]     // Catch: java.lang.Throwable -> L18f1
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18f1
            r10 = r68[r20]     // Catch: java.lang.Throwable -> L18f1
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18f1
            r11 = 749(0x2ed, float:1.05E-42)
            short r11 = (short) r11     // Catch: java.lang.Throwable -> L18f1
            java.lang.String r6 = $$c(r6, r10, r11)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L18f1
            r10 = r68[r18]     // Catch: java.lang.Throwable -> L18f1
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18f1
            r11 = r68[r30]     // Catch: java.lang.Throwable -> L18f1
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L18f1
            r14 = 770(0x302, float:1.079E-42)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L18f1
            java.lang.String r10 = $$c(r10, r11, r14)     // Catch: java.lang.Throwable -> L18f1
            r11 = 0
            java.lang.reflect.Method r6 = r6.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L18f1
            r10 = r68[r16]     // Catch: java.lang.Throwable -> L18f1
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18f1
            r11 = r68[r61]     // Catch: java.lang.Throwable -> L18f1
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L18f1
            r14 = 604(0x25c, float:8.46E-43)
            short r14 = (short) r14     // Catch: java.lang.Throwable -> L18f1
            java.lang.String r10 = $$c(r10, r11, r14)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Class[] r11 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L18f1
            java.lang.reflect.Method r2 = r2.getMethod(r10, r11)     // Catch: java.lang.Throwable -> L18f1
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L18f5
            r10 = r68[r24]     // Catch: java.lang.Throwable -> L18f5
            byte r10 = (byte) r10
            r27 = 287(0x11f, float:4.02E-43)
            r11 = r68[r27]     // Catch: java.lang.Throwable -> L1903
            byte r11 = (byte) r11
            r14 = r62
            java.lang.String r10 = $$c(r10, r11, r14)     // Catch: java.lang.Throwable -> L18f5
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L18f5
            r11 = r68[r24]     // Catch: java.lang.Throwable -> L18f5
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L18f5
            r15 = r68[r41]     // Catch: java.lang.Throwable -> L18f5
            int r15 = -r15
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L18f5
            java.lang.String r11 = $$c(r11, r15, r7)     // Catch: java.lang.Throwable -> L18f5
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch: java.lang.Throwable -> L18f5
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.Throwable -> L18f5
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r11)     // Catch: java.lang.Throwable -> L18f5
            java.lang.Object r3 = r10.newInstance(r3)     // Catch: java.lang.Throwable -> L18f5
            java.lang.Class<com.appsflyer.internal.AFa1bSDK> r10 = com.appsflyer.internal.AFa1bSDK.class
            r11 = r68[r18]     // Catch: java.lang.Throwable -> L18e5
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L18e5
            r15 = r68[r23]     // Catch: java.lang.Throwable -> L18e5
            byte r15 = (byte) r15
            r62 = r9
            r9 = 698(0x2ba, float:9.78E-43)
            short r9 = (short) r9
            java.lang.String r9 = $$c(r11, r15, r9)     // Catch: java.lang.Throwable -> L18d9
            r11 = 0
            java.lang.reflect.Method r9 = r5.getMethod(r9, r11)     // Catch: java.lang.Throwable -> L18d9
            java.lang.Object r9 = r9.invoke(r10, r11)     // Catch: java.lang.Throwable -> L18d9
            r10 = r68[r24]     // Catch: java.lang.Throwable -> L18d5
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L18d5
            r11 = r68[r19]     // Catch: java.lang.Throwable -> L18d5
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L18d5
            r15 = 776(0x308, float:1.087E-42)
            short r15 = (short) r15     // Catch: java.lang.Throwable -> L18d5
            java.lang.String r10 = $$c(r10, r11, r15)     // Catch: java.lang.Throwable -> L18d5
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L18d5
            r11 = 0
            java.lang.reflect.Constructor r15 = r10.getConstructor(r11)     // Catch: java.lang.Throwable -> L18d5
            java.lang.Object r15 = r15.newInstance(r11)     // Catch: java.lang.Throwable -> L18d5
            r37 = 26
            r11 = r68[r37]     // Catch: java.lang.Throwable -> L18ca
            byte r11 = (byte) r11
            r63 = r12
            r12 = r68[r46]     // Catch: java.lang.Throwable -> L18c6
            byte r12 = (byte) r12
            r64 = r1
            r1 = r12 | 577(0x241, float:8.09E-43)
            short r1 = (short) r1
            java.lang.String r1 = $$c(r11, r12, r1)     // Catch: java.lang.Throwable -> L189c
            r11 = r62
            java.lang.Class[] r8 = new java.lang.Class[]{r11, r8, r8}     // Catch: java.lang.Throwable -> L18c2
            java.lang.reflect.Method r1 = r10.getMethod(r1, r8)     // Catch: java.lang.Throwable -> L18c2
            r8 = 45
            r8 = r68[r8]     // Catch: java.lang.Throwable -> L18c2
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L18c2
            r12 = r68[r22]     // Catch: java.lang.Throwable -> L18c2
            byte r12 = (byte) r12
            r62 = r11
            r11 = 804(0x324, float:1.127E-42)
            short r11 = (short) r11
            java.lang.String r8 = $$c(r8, r12, r11)     // Catch: java.lang.Throwable -> L189c
            r11 = 0
            java.lang.reflect.Method r8 = r10.getMethod(r8, r11)     // Catch: java.lang.Throwable -> L189c
            r10 = r68[r24]     // Catch: java.lang.Throwable -> L189c
            byte r10 = (byte) r10     // Catch: java.lang.Throwable -> L189c
            r11 = 175(0xaf, float:2.45E-43)
            r11 = r68[r11]     // Catch: java.lang.Throwable -> L189c
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L189c
            r12 = r11 ^ 782(0x30e, float:1.096E-42)
            r65 = r12
            r12 = r11 & 782(0x30e, float:1.096E-42)
            r12 = r65 | r12
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L189c
            java.lang.String r10 = $$c(r10, r11, r12)     // Catch: java.lang.Throwable -> L189c
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch: java.lang.Throwable -> L189c
            r11 = r68[r19]     // Catch: java.lang.Throwable -> L189c
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L189c
            r12 = r68[r46]     // Catch: java.lang.Throwable -> L189c
            byte r12 = (byte) r12     // Catch: java.lang.Throwable -> L189c
            r65 = r7
            r66 = r14
            r7 = 348(0x15c, float:4.88E-43)
            short r14 = (short) r7     // Catch: java.lang.Throwable -> L189c
            java.lang.String r7 = $$c(r11, r12, r14)     // Catch: java.lang.Throwable -> L189c
            r11 = 0
            java.lang.reflect.Method r7 = r10.getMethod(r7, r11)     // Catch: java.lang.Throwable -> L189c
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L189c
            r11 = 0
        L13a5:
            java.lang.Object[] r12 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L189c
            java.lang.Object r12 = r2.invoke(r3, r12)     // Catch: java.lang.Throwable -> L189c
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch: java.lang.Throwable -> L189c
            int r14 = r12.intValue()     // Catch: java.lang.Throwable -> L189c
            if (r14 <= 0) goto L13f4
            int r68 = com.appsflyer.internal.AFa1bSDK.$10
            r69 = r68 & 107(0x6b, float:1.5E-43)
            r68 = r68 | 107(0x6b, float:1.5E-43)
            r70 = r2
            int r2 = r69 + r68
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r2
            r68 = r3
            long r2 = (long) r11
            r71 = r2
            r2 = 0
            java.lang.Object r3 = r6.invoke(r0, r2)     // Catch: java.lang.Throwable -> L13ee
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> L13ee
            long r2 = r3.longValue()     // Catch: java.lang.Throwable -> L13ee
            int r2 = (r71 > r2 ? 1 : (r71 == r2 ? 0 : -1))
            if (r2 >= 0) goto L13f2
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r4, r12}     // Catch: java.lang.Throwable -> L13ee
            r1.invoke(r15, r2)     // Catch: java.lang.Throwable -> L13ee
            int r2 = -r14
            int r2 = -r2
            r3 = r11 ^ r2
            r2 = r2 & r11
            r26 = 1
            int r2 = r2 << 1
            int r11 = r3 + r2
            r3 = r68
            r2 = r70
            goto L13a5
        L13ee:
            r0 = move-exception
            r2 = r0
            goto L10ec
        L13f2:
            r11 = 0
            goto L13f7
        L13f4:
            r68 = r3
            goto L13f2
        L13f7:
            java.lang.Object r0 = r8.invoke(r15, r11)     // Catch: java.lang.Throwable -> L189c
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L189c
            r1 = r68
            r7.invoke(r1, r11)     // Catch: java.lang.Throwable -> L13ee java.lang.Exception -> L1405
            r7.invoke(r15, r11)     // Catch: java.lang.Throwable -> L13ee java.lang.Exception -> L1405
        L1405:
            byte[] r1 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L189c
            r2 = r1[r59]     // Catch: java.lang.Throwable -> L189c
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L189c
            r3 = r1[r24]     // Catch: java.lang.Throwable -> L189c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L189c
            r6 = 830(0x33e, float:1.163E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L189c
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L189c
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L189c
            r3 = r1[r24]     // Catch: java.lang.Throwable -> L189c
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L189c
            r6 = r1[r41]     // Catch: java.lang.Throwable -> L189c
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L189c
            r7 = 865(0x361, float:1.212E-42)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L189c
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L189c
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L189c
            r6 = r1[r24]     // Catch: java.lang.Throwable -> L189c
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L189c
            r8 = r1[r21]     // Catch: java.lang.Throwable -> L189c
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L189c
            int r10 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L189c
            r11 = r10 ^ 834(0x342, float:1.169E-42)
            r10 = r10 & 834(0x342, float:1.169E-42)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L189c
            java.lang.String r6 = $$c(r6, r8, r10)     // Catch: java.lang.Throwable -> L189c
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L189c
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r6}     // Catch: java.lang.Throwable -> L189c
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L189c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L18a5
            r3 = r1[r24]     // Catch: java.lang.Throwable -> L18a5
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L18a5
            r6 = r1[r41]     // Catch: java.lang.Throwable -> L18a5
            int r6 = -r6
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L18a5
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L18a5
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L18a5
            r37 = 26
            r6 = r1[r37]     // Catch: java.lang.Throwable -> L18b1
            byte r6 = (byte) r6
            r7 = r1[r61]     // Catch: java.lang.Throwable -> L18a5
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L18a5
            r8 = 903(0x387, float:1.265E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L18a5
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L18a5
            java.lang.Class[] r7 = new java.lang.Class[]{r62}     // Catch: java.lang.Throwable -> L18a5
            java.lang.reflect.Method r3 = r3.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L18a5
            r7 = 0
            java.lang.Object r0 = r3.invoke(r7, r0)     // Catch: java.lang.Throwable -> L18a5
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r9}     // Catch: java.lang.Throwable -> L189c
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.Throwable -> L189c
            r2 = r1[r59]     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r3 = 18
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r6 = 906(0x38a, float:1.27E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r3 = 15
            r3 = r1[r3]     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r6 = 797(0x31d, float:1.117E-42)
            r6 = r1[r6]     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r7 = r6 ^ 896(0x380, float:1.256E-42)
            r8 = r6 & 896(0x380, float:1.256E-42)
            r7 = r7 | r8
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r8 = 1
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.Object r3 = r2.get(r9)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r33 = 5
            r7 = r1[r33]     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            byte r7 = (byte) r7
            r8 = r1[r31]     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r10 = 944(0x3b0, float:1.323E-42)
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.String r7 = $$c(r7, r8, r10)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            java.lang.reflect.Field r7 = r6.getDeclaredField(r7)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r8 = 1
            r7.setAccessible(r8)     // Catch: java.lang.Throwable -> L181a java.lang.Exception -> L1822
            r33 = 5
            r8 = r1[r33]     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            byte r8 = (byte) r8     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r10 = 954(0x3ba, float:1.337E-42)
            r10 = r1[r10]     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            byte r10 = (byte) r10     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r11 = 967(0x3c7, float:1.355E-42)
            short r11 = (short) r11     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.String r8 = $$c(r8, r10, r11)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.reflect.Field r6 = r6.getDeclaredField(r8)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r8 = 1
            r6.setAccessible(r8)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.Object r8 = r7.get(r3)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r10.<init>(r8)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.Class r8 = r3.getClass()     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r11 = r1[r18]     // Catch: java.lang.Throwable -> L1809
            byte r11 = (byte) r11     // Catch: java.lang.Throwable -> L1809
            r12 = 170(0xaa, float:2.38E-43)
            r1 = r1[r12]     // Catch: java.lang.Throwable -> L1809
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1809
            r12 = 991(0x3df, float:1.389E-42)
            short r12 = (short) r12     // Catch: java.lang.Throwable -> L1809
            java.lang.String r1 = $$c(r11, r1, r12)     // Catch: java.lang.Throwable -> L1809
            r11 = 0
            java.lang.reflect.Method r1 = r5.getMethod(r1, r11)     // Catch: java.lang.Throwable -> L1809
            java.lang.Object r1 = r1.invoke(r8, r11)     // Catch: java.lang.Throwable -> L1809
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L1809
            int r8 = java.lang.reflect.Array.getLength(r3)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r8)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r11 = 0
        L1523:
            if (r11 >= r8) goto L1549
            java.lang.Object r12 = java.lang.reflect.Array.get(r3, r11)     // Catch: java.lang.Throwable -> L1536 java.lang.Exception -> L1540
            java.lang.reflect.Array.set(r1, r11, r12)     // Catch: java.lang.Throwable -> L1536 java.lang.Exception -> L1540
            r12 = r11 ^ 1
            r11 = r11 & 1
            r26 = 1
            int r11 = r11 << 1
            int r11 = r11 + r12
            goto L1523
        L1536:
            r0 = move-exception
            r2 = r0
            r3 = r58
            r1 = r64
            r27 = 287(0x11f, float:4.02E-43)
            goto L10f4
        L1540:
            r0 = move-exception
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
        L1545:
            r37 = 26
            goto L182b
        L1549:
            r7.set(r2, r10)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            r6.set(r2, r1)     // Catch: java.lang.Exception -> L1540 java.lang.Throwable -> L17be
            int r1 = com.appsflyer.internal.AFa1bSDK.$10
            r2 = r1 & 1
            r26 = 1
            r1 = r1 | 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            com.appsflyer.internal.AFa1bSDK.$11 = r1
            r34 = 2
            int r2 = r2 % 2
            if (r2 != 0) goto L156d
            java.lang.Object r1 = com.appsflyer.internal.AFa1bSDK.getSdkVersion     // Catch: java.lang.Throwable -> L1536
            r2 = 26
            r17 = 0
            int r2 = r2 / 0
            if (r1 != 0) goto L1573
            goto L1571
        L156d:
            java.lang.Object r1 = com.appsflyer.internal.AFa1bSDK.getSdkVersion     // Catch: java.lang.Throwable -> L17be
            if (r1 != 0) goto L1573
        L1571:
            com.appsflyer.internal.AFa1bSDK.getSdkVersion = r0     // Catch: java.lang.Throwable -> L1536
        L1573:
            r1 = r0
        L1574:
            if (r42 == 0) goto L15ff
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L1536
            r2 = r0[r59]     // Catch: java.lang.Throwable -> L1536
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1536
            r3 = r0[r21]     // Catch: java.lang.Throwable -> L1536
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1536
            r6 = 653(0x28d, float:9.15E-43)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L1536
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L1536
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L1536
            r3 = 219(0xdb, float:3.07E-43)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L1536
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L1536
            r6 = 127(0x7f, float:1.78E-43)
            r6 = r0[r6]     // Catch: java.lang.Throwable -> L1536
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1536
            r7 = 1010(0x3f2, float:1.415E-42)
            short r7 = (short) r7     // Catch: java.lang.Throwable -> L1536
            java.lang.String r3 = $$c(r3, r6, r7)     // Catch: java.lang.Throwable -> L1536
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L1536
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1536
            r7 = r0[r21]     // Catch: java.lang.Throwable -> L1536
            int r7 = -r7
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1536
            int r8 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L1536
            r8 = r8 | 834(0x342, float:1.169E-42)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1536
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L1536
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L1536
            java.lang.Class[] r6 = new java.lang.Class[]{r13, r6}     // Catch: java.lang.Throwable -> L1536
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r6)     // Catch: java.lang.Throwable -> L1536
            r8 = 1
            r3.setAccessible(r8)     // Catch: java.lang.Throwable -> L1536
            java.lang.Class<com.appsflyer.internal.AFa1bSDK> r6 = com.appsflyer.internal.AFa1bSDK.class
            r7 = r0[r18]     // Catch: java.lang.Throwable -> L15f6
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L15f6
            r8 = r0[r23]     // Catch: java.lang.Throwable -> L15f6
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L15f6
            r9 = 698(0x2ba, float:9.78E-43)
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L15f6
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L15f6
            r11 = 0
            java.lang.reflect.Method r7 = r5.getMethod(r7, r11)     // Catch: java.lang.Throwable -> L15f6
            java.lang.Object r6 = r7.invoke(r6, r11)     // Catch: java.lang.Throwable -> L15f6
            r7 = r43
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r6}     // Catch: java.lang.Throwable -> L1536
            java.lang.Object r3 = r3.invoke(r1, r6)     // Catch: java.lang.Throwable -> L1536
            if (r3 == 0) goto L15f4
            r6 = r0[r19]     // Catch: java.lang.Throwable -> L1536
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1536
            r0 = r0[r46]     // Catch: java.lang.Throwable -> L1536
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1536
            r14 = 348(0x15c, float:4.88E-43)
            short r7 = (short) r14     // Catch: java.lang.Throwable -> L1536
            java.lang.String r0 = $$c(r6, r0, r7)     // Catch: java.lang.Throwable -> L1536
            r7 = 0
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r7)     // Catch: java.lang.Throwable -> L1536
            r0.invoke(r1, r7)     // Catch: java.lang.Throwable -> L1536
        L15f4:
            r0 = r3
            goto L1649
        L15f6:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1536
            if (r1 == 0) goto L15fe
            throw r1     // Catch: java.lang.Throwable -> L1536
        L15fe:
            throw r0     // Catch: java.lang.Throwable -> L1536
        L15ff:
            r7 = r43
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L17be
            r2 = r0[r24]     // Catch: java.lang.Throwable -> L17be
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L17be
            r3 = r0[r21]     // Catch: java.lang.Throwable -> L17be
            int r3 = -r3
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L17be
            int r6 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L17be
            r8 = r6 ^ 834(0x342, float:1.169E-42)
            r6 = r6 & 834(0x342, float:1.169E-42)
            r6 = r6 | r8
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L17be
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L17be
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L17be
            r3 = 219(0xdb, float:3.07E-43)
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L17be
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L17be
            r6 = 127(0x7f, float:1.78E-43)
            r0 = r0[r6]     // Catch: java.lang.Throwable -> L17be
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L17be
            r6 = 1010(0x3f2, float:1.415E-42)
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L17be
            java.lang.String r0 = $$c(r3, r0, r6)     // Catch: java.lang.Throwable -> L17be
            java.lang.Class[] r3 = new java.lang.Class[]{r13}     // Catch: java.lang.Throwable -> L17be
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r3)     // Catch: java.lang.Throwable -> L17be
            r8 = 1
            r0.setAccessible(r8)     // Catch: java.lang.Throwable -> L1536 java.lang.reflect.InvocationTargetException -> L1640
            java.lang.Object[] r2 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L1536 java.lang.reflect.InvocationTargetException -> L1640
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1536 java.lang.reflect.InvocationTargetException -> L1640
            goto L1649
        L1640:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L1536 java.lang.ClassNotFoundException -> L1648
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L1536 java.lang.ClassNotFoundException -> L1648
            throw r0     // Catch: java.lang.Throwable -> L1536 java.lang.ClassNotFoundException -> L1648
        L1648:
            r0 = 0
        L1649:
            if (r0 == 0) goto L17c6
            r15 = r0
            java.lang.Class r15 = (java.lang.Class) r15     // Catch: java.lang.Throwable -> L17be
            byte[] r0 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L17be
            r2 = r0[r19]     // Catch: java.lang.Throwable -> L17be
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L17be
            r3 = r0[r18]     // Catch: java.lang.Throwable -> L17be
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L17be
            r6 = r3 ^ 1002(0x3ea, float:1.404E-42)
            r7 = r3 & 1002(0x3ea, float:1.404E-42)
            r6 = r6 | r7
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L17be
            java.lang.String r43 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L17be
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L17be
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Throwable -> L17be
            java.lang.reflect.Constructor r2 = r15.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L17be
            r8 = 1
            r2.setAccessible(r8)     // Catch: java.lang.Throwable -> L17be
            r3 = r42 ^ 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L17be
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}     // Catch: java.lang.Throwable -> L17be
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L17be
            com.appsflyer.internal.AFa1bSDK.onPause = r1     // Catch: java.lang.Throwable -> L17be
            r1 = 13350(0x3426, float:1.8707E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L17be
            r2 = 720(0x2d0, float:1.009E-42)
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L17be
            int r2 = -r2
            byte r2 = (byte) r2
            r37 = 26
            r3 = r0[r37]     // Catch: java.lang.Throwable -> L17ba
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L17ba
            r6 = r3 ^ 1050(0x41a, float:1.471E-42)
            r7 = r3 & 1050(0x41a, float:1.471E-42)
            r6 = r6 | r7
            short r6 = (short) r6     // Catch: java.lang.Throwable -> L17ba
            java.lang.String r2 = $$c(r2, r3, r6)     // Catch: java.lang.Throwable -> L17ba
            r8 = 1
            java.lang.String r2 = r2.substring(r8)     // Catch: java.lang.Throwable -> L17ba
            r3 = r58
            java.util.zip.ZipEntry r2 = r3.getEntry(r2)     // Catch: java.lang.Throwable -> L17b6
            java.io.InputStream r2 = r3.getInputStream(r2)     // Catch: java.lang.Throwable -> L17b6
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L17ab
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L17ab
            byte r6 = (byte) r6
            r27 = 287(0x11f, float:4.02E-43)
            r7 = r0[r27]     // Catch: java.lang.Throwable -> L17a9
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L17a9
            r14 = r66
            java.lang.String r6 = $$c(r6, r7, r14)     // Catch: java.lang.Throwable -> L17a9
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L17a9
            r7 = r0[r24]     // Catch: java.lang.Throwable -> L17a9
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L17a9
            r8 = r0[r41]     // Catch: java.lang.Throwable -> L17a9
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L17a9
            r9 = r65
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L17a9
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L17a9
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L17a9
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L17a9
            java.lang.Object r2 = r6.newInstance(r2)     // Catch: java.lang.Throwable -> L17a9
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L17a0
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L17a0
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L17a0
            r7 = r0[r40]     // Catch: java.lang.Throwable -> L17a0
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L17a0
            r8 = r7 | 449(0x1c1, float:6.29E-43)
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L17a0
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L17a0
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L17a0
            r7 = r0[r24]     // Catch: java.lang.Throwable -> L17a0
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L17a0
            r8 = r0[r41]     // Catch: java.lang.Throwable -> L17a0
            int r8 = -r8
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L17a0
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L17a0
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L17a0
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L17a0
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L17a0
            java.lang.Object r2 = r6.newInstance(r2)     // Catch: java.lang.Throwable -> L17a0
            java.lang.Object[] r6 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L1797
            r7 = r0[r24]     // Catch: java.lang.Throwable -> L1797
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1797
            r8 = r0[r40]     // Catch: java.lang.Throwable -> L1797
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1797
            r9 = r8 ^ 449(0x1c1, float:6.29E-43)
            r10 = r8 & 449(0x1c1, float:6.29E-43)
            r9 = r9 | r10
            short r9 = (short) r9     // Catch: java.lang.Throwable -> L1797
            java.lang.String r7 = $$c(r7, r8, r9)     // Catch: java.lang.Throwable -> L1797
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L1797
            r8 = r0[r16]     // Catch: java.lang.Throwable -> L1797
            byte r8 = (byte) r8     // Catch: java.lang.Throwable -> L1797
            r9 = 127(0x7f, float:1.78E-43)
            r9 = r0[r9]     // Catch: java.lang.Throwable -> L1797
            byte r9 = (byte) r9     // Catch: java.lang.Throwable -> L1797
            int r10 = com.appsflyer.internal.AFa1bSDK.$$b     // Catch: java.lang.Throwable -> L1797
            r11 = r10 ^ 448(0x1c0, float:6.28E-43)
            r10 = r10 & 448(0x1c0, float:6.28E-43)
            r10 = r10 | r11
            short r10 = (short) r10     // Catch: java.lang.Throwable -> L1797
            java.lang.String r8 = $$c(r8, r9, r10)     // Catch: java.lang.Throwable -> L1797
            java.lang.Class[] r9 = new java.lang.Class[]{r62}     // Catch: java.lang.Throwable -> L1797
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch: java.lang.Throwable -> L1797
            r7.invoke(r2, r6)     // Catch: java.lang.Throwable -> L1797
            r6 = r0[r24]     // Catch: java.lang.Throwable -> L178e
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L178e
            r7 = r0[r40]     // Catch: java.lang.Throwable -> L178e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L178e
            r8 = r7 ^ 449(0x1c1, float:6.29E-43)
            r9 = r7 & 449(0x1c1, float:6.29E-43)
            r8 = r8 | r9
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L178e
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L178e
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L178e
            r7 = r0[r19]     // Catch: java.lang.Throwable -> L178e
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L178e
            r0 = r0[r46]     // Catch: java.lang.Throwable -> L178e
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L178e
            r8 = 348(0x15c, float:4.88E-43)
            short r9 = (short) r8     // Catch: java.lang.Throwable -> L178e
            java.lang.String r0 = $$c(r7, r0, r9)     // Catch: java.lang.Throwable -> L178e
            r7 = 0
            java.lang.reflect.Method r0 = r6.getMethod(r0, r7)     // Catch: java.lang.Throwable -> L178e
            r0.invoke(r2, r7)     // Catch: java.lang.Throwable -> L178e
            int r0 = java.lang.Math.abs(r60)     // Catch: java.lang.Throwable -> L1788
            r2 = 13307(0x33fb, float:1.8647E-41)
            r6 = r5
            r5 = r1
            r1 = r6
            r6 = r3
            r10 = r14
            r11 = r57
            r12 = r63
            r7 = r64
            r17 = 0
            r28 = 4
            r29 = 6
            r3 = r0
            r0 = r2
            r2 = r62
            goto La82
        L1788:
            r0 = move-exception
        L1789:
            r2 = r0
            r1 = r64
            goto L1a22
        L178e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1788
            if (r1 == 0) goto L1796
            throw r1     // Catch: java.lang.Throwable -> L1788
        L1796:
            throw r0     // Catch: java.lang.Throwable -> L1788
        L1797:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1788
            if (r1 == 0) goto L179f
            throw r1     // Catch: java.lang.Throwable -> L1788
        L179f:
            throw r0     // Catch: java.lang.Throwable -> L1788
        L17a0:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1788
            if (r1 == 0) goto L17a8
            throw r1     // Catch: java.lang.Throwable -> L1788
        L17a8:
            throw r0     // Catch: java.lang.Throwable -> L1788
        L17a9:
            r0 = move-exception
            goto L17ae
        L17ab:
            r0 = move-exception
            r27 = 287(0x11f, float:4.02E-43)
        L17ae:
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1788
            if (r1 == 0) goto L17b5
            throw r1     // Catch: java.lang.Throwable -> L1788
        L17b5:
            throw r0     // Catch: java.lang.Throwable -> L1788
        L17b6:
            r0 = move-exception
        L17b7:
            r27 = 287(0x11f, float:4.02E-43)
            goto L1789
        L17ba:
            r0 = move-exception
            r3 = r58
            goto L17b7
        L17be:
            r0 = move-exception
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
        L17c3:
            r37 = 26
            goto L1789
        L17c6:
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r37 = 26
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L1788
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r2}     // Catch: java.lang.Throwable -> L1788
            r15 = r67
            java.lang.reflect.Constructor r0 = r15.getDeclaredConstructor(r0)     // Catch: java.lang.Throwable -> L1788
            r8 = 1
            r0.setAccessible(r8)     // Catch: java.lang.Throwable -> L1788
            r2 = r42 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L1788
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L1788
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L1788
            com.appsflyer.internal.AFa1bSDK.onPause = r0     // Catch: java.lang.Throwable -> L1788
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r3.close()     // Catch: java.lang.Throwable -> L1804
            r3 = r57
            r2 = 7
            r6 = 2
            r10 = 1
            r17 = 0
            r26 = 1
            r35 = 0
            goto L1bc1
        L1804:
            r0 = move-exception
            r1 = r64
            goto L1ac8
        L1809:
            r0 = move-exception
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r37 = 26
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L1788 java.lang.Exception -> L1817
            if (r1 == 0) goto L1819
            throw r1     // Catch: java.lang.Throwable -> L1788 java.lang.Exception -> L1817
        L1817:
            r0 = move-exception
            goto L182b
        L1819:
            throw r0     // Catch: java.lang.Throwable -> L1788 java.lang.Exception -> L1817
        L181a:
            r0 = move-exception
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
            goto L17c3
        L1822:
            r0 = move-exception
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
            goto L1545
        L182b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1897
            r1.<init>()     // Catch: java.lang.Throwable -> L1897
            byte[] r2 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Throwable -> L1897
            r6 = r2[r39]     // Catch: java.lang.Throwable -> L1897
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1897
            r7 = r2[r46]     // Catch: java.lang.Throwable -> L1897
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1897
            r8 = r7 ^ 962(0x3c2, float:1.348E-42)
            r10 = r7 & 962(0x3c2, float:1.348E-42)
            r8 = r8 | r10
            short r8 = (short) r8     // Catch: java.lang.Throwable -> L1897
            java.lang.String r6 = $$c(r6, r7, r8)     // Catch: java.lang.Throwable -> L1897
            r1.append(r6)     // Catch: java.lang.Throwable -> L1897
            r1.append(r9)     // Catch: java.lang.Throwable -> L1897
            r6 = r2[r44]     // Catch: java.lang.Throwable -> L1897
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L1897
            r7 = r2[r45]     // Catch: java.lang.Throwable -> L1897
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> L1897
            r8 = 291(0x123, float:4.08E-43)
            short r9 = (short) r8     // Catch: java.lang.Throwable -> L1897
            java.lang.String r6 = $$c(r6, r7, r9)     // Catch: java.lang.Throwable -> L1897
            r1.append(r6)     // Catch: java.lang.Throwable -> L1897
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1897
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1889
            r26 = 1
            r7[r26] = r0     // Catch: java.lang.Throwable -> L1889
            r17 = 0
            r7[r17] = r1     // Catch: java.lang.Throwable -> L1889
            r0 = r2[r24]     // Catch: java.lang.Throwable -> L1889
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1889
            r1 = r2[r41]     // Catch: java.lang.Throwable -> L1889
            int r1 = -r1
            byte r1 = (byte) r1     // Catch: java.lang.Throwable -> L1889
            java.lang.String r0 = $$c(r0, r1, r9)     // Catch: java.lang.Throwable -> L1889
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1889
            r1 = r64
            java.lang.Class[] r2 = new java.lang.Class[]{r13, r1}     // Catch: java.lang.Throwable -> L1887
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Throwable -> L1887
            java.lang.Object r0 = r0.newInstance(r7)     // Catch: java.lang.Throwable -> L1887
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1887
            throw r0     // Catch: java.lang.Throwable -> L1887
        L1887:
            r0 = move-exception
            goto L188c
        L1889:
            r0 = move-exception
            r1 = r64
        L188c:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L1896
            throw r2     // Catch: java.lang.Throwable -> L1893
        L1893:
            r0 = move-exception
            goto Lab1
        L1896:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L1897:
            r0 = move-exception
            r1 = r64
            goto Lab1
        L189c:
            r0 = move-exception
        L189d:
            r3 = r58
            r1 = r64
        L18a1:
            r27 = 287(0x11f, float:4.02E-43)
            goto Laad
        L18a5:
            r0 = move-exception
            r3 = r58
            r1 = r64
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
            r37 = 26
            goto L18ba
        L18b1:
            r0 = move-exception
            r3 = r58
            r1 = r64
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
        L18ba:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L18c1
            throw r2     // Catch: java.lang.Throwable -> L1893
        L18c1:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L18c2:
            r0 = move-exception
            r62 = r11
            goto L189d
        L18c6:
            r0 = move-exception
        L18c7:
            r3 = r58
            goto L18a1
        L18ca:
            r0 = move-exception
            r63 = r12
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
            goto Lab1
        L18d5:
            r0 = move-exception
        L18d6:
            r63 = r12
            goto L18c7
        L18d9:
            r0 = move-exception
        L18da:
            r63 = r12
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
            r33 = 5
            r37 = 26
            goto L18e9
        L18e5:
            r0 = move-exception
            r62 = r9
            goto L18da
        L18e9:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L18f0
            throw r2     // Catch: java.lang.Throwable -> L1893
        L18f0:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L18f1:
            r0 = move-exception
            r62 = r9
            goto L18d6
        L18f5:
            r0 = move-exception
            r62 = r9
            r63 = r12
            r3 = r58
            r27 = 287(0x11f, float:4.02E-43)
        L18fe:
            r33 = 5
            r37 = 26
            goto L190b
        L1903:
            r0 = move-exception
            r62 = r9
            r63 = r12
            r3 = r58
            goto L18fe
        L190b:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L1912
            throw r2     // Catch: java.lang.Throwable -> L1893
        L1912:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L1913:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            goto L18d6
        L1919:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r63 = r12
            r3 = r58
        L1922:
            r27 = 287(0x11f, float:4.02E-43)
        L1924:
            r33 = 5
            r37 = 26
            goto L194a
        L1929:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
        L192f:
            r63 = r12
            goto L1922
        L1932:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            goto L192f
        L193b:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            goto L1924
        L194a:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L1951
            throw r2     // Catch: java.lang.Throwable -> L1893
        L1951:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L1952:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            goto Laad
        L1962:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
        L1970:
            r33 = 5
            r37 = 26
            goto L1984
        L1975:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r32 = r9
            r57 = r11
            r63 = r12
            r27 = 287(0x11f, float:4.02E-43)
            goto L1970
        L1984:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L198b
            throw r2     // Catch: java.lang.Throwable -> L1893
        L198b:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L198c:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            r37 = 26
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L19a5
            throw r2     // Catch: java.lang.Throwable -> L1893
        L19a5:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L19a6:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
        L19b0:
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            r37 = 26
            goto L19c6
        L19b9:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            goto L19b0
        L19c6:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L19cd
            throw r2     // Catch: java.lang.Throwable -> L1893
        L19cd:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L19ce:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            r37 = 26
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L19e9
            throw r2     // Catch: java.lang.Throwable -> L1893
        L19e9:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L19ea:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
        L19f8:
            r32 = 3
            r33 = 5
            r37 = 26
            goto L1a0c
        L19ff:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            goto L19f8
        L1a0c:
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1893
            if (r2 == 0) goto L1a13
            throw r2     // Catch: java.lang.Throwable -> L1893
        L1a13:
            throw r0     // Catch: java.lang.Throwable -> L1893
        L1a14:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r3 = r6
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            goto Laa9
        L1a22:
            r3.close()     // Catch: java.lang.Throwable -> L1a26
            goto L1a2a
        L1a26:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.lang.Throwable -> L1a2b
        L1a2a:
            throw r2     // Catch: java.lang.Throwable -> L1a2b
        L1a2b:
            r0 = move-exception
            goto L1ac8
        L1a2e:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r33 = r8
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            goto L4f0
        L1a41:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            r37 = 26
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1a2b
            if (r2 == 0) goto L1a5b
            throw r2     // Catch: java.lang.Throwable -> L1a2b
        L1a5b:
            throw r0     // Catch: java.lang.Throwable -> L1a2b
        L1a5c:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            r37 = 26
            java.lang.Throwable r2 = r0.getCause()     // Catch: java.lang.Throwable -> L1a2b
            if (r2 == 0) goto L1a76
            throw r2     // Catch: java.lang.Throwable -> L1a2b
        L1a76:
            throw r0     // Catch: java.lang.Throwable -> L1a2b
        L1a77:
            r0 = move-exception
            r5 = r1
            r62 = r2
            r1 = r7
            r57 = r11
            r63 = r12
            r54 = r15
            r27 = 287(0x11f, float:4.02E-43)
            r32 = 3
            r33 = 5
            goto L1ac8
        L1a89:
            r0 = move-exception
            r62 = r2
            r47 = r5
            r48 = r6
            r49 = r8
            r50 = r9
            r53 = r10
            r57 = r11
            r63 = r12
            r54 = r15
            r32 = 3
            r33 = 5
            r37 = 26
            r5 = r1
            r1 = r7
            goto L1ac8
        L1aa5:
            r62 = r2
            r47 = r5
            r48 = r6
            r49 = r8
            r50 = r9
            r53 = r10
            r57 = r11
            r63 = r12
            r54 = r15
            r32 = 3
            r33 = 5
            r37 = 26
            r5 = r1
            r1 = r7
            boolean r0 = r47[r57]     // Catch: java.lang.Throwable -> L1a2b
            r0 = r48[r57]     // Catch: java.lang.Throwable -> L1a2b
            boolean r0 = r54[r57]     // Catch: java.lang.Throwable -> L1a2b
            r35 = 0
            throw r35     // Catch: java.lang.Throwable -> L1a2b
        L1ac8:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1bfe
            int r2 = (int) r2     // Catch: java.lang.Exception -> L1bfe
            r3 = r57
            int r11 = r3 * (-675)
            int r6 = -r11
            int r6 = -r6
            r7 = 677(0x2a5, float:9.49E-43)
            r8 = r7 | r6
            r26 = 1
            int r8 = r8 << 1
            r6 = r6 ^ r7
            int r8 = r8 - r6
            r6 = r2 ^ 1
            r7 = r2 & 1
            r6 = r6 | r7
            int r7 = ~r3     // Catch: java.lang.Exception -> L1bfe
            r6 = r6 | r7
            int r6 = r6 * (-676)
            int r6 = -r6
            int r6 = -r6
            r9 = r8 & r6
            r6 = r6 | r8
            int r9 = r9 + r6
            r6 = r7 ^ 1
            r26 = 1
            r7 = r7 & 1
            r6 = r6 | r7
            int r6 = ~r6     // Catch: java.lang.Exception -> L1bfe
            int r7 = ~r2     // Catch: java.lang.Exception -> L1bfe
            r8 = r7 | 1
            int r8 = ~r8     // Catch: java.lang.Exception -> L1bfe
            r10 = r6 ^ r8
            r6 = r6 & r8
            r6 = r6 | r10
            int r6 = r6 * 676
            int r6 = -r6
            int r6 = -r6
            int r6 = ~r6     // Catch: java.lang.Exception -> L1bfe
            int r9 = r9 - r6
            r26 = 1
            int r9 = r9 + (-1)
            int r6 = ~r3     // Catch: java.lang.Exception -> L1bfe
            r8 = -2
            r10 = r8 ^ r6
            r8 = r8 & r6
            r8 = r8 | r10
            int r8 = ~r8     // Catch: java.lang.Exception -> L1bfe
            r10 = r6 ^ r7
            r6 = r6 & r7
            r6 = r6 | r10
            int r6 = ~r6     // Catch: java.lang.Exception -> L1bfe
            r7 = r8 ^ r6
            r6 = r6 & r8
            r6 = r6 | r7
            r7 = r3 ^ 1
            r8 = r3 & 1
            r7 = r7 | r8
            r8 = r7 ^ r2
            r2 = r2 & r7
            r2 = r2 | r8
            int r2 = ~r2     // Catch: java.lang.Exception -> L1bfe
            r7 = r6 ^ r2
            r2 = r2 & r6
            r2 = r2 | r7
            int r2 = r2 * 676
            r6 = r9 | r2
            r26 = 1
            int r6 = r6 << 1
            r2 = r2 ^ r9
            int r6 = r6 - r2
            r2 = 7
        L1b2f:
            if (r6 >= r2) goto L1b5c
            boolean r7 = r49[r6]     // Catch: java.lang.Exception -> L1bfe
            if (r7 == 0) goto L1b50
            int r6 = com.appsflyer.internal.AFa1bSDK.$11
            int r6 = r6 + 45
            int r7 = r6 % 128
            com.appsflyer.internal.AFa1bSDK.$10 = r7
            r34 = 2
            int r6 = r6 % 2
            if (r6 != 0) goto L1b5c
            r35 = 0
            com.appsflyer.internal.AFa1bSDK.onPause = r35     // Catch: java.lang.Exception -> L1bfe
            com.appsflyer.internal.AFa1bSDK.getSdkVersion = r35     // Catch: java.lang.Exception -> L1bfe
            r6 = 2
            r17 = 0
            r26 = 1
            goto L1bbf
        L1b50:
            r35 = 0
            r7 = r6 ^ 1
            r6 = r6 & 1
            r26 = 1
            int r6 = r6 << 1
            int r6 = r6 + r7
            goto L1b2f
        L1b5c:
            byte[] r2 = com.appsflyer.internal.AFa1bSDK.$$a     // Catch: java.lang.Exception -> L1bfe
            r3 = r2[r39]     // Catch: java.lang.Exception -> L1bfe
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L1bfe
            r4 = r2[r40]     // Catch: java.lang.Exception -> L1bfe
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> L1bfe
            r5 = 1098(0x44a, float:1.539E-42)
            short r5 = (short) r5     // Catch: java.lang.Exception -> L1bfe
            java.lang.String r3 = $$c(r3, r4, r5)     // Catch: java.lang.Exception -> L1bfe
            r6 = 2
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L1b97
            r26 = 1
            r4[r26] = r0     // Catch: java.lang.Throwable -> L1b97
            r17 = 0
            r4[r17] = r3     // Catch: java.lang.Throwable -> L1b97
            r0 = r2[r24]     // Catch: java.lang.Throwable -> L1b97
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L1b97
            r2 = r2[r41]     // Catch: java.lang.Throwable -> L1b97
            int r2 = -r2
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L1b97
            r8 = 291(0x123, float:4.08E-43)
            short r3 = (short) r8     // Catch: java.lang.Throwable -> L1b97
            java.lang.String r0 = $$c(r0, r2, r3)     // Catch: java.lang.Throwable -> L1b97
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1b97
            java.lang.Class[] r1 = new java.lang.Class[]{r13, r1}     // Catch: java.lang.Throwable -> L1b97
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L1b97
            java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Throwable -> L1b97
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L1b97
            throw r0     // Catch: java.lang.Throwable -> L1b97
        L1b97:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1bfe
            if (r1 == 0) goto L1b9f
            throw r1     // Catch: java.lang.Exception -> L1bfe
        L1b9f:
            throw r0     // Catch: java.lang.Exception -> L1bfe
        L1ba0:
            r62 = r2
            r38 = r3
            r47 = r5
            r48 = r6
            r37 = r7
            r49 = r8
            r50 = r9
            r53 = r10
            r3 = r11
            r63 = r12
            r54 = r15
            r6 = r34
            r2 = 7
            r32 = 3
            r33 = 5
            r35 = 0
            r5 = r1
        L1bbf:
            r10 = r53
        L1bc1:
            r0 = r3 & 1
            r1 = r3 | 1
            int r11 = r0 + r1
            r1 = r5
            r34 = r6
            r7 = r37
            r3 = r38
            r5 = r47
            r6 = r48
            r8 = r49
            r9 = r50
            r15 = r54
            r2 = r62
            r12 = r63
            r28 = 4
            r29 = 6
            goto L454
        L1be2:
            return
        L1be3:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1bfe
            if (r1 == 0) goto L1beb
            throw r1     // Catch: java.lang.Exception -> L1bfe
        L1beb:
            throw r0     // Catch: java.lang.Exception -> L1bfe
        L1bec:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1bfe
            if (r1 == 0) goto L1bf4
            throw r1     // Catch: java.lang.Exception -> L1bfe
        L1bf4:
            throw r0     // Catch: java.lang.Exception -> L1bfe
        L1bf5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Exception -> L1bfe
            if (r1 == 0) goto L1bfd
            throw r1     // Catch: java.lang.Exception -> L1bfe
        L1bfd:
            throw r0     // Catch: java.lang.Exception -> L1bfe
        L1bfe:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L1c05:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L1c0d
            throw r1
        L1c0d:
            throw r0
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

    /* JADX INFO: renamed from: d */
    public static int m8702d(int i10) throws Throwable {
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
