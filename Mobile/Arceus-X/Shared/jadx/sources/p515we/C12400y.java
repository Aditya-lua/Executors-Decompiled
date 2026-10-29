package p515we;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: we.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C12400y {

    /* JADX INFO: renamed from: b */
    public static final C12400y f44363b = new C12400y();

    /* JADX INFO: renamed from: c */
    public static final b f44364c = new b();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<InterfaceC12393s> f44365a = new AtomicReference<>();

    /* JADX INFO: renamed from: we.y$b */
    public static class b implements InterfaceC12393s {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // p515we.InterfaceC12393s
        /* JADX INFO: renamed from: a */
        public InterfaceC12393s.a mo46445a(C12395t c12395t, String str, String str2) {
            return C12396u.f44356a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C12400y m46475b() {
        return f44363b;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC12393s m46476a() {
        InterfaceC12393s interfaceC12393s = this.f44365a.get();
        return interfaceC12393s == null ? f44364c : interfaceC12393s;
    }
}
