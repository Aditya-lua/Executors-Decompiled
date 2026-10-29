package p471um;

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

/* JADX INFO: renamed from: um.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C11886u<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i */
    public static final Comparator<Comparable> f42176i = new a();

    /* JADX INFO: renamed from: a */
    public final Comparator<? super K> f42177a;

    /* JADX INFO: renamed from: b */
    public g<K, V>[] f42178b;

    /* JADX INFO: renamed from: c */
    public final g<K, V> f42179c;

    /* JADX INFO: renamed from: d */
    public int f42180d;

    /* JADX INFO: renamed from: e */
    public int f42181e;

    /* JADX INFO: renamed from: f */
    public int f42182f;

    /* JADX INFO: renamed from: g */
    public C11886u<K, V>.d f42183g;

    /* JADX INFO: renamed from: h */
    public C11886u<K, V>.e f42184h;

    /* JADX INFO: renamed from: um.u$a */
    public class a implements Comparator<Comparable> {
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: um.u$b */
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a */
        public g<K, V> f42185a;

        /* JADX INFO: renamed from: b */
        public int f42186b;

        /* JADX INFO: renamed from: c */
        public int f42187c;

        /* JADX INFO: renamed from: d */
        public int f42188d;

        /* JADX INFO: renamed from: a */
        public void m44422a(g<K, V> gVar) {
            gVar.f42200c = null;
            gVar.f42198a = null;
            gVar.f42199b = null;
            gVar.f42206i = 1;
            int i10 = this.f42186b;
            if (i10 > 0) {
                int i11 = this.f42188d;
                if ((i11 & 1) == 0) {
                    this.f42188d = i11 + 1;
                    this.f42186b = i10 - 1;
                    this.f42187c++;
                }
            }
            gVar.f42198a = this.f42185a;
            this.f42185a = gVar;
            int i12 = this.f42188d;
            int i13 = i12 + 1;
            this.f42188d = i13;
            int i14 = this.f42186b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f42188d = i12 + 2;
                this.f42186b = i14 - 1;
                this.f42187c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f42188d & i16) != i16) {
                    return;
                }
                int i17 = this.f42187c;
                if (i17 == 0) {
                    g<K, V> gVar2 = this.f42185a;
                    g<K, V> gVar3 = gVar2.f42198a;
                    g<K, V> gVar4 = gVar3.f42198a;
                    gVar3.f42198a = gVar4.f42198a;
                    this.f42185a = gVar3;
                    gVar3.f42199b = gVar4;
                    gVar3.f42200c = gVar2;
                    gVar3.f42206i = gVar2.f42206i + 1;
                    gVar4.f42198a = gVar3;
                    gVar2.f42198a = gVar3;
                } else if (i17 == 1) {
                    g<K, V> gVar5 = this.f42185a;
                    g<K, V> gVar6 = gVar5.f42198a;
                    this.f42185a = gVar6;
                    gVar6.f42200c = gVar5;
                    gVar6.f42206i = gVar5.f42206i + 1;
                    gVar5.f42198a = gVar6;
                    this.f42187c = 0;
                } else if (i17 == 2) {
                    this.f42187c = 0;
                }
                i15 *= 2;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m44423b(int i10) {
            this.f42186b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f42188d = 0;
            this.f42187c = 0;
            this.f42185a = null;
        }

        /* JADX INFO: renamed from: c */
        public g<K, V> m44424c() {
            g<K, V> gVar = this.f42185a;
            if (gVar.f42198a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: um.u$c */
    public static class c<K, V> {

        /* JADX INFO: renamed from: a */
        public g<K, V> f42189a;

        /* JADX INFO: renamed from: a */
        public g<K, V> m44425a() {
            g<K, V> gVar = this.f42189a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f42198a;
            gVar.f42198a = null;
            g<K, V> gVar3 = gVar.f42200c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f42189a = gVar4;
                    return gVar;
                }
                gVar2.f42198a = gVar4;
                gVar3 = gVar2.f42199b;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m44426b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f42198a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f42199b;
            }
            this.f42189a = gVar2;
        }
    }

    /* JADX INFO: renamed from: um.u$d */
    public final class d extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: um.u$d$a */
        public class a extends C11886u<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m44428b();
            }
        }

        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C11886u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C11886u.this.m44413e((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> gVarM44413e;
            if (!(obj instanceof Map.Entry) || (gVarM44413e = C11886u.this.m44413e((Map.Entry) obj)) == null) {
                return false;
            }
            C11886u.this.m44416i(gVarM44413e, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C11886u.this.f42180d;
        }
    }

    /* JADX INFO: renamed from: um.u$e */
    public final class e extends AbstractSet<K> {

        /* JADX INFO: renamed from: um.u$e$a */
        public class a extends C11886u<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m44428b().f42203f;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C11886u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C11886u.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C11886u.this.m44417j(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C11886u.this.f42180d;
        }
    }

    /* JADX INFO: renamed from: um.u$f */
    public abstract class f<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public g<K, V> f42194a;

        /* JADX INFO: renamed from: b */
        public g<K, V> f42195b = null;

        /* JADX INFO: renamed from: c */
        public int f42196c;

        public f() {
            this.f42194a = C11886u.this.f42179c.f42201d;
            this.f42196c = C11886u.this.f42181e;
        }

        /* JADX INFO: renamed from: b */
        public final g<K, V> m44428b() {
            g<K, V> gVar = this.f42194a;
            C11886u c11886u = C11886u.this;
            if (gVar == c11886u.f42179c) {
                throw new NoSuchElementException();
            }
            if (c11886u.f42181e != this.f42196c) {
                throw new ConcurrentModificationException();
            }
            this.f42194a = gVar.f42201d;
            this.f42195b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f42194a != C11886u.this.f42179c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f42195b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            C11886u.this.m44416i(gVar, true);
            this.f42195b = null;
            this.f42196c = C11886u.this.f42181e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11886u() {
        this(null);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> g<K, V>[] m44408b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.m44426b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g<K, V> gVarM44425a = cVar.m44425a();
                    if (gVarM44425a == null) {
                        break;
                    }
                    if ((gVarM44425a.f42204g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.m44423b(i11);
                bVar2.m44423b(i12);
                cVar.m44426b(gVar);
                while (true) {
                    g<K, V> gVarM44425a2 = cVar.m44425a();
                    if (gVarM44425a2 == null) {
                        break;
                    }
                    if ((gVarM44425a2.f42204g & length) == 0) {
                        bVar.m44422a(gVarM44425a2);
                    } else {
                        bVar2.m44422a(gVarM44425a2);
                    }
                }
                gVarArr2[i10] = i11 > 0 ? bVar.m44424c() : null;
                gVarArr2[i10 + length] = i12 > 0 ? bVar2.m44424c() : null;
            }
        }
        return gVarArr2;
    }

    /* JADX INFO: renamed from: n */
    public static int m44409n(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m44410a() {
        g<K, V>[] gVarArrM44408b = m44408b(this.f42178b);
        this.f42178b = gVarArrM44408b;
        this.f42182f = (gVarArrM44408b.length / 2) + (gVarArrM44408b.length / 4);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44411c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f42178b, (Object) null);
        this.f42180d = 0;
        this.f42181e++;
        g<K, V> gVar = this.f42179c;
        g<K, V> gVar2 = gVar.f42201d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f42201d;
            gVar2.f42202e = null;
            gVar2.f42201d = null;
            gVar2 = gVar3;
        }
        gVar.f42202e = gVar;
        gVar.f42201d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m44414f(obj) != null;
    }

    /* JADX INFO: renamed from: d */
    public g<K, V> m44412d(K k10, boolean z10) {
        int iCompareTo;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f42177a;
        g<K, V>[] gVarArr = this.f42178b;
        int iM44409n = m44409n(k10.hashCode());
        int length = (gVarArr.length - 1) & iM44409n;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f42176i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(gVar2.f42203f) : comparator.compare(k10, gVar2.f42203f);
                if (iCompareTo == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = iCompareTo < 0 ? gVar2.f42199b : gVar2.f42200c;
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
        g<K, V> gVar4 = this.f42179c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k10, iM44409n, gVar4, gVar4.f42202e);
            if (i10 < 0) {
                gVar5.f42199b = gVar;
            } else {
                gVar5.f42200c = gVar;
            }
            m44415g(gVar5, true);
        } else {
            if (comparator == f42176i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k10, iM44409n, gVar4, gVar4.f42202e);
            gVarArr[length] = gVar;
        }
        int i11 = this.f42180d;
        this.f42180d = i11 + 1;
        if (i11 > this.f42182f) {
            m44410a();
        }
        this.f42181e++;
        return gVar;
    }

    /* JADX INFO: renamed from: e */
    public g<K, V> m44413e(Map.Entry<?, ?> entry) {
        g<K, V> gVarM44414f = m44414f(entry.getKey());
        if (gVarM44414f == null || !m44411c(gVarM44414f.f42205h, entry.getValue())) {
            return null;
        }
        return gVarM44414f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C11886u<K, V>.d dVar = this.f42183g;
        if (dVar != null) {
            return dVar;
        }
        C11886u<K, V>.d dVar2 = new d();
        this.f42183g = dVar2;
        return dVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public g<K, V> m44414f(Object obj) {
        if (obj != 0) {
            try {
                return m44412d(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m44415g(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f42199b;
            g<K, V> gVar3 = gVar.f42200c;
            int i10 = gVar2 != null ? gVar2.f42206i : 0;
            int i11 = gVar3 != null ? gVar3.f42206i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                g<K, V> gVar4 = gVar3.f42199b;
                g<K, V> gVar5 = gVar3.f42200c;
                int i13 = (gVar4 != null ? gVar4.f42206i : 0) - (gVar5 != null ? gVar5.f42206i : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m44420m(gVar3);
                }
                m44419l(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                g<K, V> gVar6 = gVar2.f42199b;
                g<K, V> gVar7 = gVar2.f42200c;
                int i14 = (gVar6 != null ? gVar6.f42206i : 0) - (gVar7 != null ? gVar7.f42206i : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    m44419l(gVar2);
                }
                m44420m(gVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                gVar.f42206i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f42206i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f42198a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> gVarM44414f = m44414f(obj);
        if (gVarM44414f != null) {
            return gVarM44414f.f42205h;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void m44416i(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f42202e;
            gVar2.f42201d = gVar.f42201d;
            gVar.f42201d.f42202e = gVar2;
            gVar.f42202e = null;
            gVar.f42201d = null;
        }
        g<K, V> gVar3 = gVar.f42199b;
        g<K, V> gVar4 = gVar.f42200c;
        g<K, V> gVar5 = gVar.f42198a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m44418k(gVar, gVar3);
                gVar.f42199b = null;
            } else if (gVar4 != null) {
                m44418k(gVar, gVar4);
                gVar.f42200c = null;
            } else {
                m44418k(gVar, null);
            }
            m44415g(gVar5, false);
            this.f42180d--;
            this.f42181e++;
            return;
        }
        g<K, V> gVarM44430b = gVar3.f42206i > gVar4.f42206i ? gVar3.m44430b() : gVar4.m44429a();
        m44416i(gVarM44430b, false);
        g<K, V> gVar6 = gVar.f42199b;
        if (gVar6 != null) {
            i10 = gVar6.f42206i;
            gVarM44430b.f42199b = gVar6;
            gVar6.f42198a = gVarM44430b;
            gVar.f42199b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f42200c;
        if (gVar7 != null) {
            i11 = gVar7.f42206i;
            gVarM44430b.f42200c = gVar7;
            gVar7.f42198a = gVarM44430b;
            gVar.f42200c = null;
        }
        gVarM44430b.f42206i = Math.max(i10, i11) + 1;
        m44418k(gVar, gVarM44430b);
    }

    /* JADX INFO: renamed from: j */
    public g<K, V> m44417j(Object obj) {
        g<K, V> gVarM44414f = m44414f(obj);
        if (gVarM44414f != null) {
            m44416i(gVarM44414f, true);
        }
        return gVarM44414f;
    }

    /* JADX INFO: renamed from: k */
    public final void m44418k(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f42198a;
        gVar.f42198a = null;
        if (gVar2 != null) {
            gVar2.f42198a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f42204g;
            g<K, V>[] gVarArr = this.f42178b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f42199b == gVar) {
            gVar3.f42199b = gVar2;
        } else {
            gVar3.f42200c = gVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C11886u<K, V>.e eVar = this.f42184h;
        if (eVar != null) {
            return eVar;
        }
        C11886u<K, V>.e eVar2 = new e();
        this.f42184h = eVar2;
        return eVar2;
    }

    /* JADX INFO: renamed from: l */
    public final void m44419l(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f42199b;
        g<K, V> gVar3 = gVar.f42200c;
        g<K, V> gVar4 = gVar3.f42199b;
        g<K, V> gVar5 = gVar3.f42200c;
        gVar.f42200c = gVar4;
        if (gVar4 != null) {
            gVar4.f42198a = gVar;
        }
        m44418k(gVar, gVar3);
        gVar3.f42199b = gVar;
        gVar.f42198a = gVar3;
        int iMax = Math.max(gVar2 != null ? gVar2.f42206i : 0, gVar4 != null ? gVar4.f42206i : 0) + 1;
        gVar.f42206i = iMax;
        gVar3.f42206i = Math.max(iMax, gVar5 != null ? gVar5.f42206i : 0) + 1;
    }

    /* JADX INFO: renamed from: m */
    public final void m44420m(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f42199b;
        g<K, V> gVar3 = gVar.f42200c;
        g<K, V> gVar4 = gVar2.f42199b;
        g<K, V> gVar5 = gVar2.f42200c;
        gVar.f42199b = gVar5;
        if (gVar5 != null) {
            gVar5.f42198a = gVar;
        }
        m44418k(gVar, gVar2);
        gVar2.f42200c = gVar;
        gVar.f42198a = gVar2;
        int iMax = Math.max(gVar3 != null ? gVar3.f42206i : 0, gVar5 != null ? gVar5.f42206i : 0) + 1;
        gVar.f42206i = iMax;
        gVar2.f42206i = Math.max(iMax, gVar4 != null ? gVar4.f42206i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> gVarM44412d = m44412d(k10, true);
        V v10 = gVarM44412d.f42205h;
        gVarM44412d.f42205h = v5;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> gVarM44417j = m44417j(obj);
        if (gVarM44417j != null) {
            return gVarM44417j.f42205h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f42180d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C11886u(Comparator<? super K> comparator) {
        this.f42180d = 0;
        this.f42181e = 0;
        this.f42177a = comparator == null ? f42176i : comparator;
        this.f42179c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f42178b = gVarArr;
        this.f42182f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* JADX INFO: renamed from: um.u$g */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public g<K, V> f42198a;

        /* JADX INFO: renamed from: b */
        public g<K, V> f42199b;

        /* JADX INFO: renamed from: c */
        public g<K, V> f42200c;

        /* JADX INFO: renamed from: d */
        public g<K, V> f42201d;

        /* JADX INFO: renamed from: e */
        public g<K, V> f42202e;

        /* JADX INFO: renamed from: f */
        public final K f42203f;

        /* JADX INFO: renamed from: g */
        public final int f42204g;

        /* JADX INFO: renamed from: h */
        public V f42205h;

        /* JADX INFO: renamed from: i */
        public int f42206i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public g() {
            this.f42203f = null;
            this.f42204g = -1;
            this.f42202e = this;
            this.f42201d = this;
        }

        /* JADX INFO: renamed from: a */
        public g<K, V> m44429a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f42199b; gVar2 != null; gVar2 = gVar2.f42199b) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX INFO: renamed from: b */
        public g<K, V> m44430b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f42200c; gVar2 != null; gVar2 = gVar2.f42200c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f42203f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v5 = this.f42205h;
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
            return this.f42203f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f42205h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f42203f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.f42205h;
            return iHashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            V v10 = this.f42205h;
            this.f42205h = v5;
            return v10;
        }

        public String toString() {
            return this.f42203f + "=" + this.f42205h;
        }

        public g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f42198a = gVar;
            this.f42203f = k10;
            this.f42204g = i10;
            this.f42206i = 1;
            this.f42201d = gVar2;
            this.f42202e = gVar3;
            gVar3.f42201d = this;
            gVar2.f42202e = this;
        }
    }
}
