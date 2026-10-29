package p071d8;

/* JADX INFO: renamed from: d8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C4471c<T> implements InterfaceC4470b<T> {

    /* JADX INFO: renamed from: b */
    public static final C4471c<Object> f18509b = new C4471c<>(null);

    /* JADX INFO: renamed from: a */
    public final T f18510a;

    public C4471c(T t8) {
        this.f18510a = t8;
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC4470b<T> m22416a(T t8) {
        return new C4471c(C4472d.m22419c(t8, "instance cannot be null"));
    }

    @Override // ht.InterfaceC6564a
    public T get() {
        return this.f18510a;
    }
}
