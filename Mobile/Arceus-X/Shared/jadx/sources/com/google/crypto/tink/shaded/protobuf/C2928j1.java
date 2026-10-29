package com.google.crypto.tink.shaded.protobuf;

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

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1 */
/* JADX INFO: loaded from: classes2.dex */
public class C2928j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a */
    public List<C2928j1<K, V>.d> f10900a;

    /* JADX INFO: renamed from: b */
    public Map<K, V> f10901b;

    /* JADX INFO: renamed from: c */
    public boolean f10902c;

    /* JADX INFO: renamed from: d */
    public volatile C2928j1<K, V>.f f10903d;

    /* JADX INFO: renamed from: e */
    public Map<K, V> f10904e;

    /* JADX INFO: renamed from: f */
    public volatile C2928j1<K, V>.c f10905f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$a */
    public class a<FieldDescriptorType> extends C2928j1<FieldDescriptorType, Object> {
        public a() {
            super(null);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m13745s((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2928j1
        /* JADX INFO: renamed from: q */
        public void mo13744q() {
            if (!m13743p()) {
                for (int i10 = 0; i10 < m13739l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryM13738k = m13738k(i10);
                    if (((C2959u.b) entryM13738k.getKey()).mo14208f()) {
                        entryM13738k.setValue(Collections.unmodifiableList((List) entryM13738k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m13741n()) {
                    if (((C2959u.b) entry.getKey()).mo14208f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo13744q();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$c */
    public class c extends C2928j1<K, V>.f {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            super(C2928j1.this, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2928j1.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C2928j1.this, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.crypto.tink.shaded.protobuf.j1) A[MD:(com.google.crypto.tink.shaded.protobuf.j1):void (m)] (LINE:2) call: com.google.crypto.tink.shaded.protobuf.j1.c.<init>(com.google.crypto.tink.shaded.protobuf.j1):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ c(C2928j1 c2928j1, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$d */
    public class d implements Map.Entry<K, V>, Comparable<C2928j1<K, V>.d> {

        /* JADX INFO: renamed from: a */
        public final K f10910a;

        /* JADX INFO: renamed from: b */
        public V f10911b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(C2928j1 c2928j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C2928j1<K, V>.d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m13750b(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* JADX DEBUG: Method merged with bridge method: getKey()Ljava/lang/Object; */
        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f10910a;
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
            return m13750b(this.f10910a, entry.getKey()) && m13750b(this.f10911b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f10911b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f10910a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v5 = this.f10911b;
            return iHashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            C2928j1.this.m13735g();
            V v10 = this.f10911b;
            this.f10911b = v5;
            return v10;
        }

        public String toString() {
            return this.f10910a + "=" + this.f10911b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(K k10, V v5) {
            this.f10910a = k10;
            this.f10911b = v5;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$f */
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
            C2928j1.this.m13745s(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2928j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C2928j1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e(C2928j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C2928j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2928j1.this.size();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.crypto.tink.shaded.protobuf.j1) A[MD:(com.google.crypto.tink.shaded.protobuf.j1):void (m)] (LINE:2) call: com.google.crypto.tink.shaded.protobuf.j1.f.<init>(com.google.crypto.tink.shaded.protobuf.j1):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ f(C2928j1 c2928j1, a aVar) {
            this();
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.google.crypto.tink.shaded.protobuf.j1.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2928j1(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: r */
    public static <FieldDescriptorType extends C2959u.b<FieldDescriptorType>> C2928j1<FieldDescriptorType, Object> m13733r() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m13735g();
        if (!this.f10900a.isEmpty()) {
            this.f10900a.clear();
        }
        if (this.f10901b.isEmpty()) {
            return;
        }
        this.f10901b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m13734f(comparable) >= 0 || this.f10901b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f10903d == null) {
            this.f10903d = new f(this, null);
        }
        return this.f10903d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2928j1)) {
            return super.equals(obj);
        }
        C2928j1 c2928j1 = (C2928j1) obj;
        int size = size();
        if (size != c2928j1.size()) {
            return false;
        }
        int iM13739l = m13739l();
        if (iM13739l != c2928j1.m13739l()) {
            return entrySet().equals(c2928j1.entrySet());
        }
        for (int i10 = 0; i10 < iM13739l; i10++) {
            if (!m13738k(i10).equals(c2928j1.m13738k(i10))) {
                return false;
            }
        }
        if (iM13739l != size) {
            return this.f10901b.equals(c2928j1.f10901b);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003c A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final int m13734f(K k10) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f10900a.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = k10.compareTo(this.f10900a.get(i12).getKey());
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
            int iCompareTo2 = k10.compareTo(this.f10900a.get(i13).getKey());
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = k10.compareTo(this.f10900a.get(i12).getKey());
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
    public final void m13735g() {
        if (this.f10902c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM13734f = m13734f(comparable);
        return iM13734f >= 0 ? this.f10900a.get(iM13734f).getValue() : this.f10901b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM13739l = m13739l();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iM13739l; i10++) {
            iHashCode += this.f10900a.get(i10).hashCode();
        }
        return m13740m() > 0 ? iHashCode + this.f10901b.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Set<Map.Entry<K, V>> m13736i() {
        if (this.f10905f == null) {
            this.f10905f = new c(this, null);
        }
        return this.f10905f;
    }

    /* JADX INFO: renamed from: j */
    public final void m13737j() {
        m13735g();
        if (!this.f10900a.isEmpty() || (this.f10900a instanceof ArrayList)) {
            return;
        }
        this.f10900a = new ArrayList(16);
    }

    /* JADX INFO: renamed from: k */
    public Map.Entry<K, V> m13738k(int i10) {
        return this.f10900a.get(i10);
    }

    /* JADX INFO: renamed from: l */
    public int m13739l() {
        return this.f10900a.size();
    }

    /* JADX INFO: renamed from: m */
    public int m13740m() {
        return this.f10901b.size();
    }

    /* JADX INFO: renamed from: n */
    public Iterable<Map.Entry<K, V>> m13741n() {
        return this.f10901b.isEmpty() ? Collections.EMPTY_SET : this.f10901b.entrySet();
    }

    /* JADX INFO: renamed from: o */
    public final SortedMap<K, V> m13742o() {
        m13735g();
        if (this.f10901b.isEmpty() && !(this.f10901b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10901b = treeMap;
            this.f10904e = treeMap.descendingMap();
        }
        return (SortedMap) this.f10901b;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13743p() {
        return this.f10902c;
    }

    /* JADX INFO: renamed from: q */
    public void mo13744q() {
        if (this.f10902c) {
            return;
        }
        this.f10901b = this.f10901b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10901b);
        this.f10904e = this.f10904e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f10904e);
        this.f10902c = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m13735g();
        Comparable comparable = (Comparable) obj;
        int iM13734f = m13734f(comparable);
        if (iM13734f >= 0) {
            return m13746t(iM13734f);
        }
        if (this.f10901b.isEmpty()) {
            return null;
        }
        return this.f10901b.remove(comparable);
    }

    /* JADX INFO: renamed from: s */
    public V m13745s(K k10, V v5) {
        m13735g();
        int iM13734f = m13734f(k10);
        if (iM13734f >= 0) {
            return this.f10900a.get(iM13734f).setValue(v5);
        }
        m13737j();
        int i10 = -(iM13734f + 1);
        if (i10 >= 16) {
            return m13742o().put(k10, v5);
        }
        if (this.f10900a.size() == 16) {
            C2928j1<K, V>.d dVarRemove = this.f10900a.remove(15);
            m13742o().put(dVarRemove.getKey(), dVarRemove.getValue());
        }
        this.f10900a.add(i10, new d(k10, v5));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10900a.size() + this.f10901b.size();
    }

    /* JADX INFO: renamed from: t */
    public final V m13746t(int i10) {
        m13735g();
        V value = this.f10900a.remove(i10).getValue();
        if (!this.f10901b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m13742o().entrySet().iterator();
            this.f10900a.add(new d(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$b */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f10906a;

        /* JADX INFO: renamed from: b */
        public Iterator<Map.Entry<K, V>> f10907b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this.f10906a = C2928j1.this.f10900a.size();
        }

        /* JADX INFO: renamed from: b */
        public final Iterator<Map.Entry<K, V>> m13747b() {
            if (this.f10907b == null) {
                this.f10907b = C2928j1.this.f10904e.entrySet().iterator();
            }
            return this.f10907b;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (m13747b().hasNext()) {
                return m13747b().next();
            }
            List list = C2928j1.this.f10900a;
            int i10 = this.f10906a - 1;
            this.f10906a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f10906a;
            return (i10 > 0 && i10 <= C2928j1.this.f10900a.size()) || m13747b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.crypto.tink.shaded.protobuf.j1) A[MD:(com.google.crypto.tink.shaded.protobuf.j1):void (m)] (LINE:3) call: com.google.crypto.tink.shaded.protobuf.j1.b.<init>(com.google.crypto.tink.shaded.protobuf.j1):void type: THIS */
        public /* synthetic */ b(C2928j1 c2928j1, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j1$e */
    public class e implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public int f10913a;

        /* JADX INFO: renamed from: b */
        public boolean f10914b;

        /* JADX INFO: renamed from: c */
        public Iterator<Map.Entry<K, V>> f10915c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this.f10913a = -1;
        }

        /* JADX INFO: renamed from: b */
        public final Iterator<Map.Entry<K, V>> m13752b() {
            if (this.f10915c == null) {
                this.f10915c = C2928j1.this.f10901b.entrySet().iterator();
            }
            return this.f10915c;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f10914b = true;
            int i10 = this.f10913a + 1;
            this.f10913a = i10;
            return i10 < C2928j1.this.f10900a.size() ? (Map.Entry) C2928j1.this.f10900a.get(this.f10913a) : m13752b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10913a + 1 < C2928j1.this.f10900a.size() || (!C2928j1.this.f10901b.isEmpty() && m13752b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10914b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f10914b = false;
            C2928j1.this.m13735g();
            if (this.f10913a >= C2928j1.this.f10900a.size()) {
                m13752b().remove();
                return;
            }
            C2928j1 c2928j1 = C2928j1.this;
            int i10 = this.f10913a;
            this.f10913a = i10 - 1;
            c2928j1.m13746t(i10);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.google.crypto.tink.shaded.protobuf.j1) A[MD:(com.google.crypto.tink.shaded.protobuf.j1):void (m)] (LINE:3) call: com.google.crypto.tink.shaded.protobuf.j1.e.<init>(com.google.crypto.tink.shaded.protobuf.j1):void type: THIS */
        public /* synthetic */ e(C2928j1 c2928j1, a aVar) {
            this();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2928j1() {
        this.f10900a = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f10901b = map;
        this.f10904e = map;
    }
}
