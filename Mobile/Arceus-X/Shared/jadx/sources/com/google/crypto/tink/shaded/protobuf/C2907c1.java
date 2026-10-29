package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.c1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2907c1 {

    /* JADX INFO: renamed from: c */
    public static final C2907c1 f10822c = new C2907c1();

    /* JADX INFO: renamed from: d */
    public static boolean f10823d = false;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC2919g1<?>> f10825b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2922h1 f10824a = new C2930k0();

    /* JADX INFO: renamed from: a */
    public static C2907c1 m13412a() {
        return f10822c;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC2919g1<?> m13413b(Class<?> cls, InterfaceC2919g1<?> interfaceC2919g1) {
        C2900a0.m13380b(cls, "messageType");
        C2900a0.m13380b(interfaceC2919g1, "schema");
        return this.f10825b.putIfAbsent(cls, interfaceC2919g1);
    }

    /* JADX INFO: renamed from: c */
    public <T> InterfaceC2919g1<T> m13414c(Class<T> cls) {
        C2900a0.m13380b(cls, "messageType");
        InterfaceC2919g1<T> interfaceC2919g1Mo13580a = (InterfaceC2919g1) this.f10825b.get(cls);
        if (interfaceC2919g1Mo13580a == null) {
            interfaceC2919g1Mo13580a = this.f10824a.mo13580a(cls);
            InterfaceC2919g1<T> interfaceC2919g1 = (InterfaceC2919g1<T>) m13413b(cls, interfaceC2919g1Mo13580a);
            if (interfaceC2919g1 != null) {
                return interfaceC2919g1;
            }
        }
        return interfaceC2919g1Mo13580a;
    }

    /* JADX INFO: renamed from: d */
    public <T> InterfaceC2919g1<T> m13415d(T t8) {
        return m13414c(t8.getClass());
    }
}
