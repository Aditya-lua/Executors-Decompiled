package vf;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f33499a;
    public final T b;

    public T a() {
        return this.b;
    }

    public Class<T> b() {
        return this.f33499a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f33499a, this.b);
    }
}
