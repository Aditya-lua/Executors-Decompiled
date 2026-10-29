package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2112i {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap int:0x0000: INVOKE (r2v0 java.math.BigDecimal) VIRTUAL call: java.math.BigDecimal.signum():int A[MD:():int (c), WRAPPED]) == (0 int)) ? (wrap java.math.BigDecimal:0x000b: CONSTRUCTOR (wrap java.math.BigInteger:0x0008: SGET  A[WRAPPED] java.math.BigInteger.ZERO java.math.BigInteger), (0 int) A[MD:(java.math.BigInteger, int):void (c), WRAPPED] call: java.math.BigDecimal.<init>(java.math.BigInteger, int):void type: CONSTRUCTOR) : (wrap java.math.BigDecimal:0x000f: INVOKE (r2v0 java.math.BigDecimal) VIRTUAL call: java.math.BigDecimal.stripTrailingZeros():java.math.BigDecimal A[MD:():java.math.BigDecimal (c), WRAPPED]) */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m10279a(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
