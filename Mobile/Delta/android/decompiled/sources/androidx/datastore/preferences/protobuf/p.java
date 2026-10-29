package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t.b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class p<T extends t.b<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract Object b(o oVar, r0 r0Var, int i10);

    public abstract t<T> c(Object obj);

    public abstract t<T> d(Object obj);

    public abstract boolean e(r0 r0Var);

    public abstract void f(Object obj);

    public abstract <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<T> tVar, UB ub, n1<UT, UB> n1Var);

    public abstract void h(f1 f1Var, Object obj, o oVar, t<T> tVar);

    public abstract void i(g gVar, Object obj, o oVar, t<T> tVar);

    public abstract void j(t1 t1Var, Map.Entry<?, ?> entry);
}
