package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2562l2 extends TimeoutException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c)] call: java.util.concurrent.TimeoutException.<init>(java.lang.String):void type: SUPER */
    public /* synthetic */ C2562l2(String str, C2573m2 c2573m2) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
