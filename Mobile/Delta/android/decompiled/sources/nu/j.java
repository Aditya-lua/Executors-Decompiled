package nu;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"nu/k", "nu/l", "nu/m", "nu/n", "nu/o", "nu/q", "nu/t", "nu/u", "nu/v", "nu/w", "nu/x", "nu/y", "nu/z", "nu/a0"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = 48)
public final class j {
    @NotNull
    public static final <T, R> h<R> A(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super R>, ? extends Object> function2) {
        return x.a(hVar, function2);
    }

    @NotNull
    public static final <T> h<T> B(@NotNull Iterable<? extends h<? extends T>> iterable) {
        return x.b(iterable);
    }

    @NotNull
    public static final <T> h<T> C(@NotNull h<? extends T>... hVarArr) {
        return x.c(hVarArr);
    }

    @NotNull
    public static final <T> h<T> D(@NotNull h<? extends T> hVar, @NotNull zt.n<? super i<? super T>, ? super Throwable, ? super nt.b<? super Unit>, ? extends Object> nVar) {
        return u.d(hVar, nVar);
    }

    @NotNull
    public static final <T> h<T> E(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return a0.b(hVar, function2);
    }

    @NotNull
    public static final <T> h<T> F(@NotNull h<? extends T> hVar, @NotNull Function2<? super i<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return u.e(hVar, function2);
    }

    @NotNull
    public static final <T> mu.x<T> G(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var) {
        return l.d(hVar, p0Var);
    }

    @NotNull
    public static final <T> h<T> H(@NotNull mu.x<? extends T> xVar) {
        return l.e(xVar);
    }

    @NotNull
    public static final <T> h<T> I(@NotNull h<? extends T> hVar, @NotNull zt.o<? super i<? super T>, ? super Throwable, ? super Long, ? super nt.b<? super Boolean>, ? extends Object> oVar) {
        return v.e(hVar, oVar);
    }

    @NotNull
    public static final <T> g0<T> J(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var, @NotNull m0 m0Var, int i10) {
        return z.d(hVar, p0Var, m0Var, i10);
    }

    @NotNull
    public static final <T> p0<T> L(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var, @NotNull m0 m0Var, T t8) {
        return z.f(hVar, p0Var, m0Var, t8);
    }

    @NotNull
    public static final <T> h<T> M(@NotNull h<? extends T> hVar, int i10) {
        return w.e(hVar, i10);
    }

    @NotNull
    public static final <T> h<T> N(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2) {
        return w.f(hVar, function2);
    }

    @NotNull
    public static final <T> h<T> O(@NotNull h<? extends T> hVar, long j10) {
        return q.e(hVar, j10);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object P(@NotNull h<? extends T> hVar, @NotNull C c10, @NotNull nt.b<? super C> bVar) {
        return n.a(hVar, c10, bVar);
    }

    @Nullable
    public static final <T> Object Q(@NotNull h<? extends T> hVar, @NotNull List<T> list, @NotNull nt.b<? super List<? extends T>> bVar) {
        return n.b(hVar, list, bVar);
    }

    @NotNull
    public static final <T, R> h<R> S(@NotNull h<? extends T> hVar, @NotNull zt.n<? super i<? super R>, ? super T, ? super nt.b<? super Unit>, ? extends Object> nVar) {
        return x.d(hVar, nVar);
    }

    @NotNull
    public static final <T, R> h<R> T(@NotNull h<? extends T> hVar, @NotNull zt.n<? super i<? super R>, ? super T, ? super nt.b<? super Boolean>, ? extends Object> nVar) {
        return w.g(hVar, nVar);
    }

    @NotNull
    public static final <T> p0<T> a(@NotNull c0<T> c0Var) {
        return z.a(c0Var);
    }

    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, int i10, @NotNull mu.a aVar) {
        return o.a(hVar, i10, aVar);
    }

    @NotNull
    public static final <T> h<T> d(@NotNull Function2<? super mu.v<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return k.a(function2);
    }

    @NotNull
    public static final <T> h<T> e(@NotNull h<? extends T> hVar) {
        return o.c(hVar);
    }

    @NotNull
    public static final <T> h<T> f(@NotNull h<? extends T> hVar, @NotNull zt.n<? super i<? super T>, ? super Throwable, ? super nt.b<? super Unit>, ? extends Object> nVar) {
        return v.a(hVar, nVar);
    }

    @Nullable
    public static final <T> Object g(@NotNull h<? extends T> hVar, @NotNull i<? super T> iVar, @NotNull nt.b<? super Throwable> bVar) {
        return v.b(hVar, iVar, bVar);
    }

    @NotNull
    public static final <T> h<T> h(@NotNull Function2<? super mu.v<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return k.b(function2);
    }

    @Nullable
    public static final Object i(@NotNull h<?> hVar, @NotNull nt.b<? super Unit> bVar) {
        return m.a(hVar, bVar);
    }

    @Nullable
    public static final <T> Object j(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Unit>, ? extends Object> function2, @NotNull nt.b<? super Unit> bVar) {
        return m.b(hVar, function2, bVar);
    }

    @NotNull
    public static final <T> h<T> k(@NotNull h<? extends T> hVar) {
        return o.e(hVar);
    }

    @NotNull
    public static final <T> h<T> l(@NotNull h<? extends T> hVar, long j10) {
        return q.b(hVar, j10);
    }

    @NotNull
    public static final <T> h<T> m(@NotNull h<? extends T> hVar) {
        return t.e(hVar);
    }

    @NotNull
    public static final <T> h<T> n(@NotNull h<? extends T> hVar, int i10) {
        return w.b(hVar, i10);
    }

    @NotNull
    public static final <T> h<T> o(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2) {
        return w.c(hVar, function2);
    }

    @Nullable
    public static final <T> Object p(@NotNull i<? super T> iVar, @NotNull mu.x<? extends T> xVar, @NotNull nt.b<? super Unit> bVar) {
        return l.b(iVar, xVar, bVar);
    }

    @Nullable
    public static final <T> Object q(@NotNull i<? super T> iVar, @NotNull h<? extends T> hVar, @NotNull nt.b<? super Unit> bVar) {
        return m.c(iVar, hVar, bVar);
    }

    public static final void r(@NotNull i<?> iVar) {
        u.b(iVar);
    }

    @NotNull
    public static final <T> h<T> s(@NotNull h<? extends T> hVar) {
        return a0.a(hVar);
    }

    @Nullable
    public static final <T> Object t(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super nt.b<? super Boolean>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        return y.a(hVar, function2, bVar);
    }

    @Nullable
    public static final <T> Object u(@NotNull h<? extends T> hVar, @NotNull nt.b<? super T> bVar) {
        return y.b(hVar, bVar);
    }

    @Nullable
    public static final <T> Object v(@NotNull h<? extends T> hVar, @NotNull nt.b<? super T> bVar) {
        return y.c(hVar, bVar);
    }

    @NotNull
    public static final <T> h<T> w(@NotNull Function2<? super i<? super T>, ? super nt.b<? super Unit>, ? extends Object> function2) {
        return k.c(function2);
    }

    @NotNull
    public static final <T> h<T> x(T t8) {
        return k.d(t8);
    }

    @NotNull
    public static final <T> h<T> y(@NotNull h<? extends T> hVar, @NotNull CoroutineContext coroutineContext) {
        return o.f(hVar, coroutineContext);
    }

    @NotNull
    public static final <T> d2 z(@NotNull h<? extends T> hVar, @NotNull ku.p0 p0Var) {
        return m.d(hVar, p0Var);
    }
}
