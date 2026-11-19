package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f2040a;
    public final K b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f2041c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.b f2042a;
        public final K b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1.b f2043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f2044d;

        public a(s1.b bVar, K k10, s1.b bVar2, V v8) {
            this.f2042a = bVar;
            this.b = k10;
            this.f2043c = bVar2;
            this.f2044d = v8;
        }
    }

    public k0(s1.b bVar, K k10, s1.b bVar2, V v8) {
        this.f2040a = new a<>(bVar, k10, bVar2, v8);
        this.b = k10;
        this.f2041c = v8;
    }

    public static <K, V> int b(a<K, V> aVar, K k10, V v8) {
        return t.d(aVar.f2042a, 1, k10) + t.d(aVar.f2043c, 2, v8);
    }

    public static <K, V> k0<K, V> d(s1.b bVar, K k10, s1.b bVar2, V v8) {
        return new k0<>(bVar, k10, bVar2, v8);
    }

    public static <K, V> void e(j jVar, a<K, V> aVar, K k10, V v8) {
        t.A(jVar, aVar.f2042a, 1, k10);
        t.A(jVar, aVar.f2043c, 2, v8);
    }

    public int a(int i10, K k10, V v8) {
        return j.U(i10) + j.C(b(this.f2040a, k10, v8));
    }

    public a<K, V> c() {
        return this.f2040a;
    }
}
