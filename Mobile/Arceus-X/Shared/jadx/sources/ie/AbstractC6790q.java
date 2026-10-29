package ie;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: ie.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6790q<K, V> extends AbstractC6798u<K, V> implements Map {

    /* JADX INFO: renamed from: ie.q$a */
    public static final class a<K, V> extends AbstractC6798u.a<K, V> {
        /* JADX DEBUG: Method merged with bridge method: a()Lie/u; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC6790q<K, V> mo29041a() {
            return mo29042c();
        }

        /* JADX DEBUG: Method merged with bridge method: c()Lie/u; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC6790q<K, V> mo29042c() {
            int i10 = this.f26728c;
            if (i10 == 0) {
                return AbstractC6790q.m29036s();
            }
            if (this.f26726a != null) {
                if (this.f26729d) {
                    this.f26727b = Arrays.copyOf(this.f26727b, i10 * 2);
                }
                AbstractC6798u.a.m29125j(this.f26727b, this.f26728c, this.f26726a);
            }
            this.f26729d = true;
            return new C6787o0(this.f26727b, this.f26728c);
        }

        /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;)Lie/u$a; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a<K, V> mo29043f(K k10, V v5) {
            super.mo29043f(k10, v5);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: g(Ljava/util/Map$Entry;)Lie/u$a; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public a<K, V> mo29044g(Map.Entry<? extends K, ? extends V> entry) {
            super.mo29044g(entry);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: h(Ljava/lang/Iterable;)Lie/u$a; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public a<K, V> mo29045h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo29045h(iterable);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: i(Ljava/util/Map;)Lie/u$a; */
        @Override // ie.AbstractC6798u.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public a<K, V> mo29046i(Map<? extends K, ? extends V> map) {
            super.mo29046i(map);
            return this;
        }
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> AbstractC6790q<K, V> m29036s() {
        return C6787o0.f26673j;
    }

    /* JADX DEBUG: Method merged with bridge method: f()Lie/r; */
    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final AbstractC6802w<V> mo29037f() {
        throw new AssertionError("should never be called");
    }

    /* JADX INFO: renamed from: r */
    public abstract AbstractC6790q<V, K> mo29027r();

    /* JADX DEBUG: Method merged with bridge method: p()Lie/r; */
    /* JADX DEBUG: Method merged with bridge method: values()Ljava/util/Collection; */
    @Override // ie.AbstractC6798u, java.util.Map
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC6802w<V> values() {
        return mo29027r().keySet();
    }
}
