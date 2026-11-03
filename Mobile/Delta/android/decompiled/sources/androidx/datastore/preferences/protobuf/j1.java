package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<j1<K, V>.d> f2064a;
    public Map<K, V> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j1<K, V>.f f2066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<K, V> f2067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile j1<K, V>.c f2068f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryK = k(i10);
                    if (((t.b) entryK.getKey()).f()) {
                        entryK.setValue(Collections.unmodifiableList((List) entryK.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((t.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    public class c extends j1<K, V>.f {
        public c() {
            super(j1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }

        public /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry<K, V>, Comparable<j1<K, V>.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f2071a;
        public V b;

        public d(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(j1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f2071a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f2071a, entry.getKey()) && b(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f2071a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.b;
            return iHashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            j1.this.g();
            V v10 = this.b;
            this.b = v5;
            return v10;
        }

        public String toString() {
            return this.f2071a + "=" + this.b;
        }

        public d(K k10, V v5) {
            this.f2071a = k10;
            this.b = v5;
        }
    }

    public class f extends AbstractSet<Map.Entry<K, V>> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.s(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j1.this.size();
        }

        public /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ j1(a aVar) {
        this();
    }

    public static <FieldDescriptorType extends t.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f2064a.isEmpty()) {
            this.f2064a.clear();
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2066d == null) {
            this.f2066d = new f(this, null);
        }
        return this.f2066d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int iL = l();
        if (iL != j1Var.l()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i10 = 0; i10 < iL; i10++) {
            if (!k(i10).equals(j1Var.k(i10))) {
                return false;
            }
        }
        if (iL != size) {
            return this.b.equals(j1Var.b);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    public final int f(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f2064a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f2064a.get(i12).getKey());
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = k10.compareTo(this.f2064a.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f2064a.get(i12).getKey());
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void g() {
        if (this.f2065c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f2064a.get(iF).getValue() : this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iL = l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iHashCode += this.f2064a.get(i10).hashCode();
        }
        return m() > 0 ? iHashCode + this.b.hashCode() : iHashCode;
    }

    public Set<Map.Entry<K, V>> i() {
        if (this.f2068f == null) {
            this.f2068f = new c(this, null);
        }
        return this.f2068f;
    }

    public final void j() {
        g();
        if (!this.f2064a.isEmpty() || (this.f2064a instanceof ArrayList)) {
            return;
        }
        this.f2064a = new ArrayList(16);
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f2064a.get(i10);
    }

    public int l() {
        return this.f2064a.size();
    }

    public int m() {
        return this.b.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public final SortedMap<K, V> o() {
        g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.f2067e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public boolean p() {
        return this.f2065c;
    }

    public void q() {
        if (this.f2065c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.b);
        this.f2067e = this.f2067e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2067e);
        this.f2065c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return t(iF);
        }
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.remove(comparable);
    }

    public V s(K k10, V v5) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f2064a.get(iF).setValue(v5);
        }
        j();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return o().put(k10, v5);
        }
        if (this.f2064a.size() == 16) {
            j1<K, V>.d dVarRemove = this.f2064a.remove(15);
            o().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f2064a.add(i10, new d(k10, v5));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2064a.size() + this.b.size();
    }

    public final V t(int i10) {
        g();
        V value = this.f2064a.remove(i10).getValue();
        if (!this.b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f2064a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2069a;
        public Iterator<Map.Entry<K, V>> b;

        public b() {
            this.f2069a = j1.this.f2064a.size();
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.b == null) {
                this.b = j1.this.f2067e.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = j1.this.f2064a;
            int i10 = this.f2069a - 1;
            this.f2069a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f2069a;
            return (i10 > 0 && i10 <= j1.this.f2064a.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2073a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2074c;

        public e() {
            this.f2073a = -1;
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.f2074c == null) {
                this.f2074c = j1.this.b.entrySet().iterator();
            }
            return this.f2074c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.b = true;
            int i10 = this.f2073a + 1;
            this.f2073a = i10;
            return i10 < j1.this.f2064a.size() ? (Map.Entry) j1.this.f2064a.get(this.f2073a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2073a + 1 < j1.this.f2064a.size() || (!j1.this.b.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            j1.this.g();
            if (this.f2073a >= j1.this.f2064a.size()) {
                b().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f2073a;
            this.f2073a = i10 - 1;
            j1Var.t(i10);
        }

        public /* synthetic */ e(j1 j1Var, a aVar) {
            this();
        }
    }

    public j1() {
        this.f2064a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.b = map;
        this.f2067e = map;
    }
}
