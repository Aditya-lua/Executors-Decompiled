package ie;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import me.C8486a;
import p169he.C6380j;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.i */
/* JADX INFO: loaded from: classes2.dex */
public class C6774i<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j */
    public static final Object f26638j = new Object();

    /* JADX INFO: renamed from: a */
    public transient Object f26639a;

    /* JADX INFO: renamed from: b */
    public transient int[] f26640b;

    /* JADX INFO: renamed from: c */
    public transient Object[] f26641c;

    /* JADX INFO: renamed from: d */
    public transient Object[] f26642d;

    /* JADX INFO: renamed from: e */
    public transient int f26643e;

    /* JADX INFO: renamed from: f */
    public transient int f26644f;

    /* JADX INFO: renamed from: g */
    public transient Set<K> f26645g;

    /* JADX INFO: renamed from: h */
    public transient Set<Map.Entry<K, V>> f26646h;

    /* JADX INFO: renamed from: i */
    public transient Collection<V> f26647i;

    /* JADX INFO: renamed from: ie.i$a */
    public class a extends C6774i<K, V>.e<K> {
        public a() {
            super(C6774i.this, null);
        }

        @Override // ie.C6774i.e
        /* JADX INFO: renamed from: d */
        public K mo28961d(int i10) {
            return (K) C6774i.this.m28933I(i10);
        }
    }

    /* JADX INFO: renamed from: ie.i$b */
    public class b extends C6774i<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(C6774i.this, null);
        }

        /* JADX DEBUG: Method merged with bridge method: d(I)Ljava/lang/Object; */
        @Override // ie.C6774i.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo28961d(int i10) {
            return new g(i10);
        }
    }

    /* JADX INFO: renamed from: ie.i$c */
    public class c extends C6774i<K, V>.e<V> {
        public c() {
            super(C6774i.this, null);
        }

        @Override // ie.C6774i.e
        /* JADX INFO: renamed from: d */
        public V mo28961d(int i10) {
            return (V) C6774i.this.m28949Y(i10);
        }
    }

    /* JADX INFO: renamed from: ie.i$d */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6774i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapM28959x = C6774i.this.m28959x();
            if (mapM28959x != null) {
                return mapM28959x.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iM28930F = C6774i.this.m28930F(entry.getKey());
                if (iM28930F != -1 && C6380j.m27910a(C6774i.this.m28949Y(iM28930F), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C6774i.this.m28925A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iM28928D;
            int iM29002f;
            Map<K, V> mapM28959x = C6774i.this.m28959x();
            if (mapM28959x != null) {
                return mapM28959x.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C6774i.this.m28936L() || (iM29002f = C6778k.m29002f(entry.getKey(), entry.getValue(), (iM28928D = C6774i.this.m28928D()), C6774i.this.m28940P(), C6774i.this.m28938N(), C6774i.this.m28939O(), C6774i.this.m28941Q())) == -1) {
                return false;
            }
            C6774i.this.m28935K(iM29002f, iM28928D);
            C6774i.m28915e(C6774i.this);
            C6774i.this.m28929E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6774i.this.size();
        }
    }

    /* JADX INFO: renamed from: ie.i$f */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6774i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C6774i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C6774i.this.m28934J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapM28959x = C6774i.this.m28959x();
            if (mapM28959x != null) {
                return mapM28959x.keySet().remove(obj);
            }
            return C6774i.this.m28937M(obj) != C6774i.f26638j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6774i.this.size();
        }
    }

    /* JADX INFO: renamed from: ie.i$g */
    public final class g extends AbstractC6762c<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f26657a;

        /* JADX INFO: renamed from: b */
        public int f26658b;

        public g(int i10) {
            this.f26657a = (K) C6774i.this.m28933I(i10);
            this.f26658b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final void m28965a() {
            int i10 = this.f26658b;
            if (i10 == -1 || i10 >= C6774i.this.size() || !C6380j.m27910a(this.f26657a, C6774i.this.m28933I(this.f26658b))) {
                this.f26658b = C6774i.this.m28930F(this.f26657a);
            }
        }

        @Override // ie.AbstractC6762c, java.util.Map.Entry
        public K getKey() {
            return this.f26657a;
        }

        @Override // ie.AbstractC6762c, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapM28959x = C6774i.this.m28959x();
            if (mapM28959x != null) {
                return (V) C6779k0.m29007a(mapM28959x.get(this.f26657a));
            }
            m28965a();
            int i10 = this.f26658b;
            return i10 == -1 ? (V) C6779k0.m29008b() : (V) C6774i.this.m28949Y(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            Map<K, V> mapM28959x = C6774i.this.m28959x();
            if (mapM28959x != null) {
                return (V) C6779k0.m29007a(mapM28959x.put(this.f26657a, v5));
            }
            m28965a();
            int i10 = this.f26658b;
            if (i10 == -1) {
                C6774i.this.put(this.f26657a, v5);
                return (V) C6779k0.m29008b();
            }
            V v10 = (V) C6774i.this.m28949Y(i10);
            C6774i.this.m28948X(this.f26658b, v5);
            return v10;
        }
    }

    /* JADX INFO: renamed from: ie.i$h */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C6774i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C6774i.this.m28950Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C6774i.this.size();
        }
    }

    public C6774i() {
        m28931G(3);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m28915e(C6774i c6774i) {
        int i10 = c6774i.f26644f;
        c6774i.f26644f = i10 - 1;
        return i10;
    }

    /* JADX INFO: renamed from: s */
    public static <K, V> C6774i<K, V> m28924s() {
        return new C6774i<>();
    }

    /* JADX INFO: renamed from: A */
    public Iterator<Map.Entry<K, V>> m28925A() {
        Map<K, V> mapM28959x = m28959x();
        return mapM28959x != null ? mapM28959x.entrySet().iterator() : new b();
    }

    /* JADX INFO: renamed from: B */
    public int m28926B() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: C */
    public int m28927C(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f26644f) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final int m28928D() {
        return (1 << (this.f26643e & 31)) - 1;
    }

    /* JADX INFO: renamed from: E */
    public void m28929E() {
        this.f26643e += 32;
    }

    /* JADX INFO: renamed from: F */
    public final int m28930F(Object obj) {
        if (m28936L()) {
            return -1;
        }
        int iM29030c = C6788p.m29030c(obj);
        int iM28928D = m28928D();
        int iM29004h = C6778k.m29004h(m28940P(), iM29030c & iM28928D);
        if (iM29004h == 0) {
            return -1;
        }
        int iM28998b = C6778k.m28998b(iM29030c, iM28928D);
        do {
            int i10 = iM29004h - 1;
            int iM28960y = m28960y(i10);
            if (C6778k.m28998b(iM28960y, iM28928D) == iM28998b && C6380j.m27910a(obj, m28933I(i10))) {
                return i10;
            }
            iM29004h = C6778k.m28999c(iM28960y, iM28928D);
        } while (iM29004h != 0);
        return -1;
    }

    /* JADX INFO: renamed from: G */
    public void m28931G(int i10) {
        C6384n.m27921e(i10 >= 0, "Expected size must be >= 0");
        this.f26643e = C8486a.m34269a(i10, 1, 1073741823);
    }

    /* JADX INFO: renamed from: H */
    public void m28932H(int i10, K k10, V v5, int i11, int i12) {
        m28945U(i10, C6778k.m29000d(i11, 0, i12));
        m28947W(i10, k10);
        m28948X(i10, v5);
    }

    /* JADX INFO: renamed from: I */
    public final K m28933I(int i10) {
        return (K) m28939O()[i10];
    }

    /* JADX INFO: renamed from: J */
    public Iterator<K> m28934J() {
        Map<K, V> mapM28959x = m28959x();
        return mapM28959x != null ? mapM28959x.keySet().iterator() : new a();
    }

    /* JADX INFO: renamed from: K */
    public void m28935K(int i10, int i11) {
        Object objM28940P = m28940P();
        int[] iArrM28938N = m28938N();
        Object[] objArrM28939O = m28939O();
        Object[] objArrM28941Q = m28941Q();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrM28939O[i10] = null;
            objArrM28941Q[i10] = null;
            iArrM28938N[i10] = 0;
            return;
        }
        Object obj = objArrM28939O[i12];
        objArrM28939O[i10] = obj;
        objArrM28941Q[i10] = objArrM28941Q[i12];
        objArrM28939O[i12] = null;
        objArrM28941Q[i12] = null;
        iArrM28938N[i10] = iArrM28938N[i12];
        iArrM28938N[i12] = 0;
        int iM29030c = C6788p.m29030c(obj) & i11;
        int iM29004h = C6778k.m29004h(objM28940P, iM29030c);
        if (iM29004h == size) {
            C6778k.m29005i(objM28940P, iM29030c, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iM29004h - 1;
            int i14 = iArrM28938N[i13];
            int iM28999c = C6778k.m28999c(i14, i11);
            if (iM28999c == size) {
                iArrM28938N[i13] = C6778k.m29000d(i14, i10 + 1, i11);
                return;
            }
            iM29004h = iM28999c;
        }
    }

    /* JADX INFO: renamed from: L */
    public boolean m28936L() {
        return this.f26639a == null;
    }

    /* JADX INFO: renamed from: M */
    public final Object m28937M(Object obj) {
        int iM28928D;
        int iM29002f;
        if (!m28936L() && (iM29002f = C6778k.m29002f(obj, null, (iM28928D = m28928D()), m28940P(), m28938N(), m28939O(), null)) != -1) {
            V vM28949Y = m28949Y(iM29002f);
            m28935K(iM29002f, iM28928D);
            this.f26644f--;
            m28929E();
            return vM28949Y;
        }
        return f26638j;
    }

    /* JADX INFO: renamed from: N */
    public final int[] m28938N() {
        int[] iArr = this.f26640b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: renamed from: O */
    public final Object[] m28939O() {
        Object[] objArr = this.f26641c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: P */
    public final Object m28940P() {
        Object obj = this.f26639a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: renamed from: Q */
    public final Object[] m28941Q() {
        Object[] objArr = this.f26642d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: renamed from: R */
    public void m28942R(int i10) {
        this.f26640b = Arrays.copyOf(m28938N(), i10);
        this.f26641c = Arrays.copyOf(m28939O(), i10);
        this.f26642d = Arrays.copyOf(m28941Q(), i10);
    }

    /* JADX INFO: renamed from: S */
    public final void m28943S(int i10) {
        int iMin;
        int length = m28938N().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m28942R(iMin);
    }

    /* JADX INFO: renamed from: T */
    public final int m28944T(int i10, int i11, int i12, int i13) {
        Object objM28997a = C6778k.m28997a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C6778k.m29005i(objM28997a, i12 & i14, i13 + 1);
        }
        Object objM28940P = m28940P();
        int[] iArrM28938N = m28938N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iM29004h = C6778k.m29004h(objM28940P, i15);
            while (iM29004h != 0) {
                int i16 = iM29004h - 1;
                int i17 = iArrM28938N[i16];
                int iM28998b = C6778k.m28998b(i17, i10) | i15;
                int i18 = iM28998b & i14;
                int iM29004h2 = C6778k.m29004h(objM28997a, i18);
                C6778k.m29005i(objM28997a, i18, iM29004h);
                iArrM28938N[i16] = C6778k.m29000d(iM28998b, iM29004h2, i14);
                iM29004h = C6778k.m28999c(i17, i10);
            }
        }
        this.f26639a = objM28997a;
        m28946V(i14);
        return i14;
    }

    /* JADX INFO: renamed from: U */
    public final void m28945U(int i10, int i11) {
        m28938N()[i10] = i11;
    }

    /* JADX INFO: renamed from: V */
    public final void m28946V(int i10) {
        this.f26643e = C6778k.m29000d(this.f26643e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    /* JADX INFO: renamed from: W */
    public final void m28947W(int i10, K k10) {
        m28939O()[i10] = k10;
    }

    /* JADX INFO: renamed from: X */
    public final void m28948X(int i10, V v5) {
        m28941Q()[i10] = v5;
    }

    /* JADX INFO: renamed from: Y */
    public final V m28949Y(int i10) {
        return (V) m28941Q()[i10];
    }

    /* JADX INFO: renamed from: Z */
    public Iterator<V> m28950Z() {
        Map<K, V> mapM28959x = m28959x();
        return mapM28959x != null ? mapM28959x.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m28936L()) {
            return;
        }
        m28929E();
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            this.f26643e = C8486a.m34269a(size(), 3, 1073741823);
            mapM28959x.clear();
            this.f26639a = null;
            this.f26644f = 0;
            return;
        }
        Arrays.fill(m28939O(), 0, this.f26644f, (Object) null);
        Arrays.fill(m28941Q(), 0, this.f26644f, (Object) null);
        C6778k.m29003g(m28940P());
        Arrays.fill(m28938N(), 0, this.f26644f, 0);
        this.f26644f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            return mapM28959x.containsKey(obj);
        }
        return m28930F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            return mapM28959x.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f26644f; i10++) {
            if (C6380j.m27910a(obj, m28949Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26646h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setM28955t = m28955t();
        this.f26646h = setM28955t;
        return setM28955t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            return mapM28959x.get(obj);
        }
        int iM28930F = m28930F(obj);
        if (iM28930F == -1) {
            return null;
        }
        m28951o(iM28930F);
        return m28949Y(iM28930F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26645g;
        if (set != null) {
            return set;
        }
        Set<K> setM28957v = m28957v();
        this.f26645g = setM28957v;
        return setM28957v;
    }

    /* JADX INFO: renamed from: o */
    public void m28951o(int i10) {
    }

    /* JADX INFO: renamed from: p */
    public int m28952p(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v5) {
        if (m28936L()) {
            m28953q();
        }
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            return mapM28959x.put(k10, v5);
        }
        int[] iArrM28938N = m28938N();
        Object[] objArrM28939O = m28939O();
        Object[] objArrM28941Q = m28941Q();
        int i10 = this.f26644f;
        int i11 = i10 + 1;
        int iM29030c = C6788p.m29030c(k10);
        int iM28928D = m28928D();
        int i12 = iM29030c & iM28928D;
        int iM29004h = C6778k.m29004h(m28940P(), i12);
        if (iM29004h != 0) {
            int iM28998b = C6778k.m28998b(iM29030c, iM28928D);
            int i13 = 0;
            while (true) {
                int i14 = iM29004h - 1;
                int i15 = iArrM28938N[i14];
                if (C6778k.m28998b(i15, iM28928D) == iM28998b && C6380j.m27910a(k10, objArrM28939O[i14])) {
                    V v10 = (V) objArrM28941Q[i14];
                    objArrM28941Q[i14] = v5;
                    m28951o(i14);
                    return v10;
                }
                int iM28999c = C6778k.m28999c(i15, iM28928D);
                i13++;
                if (iM28999c == 0) {
                    if (i13 < 9) {
                        if (i11 <= iM28928D) {
                            iArrM28938N[i14] = C6778k.m29000d(i15, i11, iM28928D);
                            break;
                        }
                        iM28928D = m28944T(iM28928D, C6778k.m29001e(iM28928D), iM29030c, i10);
                        break;
                    }
                    return m28954r().put(k10, v5);
                }
                k10 = k10;
                v5 = v5;
                iM29004h = iM28999c;
            }
        } else if (i11 > iM28928D) {
            iM28928D = m28944T(iM28928D, C6778k.m29001e(iM28928D), iM29030c, i10);
        } else {
            C6778k.m29005i(m28940P(), i12, i11);
        }
        int i16 = iM28928D;
        m28943S(i11);
        m28932H(i10, k10, v5, iM29030c, i16);
        this.f26644f = i11;
        m28929E();
        return null;
    }

    /* JADX INFO: renamed from: q */
    public int m28953q() {
        C6384n.m27935s(m28936L(), "Arrays already allocated");
        int i10 = this.f26643e;
        int iM29006j = C6778k.m29006j(i10);
        this.f26639a = C6778k.m28997a(iM29006j);
        m28946V(iM29006j - 1);
        this.f26640b = new int[i10];
        this.f26641c = new Object[i10];
        this.f26642d = new Object[i10];
        return i10;
    }

    /* JADX INFO: renamed from: r */
    public Map<K, V> m28954r() {
        Map<K, V> mapM28956u = m28956u(m28928D() + 1);
        int iM28926B = m28926B();
        while (iM28926B >= 0) {
            mapM28956u.put(m28933I(iM28926B), m28949Y(iM28926B));
            iM28926B = m28927C(iM28926B);
        }
        this.f26639a = mapM28956u;
        this.f26640b = null;
        this.f26641c = null;
        this.f26642d = null;
        m28929E();
        return mapM28956u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapM28959x = m28959x();
        if (mapM28959x != null) {
            return mapM28959x.remove(obj);
        }
        V v5 = (V) m28937M(obj);
        if (v5 == f26638j) {
            return null;
        }
        return v5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapM28959x = m28959x();
        return mapM28959x != null ? mapM28959x.size() : this.f26644f;
    }

    /* JADX INFO: renamed from: t */
    public Set<Map.Entry<K, V>> m28955t() {
        return new d();
    }

    /* JADX INFO: renamed from: u */
    public Map<K, V> m28956u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* JADX INFO: renamed from: v */
    public Set<K> m28957v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f26647i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionM28958w = m28958w();
        this.f26647i = collectionM28958w;
        return collectionM28958w;
    }

    /* JADX INFO: renamed from: w */
    public Collection<V> m28958w() {
        return new h();
    }

    /* JADX INFO: renamed from: x */
    public Map<K, V> m28959x() {
        Object obj = this.f26639a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final int m28960y(int i10) {
        return m28938N()[i10];
    }

    /* JADX INFO: renamed from: ie.i$e */
    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f26652a;

        /* JADX INFO: renamed from: b */
        public int f26653b;

        /* JADX INFO: renamed from: c */
        public int f26654c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this.f26652a = C6774i.this.f26643e;
            this.f26653b = C6774i.this.m28926B();
            this.f26654c = -1;
        }

        /* JADX INFO: renamed from: b */
        public final void m28963b() {
            if (C6774i.this.f26643e != this.f26652a) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: d */
        public abstract T mo28961d(int i10);

        /* JADX INFO: renamed from: e */
        public void m28964e() {
            this.f26652a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26653b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m28963b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f26653b;
            this.f26654c = i10;
            T tMo28961d = mo28961d(i10);
            this.f26653b = C6774i.this.m28927C(this.f26653b);
            return tMo28961d;
        }

        @Override // java.util.Iterator
        public void remove() {
            m28963b();
            C6770g.m28908c(this.f26654c >= 0);
            m28964e();
            C6774i c6774i = C6774i.this;
            c6774i.remove(c6774i.m28933I(this.f26654c));
            this.f26653b = C6774i.this.m28952p(this.f26653b, this.f26654c);
            this.f26654c = -1;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 ie.i) A[MD:(ie.i):void (m)] (LINE:5) call: ie.i.e.<init>(ie.i):void type: THIS */
        public /* synthetic */ e(C6774i c6774i, a aVar) {
            this();
        }
    }
}
