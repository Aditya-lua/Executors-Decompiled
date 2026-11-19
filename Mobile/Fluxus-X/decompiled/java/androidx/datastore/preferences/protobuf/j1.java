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
    public List<j1<K, V>.d> f2025a;
    public Map<K, V> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j1<K, V>.f f2027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<K, V> f2028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile j1<K, V>.c f2029f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.j1
        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryJ = j(i10);
                    if (((t.b) entryJ.getKey()).f()) {
                        entryJ.setValue(Collections.unmodifiableList((List) entryJ.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((t.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.s((Comparable) obj, obj2);
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
        public final K f2032a;
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
            return this.f2032a;
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
            return b(this.f2032a, entry.getKey()) && b(this.b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f2032a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v8 = this.b;
            return iHashCode ^ (v8 != null ? v8.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v8) {
            j1.this.g();
            V v10 = this.b;
            this.b = v8;
            return v10;
        }

        public String toString() {
            return this.f2032a + "=" + this.b;
        }

        public d(K k10, V v8) {
            this.f2032a = k10;
            this.b = v8;
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
        if (!this.f2025a.isEmpty()) {
            this.f2025a.clear();
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
        if (this.f2027d == null) {
            this.f2027d = new f(this, null);
        }
        return this.f2027d;
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
        int iK = k();
        if (iK != j1Var.k()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!j(i10).equals(j1Var.j(i10))) {
                return false;
            }
        }
        if (iK != size) {
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
        int size = this.f2025a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f2025a.get(i12).getKey());
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
            int iCompareTo2 = k10.compareTo(this.f2025a.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f2025a.get(i12).getKey());
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
        if (this.f2026c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? this.f2025a.get(iF).getValue() : this.b.get(comparable);
    }

    public Set<Map.Entry<K, V>> h() {
        if (this.f2029f == null) {
            this.f2029f = new c(this, null);
        }
        return this.f2029f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += this.f2025a.get(i10).hashCode();
        }
        return l() > 0 ? iHashCode + this.b.hashCode() : iHashCode;
    }

    public final void i() {
        g();
        if (!this.f2025a.isEmpty() || (this.f2025a instanceof ArrayList)) {
            return;
        }
        this.f2025a = new ArrayList(16);
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f2025a.get(i10);
    }

    public int k() {
        return this.f2025a.size();
    }

    public int l() {
        return this.b.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.b.isEmpty() ? Collections.EMPTY_SET : this.b.entrySet();
    }

    public final SortedMap<K, V> n() {
        g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.f2028e = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public boolean o() {
        return this.f2026c;
    }

    public void p() {
        if (this.f2026c) {
            return;
        }
        this.b = this.b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.b);
        this.f2028e = this.f2028e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2028e);
        this.f2026c = true;
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

    public V s(K k10, V v8) {
        g();
        int iF = f(k10);
        if (iF >= 0) {
            return this.f2025a.get(iF).setValue(v8);
        }
        i();
        int i10 = -(iF + 1);
        if (i10 >= 16) {
            return n().put(k10, v8);
        }
        if (this.f2025a.size() == 16) {
            j1<K, V>.d dVarRemove = this.f2025a.remove(15);
            n().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f2025a.add(i10, new d(k10, v8));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2025a.size() + this.b.size();
    }

    public final V t(int i10) {
        g();
        V value = this.f2025a.remove(i10).getValue();
        if (!this.b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f2025a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2030a;
        public Iterator<Map.Entry<K, V>> b;

        public b() {
            this.f2030a = j1.this.f2025a.size();
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.b == null) {
                this.b = j1.this.f2028e.entrySet().iterator();
            }
            return this.b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (b().hasNext()) {
                return b().next();
            }
            List list = j1.this.f2025a;
            int i10 = this.f2030a - 1;
            this.f2030a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f2030a;
            return (i10 > 0 && i10 <= j1.this.f2025a.size()) || b().hasNext();
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
        public int f2034a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f2035c;

        public e() {
            this.f2034a = -1;
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.f2035c == null) {
                this.f2035c = j1.this.b.entrySet().iterator();
            }
            return this.f2035c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.b = true;
            int i10 = this.f2034a + 1;
            this.f2034a = i10;
            return i10 < j1.this.f2025a.size() ? (Map.Entry) j1.this.f2025a.get(this.f2034a) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2034a + 1 < j1.this.f2025a.size() || (!j1.this.b.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            j1.this.g();
            if (this.f2034a >= j1.this.f2025a.size()) {
                b().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f2034a;
            this.f2034a = i10 - 1;
            j1Var.t(i10);
        }

        public /* synthetic */ e(j1 j1Var, a aVar) {
            this();
        }
    }

    public j1() {
        this.f2025a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.b = map;
        this.f2028e = map;
    }
}
