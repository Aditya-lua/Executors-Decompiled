package n0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p1<T> implements a3<T> {
    public static final p1<Object> b = new p1<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final me.x<T> f24802a;

    public p1(T t8) {
        this.f24802a = r0.n.p(t8);
    }

    public static /* synthetic */ void a(p1 p1Var, a3.a aVar) {
        p1Var.getClass();
        try {
            aVar.a(p1Var.f24802a.get());
        } catch (InterruptedException | ExecutionException e10) {
            aVar.onError(e10);
        }
    }

    public static <U> a3<U> f(U u8) {
        return u8 == null ? b : new p1(u8);
    }

    @Override // n0.a3
    public me.x<T> b() {
        return this.f24802a;
    }

    @Override // n0.a3
    public void c(Executor executor, final a3.a<? super T> aVar) {
        this.f24802a.a(new Runnable() { // from class: n0.o1
            @Override // java.lang.Runnable
            public final void run() {
                p1.a(this.f24763a, aVar);
            }
        }, executor);
    }

    @Override // n0.a3
    public void d(a3.a<? super T> aVar) {
    }
}
