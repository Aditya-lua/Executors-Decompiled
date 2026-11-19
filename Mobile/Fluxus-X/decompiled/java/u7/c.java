package u7;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f33257a;
    public j7.a<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f33258c;

    public c() {
        this.f33257a = new b<>();
        this.f33258c = null;
    }

    public T a(b<T> bVar) {
        return this.f33258c;
    }

    public final T b(float f10, float f11, T t8, T t10, float f12, float f13, float f14) {
        return a(this.f33257a.h(f10, f11, t8, t10, f12, f13, f14));
    }

    public final void c(j7.a<?, ?> aVar) {
        this.b = aVar;
    }

    public c(T t8) {
        this.f33257a = new b<>();
        this.f33258c = t8;
    }
}
