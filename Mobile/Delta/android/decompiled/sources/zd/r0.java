package zd;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public enum r0 implements j0 {
    INSTANCE;

    public static final AtomicReference b = new AtomicReference(null);

    public final void a(k0 k0Var) {
        b.set(k0Var);
    }

    @Override // zd.j0
    public final k0 zza() {
        return (k0) b.get();
    }
}
