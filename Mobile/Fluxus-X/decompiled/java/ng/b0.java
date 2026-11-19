package ng;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class b0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f25526i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator<? super K> f25527a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e<K, V> f25528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e<K, V> f25531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0<K, V>.b f25532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0<K, V>.c f25533h;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends b0<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && b0.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = b0.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            b0.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f25529d;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends b0<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f25545f;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b0.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.f25529d;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e<K, V> f25538a;
        public e<K, V> b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25539c;

        public d() {
            this.f25538a = b0.this.f25531f.f25543d;
            this.f25539c = b0.this.f25530e;
        }

        public final e<K, V> b() {
            e<K, V> eVar = this.f25538a;
            b0 b0Var = b0.this;
            if (eVar == b0Var.f25531f) {
                throw new NoSuchElementException();
            }
            if (b0Var.f25530e != this.f25539c) {
                throw new ConcurrentModificationException();
            }
            this.f25538a = eVar.f25543d;
            this.b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f25538a != b0.this.f25531f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            b0.this.f(eVar, true);
            this.b = null;
            this.f25539c = b0.this.f25530e;
        }
    }

    public b0() {
        this(f25526i, true);
    }

    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public e<K, V> b(K k10, boolean z10) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f25527a;
        e<K, V> eVar2 = this.f25528c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f25526i ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f25545f) : comparator.compare(k10, eVar2.f25545f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.b : eVar2.f25542c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e<K, V> eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e<K, V> eVar5 = this.f25531f;
        if (eVar4 != null) {
            eVar = new e<>(this.b, eVar4, k10, eVar5, eVar5.f25544e);
            if (iCompareTo < 0) {
                eVar4.b = eVar;
            } else {
                eVar4.f25542c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f25526i && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(this.b, eVar4, k10, eVar5, eVar5.f25544e);
            this.f25528c = eVar;
        }
        this.f25529d++;
        this.f25530e++;
        return eVar;
    }

    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f25547h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f25528c = null;
        this.f25529d = 0;
        this.f25530e++;
        e<K, V> eVar = this.f25531f;
        eVar.f25544e = eVar;
        eVar.f25543d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> d(Object obj) {
        if (obj != 0) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.b;
            e<K, V> eVar3 = eVar.f25542c;
            int i10 = eVar2 != null ? eVar2.f25548i : 0;
            int i11 = eVar3 != null ? eVar3.f25548i : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.b;
                e<K, V> eVar5 = eVar3.f25542c;
                int i13 = (eVar4 != null ? eVar4.f25548i : 0) - (eVar5 != null ? eVar5.f25548i : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.b;
                e<K, V> eVar7 = eVar2.f25542c;
                int i14 = (eVar6 != null ? eVar6.f25548i : 0) - (eVar7 != null ? eVar7.f25548i : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f25548i = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f25548i = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f25541a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        b0<K, V>.b bVar = this.f25532g;
        if (bVar != null) {
            return bVar;
        }
        b0<K, V>.b bVar2 = new b();
        this.f25532g = bVar2;
        return bVar2;
    }

    public void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f25544e;
            eVar2.f25543d = eVar.f25543d;
            eVar.f25543d.f25544e = eVar2;
        }
        e<K, V> eVar3 = eVar.b;
        e<K, V> eVar4 = eVar.f25542c;
        e<K, V> eVar5 = eVar.f25541a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f25542c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f25529d--;
            this.f25530e++;
            return;
        }
        e<K, V> eVarB = eVar3.f25548i > eVar4.f25548i ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.b;
        if (eVar6 != null) {
            i10 = eVar6.f25548i;
            eVarB.b = eVar6;
            eVar6.f25541a = eVarB;
            eVar.b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f25542c;
        if (eVar7 != null) {
            i11 = eVar7.f25548i;
            eVarB.f25542c = eVar7;
            eVar7.f25541a = eVarB;
            eVar.f25542c = null;
        }
        eVarB.f25548i = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    public e<K, V> g(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f25547h;
        }
        return null;
    }

    public final void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f25541a;
        eVar.f25541a = null;
        if (eVar2 != null) {
            eVar2.f25541a = eVar3;
        }
        if (eVar3 == null) {
            this.f25528c = eVar2;
        } else if (eVar3.b == eVar) {
            eVar3.b = eVar2;
        } else {
            eVar3.f25542c = eVar2;
        }
    }

    public final void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.f25542c;
        e<K, V> eVar4 = eVar3.b;
        e<K, V> eVar5 = eVar3.f25542c;
        eVar.f25542c = eVar4;
        if (eVar4 != null) {
            eVar4.f25541a = eVar;
        }
        h(eVar, eVar3);
        eVar3.b = eVar;
        eVar.f25541a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f25548i : 0, eVar4 != null ? eVar4.f25548i : 0) + 1;
        eVar.f25548i = iMax;
        eVar3.f25548i = Math.max(iMax, eVar5 != null ? eVar5.f25548i : 0) + 1;
    }

    public final void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.b;
        e<K, V> eVar3 = eVar.f25542c;
        e<K, V> eVar4 = eVar2.b;
        e<K, V> eVar5 = eVar2.f25542c;
        eVar.b = eVar5;
        if (eVar5 != null) {
            eVar5.f25541a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f25542c = eVar;
        eVar.f25541a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f25548i : 0, eVar5 != null ? eVar5.f25548i : 0) + 1;
        eVar.f25548i = iMax;
        eVar2.f25548i = Math.max(iMax, eVar4 != null ? eVar4.f25548i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        b0<K, V>.c cVar = this.f25533h;
        if (cVar != null) {
            return cVar;
        }
        b0<K, V>.c cVar2 = new c();
        this.f25533h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v8) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        if (v8 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        e<K, V> eVarB = b(k10, true);
        V v10 = eVarB.f25547h;
        eVarB.f25547h = v8;
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f25547h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f25529d;
    }

    public b0(boolean z10) {
        this(f25526i, z10);
    }

    public b0(Comparator<? super K> comparator, boolean z10) {
        this.f25529d = 0;
        this.f25530e = 0;
        this.f25527a = comparator == null ? f25526i : comparator;
        this.b = z10;
        this.f25531f = new e<>(z10);
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e<K, V> f25541a;
        public e<K, V> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f25542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f25543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f25544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final K f25545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f25546g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f25547h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f25548i;

        public e(boolean z10) {
            this.f25545f = null;
            this.f25546g = z10;
            this.f25544e = this;
            this.f25543d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.b; eVar2 != null; eVar2 = eVar2.b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f25542c; eVar2 != null; eVar2 = eVar2.f25542c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f25545f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v8 = this.f25547h;
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
            return this.f25545f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f25547h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f25545f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v8 = this.f25547h;
            return iHashCode ^ (v8 != null ? v8.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v8) {
            if (v8 == null && !this.f25546g) {
                throw new NullPointerException("value == null");
            }
            V v10 = this.f25547h;
            this.f25547h = v8;
            return v10;
        }

        public String toString() {
            return this.f25545f + "=" + this.f25547h;
        }

        public e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f25541a = eVar;
            this.f25545f = k10;
            this.f25546g = z10;
            this.f25548i = 1;
            this.f25543d = eVar2;
            this.f25544e = eVar3;
            eVar3.f25543d = this;
            eVar2.f25544e = this;
        }
    }
}
