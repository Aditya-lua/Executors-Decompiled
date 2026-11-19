package ke;

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

/* JADX INFO: loaded from: classes2.dex */
public class i<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f21357j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f21358a;
    public transient int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Object[] f21359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f21360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f21361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int f21362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient Set<K> f21363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f21364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient Collection<V> f21365i;

    public class a extends i<K, V>.e<K> {
        public a() {
            super(i.this, null);
        }

        @Override // ke.i.e
        public K d(int i10) {
            return (K) i.this.I(i10);
        }
    }

    public class b extends i<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(i.this, null);
        }

        @Override // ke.i.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> d(int i10) {
            return new g(i10);
        }
    }

    public class c extends i<K, V>.e<V> {
        public c() {
            super(i.this, null);
        }

        @Override // ke.i.e
        public V d(int i10) {
            return (V) i.this.Y(i10);
        }
    }

    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> mapY = i.this.y();
            if (mapY != null) {
                return mapY.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iF = i.this.F(entry.getKey());
                if (iF != -1 && je.j.a(i.this.Y(iF), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return i.this.A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int iD;
            int iF;
            Map<K, V> mapY = i.this.y();
            if (mapY != null) {
                return mapY.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (i.this.L() || (iF = k.f(entry.getKey(), entry.getValue(), (iD = i.this.D()), i.this.P(), i.this.N(), i.this.O(), i.this.Q())) == -1) {
                return false;
            }
            i.this.K(iF, iD);
            i.e(i.this);
            i.this.E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size();
        }
    }

    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return i.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return i.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> mapY = i.this.y();
            if (mapY != null) {
                return mapY.keySet().remove(obj);
            }
            return i.this.M(obj) != i.f21357j;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return i.this.size();
        }
    }

    public final class g extends ke.c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f21374a;
        public int b;

        public g(int i10) {
            this.f21374a = (K) i.this.I(i10);
            this.b = i10;
        }

        public final void a() {
            int i10 = this.b;
            if (i10 == -1 || i10 >= i.this.size() || !je.j.a(this.f21374a, i.this.I(this.b))) {
                this.b = i.this.F(this.f21374a);
            }
        }

        @Override // ke.c, java.util.Map.Entry
        public K getKey() {
            return this.f21374a;
        }

        @Override // ke.c, java.util.Map.Entry
        public V getValue() {
            Map<K, V> mapY = i.this.y();
            if (mapY != null) {
                return (V) k0.a(mapY.get(this.f21374a));
            }
            a();
            int i10 = this.b;
            return i10 == -1 ? (V) k0.b() : (V) i.this.Y(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v8) {
            Map<K, V> mapY = i.this.y();
            if (mapY != null) {
                return (V) k0.a(mapY.put(this.f21374a, v8));
            }
            a();
            int i10 = this.b;
            if (i10 == -1) {
                i.this.put(this.f21374a, v8);
                return (V) k0.b();
            }
            V v10 = (V) i.this.Y(i10);
            i.this.X(this.b, v8);
            return v10;
        }
    }

    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            i.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return i.this.Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return i.this.size();
        }
    }

    public i() {
        G(3);
    }

    public static /* synthetic */ int e(i iVar) {
        int i10 = iVar.f21362f;
        iVar.f21362f = i10 - 1;
        return i10;
    }

    public static <K, V> i<K, V> s() {
        return new i<>();
    }

    public Iterator<Map.Entry<K, V>> A() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.entrySet().iterator() : new b();
    }

    public int B() {
        return isEmpty() ? -1 : 0;
    }

    public int C(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f21362f) {
            return i11;
        }
        return -1;
    }

    public final int D() {
        return (1 << (this.f21361e & 31)) - 1;
    }

    public void E() {
        this.f21361e += 32;
    }

    public final int F(Object obj) {
        if (L()) {
            return -1;
        }
        int iC = p.c(obj);
        int iD = D();
        int iH = k.h(P(), iC & iD);
        if (iH == 0) {
            return -1;
        }
        int iB = k.b(iC, iD);
        do {
            int i10 = iH - 1;
            int iZ = z(i10);
            if (k.b(iZ, iD) == iB && je.j.a(obj, I(i10))) {
                return i10;
            }
            iH = k.c(iZ, iD);
        } while (iH != 0);
        return -1;
    }

    public void G(int i10) {
        je.n.e(i10 >= 0, "Expected size must be >= 0");
        this.f21361e = oe.a.a(i10, 1, 1073741823);
    }

    public void H(int i10, K k10, V v8, int i11, int i12) {
        U(i10, k.d(i11, 0, i12));
        W(i10, k10);
        X(i10, v8);
    }

    public final K I(int i10) {
        return (K) O()[i10];
    }

    public Iterator<K> J() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.keySet().iterator() : new a();
    }

    public void K(int i10, int i11) {
        Object objP = P();
        int[] iArrN = N();
        Object[] objArrO = O();
        Object[] objArrQ = Q();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrO[i10] = null;
            objArrQ[i10] = null;
            iArrN[i10] = 0;
            return;
        }
        Object obj = objArrO[i12];
        objArrO[i10] = obj;
        objArrQ[i10] = objArrQ[i12];
        objArrO[i12] = null;
        objArrQ[i12] = null;
        iArrN[i10] = iArrN[i12];
        iArrN[i12] = 0;
        int iC = p.c(obj) & i11;
        int iH = k.h(objP, iC);
        if (iH == size) {
            k.i(objP, iC, i10 + 1);
            return;
        }
        while (true) {
            int i13 = iH - 1;
            int i14 = iArrN[i13];
            int iC2 = k.c(i14, i11);
            if (iC2 == size) {
                iArrN[i13] = k.d(i14, i10 + 1, i11);
                return;
            }
            iH = iC2;
        }
    }

    public boolean L() {
        return this.f21358a == null;
    }

    public final Object M(Object obj) {
        int iD;
        int iF;
        if (!L() && (iF = k.f(obj, null, (iD = D()), P(), N(), O(), null)) != -1) {
            V vY = Y(iF);
            K(iF, iD);
            this.f21362f--;
            E();
            return vY;
        }
        return f21357j;
    }

    public final int[] N() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] O() {
        Object[] objArr = this.f21359c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object P() {
        Object obj = this.f21358a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] Q() {
        Object[] objArr = this.f21360d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void R(int i10) {
        this.b = Arrays.copyOf(N(), i10);
        this.f21359c = Arrays.copyOf(O(), i10);
        this.f21360d = Arrays.copyOf(Q(), i10);
    }

    public final void S(int i10) {
        int iMin;
        int length = N().length;
        if (i10 <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        R(iMin);
    }

    public final int T(int i10, int i11, int i12, int i13) {
        Object objA = k.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            k.i(objA, i12 & i14, i13 + 1);
        }
        Object objP = P();
        int[] iArrN = N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iH = k.h(objP, i15);
            while (iH != 0) {
                int i16 = iH - 1;
                int i17 = iArrN[i16];
                int iB = k.b(i17, i10) | i15;
                int i18 = iB & i14;
                int iH2 = k.h(objA, i18);
                k.i(objA, i18, iH);
                iArrN[i16] = k.d(iB, iH2, i14);
                iH = k.c(i17, i10);
            }
        }
        this.f21358a = objA;
        V(i14);
        return i14;
    }

    public final void U(int i10, int i11) {
        N()[i10] = i11;
    }

    public final void V(int i10) {
        this.f21361e = k.d(this.f21361e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    public final void W(int i10, K k10) {
        O()[i10] = k10;
    }

    public final void X(int i10, V v8) {
        Q()[i10] = v8;
    }

    public final V Y(int i10) {
        return (V) Q()[i10];
    }

    public Iterator<V> Z() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        E();
        Map<K, V> mapY = y();
        if (mapY != null) {
            this.f21361e = oe.a.a(size(), 3, 1073741823);
            mapY.clear();
            this.f21358a = null;
            this.f21362f = 0;
            return;
        }
        Arrays.fill(O(), 0, this.f21362f, (Object) null);
        Arrays.fill(Q(), 0, this.f21362f, (Object) null);
        k.g(P());
        Arrays.fill(N(), 0, this.f21362f, 0);
        this.f21362f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.containsKey(obj);
        }
        return F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f21362f; i10++) {
            if (je.j.a(obj, Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21364h;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setT = t();
        this.f21364h = setT;
        return setT;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.get(obj);
        }
        int iF = F(obj);
        if (iF == -1) {
            return null;
        }
        n(iF);
        return Y(iF);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f21363g;
        if (set != null) {
            return set;
        }
        Set<K> setW = w();
        this.f21363g = setW;
        return setW;
    }

    public void n(int i10) {
    }

    public int o(int i10, int i11) {
        return i10 - 1;
    }

    public int p() {
        je.n.s(L(), "Arrays already allocated");
        int i10 = this.f21361e;
        int iJ = k.j(i10);
        this.f21358a = k.a(iJ);
        V(iJ - 1);
        this.b = new int[i10];
        this.f21359c = new Object[i10];
        this.f21360d = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v8) {
        if (L()) {
            p();
        }
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.put(k10, v8);
        }
        int[] iArrN = N();
        Object[] objArrO = O();
        Object[] objArrQ = Q();
        int i10 = this.f21362f;
        int i11 = i10 + 1;
        int iC = p.c(k10);
        int iD = D();
        int i12 = iC & iD;
        int iH = k.h(P(), i12);
        if (iH != 0) {
            int iB = k.b(iC, iD);
            int i13 = 0;
            while (true) {
                int i14 = iH - 1;
                int i15 = iArrN[i14];
                if (k.b(i15, iD) == iB && je.j.a(k10, objArrO[i14])) {
                    V v10 = (V) objArrQ[i14];
                    objArrQ[i14] = v8;
                    n(i14);
                    return v10;
                }
                int iC2 = k.c(i15, iD);
                i13++;
                if (iC2 == 0) {
                    if (i13 < 9) {
                        if (i11 <= iD) {
                            iArrN[i14] = k.d(i15, i11, iD);
                            break;
                        }
                        iD = T(iD, k.e(iD), iC, i10);
                        break;
                    }
                    return r().put(k10, v8);
                }
                k10 = k10;
                v8 = v8;
                iH = iC2;
            }
        } else if (i11 > iD) {
            iD = T(iD, k.e(iD), iC, i10);
        } else {
            k.i(P(), i12, i11);
        }
        int i16 = iD;
        S(i11);
        H(i10, k10, v8, iC, i16);
        this.f21362f = i11;
        E();
        return null;
    }

    public Map<K, V> r() {
        Map<K, V> mapU = u(D() + 1);
        int iB = B();
        while (iB >= 0) {
            mapU.put(I(iB), Y(iB));
            iB = C(iB);
        }
        this.f21358a = mapU;
        this.b = null;
        this.f21359c = null;
        this.f21360d = null;
        E();
        return mapU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> mapY = y();
        if (mapY != null) {
            return mapY.remove(obj);
        }
        V v8 = (V) M(obj);
        if (v8 == f21357j) {
            return null;
        }
        return v8;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapY = y();
        return mapY != null ? mapY.size() : this.f21362f;
    }

    public Set<Map.Entry<K, V>> t() {
        return new d();
    }

    public Map<K, V> u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f21365i;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionX = x();
        this.f21365i = collectionX;
        return collectionX;
    }

    public Set<K> w() {
        return new f();
    }

    public Collection<V> x() {
        return new h();
    }

    public Map<K, V> y() {
        Object obj = this.f21358a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int z(int i10) {
        return N()[i10];
    }

    public abstract class e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21370a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21371c;

        public e() {
            this.f21370a = i.this.f21361e;
            this.b = i.this.B();
            this.f21371c = -1;
        }

        public final void b() {
            if (i.this.f21361e != this.f21370a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T d(int i10);

        public void e() {
            this.f21370a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.b;
            this.f21371c = i10;
            T tD = d(i10);
            this.b = i.this.C(this.b);
            return tD;
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            ke.g.c(this.f21371c >= 0);
            e();
            i iVar = i.this;
            iVar.remove(iVar.I(this.f21371c));
            this.b = i.this.o(this.b, this.f21371c);
            this.f21371c = -1;
        }

        public /* synthetic */ e(i iVar, a aVar) {
            this();
        }
    }
}
