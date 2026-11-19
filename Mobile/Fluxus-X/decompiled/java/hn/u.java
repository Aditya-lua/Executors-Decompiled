package hn;

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
    public static final Comparator<Comparable> f18399i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f18400a;
    public g<K, V>[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<K, V> f18401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u<K, V>.d f18405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u<K, V>.e f18406h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f18407a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18409d;

        public void a(g<K, V> gVar) {
            gVar.f18419c = null;
            gVar.f18418a = null;
            gVar.b = null;
            gVar.f18425i = 1;
            int i10 = this.b;
            if (i10 > 0) {
                int i11 = this.f18409d;
                if ((i11 & 1) == 0) {
                    this.f18409d = i11 + 1;
                    this.b = i10 - 1;
                    this.f18408c++;
                }
            }
            gVar.f18418a = this.f18407a;
            this.f18407a = gVar;
            int i12 = this.f18409d;
            int i13 = i12 + 1;
            this.f18409d = i13;
            int i14 = this.b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f18409d = i12 + 2;
                this.b = i14 - 1;
                this.f18408c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f18409d & i16) != i16) {
                    return;
                }
                int i17 = this.f18408c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f18407a;
                    g<K, V> gVar3 = gVar2.f18418a;
                    g<K, V> gVar4 = gVar3.f18418a;
                    gVar3.f18418a = gVar4.f18418a;
                    this.f18407a = gVar3;
                    gVar3.b = gVar4;
                    gVar3.f18419c = gVar2;
                    gVar3.f18425i = gVar2.f18425i + 1;
                    gVar4.f18418a = gVar3;
                    gVar2.f18418a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f18407a;
                    g<K, V> gVar6 = gVar5.f18418a;
                    this.f18407a = gVar6;
                    gVar6.f18419c = gVar5;
                    gVar6.f18425i = gVar5.f18425i + 1;
                    gVar5.f18418a = gVar6;
                    this.f18408c = 0;
                } else if (i17 == 2) {
                    this.f18408c = 0;
                }
                i15 *= 2;
            }
        }

        public void b(int i10) {
            this.b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f18409d = 0;
            this.f18408c = 0;
            this.f18407a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f18407a;
            if (gVar.f18418a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f18410a;

        public g<K, V> a() {
            g<K, V> gVar = this.f18410a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f18418a;
            gVar.f18418a = null;
            g<K, V> gVar3 = gVar.f18419c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f18410a = gVar4;
                    return gVar;
                }
                gVar2.f18418a = gVar4;
                gVar3 = gVar2.b;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f18418a = gVar2;
                gVar2 = gVar;
                gVar = gVar.b;
            }
            this.f18410a = gVar2;
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
            u.this.h(gVarE, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f18402d;
        }
    }

    public final class e extends AbstractSet<K> {

        public class a extends u<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f18422f;
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
            return u.this.i(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.f18402d;
        }
    }

    public abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f18415a;
        public g<K, V> b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18416c;

        public f() {
            this.f18415a = u.this.f18401c.f18420d;
            this.f18416c = u.this.f18403e;
        }

        public final g<K, V> b() {
            g<K, V> gVar = this.f18415a;
            u uVar = u.this;
            if (gVar == uVar.f18401c) {
                throw new NoSuchElementException();
            }
            if (uVar.f18403e != this.f18416c) {
                throw new ConcurrentModificationException();
            }
            this.f18415a = gVar.f18420d;
            this.b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18415a != u.this.f18401c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            u.this.h(gVar, true);
            this.b = null;
            this.f18416c = u.this.f18403e;
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
                    if ((gVarA.f18423g & length) == 0) {
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
                    if ((gVarA2.f18423g & length) == 0) {
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

    public static int m(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public final void a() {
        g<K, V>[] gVarArrB = b(this.b);
        this.b = gVarArrB;
        this.f18404f = (gVarArrB.length / 2) + (gVarArrB.length / 4);
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
        this.f18402d = 0;
        this.f18403e++;
        g<K, V> gVar = this.f18401c;
        g<K, V> gVar2 = gVar.f18420d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f18420d;
            gVar2.f18421e = null;
            gVar2.f18420d = null;
            gVar2 = gVar3;
        }
        gVar.f18421e = gVar;
        gVar.f18420d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    public g<K, V> d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f18400a;
        g<K, V>[] gVarArr = this.b;
        int iM = m(k10.hashCode());
        int length = (gVarArr.length - 1) & iM;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f18399i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f18422f) : comparator.compare(k10, gVar2.f18422f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.b : gVar2.f18419c;
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
        g<K, V> gVar4 = this.f18401c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iM, gVar4, gVar4.f18421e);
            if (i10 < 0) {
                gVar5.b = gVar;
            } else {
                gVar5.f18419c = gVar;
            }
            g(gVar5, true);
        } else {
            if (comparator == f18399i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iM, gVar4, gVar4.f18421e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f18402d;
        this.f18402d = i11 + 1;
        if (i11 > this.f18404f) {
            a();
        }
        this.f18403e++;
        return gVar;
    }

    public g<K, V> e(Map.Entry<?, ?> entry) {
        g<K, V> gVarF = f(entry.getKey());
        if (gVarF == null || !c(gVarF.f18424h, entry.getValue())) {
            return null;
        }
        return gVarF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        u<K, V>.d dVar = this.f18405g;
        if (dVar != null) {
            return dVar;
        }
        u<K, V>.d dVar2 = new d();
        this.f18405g = dVar2;
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
            g<K, V> gVar3 = gVar.f18419c;
            int i10 = gVar2 != null ? gVar2.f18425i : 0;
            int i11 = gVar3 != null ? gVar3.f18425i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.b;
                g<K, V> gVar5 = gVar3.f18419c;
                int i13 = (gVar4 != null ? gVar4.f18425i : 0) - (gVar5 != null ? gVar5.f18425i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    l(gVar3);
                }
                k(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.b;
                g<K, V> gVar7 = gVar2.f18419c;
                int i14 = (gVar6 != null ? gVar6.f18425i : 0) - (gVar7 != null ? gVar7.f18425i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    k(gVar2);
                }
                l(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f18425i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f18425i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f18418a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            return gVarF.f18424h;
        }
        return null;
    }

    public void h(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f18421e;
            gVar2.f18420d = gVar.f18420d;
            gVar.f18420d.f18421e = gVar2;
            gVar.f18421e = null;
            gVar.f18420d = null;
        }
        g<K, V> gVar3 = gVar.b;
        g<K, V> gVar4 = gVar.f18419c;
        g<K, V> gVar5 = gVar.f18418a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                j(gVar, gVar3);
                gVar.b = null;
            } else if (gVar4 != null) {
                j(gVar, gVar4);
                gVar.f18419c = null;
            } else {
                j(gVar, null);
            }
            g(gVar5, false);
            this.f18402d--;
            this.f18403e++;
            return;
        }
        g<K, V> gVarB = gVar3.f18425i > gVar4.f18425i ? gVar3.b() : gVar4.a();
        h(gVarB, false);
        g<K, V> gVar6 = gVar.b;
        if (gVar6 != null) {
            i10 = gVar6.f18425i;
            gVarB.b = gVar6;
            gVar6.f18418a = gVarB;
            gVar.b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f18419c;
        if (gVar7 != null) {
            i11 = gVar7.f18425i;
            gVarB.f18419c = gVar7;
            gVar7.f18418a = gVarB;
            gVar.f18419c = null;
        }
        gVarB.f18425i = Math.max(i10, i11) + 1;
        j(gVar, gVarB);
    }

    public g<K, V> i(Object obj) {
        g<K, V> gVarF = f(obj);
        if (gVarF != null) {
            h(gVarF, true);
        }
        return gVarF;
    }

    public final void j(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f18418a;
        gVar.f18418a = null;
        if (gVar2 != null) {
            gVar2.f18418a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f18423g;
            g<K, V>[] gVarArr = this.b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.b == gVar) {
            gVar3.b = gVar2;
        } else {
            gVar3.f18419c = gVar2;
        }
    }

    public final void k(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f18419c;
        g<K, V> gVar4 = gVar3.b;
        g<K, V> gVar5 = gVar3.f18419c;
        gVar.f18419c = gVar4;
        if (gVar4 != null) {
            gVar4.f18418a = gVar;
        }
        j(gVar, gVar3);
        gVar3.b = gVar;
        gVar.f18418a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f18425i : 0, gVar4 != null ? gVar4.f18425i : 0) + 1;
        gVar.f18425i = iMax;
        gVar3.f18425i = Math.max(iMax, gVar5 != null ? gVar5.f18425i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        u<K, V>.e eVar = this.f18406h;
        if (eVar != null) {
            return eVar;
        }
        u<K, V>.e eVar2 = new e();
        this.f18406h = eVar2;
        return eVar2;
    }

    public final void l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.b;
        g<K, V> gVar3 = gVar.f18419c;
        g<K, V> gVar4 = gVar2.b;
        g<K, V> gVar5 = gVar2.f18419c;
        gVar.b = gVar5;
        if (gVar5 != null) {
            gVar5.f18418a = gVar;
        }
        j(gVar, gVar2);
        gVar2.f18419c = gVar;
        gVar.f18418a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f18425i : 0, gVar5 != null ? gVar5.f18425i : 0) + 1;
        gVar.f18425i = iMax;
        gVar2.f18425i = Math.max(iMax, gVar4 != null ? gVar4.f18425i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v8) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarD = d(k10, true);
        V v10 = gVarD.f18424h;
        gVarD.f18424h = v8;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarI = i(obj);
        if (gVarI != null) {
            return gVarI.f18424h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18402d;
    }

    public u(Comparator<? super K> comparator) {
        this.f18402d = 0;
        this.f18403e = 0;
        this.f18400a = comparator == null ? f18399i : comparator;
        this.f18401c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.b = gVarArr;
        this.f18404f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g<K, V> f18418a;
        public g<K, V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g<K, V> f18419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g<K, V> f18420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g<K, V> f18421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final K f18422f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f18423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f18424h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18425i;

        public g() {
            this.f18422f = null;
            this.f18423g = -1;
            this.f18421e = this;
            this.f18420d = this;
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
            for (g<K, V> gVar2 = this.f18419c; gVar2 != null; gVar2 = gVar2.f18419c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f18422f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v8 = this.f18424h;
                    if (v8 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v8.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f18422f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f18424h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f18422f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v8 = this.f18424h;
            return iHashCode ^ (v8 != null ? v8.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v8) {
            V v10 = this.f18424h;
            this.f18424h = v8;
            return v10;
        }

        public String toString() {
            return this.f18422f + "=" + this.f18424h;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f18418a = gVar;
            this.f18422f = k10;
            this.f18423g = i10;
            this.f18425i = 1;
            this.f18420d = gVar2;
            this.f18421e = gVar3;
            gVar3.f18420d = this;
            gVar2.f18421e = this;
        }
    }
}
