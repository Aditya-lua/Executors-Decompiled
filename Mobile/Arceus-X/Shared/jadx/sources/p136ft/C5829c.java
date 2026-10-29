package p136ft;

import p061ct.InterfaceC4364a;

/* JADX INFO: renamed from: ft.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5829c<T> implements InterfaceC5835i<T>, InterfaceC4364a<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f22228c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC5835i<T> f22229a;

    /* JADX INFO: renamed from: b */
    public volatile Object f22230b = f22228c;

    public C5829c(InterfaceC5835i<T> interfaceC5835i) {
        this.f22229a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: b */
    public static <T> InterfaceC4364a<T> m26178b(InterfaceC5835i<T> interfaceC5835i) {
        return interfaceC5835i instanceof InterfaceC4364a ? (InterfaceC4364a) interfaceC5835i : new C5829c((InterfaceC5835i) C5834h.m26191b(interfaceC5835i));
    }

    /* JADX INFO: renamed from: c */
    public static <T> InterfaceC5835i<T> m26179c(InterfaceC5835i<T> interfaceC5835i) {
        C5834h.m26191b(interfaceC5835i);
        return interfaceC5835i instanceof C5829c ? interfaceC5835i : new C5829c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: d */
    private static Object m26180d(Object obj, Object obj2) {
        if (obj == f22228c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Object m26181a() {
        Object obj;
        obj = this.f22230b;
        if (obj == f22228c) {
            obj = this.f22229a.get();
            this.f22230b = m26180d(this.f22230b, obj);
            this.f22229a = null;
        }
        return obj;
    }

    @Override // ht.InterfaceC6564a
    public T get() {
        T t8 = (T) this.f22230b;
        return t8 == f22228c ? (T) m26181a() : t8;
    }
}
