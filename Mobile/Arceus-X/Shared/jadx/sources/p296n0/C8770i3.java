package p296n0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p140g0.C5931r1;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: n0.i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C8770i3 {

    /* JADX INFO: renamed from: b */
    public static final C8764h3 f31892b = C8764h3.m35146b();

    /* JADX INFO: renamed from: c */
    public static final C8770i3 f31893c = new C8770i3();

    /* JADX INFO: renamed from: a */
    public final C8851y2<C8764h3> f31894a = C8851y2.m35550l(f31892b);

    /* JADX INFO: renamed from: n0.i3$a */
    public static class a<T> implements InterfaceC8722a3.a<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC12631a<T> f31895a;

        public a(InterfaceC12631a<T> interfaceC12631a) {
            this.f31895a = interfaceC12631a;
        }

        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: a */
        public void mo2367a(T t8) {
            this.f31895a.accept(t8);
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(Throwable th2) {
            C5931r1.m26564d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8770i3 m35195b() {
        return f31893c;
    }

    /* JADX INFO: renamed from: a */
    public C8764h3 m35196a() {
        try {
            return this.f31894a.mo34017b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m35197c(Executor executor, InterfaceC12631a<C8764h3> interfaceC12631a) {
        this.f31894a.mo34018c(executor, new a(interfaceC12631a));
    }

    /* JADX INFO: renamed from: d */
    public void m35198d(C8764h3 c8764h3) {
        this.f31894a.m35552k(c8764h3);
    }
}
