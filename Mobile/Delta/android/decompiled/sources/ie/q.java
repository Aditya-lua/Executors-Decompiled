package ie;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q<K, V> extends u<K, V> implements Map {

    public static final class a<K, V> extends u.a<K, V> {
        @Override // ie.u.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public q<K, V> a() {
            return c();
        }

        @Override // ie.u.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public q<K, V> c() {
            int i10 = this.f21114c;
            if (i10 == 0) {
                return q.s();
            }
            if (this.f21113a != null) {
                if (this.f21115d) {
                    this.b = Arrays.copyOf(this.b, i10 * 2);
                }
                u.a.j(this.b, this.f21114c, this.f21113a);
            }
            this.f21115d = true;
            return new o0(this.b, this.f21114c);
        }

        @Override // ie.u.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> f(K k10, V v5) {
            super.f(k10, v5);
            return this;
        }

        @Override // ie.u.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // ie.u.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.h(iterable);
            return this;
        }

        @Override // ie.u.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> i(Map<? extends K, ? extends V> map) {
            super.i(map);
            return this;
        }
    }

    public static <K, V> q<K, V> s() {
        return o0.f21065j;
    }

    @Override // ie.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final w<V> f() {
        throw new AssertionError("should never be called");
    }

    public abstract q<V, K> r();

    @Override // ie.u, java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public w<V> values() {
        return r().keySet();
    }
}
