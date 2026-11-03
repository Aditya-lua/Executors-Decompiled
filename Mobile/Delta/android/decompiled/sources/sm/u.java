package sm;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f31644i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f31645a;
    public g<K, V>[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<K, V> f31646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u<K, V>.d f31650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u<K, V>.e f31651h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f31652a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31653c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31654d;

        public void a(g<K, V> gVar) {
            gVar.f31664c = null;
            gVar.f31663a = null;
            gVar.b = null;
            gVar.f31670i = 1;
            int i10 = this.b;
            if (i10 > 0) {
                int i11 = this.f31654d;
                if ((i11 & 1) == 0) {
                    this.f31654d = i11 + 1;
                    this.b = i10 - 1;
                    this.f31653c++;
                }
            }
            gVar.f31663a = this.f31652a;
            this.f31652a = gVar;
            int i12 = this.f31654d;
            int i13 = i12 + 1;
            this.f31654d = i13;
            int i14 = this.b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f31654d = i12 + 2;
                this.b = i14 - 1;
                this.f31653c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f31654d & i16) != i16) {
                    return;
                }
                int i17 = this.f31653c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f31652a;
                    g<K, V> gVar3 = gVar2.f31663a;
                    g<K, V> gVar4 = gVar3.f31663a;
                    gVar3.f31663a = gVar4.f31663a;
                    this.f31652a = gVar3;
                    gVar3.b = gVar4;
                    gVar3.f31664c = gVar2;
                    gVar3.f31670i = gVar2.f31670i + 1;
                    gVar4.f31663a = gVar3;
                    gVar2.f31663a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f31652a;
                    g<K, V> gVar6 = gVar5.f31663a;
                    this.f31652a = gVar6;
                    gVar6.f31664c = gVar5;
                    gVar6.f31670i = gVar5.f31670i + 1;
                    gVar5.f31663a = gVar6;
                    this.f31653c = 0;
                } else if (i17 == 2) {
                    this.f31653c = 0;
                }
                i15 *= 2;
            }
        }

        public void b(int i10) {
            this.b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f31654d = 0;
            this.f31653c = 0;
            this.f31652a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f31652a;
            if (gVar.f31663a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f31655a;

        public g<K, V> a() {
            g<K, V> gVar = this.f31655a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f31663a;
            gVar.f31663a = null;
            g<K, V> gVar3 = gVar.f31664c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f31655a = gVar4;
                    return gVar;
                }
                gVar2.f31663a = gVar4;
                gVar3 = gVar2.b;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f31663a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.f31655a = gVar2;
        }
    }

    public final class d extends AbstractSet<Map.Entry<K, V>> {

        public class a extends u<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && u.this.e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarE;
            if (!(obj instanceof Map.Entry) || (gVarE = u.this.e((Map.Entry) obj)) == null) {
                return false;
            }
            u.this.i(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f31647d;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends u<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f31667f;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return u.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return u.this.j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f31647d;
        }
    }

    public abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f31660a;
        public g<K, V> b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31661c;

        public f() {
            this.f31660a = u.this.f31646c.f31665d;
            this.f31661c = u.this.f31648e;
        }

        public final g<K, V> b() {
            g<K, V> gVar = this.f31660a;
            u uVar = u.this;
            if (gVar == uVar.f31646c) {
                throw new NoSuchElementException();
            }
            if (uVar.f31648e != this.f31661c) {
                throw new ConcurrentModificationException();
            }
            this.f31660a = gVar.f31665d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f31660a != u.this.f31646c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            u.this.i(gVar, true);
            this.b = null;
            this.f31661c = u.this.f31648e;
        }
    }

    public u() {
        this(null);
    }

    public static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarA = cVar.a();
                    if (gVarA == null) {
                        break;
                    }
                    if ((gVarA.f31668g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g<K, V> gVarA2 = cVar.a();
                    if (gVarA2 == null) {
                        break;
                    }
                    if ((gVarA2.f31668g & length) == 0) {
                        bVar.a(gVarA2);
                    } else {
                        bVar2.a(gVarA2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    public static int n(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public final void a() {
        g<K, V>[] gVarArrB = b(this.b);
        this.b = gVarArrB;
        this.f31649f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
    }

    public final boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.b, (Object) null);
        this.f31647d = 0;
        this.f31648e++;
        g<K, V> gVar = this.f31646c;
        g<K, V> gVar2 = gVar.f31665d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f31665d;
            gVar2.f31666e = null;
            gVar2.f31665d = null;
            gVar2 = gVar3;
        }
        gVar.f31666e = gVar;
        gVar.f31665d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    public g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f31645a;
        g<K, V>[] gVarArr = this.b;
        int iN = n(k10.hashCode());
        int length = (gVarArr.length - 1) & iN;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f31644i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f31667f) : comparator.compare(k10, gVar2.f31667f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.b : gVar2.f31664c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i10 = iCompareTo;
        if (!z10) {
            return null;
        }
        g<K, V> gVar4 = this.f31646c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iN, gVar4, gVar4.f31666e);
            if (i10 < 0) {
                gVar5.b = gVar;
            } else {
                gVar5.f31664c = gVar;
            }
            g(gVar5, true);
        } else {
            if (comparator == f31644i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iN, gVar4, gVar4.f31666e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f31647d;
        this.f31647d = i11 + 1;
        if (i11 > this.f31649f) {
            a();
        }
        this.f31648e++;
        return gVar;
    }

    public g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF == null || !c(gVarF.f31669h, entry.getValue())) {
            return null;
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        u<K, V>.d dVar = this.f31650g;
        if (dVar != null) {
            return dVar;
        }
        u<K, V>.d dVar2 = new d();
        this.f31650g = dVar2;
        return dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> f(Object obj) {
        if (obj != 0) {
            try {
                return d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.b;
            g<K, V> gVar3 = gVar.f31664c;
            int i10 = gVar2 != null ? gVar2.f31670i : 0;
            int i11 = gVar3 != null ? gVar3.f31670i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.b;
                g<K, V> gVar5 = gVar3.f31664c;
                int i13 = (gVar4 != null ? gVar4.f31670i : 0) - (gVar5 != null ? gVar5.f31670i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m(gVar3);
                }
                l(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.b;
                g<K, V> gVar7 = gVar2.f31664c;
                int i14 = (gVar6 != null ? gVar6.f31670i : 0) - (gVar7 != null ? gVar7.f31670i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    l(gVar2);
                }
                m(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f31670i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f31670i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f31663a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            return gVarF.f31669h;
        }
        return null;
    }

    public void i(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f31666e;
            gVar2.f31665d = gVar.f31665d;
            gVar.f31665d.f31666e = gVar2;
            gVar.f31666e = null;
            gVar.f31665d = null;
        }
        g<K, V> gVar3 = gVar.b;
        g<K, V> gVar4 = gVar.f31664c;
        g<K, V> gVar5 = gVar.f31663a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                k(gVar, gVar3);
                gVar.b = null;
            } else if (gVar4 != null) {
                k(gVar, gVar4);
                gVar.f31664c = null;
            } else {
                k(gVar, null);
            }
            g(gVar5, false);
            this.f31647d--;
            this.f31648e++;
            return;
        }
        g<K, V> gVarB = gVar3.f31670i > gVar4.f31670i ? gVar3.b() : gVar4.a();
        i(gVarB, false);
        g<K, V> gVar6 = gVar.b;
        if (gVar6 != null) {
            i10 = gVar6.f31670i;
            gVarB.b = gVar6;
            gVar6.f31663a = gVarB;
            gVar.b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f31664c;
        if (gVar7 != null) {
            i11 = gVar7.f31670i;
            gVarB.f31664c = gVar7;
            gVar7.f31663a = gVarB;
            gVar.f31664c = null;
        }
        gVarB.f31670i = Math.max(i10, i11) + 1;
        k(gVar, gVarB);
    }

    public g<K, V> j(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            i(gVarF, true);
        }
        return gVarF;
    }

    public final void k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f31663a;
        gVar.f31663a = null;
        if (gVar2 != null) {
            gVar2.f31663a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f31668g;
            g<K, V>[] gVarArr = this.b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.f31664c = gVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        u<K, V>.e eVar = this.f31651h;
        if (eVar != null) {
            return eVar;
        }
        u<K, V>.e eVar2 = new e();
        this.f31651h = eVar2;
        return eVar2;
    }

    public final void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f31664c;
        g<K, V> gVar4 = gVar3.b;
        g<K, V> gVar5 = gVar3.f31664c;
        gVar.f31664c = gVar4;
        if (gVar4 != null) {
            gVar4.f31663a = gVar;
        }
        k(gVar, gVar3);
        gVar3.b = gVar;
        gVar.f31663a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f31670i : 0, gVar4 != null ? gVar4.f31670i : 0) + 1;
        gVar.f31670i = iMax;
        gVar3.f31670i = Math.max(iMax, gVar5 != null ? gVar5.f31670i : 0) + 1;
    }

    public final void m(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f31664c;
        g<K, V> gVar4 = gVar2.b;
        g<K, V> gVar5 = gVar2.f31664c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.f31663a = gVar;
        }
        k(gVar, gVar2);
        gVar2.f31664c = gVar;
        gVar.f31663a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f31670i : 0, gVar5 != null ? gVar5.f31670i : 0) + 1;
        gVar.f31670i = iMax;
        gVar2.f31670i = Math.max(iMax, gVar4 != null ? gVar4.f31670i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v10 = gVarD.f31669h;
        gVarD.f31669h = v5;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarJ = j(obj);
        if (gVarJ != null) {
            return gVarJ.f31669h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f31647d;
    }

    public u(Comparator<? super K> comparator) {
        this.f31647d = 0;
        this.f31648e = 0;
        this.f31645a = comparator == null ? f31644i : comparator;
        this.f31646c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.b = gVarArr;
        this.f31649f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f31663a;
        public g<K, V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f31664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g<K, V> f31665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g<K, V> f31666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final K f31667f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f31668g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f31669h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31670i;

        public g() {
            this.f31667f = null;
            this.f31668g = -1;
            this.f31666e = this;
            this.f31665d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.b; gVar2 != null; gVar2 = gVar2.b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f31664c; gVar2 != null; gVar2 = gVar2.f31664c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f31667f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v5 = this.f31669h;
                    if (v5 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v5.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f31667f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f31669h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f31667f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.f31669h;
            return iHashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            V v10 = this.f31669h;
            this.f31669h = v5;
            return v10;
        }

        public String toString() {
            return this.f31667f + "=" + this.f31669h;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f31663a = gVar;
            this.f31667f = k10;
            this.f31668g = i10;
            this.f31670i = 1;
            this.f31665d = gVar2;
            this.f31666e = gVar3;
            gVar3.f31665d = this;
            gVar2.f31666e = this;
        }
    }
}
