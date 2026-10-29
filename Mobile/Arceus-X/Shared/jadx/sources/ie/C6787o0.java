package ie;

import java.util.Map;

/* JADX INFO: renamed from: ie.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6787o0<K, V> extends AbstractC6790q<K, V> {

    /* JADX INFO: renamed from: j */
    public static final C6787o0<Object, Object> f26673j = new C6787o0<>();

    /* JADX INFO: renamed from: e */
    public final transient Object f26674e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f26675f;

    /* JADX INFO: renamed from: g */
    public final transient int f26676g;

    /* JADX INFO: renamed from: h */
    public final transient int f26677h;

    /* JADX INFO: renamed from: i */
    public final transient C6787o0<V, K> f26678i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ie.o0<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6787o0() {
        this.f26674e = null;
        this.f26675f = new Object[0];
        this.f26676g = 0;
        this.f26677h = 0;
        this.f26678i = this;
    }

    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: d */
    public AbstractC6802w<Map.Entry<K, V>> mo29025d() {
        return new C6791q0.a(this, this.f26675f, this.f26676g, this.f26677h);
    }

    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: e */
    public AbstractC6802w<K> mo29026e() {
        return new C6791q0.b(this, new C6791q0.c(this.f26675f, this.f26676g, this.f26677h));
    }

    @Override // ie.AbstractC6798u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) C6791q0.m29057u(this.f26674e, this.f26675f, this.f26677h, this.f26676g, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // ie.AbstractC6790q
    /* JADX INFO: renamed from: r */
    public AbstractC6790q<V, K> mo29027r() {
        return this.f26678i;
    }

    @Override // java.util.Map
    public int size() {
        return this.f26677h;
    }

    public C6787o0(Object[] objArr, int i10) {
        this.f26675f = objArr;
        this.f26677h = i10;
        this.f26676g = 0;
        int iM29136h = i10 >= 2 ? AbstractC6802w.m29136h(i10) : 0;
        this.f26674e = C6791q0.m29056t(objArr, i10, iM29136h, 0);
        this.f26678i = new C6787o0<>(C6791q0.m29056t(objArr, i10, iM29136h, 1), objArr, i10, this);
    }

    public C6787o0(Object obj, Object[] objArr, int i10, C6787o0<V, K> c6787o0) {
        this.f26674e = obj;
        this.f26675f = objArr;
        this.f26676g = 1;
        this.f26677h = i10;
        this.f26678i = c6787o0;
    }
}
