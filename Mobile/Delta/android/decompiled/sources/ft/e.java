package ft;

/* JADX INFO: loaded from: classes3.dex */
public final class e<T> implements d<T>, ct.a<T> {
    public static final e<Object> b = new e<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f17228a;

    public e(T t8) {
        this.f17228a = t8;
    }

    public static <T> d<T> a(T t8) {
        return new e(h.c(t8, "instance cannot be null"));
    }

    @Override // ht.a
    public T get() {
        return this.f17228a;
    }
}
