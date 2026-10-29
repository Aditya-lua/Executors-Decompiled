package ae;

import java.util.concurrent.atomic.AtomicReference;
import p348p1.C10146t;

/* JADX INFO: renamed from: ae.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0192u0 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f593a = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    public static InterfaceC0190t0 m535a() {
        return (InterfaceC0190t0) f593a.get();
    }

    /* JADX INFO: renamed from: b */
    public static void m536b(InterfaceC0190t0 interfaceC0190t0) {
        AtomicReference atomicReference = f593a;
        while (!C10146t.m39085a(atomicReference, null, interfaceC0190t0) && atomicReference.get() == null) {
        }
    }
}
