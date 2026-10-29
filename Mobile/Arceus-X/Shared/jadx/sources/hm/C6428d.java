package hm;

import java.util.Objects;

/* JADX INFO: renamed from: hm.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6428d {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: ARITH (wrap int:0x0004: ARITH (wrap int:0x0000: INVOKE (r0v0 float) STATIC call: java.lang.Float.hashCode(float):int A[MD:(float):int (c), WRAPPED]) * (31 int) A[WRAPPED]) + (wrap int:0x0006: INVOKE (r1v0 java.lang.Object) STATIC call: java.util.Objects.hashCode(java.lang.Object):int A[MD:(java.lang.Object):int (c), WRAPPED]) */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m28034a(float f10, Object obj) {
        return (Float.hashCode(f10) * 31) + Objects.hashCode(obj);
    }
}
