package zd;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f37510a = new AtomicReference(null);

    public static t0 a() {
        return (t0) f37510a.get();
    }

    public static void b(t0 t0Var) {
        AtomicReference atomicReference = f37510a;
        while (!p1.t.a(atomicReference, null, t0Var) && atomicReference.get() == null) {
        }
    }
}
