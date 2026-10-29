package t7;

/* JADX INFO: loaded from: classes3.dex */
public class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b<T> f31691a;
    public i7.a<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f31692c;

    public c() {
        this.f31691a = new b<>();
        this.f31692c = null;
    }

    public T a(b<T> bVar) {
        return this.f31692c;
    }

    public final T b(float f10, float f11, T t8, T t10, float f12, float f13, float f14) {
        return a(this.f31691a.h(f10, f11, t8, t10, f12, f13, f14));
    }

    public final void c(i7.a<?, ?> aVar) {
        this.b = aVar;
    }

    public c(T t8) {
        this.f31691a = new b<>();
        this.f31692c = t8;
    }
}
