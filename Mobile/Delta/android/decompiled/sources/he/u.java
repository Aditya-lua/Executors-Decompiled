package he;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f19288d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient w<Map.Entry<K, V>> f19289a;
    public transient w<K> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient r<V> f19290c;

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator<? super V> f19291a;
        public Object[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0342a f19294e;

        /* JADX INFO: renamed from: he.u$a$a, reason: collision with other inner class name */
        public static final class C0342a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f19295a;
            public final Object b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f19296c;

            public C0342a(Object obj, Object obj2, Object obj3) {
                this.f19295a = obj;
                this.b = obj2;
                this.f19296c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f19295a);
                String strValueOf2 = String.valueOf(this.b);
                String strValueOf3 = String.valueOf(this.f19295a);
                String strValueOf4 = String.valueOf(this.f19296c);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb2.append("Multiple entries with same key: ");
                sb2.append(strValueOf);
                sb2.append("=");
                sb2.append(strValueOf2);
                sb2.append(" and ");
                sb2.append(strValueOf3);
                sb2.append("=");
                sb2.append(strValueOf4);
                return new IllegalArgumentException(sb2.toString());
            }
        }

        public a() {
            this(4);
        }

        public static <V> void j(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, m0.a(comparator).e(f0.e()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public u<K, V> a() {
            return c();
        }

        public final u<K, V> b(boolean z10) {
            Object[] objArrE;
            C0342a c0342a;
            C0342a c0342a2;
            if (z10 && (c0342a2 = this.f19294e) != null) {
                throw c0342a2.a();
            }
            int length = this.f19292c;
            if (this.f19291a == null) {
                objArrE = this.b;
            } else {
                if (this.f19293d) {
                    this.b = Arrays.copyOf(this.b, length * 2);
                }
                objArrE = this.b;
                if (!z10) {
                    objArrE = e(objArrE, this.f19292c);
                    if (objArrE.length < this.b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f19291a);
            }
            this.f19293d = true;
            q0 q0VarR = q0.r(length, objArrE, this);
            if (!z10 || (c0342a = this.f19294e) == null) {
                return q0VarR;
            }
            throw c0342a.a();
        }

        public u<K, V> c() {
            return b(true);
        }

        public final void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.b;
            if (i11 > objArr.length) {
                this.b = Arrays.copyOf(objArr, r.b.c(objArr.length, i11));
                this.f19293d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        public a<K, V> f(K k10, V v5) {
            d(this.f19292c + 1);
            g.a(k10, v5);
            Object[] objArr = this.b;
            int i10 = this.f19292c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v5;
            this.f19292c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f19292c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public a<K, V> i(Map<? extends K, ? extends V> map) {
            return h(map.entrySet());
        }

        public a(int i10) {
            this.b = new Object[i10 * 2];
            this.f19292c = 0;
            this.f19293d = false;
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> a<K, V> b(int i10) {
        g.b(i10, "expectedSize");
        return new a<>(i10);
    }

    public static <K, V> u<K, V> c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> u<K, V> j() {
        return (u<K, V>) q0.f19252h;
    }

    public static <K, V> u<K, V> k(K k10, V v5) {
        g.a(k10, v5);
        return q0.q(1, new Object[]{k10, v5});
    }

    public static <K, V> u<K, V> l(K k10, V v5, K k11, V v10, K k12, V v11) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        return q0.q(3, new Object[]{k10, v5, k11, v10, k12, v11});
    }

    public static <K, V> u<K, V> m(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        g.a(k13, v12);
        return q0.q(4, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12});
    }

    public static <K, V> u<K, V> n(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13) {
        g.a(k10, v5);
        g.a(k11, v10);
        g.a(k12, v11);
        g.a(k13, v12);
        g.a(k14, v13);
        return q0.q(5, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12, k14, v13});
    }

    @SafeVarargs
    public static <K, V> u<K, V> o(Map.Entry<? extends K, ? extends V>... entryArr) {
        return c(Arrays.asList(entryArr));
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract w<Map.Entry<K, V>> d();

    public abstract w<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return f0.a(this, obj);
    }

    public abstract r<V> f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w<Map.Entry<K, V>> entrySet() {
        w<Map.Entry<K, V>> wVar = this.f19289a;
        if (wVar != null) {
            return wVar;
        }
        w<Map.Entry<K, V>> wVarD = d();
        this.f19289a = wVarD;
        return wVarD;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v5) {
        V v10 = get(obj);
        return v10 != null ? v10 : v5;
    }

    @Override // java.util.Map
    public int hashCode() {
        return t0.b(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public w<K> keySet() {
        w<K> wVar = this.b;
        if (wVar != null) {
            return wVar;
        }
        w<K> wVarE = e();
        this.b = wVarE;
        return wVarE;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public r<V> values() {
        r<V> rVar = this.f19290c;
        if (rVar != null) {
            return rVar;
        }
        r<V> rVarF = f();
        this.f19290c = rVarF;
        return rVarF;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return f0.d(this);
    }
}
