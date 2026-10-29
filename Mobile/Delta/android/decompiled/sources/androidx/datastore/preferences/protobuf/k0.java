package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f2234a;
    public final K b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f2235c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.b f2236a;
        public final K b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1.b f2237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f2238d;

        public a(s1.b bVar, K k10, s1.b bVar2, V v5) {
            this.f2236a = bVar;
            this.b = k10;
            this.f2237c = bVar2;
            this.f2238d = v5;
        }
    }

    public k0(s1.b bVar, K k10, s1.b bVar2, V v5) {
        this.f2234a = new a<>(bVar, k10, bVar2, v5);
        this.b = k10;
        this.f2235c = v5;
    }

    public static <K, V> int b(a<K, V> aVar, K k10, V v5) {
        return t.d(aVar.f2236a, 1, k10) + t.d(aVar.f2237c, 2, v5);
    }

    public static <K, V> k0<K, V> d(s1.b bVar, K k10, s1.b bVar2, V v5) {
        return new k0<>(bVar, k10, bVar2, v5);
    }

    public static <K, V> void e(j jVar, a<K, V> aVar, K k10, V v5) {
        t.A(jVar, aVar.f2236a, 1, k10);
        t.A(jVar, aVar.f2237c, 2, v5);
    }

    public int a(int i10, K k10, V v5) {
        return j.U(i10) + j.C(b(this.f2234a, k10, v5));
    }

    public a<K, V> c() {
        return this.f2234a;
    }
}
