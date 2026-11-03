package ie;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<K, V> extends q<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o0<Object, Object> f21065j = new o0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f21066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f21067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f21068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f21069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient o0<V, K> f21070i;

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this.f21066e = null;
        this.f21067f = new Object[0];
        this.f21068g = 0;
        this.f21069h = 0;
        this.f21070i = this;
    }

    @Override // ie.u
    public w<Map.Entry<K, V>> d() {
        return new q0.a(this, this.f21067f, this.f21068g, this.f21069h);
    }

    @Override // ie.u
    public w<K> e() {
        return new q0.b(this, new q0.c(this.f21067f, this.f21068g, this.f21069h));
    }

    @Override // ie.u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) q0.u(this.f21066e, this.f21067f, this.f21069h, this.f21068g, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // ie.q
    public q<V, K> r() {
        return this.f21070i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f21069h;
    }

    public o0(Object[] objArr, int i10) {
        this.f21067f = objArr;
        this.f21069h = i10;
        this.f21068g = 0;
        int iH = i10 >= 2 ? w.h(i10) : 0;
        this.f21066e = q0.t(objArr, i10, iH, 0);
        this.f21070i = new o0<>(q0.t(objArr, i10, iH, 1), objArr, i10, this);
    }

    public o0(Object obj, Object[] objArr, int i10, o0<V, K> o0Var) {
        this.f21066e = obj;
        this.f21067f = objArr;
        this.f21068g = 1;
        this.f21069h = i10;
        this.f21070i = o0Var;
    }
}
