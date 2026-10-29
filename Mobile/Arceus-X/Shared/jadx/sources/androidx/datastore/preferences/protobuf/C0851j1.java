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

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1 */
/* JADX INFO: loaded from: classes.dex */
public class C0851j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public List<C0851j1<K, V>.d> f2919a;

    /* JADX INFO: renamed from: b */
    public Map<K, V> f2920b;

    /* JADX INFO: renamed from: c */
    public boolean f2921c;

    /* JADX INFO: renamed from: d */
    public volatile C0851j1<K, V>.f f2922d;

    /* JADX INFO: renamed from: e */
    public Map<K, V> f2923e;

    /* JADX INFO: renamed from: f */
    public volatile C0851j1<K, V>.c f2924f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$a */
    public class a<FieldDescriptorType> extends C0851j1<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m3767s((Comparable) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0851j1
        /* JADX INFO: renamed from: q */
        public void mo3766q() {
            if (!m3765p()) {
                for (int i10 = 0; i10 < m3761l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryM3760k = m3760k(i10);
                    if (((C0879t.b) entryM3760k.getKey()).mo4091f()) {
                        entryM3760k.setValue(Collections.unmodifiableList((List) entryM3760k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m3763n()) {
                    if (((C0879t.b) entry.getKey()).mo4091f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo3766q();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$c */
    public class c extends C0851j1<K, V>.f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            super(C0851j1.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C0851j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C0851j1.this, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.datastore.preferences.protobuf.j1) A[MD:(androidx.datastore.preferences.protobuf.j1):void (m)] (LINE:2) call: androidx.datastore.preferences.protobuf.j1.c.<init>(androidx.datastore.preferences.protobuf.j1):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ c(C0851j1 c0851j1, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$d */
    public class d implements Map.Entry<K, V>, Comparable<C0851j1<K, V>.d> {

        /* JADX INFO: renamed from: a */
        public final K f2929a;

        /* JADX INFO: renamed from: b */
        public V f2930b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(C0851j1 c0851j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0851j1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m3772b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* JADX DEBUG: Method merged with bridge method: getKey()Ljava/lang/Object; */
        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f2929a;
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
            return m3772b(this.f2929a, entry.getKey()) && m3772b(this.f2930b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2930b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f2929a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.f2930b;
            return iHashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            C0851j1.this.m3757g();
            V v10 = this.f2930b;
            this.f2930b = v5;
            return v10;
        }

        public String toString() {
            return this.f2929a + "=" + this.f2930b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(K k10, V v5) {
            this.f2929a = k10;
            this.f2930b = v5;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$f */
    public class f extends AbstractSet<Map.Entry<K, V>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public f() {
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C0851j1.this.m3767s(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C0851j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C0851j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(C0851j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C0851j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C0851j1.this.size();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.datastore.preferences.protobuf.j1) A[MD:(androidx.datastore.preferences.protobuf.j1):void (m)] (LINE:2) call: androidx.datastore.preferences.protobuf.j1.f.<init>(androidx.datastore.preferences.protobuf.j1):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ f(C0851j1 c0851j1, a aVar) {
            this();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: androidx.datastore.preferences.protobuf.j1.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0851j1(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: r */
    public static <FieldDescriptorType extends C0879t.b<FieldDescriptorType>> C0851j1<FieldDescriptorType, Object> m3755r() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m3757g();
        if (!this.f2919a.isEmpty()) {
            this.f2919a.clear();
        }
        if (this.f2920b.isEmpty()) {
            return;
        }
        this.f2920b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m3756f(comparable) >= 0 || this.f2920b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2922d == null) {
            this.f2922d = new f(this, null);
        }
        return this.f2922d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0851j1)) {
            return super.equals(obj);
        }
        C0851j1 c0851j1 = (C0851j1) obj;
        int size = size();
        if (size != c0851j1.size()) {
            return false;
        }
        int iM3761l = m3761l();
        if (iM3761l != c0851j1.m3761l()) {
            return entrySet().equals(c0851j1.entrySet());
        }
        for (int i10 = 0; i10 < iM3761l; i10++) {
            if (!m3760k(i10).equals(c0851j1.m3760k(i10))) {
                return false;
            }
        }
        if (iM3761l != size) {
            return this.f2920b.equals(c0851j1.f2920b);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final int m3756f(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f2919a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f2919a.get(i12).getKey());
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
            int iCompareTo2 = k10.compareTo(this.f2919a.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f2919a.get(i12).getKey());
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

    /* JADX INFO: renamed from: g */
    public final void m3757g() {
        if (this.f2921c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM3756f = m3756f(comparable);
        return iM3756f >= 0 ? this.f2919a.get(iM3756f).getValue() : this.f2920b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM3761l = m3761l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM3761l; i10++) {
            iHashCode += this.f2919a.get(i10).hashCode();
        }
        return m3762m() > 0 ? iHashCode + this.f2920b.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Set<Map.Entry<K, V>> m3758i() {
        if (this.f2924f == null) {
            this.f2924f = new c(this, null);
        }
        return this.f2924f;
    }

    /* JADX INFO: renamed from: j */
    public final void m3759j() {
        m3757g();
        if (!this.f2919a.isEmpty() || (this.f2919a instanceof ArrayList)) {
            return;
        }
        this.f2919a = new ArrayList(16);
    }

    /* JADX INFO: renamed from: k */
    public Map.Entry<K, V> m3760k(int i10) {
        return this.f2919a.get(i10);
    }

    /* JADX INFO: renamed from: l */
    public int m3761l() {
        return this.f2919a.size();
    }

    /* JADX INFO: renamed from: m */
    public int m3762m() {
        return this.f2920b.size();
    }

    /* JADX INFO: renamed from: n */
    public Iterable<Map.Entry<K, V>> m3763n() {
        return this.f2920b.isEmpty() ? Collections.EMPTY_SET : this.f2920b.entrySet();
    }

    /* JADX INFO: renamed from: o */
    public final SortedMap<K, V> m3764o() {
        m3757g();
        if (this.f2920b.isEmpty() && !(this.f2920b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2920b = treeMap;
            this.f2923e = treeMap.descendingMap();
        }
        return (SortedMap) this.f2920b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m3765p() {
        return this.f2921c;
    }

    /* JADX INFO: renamed from: q */
    public void mo3766q() {
        if (this.f2921c) {
            return;
        }
        this.f2920b = this.f2920b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2920b);
        this.f2923e = this.f2923e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f2923e);
        this.f2921c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m3757g();
        Comparable comparable = (Comparable) obj;
        int iM3756f = m3756f(comparable);
        if (iM3756f >= 0) {
            return m3768t(iM3756f);
        }
        if (this.f2920b.isEmpty()) {
            return null;
        }
        return this.f2920b.remove(comparable);
    }

    /* JADX INFO: renamed from: s */
    public V m3767s(K k10, V v5) {
        m3757g();
        int iM3756f = m3756f(k10);
        if (iM3756f >= 0) {
            return this.f2919a.get(iM3756f).setValue(v5);
        }
        m3759j();
        int i10 = -(iM3756f + 1);
        if (i10 >= 16) {
            return m3764o().put(k10, v5);
        }
        if (this.f2919a.size() == 16) {
            C0851j1<K, V>.d dVarRemove = this.f2919a.remove(15);
            m3764o().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f2919a.add(i10, new d(k10, v5));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2919a.size() + this.f2920b.size();
    }

    /* JADX INFO: renamed from: t */
    public final V m3768t(int i10) {
        m3757g();
        V value = this.f2919a.remove(i10).getValue();
        if (!this.f2920b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m3764o().entrySet().iterator();
            this.f2919a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$b */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f2925a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f2926b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this.f2925a = C0851j1.this.f2919a.size();
        }

        /* JADX INFO: renamed from: b */
        public final Iterator<Map.Entry<K, V>> m3769b() {
            if (this.f2926b == null) {
                this.f2926b = C0851j1.this.f2923e.entrySet().iterator();
            }
            return this.f2926b;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (m3769b().hasNext()) {
                return m3769b().next();
            }
            List list = C0851j1.this.f2919a;
            int i10 = this.f2925a - 1;
            this.f2925a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f2925a;
            return (i10 > 0 && i10 <= C0851j1.this.f2919a.size()) || m3769b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.datastore.preferences.protobuf.j1) A[MD:(androidx.datastore.preferences.protobuf.j1):void (m)] (LINE:3) call: androidx.datastore.preferences.protobuf.j1.b.<init>(androidx.datastore.preferences.protobuf.j1):void type: THIS */
        public /* synthetic */ b(C0851j1 c0851j1, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j1$e */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f2932a;

        /* JADX INFO: renamed from: b */
        public boolean f2933b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f2934c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this.f2932a = -1;
        }

        /* JADX INFO: renamed from: b */
        public final Iterator<Map.Entry<K, V>> m3774b() {
            if (this.f2934c == null) {
                this.f2934c = C0851j1.this.f2920b.entrySet().iterator();
            }
            return this.f2934c;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f2933b = true;
            int i10 = this.f2932a + 1;
            this.f2932a = i10;
            return i10 < C0851j1.this.f2919a.size() ? (Map.Entry) C0851j1.this.f2919a.get(this.f2932a) : m3774b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2932a + 1 < C0851j1.this.f2919a.size() || (!C0851j1.this.f2920b.isEmpty() && m3774b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2933b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f2933b = false;
            C0851j1.this.m3757g();
            if (this.f2932a >= C0851j1.this.f2919a.size()) {
                m3774b().remove();
                return;
            }
            C0851j1 c0851j1 = C0851j1.this;
            int i10 = this.f2932a;
            this.f2932a = i10 - 1;
            c0851j1.m3768t(i10);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 androidx.datastore.preferences.protobuf.j1) A[MD:(androidx.datastore.preferences.protobuf.j1):void (m)] (LINE:3) call: androidx.datastore.preferences.protobuf.j1.e.<init>(androidx.datastore.preferences.protobuf.j1):void type: THIS */
        public /* synthetic */ e(C0851j1 c0851j1, a aVar) {
            this();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0851j1() {
        this.f2919a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f2920b = map;
        this.f2923e = map;
    }
}
