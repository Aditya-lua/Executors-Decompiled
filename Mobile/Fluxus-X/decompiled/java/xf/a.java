package xf;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f36666a;
    public final T b;

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.f36666a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f36666a, this.b);
    }
}
