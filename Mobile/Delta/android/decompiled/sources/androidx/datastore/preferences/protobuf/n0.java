package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements m0 {
    public static <K, V> int i(int i10, Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        k0 k0Var = (k0) obj2;
        int iA = 0;
        if (l0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : l0Var.entrySet()) {
            iA += k0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static <K, V> l0<K, V> j(Object obj, Object obj2) {
        l0<K, V> l0VarP = (l0) obj;
        l0<K, V> l0Var = (l0) obj2;
        if (!l0Var.isEmpty()) {
            if (!l0VarP.k()) {
                l0VarP = l0VarP.p();
            }
            l0VarP.o(l0Var);
        }
        return l0VarP;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public k0.a<?, ?> b(Object obj) {
        return ((k0) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public Map<?, ?> c(Object obj) {
        return (l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public Object d(Object obj) {
        return l0.e().p();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public Map<?, ?> e(Object obj) {
        return (l0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public Object f(Object obj) {
        ((l0) obj).n();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public boolean h(Object obj) {
        return !((l0) obj).k();
    }
}
