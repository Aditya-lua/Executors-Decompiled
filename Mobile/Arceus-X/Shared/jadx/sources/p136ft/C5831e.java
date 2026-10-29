package p136ft;

import p061ct.InterfaceC4364a;

/* JADX INFO: renamed from: ft.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C5831e<T> implements InterfaceC5830d<T>, InterfaceC4364a<T> {

    /* JADX INFO: renamed from: b */
    public static final C5831e<Object> f22231b = new C5831e<>(null);

    /* JADX INFO: renamed from: a */
    public final T f22232a;

    public C5831e(T t8) {
        this.f22232a = t8;
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC5830d<T> m26182a(T t8) {
        return new C5831e(C5834h.m26192c(t8, "instance cannot be null"));
    }

    @Override // ht.InterfaceC6564a
    public T get() {
        return this.f22232a;
    }
}
