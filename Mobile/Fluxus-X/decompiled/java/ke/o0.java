package ke;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0<K, V> extends q<K, V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o0<Object, Object> f21387j = new o0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f21388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f21389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f21390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f21391h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient o0<V, K> f21392i;

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this.f21388e = null;
        this.f21389f = new Object[0];
        this.f21390g = 0;
        this.f21391h = 0;
        this.f21392i = this;
    }

    @Override // ke.u
    public w<Map.Entry<K, V>> d() {
        return new q0.a(this, this.f21389f, this.f21390g, this.f21391h);
    }

    @Override // ke.u
    public w<K> e() {
        return new q0.b(this, new q0.c(this.f21389f, this.f21390g, this.f21391h));
    }

    @Override // ke.u, java.util.Map
    public V get(Object obj) {
        V v8 = (V) q0.u(this.f21388e, this.f21389f, this.f21391h, this.f21390g, obj);
        if (v8 == null) {
            return null;
        }
        return v8;
    }

    @Override // ke.q
    public q<V, K> r() {
        return this.f21392i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f21391h;
    }

    public o0(Object[] objArr, int i10) {
        this.f21389f = objArr;
        this.f21391h = i10;
        this.f21390g = 0;
        int iH = i10 >= 2 ? w.h(i10) : 0;
        this.f21388e = q0.t(objArr, i10, iH, 0);
        this.f21392i = new o0<>(q0.t(objArr, i10, iH, 1), objArr, i10, this);
    }

    public o0(Object obj, Object[] objArr, int i10, o0<V, K> o0Var) {
        this.f21388e = obj;
        this.f21389f = objArr;
        this.f21390g = 1;
        this.f21391h = i10;
        this.f21392i = o0Var;
    }
}
