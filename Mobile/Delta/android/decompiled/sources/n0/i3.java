package n0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i3 {
    public static final h3 b = h3.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i3 f24694c = new i3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y2<h3> f24695a = y2.l(b);

    public static class a<T> implements a3.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2.a<T> f24696a;

        public a(x2.a<T> aVar) {
            this.f24696a = aVar;
        }

        @Override // n0.a3.a
        public void a(T t8) {
            this.f24696a.accept(t8);
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            g0.r1.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
        }
    }

    public static i3 b() {
        return f24694c;
    }

    public h3 a() {
        try {
            return this.f24695a.b().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e10);
        }
    }

    public void c(Executor executor, x2.a<h3> aVar) {
        this.f24695a.c(executor, new a(aVar));
    }

    public void d(h3 h3Var) {
        this.f24695a.k(h3Var);
    }
}
