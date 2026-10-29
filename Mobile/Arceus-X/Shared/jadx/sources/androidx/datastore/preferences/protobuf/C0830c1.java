package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0830c1 {

    /* JADX INFO: renamed from: c */
    public static final C0830c1 f2836c = new C0830c1();

    /* JADX INFO: renamed from: d */
    public static boolean f2837d = false;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap<Class<?>, InterfaceC0842g1<?>> f2839b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final InterfaceC0845h1 f2838a = new C0850j0();

    /* JADX INFO: renamed from: a */
    public static C0830c1 m3364a() {
        return f2836c;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0842g1<?> m3365b(Class<?> cls, InterfaceC0842g1<?> interfaceC0842g1) {
        C0892z.m4237b(cls, "messageType");
        C0892z.m4237b(interfaceC0842g1, "schema");
        return this.f2839b.putIfAbsent(cls, interfaceC0842g1);
    }

    /* JADX INFO: renamed from: c */
    public <T> InterfaceC0842g1<T> m3366c(Class<T> cls) {
        C0892z.m4237b(cls, "messageType");
        InterfaceC0842g1<T> interfaceC0842g1Mo3546a = (InterfaceC0842g1) this.f2839b.get(cls);
        if (interfaceC0842g1Mo3546a == null) {
            interfaceC0842g1Mo3546a = this.f2838a.mo3546a(cls);
            InterfaceC0842g1<T> interfaceC0842g1 = (InterfaceC0842g1<T>) m3365b(cls, interfaceC0842g1Mo3546a);
            if (interfaceC0842g1 != null) {
                return interfaceC0842g1;
            }
        }
        return interfaceC0842g1Mo3546a;
    }

    /* JADX INFO: renamed from: d */
    public <T> InterfaceC0842g1<T> m3367d(T t8) {
        return m3366c(t8.getClass());
    }
}
