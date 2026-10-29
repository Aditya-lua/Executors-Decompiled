package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class x<K, V> extends v<K, V> implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient w<V> f19304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient w<Map.Entry<K, V>> f19305d;

    public static final class a<K, V> extends v.b<K, V> {
        @Override // he.v.b
        public Collection<V> a() {
            return n0.c();
        }

        public x<K, V> c() {
            Collection collectionEntrySet = this.f19302a.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                collectionEntrySet = m0.a(comparator).d().b(collectionEntrySet);
            }
            return x.i(collectionEntrySet, this.f19303c);
        }

        public a<K, V> d(K k10, Iterable<? extends V> iterable) {
            super.b(k10, iterable);
            return this;
        }

        public a<K, V> e(K k10, V... vArr) {
            return d(k10, Arrays.asList(vArr));
        }
    }

    public static final class b<K, V> extends w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient x<K, V> f19306c;

        public b(x<K, V> xVar) {
            this.f19306c = xVar;
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f19306c.b(entry.getKey(), entry.getValue());
        }

        @Override // he.r
        public boolean f() {
            return false;
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public y0<Map.Entry<K, V>> iterator() {
            return this.f19306c.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f19306c.e();
        }
    }

    public x(u<K, w<V>> uVar, int i10, Comparator<? super V> comparator) {
        super(uVar, i10);
        this.f19304c = g(comparator);
    }

    public static <K, V> a<K, V> f() {
        return new a<>();
    }

    public static <V> w<V> g(Comparator<? super V> comparator) {
        return comparator == null ? w.t() : y.F(comparator);
    }

    public static <K, V> x<K, V> i(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return j();
        }
        u.a aVar = new u.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            w wVarK = k(comparator, entry.getValue());
            if (!wVarK.isEmpty()) {
                aVar.f(key, wVarK);
                size += wVarK.size();
            }
        }
        return new x<>(aVar.c(), size, comparator);
    }

    public static <K, V> x<K, V> j() {
        return n.f19242e;
    }

    public static <V> w<V> k(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? w.k(collection) : y.C(comparator, collection);
    }

    public w<Map.Entry<K, V>> h() {
        w<Map.Entry<K, V>> wVar = this.f19305d;
        if (wVar != null) {
            return wVar;
        }
        b bVar = new b(this);
        this.f19305d = bVar;
        return bVar;
    }
}
