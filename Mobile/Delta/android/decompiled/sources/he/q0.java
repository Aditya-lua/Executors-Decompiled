package he;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q0<K, V> extends u<K, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u<Object, Object> f19252h = new q0(null, new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object f19253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f19254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f19255g;

    public static class a<K, V> extends w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient u<K, V> f19256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Object[] f19257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f19258e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final transient int f19259f;

        /* JADX INFO: renamed from: he.q0$a$a, reason: collision with other inner class name */
        public class C0340a extends t<Map.Entry<K, V>> {
            public C0340a() {
            }

            @Override // java.util.List
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                ge.n.j(i10, a.this.f19259f);
                int i11 = i10 * 2;
                Object obj = a.this.f19257d[a.this.f19258e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f19257d[i11 + (a.this.f19258e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // he.r
            public boolean f() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f19259f;
            }
        }

        public a(u<K, V> uVar, Object[] objArr, int i10, int i11) {
            this.f19256c = uVar;
            this.f19257d = objArr;
            this.f19258e = i10;
            this.f19259f = i11;
        }

        @Override // he.r
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f19256c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // he.r
        public boolean f() {
            return true;
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public y0<Map.Entry<K, V>> iterator() {
            return a().iterator();
        }

        @Override // he.w
        public t<Map.Entry<K, V>> m() {
            return new C0340a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f19259f;
        }
    }

    public static final class b<K> extends w<K> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient u<K, ?> f19261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient t<K> f19262d;

        public b(u<K, ?> uVar, t<K> tVar) {
            this.f19261c = uVar;
            this.f19262d = tVar;
        }

        @Override // he.w, he.r
        public t<K> a() {
            return this.f19262d;
        }

        @Override // he.r
        public int b(Object[] objArr, int i10) {
            return a().b(objArr, i10);
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f19261c.get(obj) != null;
        }

        @Override // he.r
        public boolean f() {
            return true;
        }

        @Override // he.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public y0<K> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f19261c.size();
        }
    }

    public static final class c extends t<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final transient Object[] f19263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f19264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f19265e;

        public c(Object[] objArr, int i10, int i11) {
            this.f19263c = objArr;
            this.f19264d = i10;
            this.f19265e = i11;
        }

        @Override // he.r
        public boolean f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            ge.n.j(i10, this.f19265e);
            Object obj = this.f19263c[(i10 * 2) + this.f19264d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f19265e;
        }
    }

    public q0(Object obj, Object[] objArr, int i10) {
        this.f19253e = obj;
        this.f19254f = objArr;
        this.f19255g = i10;
    }

    public static <K, V> q0<K, V> q(int i10, Object[] objArr) {
        return r(i10, objArr, null);
    }

    public static <K, V> q0<K, V> r(int i10, Object[] objArr, u.a<K, V> aVar) {
        if (i10 == 0) {
            return (q0) f19252h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            g.a(obj, obj2);
            return new q0<>(null, objArr, 1);
        }
        ge.n.o(i10, objArr.length >> 1);
        Object objS = s(objArr, i10, w.h(i10), 0);
        if (objS instanceof Object[]) {
            Object[] objArr2 = (Object[]) objS;
            u.a.C0342a c0342a = (u.a.C0342a) objArr2[2];
            if (aVar == null) {
                throw c0342a.a();
            }
            aVar.f19294e = c0342a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objS = obj3;
            i10 = iIntValue;
        }
        return new q0<>(objS, objArr, i10);
    }

    public static Object s(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        u.a.C0342a c0342a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            g.a(obj, obj2);
            return null;
        }
        int i15 = i11 - 1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                int i18 = (i17 * 2) + i12;
                int i19 = (i16 * 2) + i12;
                Object obj3 = objArr[i18];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i18 ^ 1];
                Objects.requireNonNull(obj4);
                g.a(obj3, obj4);
                int iB = p.b(obj3.hashCode());
                while (true) {
                    int i20 = iB & i15;
                    int i21 = bArr[i20] & 255;
                    if (i21 == 255) {
                        bArr[i20] = (byte) i19;
                        if (i16 < i17) {
                            objArr[i19] = obj3;
                            objArr[i19 ^ 1] = obj4;
                        }
                        i16++;
                        break;
                    }
                    if (obj3.equals(objArr[i21])) {
                        int i22 = i21 ^ 1;
                        Object obj5 = objArr[i22];
                        Objects.requireNonNull(obj5);
                        c0342a = new u.a.C0342a(obj3, obj4, obj5);
                        objArr[i22] = obj4;
                        break;
                    }
                    iB = i20 + 1;
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c0342a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i23 = 0;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = (i24 * 2) + i12;
                int i26 = (i23 * 2) + i12;
                Object obj6 = objArr[i25];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i25 ^ 1];
                Objects.requireNonNull(obj7);
                g.a(obj6, obj7);
                int iB2 = p.b(obj6.hashCode());
                while (true) {
                    int i27 = iB2 & i15;
                    int i28 = sArr[i27] & 65535;
                    if (i28 == 65535) {
                        sArr[i27] = (short) i26;
                        if (i23 < i24) {
                            objArr[i26] = obj6;
                            objArr[i26 ^ 1] = obj7;
                        }
                        i23++;
                        break;
                    }
                    if (obj6.equals(objArr[i28])) {
                        int i29 = i28 ^ 1;
                        Object obj8 = objArr[i29];
                        Objects.requireNonNull(obj8);
                        c0342a = new u.a.C0342a(obj6, obj7, obj8);
                        objArr[i29] = obj7;
                        break;
                    }
                    iB2 = i27 + 1;
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c0342a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i30 = 0;
        int i31 = 0;
        while (i30 < i10) {
            int i32 = (i30 * 2) + i12;
            int i33 = (i31 * 2) + i12;
            Object obj9 = objArr[i32];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i32 ^ i14];
            Objects.requireNonNull(obj10);
            g.a(obj9, obj10);
            int iB3 = p.b(obj9.hashCode());
            while (true) {
                int i34 = iB3 & i15;
                int i35 = iArr[i34];
                if (i35 == -1) {
                    iArr[i34] = i33;
                    if (i31 < i30) {
                        objArr[i33] = obj9;
                        objArr[i33 ^ 1] = obj10;
                    }
                    i31++;
                    i13 = i14;
                    break;
                }
                i13 = i14;
                if (obj9.equals(objArr[i35])) {
                    int i36 = i35 ^ 1;
                    Object obj11 = objArr[i36];
                    Objects.requireNonNull(obj11);
                    c0342a = new u.a.C0342a(obj9, obj10, obj11);
                    objArr[i36] = obj10;
                    break;
                }
                iB3 = i34 + 1;
                i14 = i13;
            }
            i30++;
            i14 = i13;
        }
        int i37 = i14;
        if (i31 == i10) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i37] = Integer.valueOf(i31);
        objArr2[2] = c0342a;
        return objArr2;
    }

    public static Object t(Object[] objArr, int i10, int i11, int i12) {
        Object objS = s(objArr, i10, i11, i12);
        if (objS instanceof Object[]) {
            throw ((u.a.C0342a) ((Object[]) objS)[2]).a();
        }
        return objS;
    }

    public static Object u(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iB = p.b(obj2.hashCode());
            while (true) {
                int i12 = iB & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iB = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iB2 = p.b(obj2.hashCode());
            while (true) {
                int i14 = iB2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iB2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iB3 = p.b(obj2.hashCode());
            while (true) {
                int i16 = iB3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iB3 = i16 + 1;
            }
        }
    }

    @Override // he.u
    public w<Map.Entry<K, V>> d() {
        return new a(this, this.f19254f, 0, this.f19255g);
    }

    @Override // he.u
    public w<K> e() {
        return new b(this, new c(this.f19254f, 0, this.f19255g));
    }

    @Override // he.u
    public r<V> f() {
        return new c(this.f19254f, 1, this.f19255g);
    }

    @Override // he.u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) u(this.f19253e, this.f19254f, this.f19255g, 0, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // java.util.Map
    public int size() {
        return this.f19255g;
    }
}
