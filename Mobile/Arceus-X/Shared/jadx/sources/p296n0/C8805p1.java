package p296n0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;

/* JADX INFO: renamed from: n0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8805p1<T> implements InterfaceC8722a3<T> {

    /* JADX INFO: renamed from: b */
    public static final C8805p1<Object> f32031b = new C8805p1<>(null);

    /* JADX INFO: renamed from: a */
    public final InterfaceFutureC9440x<T> f32032a;

    public C8805p1(T t8) {
        this.f32032a = C10773n.m40993p(t8);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m35370a(C8805p1 c8805p1, InterfaceC8722a3.a aVar) {
        c8805p1.getClass();
        try {
            aVar.mo2367a(c8805p1.f32032a.get());
        } catch (InterruptedException | ExecutionException e10) {
            aVar.onError(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static <U> InterfaceC8722a3<U> m35371f(U u8) {
        return u8 == null ? f32031b : new C8805p1(u8);
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: b */
    public InterfaceFutureC9440x<T> mo34017b() {
        return this.f32032a;
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: c */
    public void mo34018c(Executor executor, final InterfaceC8722a3.a<? super T> aVar) {
        this.f32032a.mo37173a(new Runnable() { // from class: n0.o1
            @Override // java.lang.Runnable
            public final void run() {
                C8805p1.m35370a(this.f31984a, aVar);
            }
        }, executor);
    }

    @Override // p296n0.InterfaceC8722a3
    /* JADX INFO: renamed from: d */
    public void mo34019d(InterfaceC8722a3.a<? super T> aVar) {
    }
}
