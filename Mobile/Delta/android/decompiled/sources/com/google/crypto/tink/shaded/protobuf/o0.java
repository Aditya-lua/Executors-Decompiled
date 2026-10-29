package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements n0 {
    public static <K, V> int i(int i10, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int iA = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : m0Var.entrySet()) {
            iA += l0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    public static <K, V> m0<K, V> j(Object obj, Object obj2) {
        m0<K, V> m0VarP = (m0) obj;
        m0<K, V> m0Var = (m0) obj2;
        if (!m0Var.isEmpty()) {
            if (!m0VarP.k()) {
                m0VarP = m0VarP.p();
            }
            m0VarP.o(m0Var);
        }
        return m0VarP;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public l0.a<?, ?> b(Object obj) {
        ((l0) obj).c();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Map<?, ?> c(Object obj) {
        return (m0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object d(Object obj) {
        return m0.e().p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Map<?, ?> e(Object obj) {
        return (m0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public Object f(Object obj) {
        ((m0) obj).n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public int g(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.n0
    public boolean h(Object obj) {
        return !((m0) obj).k();
    }
}
