package p071d8;

import ht.InterfaceC6564a;

/* JADX INFO: renamed from: d8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4469a<T> implements InterfaceC6564a<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f18506c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC6564a<T> f18507a;

    /* JADX INFO: renamed from: b */
    public volatile Object f18508b = f18506c;

    public C4469a(InterfaceC6564a<T> interfaceC6564a) {
        this.f18507a = interfaceC6564a;
    }

    /* JADX INFO: renamed from: a */
    public static <P extends InterfaceC6564a<T>, T> InterfaceC6564a<T> m22414a(P p8) {
        C4472d.m22418b(p8);
        return p8 instanceof C4469a ? p8 : new C4469a(p8);
    }

    /* JADX INFO: renamed from: b */
    public static Object m22415b(Object obj, Object obj2) {
        if (obj == f18506c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ht.InterfaceC6564a
    public T get() {
        T t8;
        T t10 = (T) this.f18508b;
        Object obj = f18506c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.f18508b;
                if (t8 == obj) {
                    t8 = this.f18507a.get();
                    this.f18508b = m22415b(this.f18508b, t8);
                    this.f18507a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
