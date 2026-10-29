package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0 */
/* JADX INFO: loaded from: classes.dex */
public class C0853k0<K, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f2939a;

    /* JADX INFO: renamed from: b */
    public final K f2940b;

    /* JADX INFO: renamed from: c */
    public final V f2941c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final C0878s1.b f2942a;

        /* JADX INFO: renamed from: b */
        public final K f2943b;

        /* JADX INFO: renamed from: c */
        public final C0878s1.b f2944c;

        /* JADX INFO: renamed from: d */
        public final V f2945d;

        public a(C0878s1.b bVar, K k10, C0878s1.b bVar2, V v5) {
            this.f2942a = bVar;
            this.f2943b = k10;
            this.f2944c = bVar2;
            this.f2945d = v5;
        }
    }

    public C0853k0(C0878s1.b bVar, K k10, C0878s1.b bVar2, V v5) {
        this.f2939a = new a<>(bVar, k10, bVar2, v5);
        this.f2940b = k10;
        this.f2941c = v5;
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> int m3853b(a<K, V> aVar, K k10, V v5) {
        return C0879t.m4066d(aVar.f2942a, 1, k10) + C0879t.m4066d(aVar.f2944c, 2, v5);
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> C0853k0<K, V> m3854d(C0878s1.b bVar, K k10, C0878s1.b bVar2, V v5) {
        return new C0853k0<>(bVar, k10, bVar2, v5);
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> void m3855e(AbstractC0849j abstractC0849j, a<K, V> aVar, K k10, V v5) {
        C0879t.m4063A(abstractC0849j, aVar.f2942a, 1, k10);
        C0879t.m4063A(abstractC0849j, aVar.f2944c, 2, v5);
    }

    /* JADX INFO: renamed from: a */
    public int m3856a(int i10, K k10, V v5) {
        return AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(m3853b(this.f2939a, k10, v5));
    }

    /* JADX INFO: renamed from: c */
    public a<K, V> m3857c() {
        return this.f2939a;
    }
}
