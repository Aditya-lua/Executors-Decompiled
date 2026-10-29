package ie;

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

/* JADX INFO: renamed from: ie.u */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6798u<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: d */
    public static final Map.Entry<?, ?>[] f26722d = new Map.Entry[0];

    /* JADX INFO: renamed from: a */
    public transient AbstractC6802w<Map.Entry<K, V>> f26723a;

    /* JADX INFO: renamed from: b */
    public transient AbstractC6802w<K> f26724b;

    /* JADX INFO: renamed from: c */
    public transient AbstractC6792r<V> f26725c;

    /* JADX INFO: renamed from: ie.u$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public Comparator<? super V> f26726a;

        /* JADX INFO: renamed from: b */
        public Object[] f26727b;

        /* JADX INFO: renamed from: c */
        public int f26728c;

        /* JADX INFO: renamed from: d */
        public boolean f26729d;

        /* JADX INFO: renamed from: e */
        public C14188a f26730e;

        /* JADX INFO: renamed from: ie.u$a$a, reason: collision with other inner class name */
        public static final class C14188a {

            /* JADX INFO: renamed from: a */
            public final Object f26731a;

            /* JADX INFO: renamed from: b */
            public final Object f26732b;

            /* JADX INFO: renamed from: c */
            public final Object f26733c;

            public C14188a(Object obj, Object obj2, Object obj3) {
                this.f26731a = obj;
                this.f26732b = obj2;
                this.f26733c = obj3;
            }

            /* JADX INFO: renamed from: a */
            public IllegalArgumentException m29129a() {
                String strValueOf = String.valueOf(this.f26731a);
                String strValueOf2 = String.valueOf(this.f26732b);
                String strValueOf3 = String.valueOf(this.f26731a);
                String strValueOf4 = String.valueOf(this.f26733c);
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(4);
        }

        /* JADX INFO: renamed from: j */
        public static <V> void m29125j(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, AbstractC6783m0.m29016a(comparator).m29020e(C6769f0.m28902e()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        /* JADX INFO: renamed from: a */
        public AbstractC6798u<K, V> mo29041a() {
            return mo29042c();
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC6798u<K, V> m29126b(boolean z10) {
            Object[] objArrM29128e;
            C14188a c14188a;
            C14188a c14188a2;
            if (z10 && (c14188a2 = this.f26730e) != null) {
                throw c14188a2.m29129a();
            }
            int length = this.f26728c;
            if (this.f26726a == null) {
                objArrM29128e = this.f26727b;
            } else {
                if (this.f26729d) {
                    this.f26727b = Arrays.copyOf(this.f26727b, length * 2);
                }
                objArrM29128e = this.f26727b;
                if (!z10) {
                    objArrM29128e = m29128e(objArrM29128e, this.f26728c);
                    if (objArrM29128e.length < this.f26727b.length) {
                        length = objArrM29128e.length >>> 1;
                    }
                }
                m29125j(objArrM29128e, length, this.f26726a);
            }
            this.f26729d = true;
            C6791q0 c6791q0M29054r = C6791q0.m29054r(length, objArrM29128e, this);
            if (!z10 || (c14188a = this.f26730e) == null) {
                return c6791q0M29054r;
            }
            throw c14188a.m29129a();
        }

        /* JADX INFO: renamed from: c */
        public AbstractC6798u<K, V> mo29042c() {
            return m29126b(true);
        }

        /* JADX INFO: renamed from: d */
        public final void m29127d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f26727b;
            if (i11 > objArr.length) {
                this.f26727b = Arrays.copyOf(objArr, AbstractC6792r.b.m29069c(objArr.length, i11));
                this.f26729d = false;
            }
        }

        /* JADX INFO: renamed from: e */
        public final Object[] m29128e(Object[] objArr, int i10) {
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

        /* JADX INFO: renamed from: f */
        public a<K, V> mo29043f(K k10, V v5) {
            m29127d(this.f26728c + 1);
            C6770g.m28906a(k10, v5);
            Object[] objArr = this.f26727b;
            int i10 = this.f26728c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v5;
            this.f26728c = i10 + 1;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public a<K, V> mo29044g(Map.Entry<? extends K, ? extends V> entry) {
            return mo29043f(entry.getKey(), entry.getValue());
        }

        /* JADX INFO: renamed from: h */
        public a<K, V> mo29045h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m29127d(this.f26728c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo29044g(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: i */
        public a<K, V> mo29046i(Map<? extends K, ? extends V> map) {
            return mo29045h(map.entrySet());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(int i10) {
            this.f26727b = new Object[i10 * 2];
            this.f26728c = 0;
            this.f26729d = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> a<K, V> m29114a() {
        return new a<>();
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> a<K, V> m29115b(int i10) {
        C6770g.m28907b(i10, "expectedSize");
        return new a<>(i10);
    }

    /* JADX INFO: renamed from: c */
    public static <K, V> AbstractC6798u<K, V> m29116c(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.mo29045h(iterable);
        return aVar.mo29041a();
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> AbstractC6798u<K, V> m29117j() {
        return (AbstractC6798u<K, V>) C6791q0.f26682h;
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> AbstractC6798u<K, V> m29118k(K k10, V v5) {
        C6770g.m28906a(k10, v5);
        return C6791q0.m29053q(1, new Object[]{k10, v5});
    }

    /* JADX INFO: renamed from: l */
    public static <K, V> AbstractC6798u<K, V> m29119l(K k10, V v5, K k11, V v10, K k12, V v11) {
        C6770g.m28906a(k10, v5);
        C6770g.m28906a(k11, v10);
        C6770g.m28906a(k12, v11);
        return C6791q0.m29053q(3, new Object[]{k10, v5, k11, v10, k12, v11});
    }

    /* JADX INFO: renamed from: m */
    public static <K, V> AbstractC6798u<K, V> m29120m(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12) {
        C6770g.m28906a(k10, v5);
        C6770g.m28906a(k11, v10);
        C6770g.m28906a(k12, v11);
        C6770g.m28906a(k13, v12);
        return C6791q0.m29053q(4, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12});
    }

    /* JADX INFO: renamed from: n */
    public static <K, V> AbstractC6798u<K, V> m29121n(K k10, V v5, K k11, V v10, K k12, V v11, K k13, V v12, K k14, V v13) {
        C6770g.m28906a(k10, v5);
        C6770g.m28906a(k11, v10);
        C6770g.m28906a(k12, v11);
        C6770g.m28906a(k13, v12);
        C6770g.m28906a(k14, v13);
        return C6791q0.m29053q(5, new Object[]{k10, v5, k11, v10, k12, v11, k13, v12, k14, v13});
    }

    @SafeVarargs
    /* JADX INFO: renamed from: o */
    public static <K, V> AbstractC6798u<K, V> m29122o(Map.Entry<? extends K, ? extends V>... entryArr) {
        return m29116c(Arrays.asList(entryArr));
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

    /* JADX INFO: renamed from: d */
    public abstract AbstractC6802w<Map.Entry<K, V>> mo29025d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC6802w<K> mo29026e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C6769f0.m28898a(this, obj);
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractC6792r<V> mo29037f();

    /* JADX DEBUG: Method merged with bridge method: entrySet()Ljava/util/Set; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC6802w<Map.Entry<K, V>> entrySet() {
        AbstractC6802w<Map.Entry<K, V>> abstractC6802w = this.f26723a;
        if (abstractC6802w != null) {
            return abstractC6802w;
        }
        AbstractC6802w<Map.Entry<K, V>> abstractC6802wMo29025d = mo29025d();
        this.f26723a = abstractC6802wMo29025d;
        return abstractC6802wMo29025d;
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
        return C6797t0.m29110b(entrySet());
    }

    /* JADX DEBUG: Method merged with bridge method: keySet()Ljava/util/Set; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC6802w<K> keySet() {
        AbstractC6802w<K> abstractC6802w = this.f26724b;
        if (abstractC6802w != null) {
            return abstractC6802w;
        }
        AbstractC6802w<K> abstractC6802wMo29026e = mo29026e();
        this.f26724b = abstractC6802wMo29026e;
        return abstractC6802wMo29026e;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX DEBUG: Method merged with bridge method: values()Ljava/util/Collection; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC6792r<V> values() {
        AbstractC6792r<V> abstractC6792r = this.f26725c;
        if (abstractC6792r != null) {
            return abstractC6792r;
        }
        AbstractC6792r<V> abstractC6792rMo29037f = mo29037f();
        this.f26725c = abstractC6792rMo29037f;
        return abstractC6792rMo29037f;
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
        return C6769f0.m28901d(this);
    }
}
