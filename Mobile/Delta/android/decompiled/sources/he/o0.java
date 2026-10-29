package he;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<K, V> extends q<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o0<Object, Object> f19243j = new o0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f19244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f19245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f19246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f19247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient o0<V, K> f19248i;

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this.f19244e = null;
        this.f19245f = new Object[0];
        this.f19246g = 0;
        this.f19247h = 0;
        this.f19248i = this;
    }

    @Override // he.u
    public w<Map.Entry<K, V>> d() {
        return new q0.a(this, this.f19245f, this.f19246g, this.f19247h);
    }

    @Override // he.u
    public w<K> e() {
        return new q0.b(this, new q0.c(this.f19245f, this.f19246g, this.f19247h));
    }

    @Override // he.u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) q0.u(this.f19244e, this.f19245f, this.f19247h, this.f19246g, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // he.q
    public q<V, K> r() {
        return this.f19248i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f19247h;
    }

    public o0(Object[] objArr, int i10) {
        this.f19245f = objArr;
        this.f19247h = i10;
        this.f19246g = 0;
        int iH = i10 >= 2 ? w.h(i10) : 0;
        this.f19244e = q0.t(objArr, i10, iH, 0);
        this.f19248i = new o0<>(q0.t(objArr, i10, iH, 1), objArr, i10, this);
    }

    public o0(Object obj, Object[] objArr, int i10, o0<V, K> o0Var) {
        this.f19244e = obj;
        this.f19245f = objArr;
        this.f19246g = 1;
        this.f19247h = i10;
        this.f19248i = o0Var;
    }
}
