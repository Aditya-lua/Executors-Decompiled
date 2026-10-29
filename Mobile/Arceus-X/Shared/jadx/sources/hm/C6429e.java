package hm;

import java.util.Objects;

/* JADX INFO: renamed from: hm.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6429e {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: ARITH (wrap int:0x000b: ARITH (wrap int:0x000a: ARITH (wrap int:0x0004: ARITH (wrap int:0x0000: INVOKE (r0v0 java.lang.Object) STATIC call: java.util.Objects.hashCode(java.lang.Object):int A[MD:(java.lang.Object):int (c), WRAPPED]) * (31 int) A[WRAPPED]) + (wrap int:0x0006: INVOKE (r1v0 java.lang.Object) STATIC call: java.util.Objects.hashCode(java.lang.Object):int A[MD:(java.lang.Object):int (c), WRAPPED]) A[WRAPPED]) * (31 int) A[WRAPPED]) + (wrap int:0x000d: INVOKE (r2v0 java.lang.Object) STATIC call: java.util.Objects.hashCode(java.lang.Object):int A[MD:(java.lang.Object):int (c), WRAPPED]) */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m28035a(Object obj, Object obj2, Object obj3) {
        return (((Objects.hashCode(obj) * 31) + Objects.hashCode(obj2)) * 31) + Objects.hashCode(obj3);
    }
}
