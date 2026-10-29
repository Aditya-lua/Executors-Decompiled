package d8;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements b<T> {
    public static final c<Object> b = new c<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f14487a;

    public c(T t8) {
        this.f14487a = t8;
    }

    public static <T> b<T> a(T t8) {
        return new c(d.c(t8, "instance cannot be null"));
    }

    @Override // ht.a
    public T get() {
        return this.f14487a;
    }
}
