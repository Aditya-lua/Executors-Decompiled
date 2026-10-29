package ie;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6791q0<K, V> extends AbstractC6798u<K, V> {

    /* JADX INFO: renamed from: h */
    public static final AbstractC6798u<Object, Object> f26682h = new C6791q0(null, new Object[0], 0);

    /* JADX INFO: renamed from: e */
    public final transient Object f26683e;

    /* JADX INFO: renamed from: f */
    public final transient Object[] f26684f;

    /* JADX INFO: renamed from: g */
    public final transient int f26685g;

    /* JADX INFO: renamed from: ie.q0$a */
    public static class a<K, V> extends AbstractC6802w<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c */
        public final transient AbstractC6798u<K, V> f26686c;

        /* JADX INFO: renamed from: d */
        public final transient Object[] f26687d;

        /* JADX INFO: renamed from: e */
        public final transient int f26688e;

        /* JADX INFO: renamed from: f */
        public final transient int f26689f;

        /* JADX INFO: renamed from: ie.q0$a$a, reason: collision with other inner class name */
        public class C14186a extends AbstractC6796t<Map.Entry<K, V>> {
            public C14186a() {
            }

            /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
            @Override // java.util.List
            /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                C6384n.m27926j(i10, a.this.f26689f);
                int i11 = i10 * 2;
                Object obj = a.this.f26687d[a.this.f26688e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f26687d[i11 + (a.this.f26688e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // ie.AbstractC6792r
            /* JADX INFO: renamed from: f */
            public boolean mo29035f() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f26689f;
            }
        }

        public a(AbstractC6798u<K, V> abstractC6798u, Object[] objArr, int i10, int i11) {
            this.f26686c = abstractC6798u;
            this.f26687d = objArr;
            this.f26688e = i10;
            this.f26689f = i11;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: b */
        public int mo29031b(Object[] objArr, int i10) {
            return mo29064a().mo29031b(objArr, i10);
        }

        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.f26686c.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public AbstractC6807y0<Map.Entry<K, V>> iterator() {
            return mo29064a().iterator();
        }

        @Override // ie.AbstractC6802w
        /* JADX INFO: renamed from: m */
        public AbstractC6796t<Map.Entry<K, V>> mo29062m() {
            return new C14186a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26689f;
        }
    }

    /* JADX INFO: renamed from: ie.q0$b */
    public static final class b<K> extends AbstractC6802w<K> {

        /* JADX INFO: renamed from: c */
        public final transient AbstractC6798u<K, ?> f26691c;

        /* JADX INFO: renamed from: d */
        public final transient AbstractC6796t<K> f26692d;

        public b(AbstractC6798u<K, ?> abstractC6798u, AbstractC6796t<K> abstractC6796t) {
            this.f26691c = abstractC6798u;
            this.f26692d = abstractC6796t;
        }

        @Override // ie.AbstractC6802w, ie.AbstractC6792r
        /* JADX INFO: renamed from: a */
        public AbstractC6796t<K> mo29064a() {
            return this.f26692d;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: b */
        public int mo29031b(Object[] objArr, int i10) {
            return mo29064a().mo29031b(objArr, i10);
        }

        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f26691c.get(obj) != null;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
        @Override // ie.AbstractC6792r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: g */
        public AbstractC6807y0<K> iterator() {
            return mo29064a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26691c.size();
        }
    }

    /* JADX INFO: renamed from: ie.q0$c */
    public static final class c extends AbstractC6796t<Object> {

        /* JADX INFO: renamed from: c */
        public final transient Object[] f26693c;

        /* JADX INFO: renamed from: d */
        public final transient int f26694d;

        /* JADX INFO: renamed from: e */
        public final transient int f26695e;

        public c(Object[] objArr, int i10, int i11) {
            this.f26693c = objArr;
            this.f26694d = i10;
            this.f26695e = i11;
        }

        @Override // ie.AbstractC6792r
        /* JADX INFO: renamed from: f */
        public boolean mo29035f() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            C6384n.m27926j(i10, this.f26695e);
            Object obj = this.f26693c[(i10 * 2) + this.f26694d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f26695e;
        }
    }

    public C6791q0(Object obj, Object[] objArr, int i10) {
        this.f26683e = obj;
        this.f26684f = objArr;
        this.f26685g = i10;
    }

    /* JADX INFO: renamed from: q */
    public static <K, V> C6791q0<K, V> m29053q(int i10, Object[] objArr) {
        return m29054r(i10, objArr, null);
    }

    /* JADX INFO: renamed from: r */
    public static <K, V> C6791q0<K, V> m29054r(int i10, Object[] objArr, AbstractC6798u.a<K, V> aVar) {
        if (i10 == 0) {
            return (C6791q0) f26682h;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C6770g.m28906a(obj, obj2);
            return new C6791q0<>(null, objArr, 1);
        }
        C6384n.m27931o(i10, objArr.length >> 1);
        Object objM29055s = m29055s(objArr, i10, AbstractC6802w.m29136h(i10), 0);
        if (objM29055s instanceof Object[]) {
            Object[] objArr2 = (Object[]) objM29055s;
            AbstractC6798u.a.C14188a c14188a = (AbstractC6798u.a.C14188a) objArr2[2];
            if (aVar == null) {
                throw c14188a.m29129a();
            }
            aVar.f26730e = c14188a;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objM29055s = obj3;
            i10 = iIntValue;
        }
        return new C6791q0<>(objM29055s, objArr, i10);
    }

    /* JADX INFO: renamed from: s */
    public static Object m29055s(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        AbstractC6798u.a.C14188a c14188a = null;
        int i14 = 1;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            C6770g.m28906a(obj, obj2);
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
                C6770g.m28906a(obj3, obj4);
                int iM29029b = C6788p.m29029b(obj3.hashCode());
                while (true) {
                    int i20 = iM29029b & i15;
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
                        c14188a = new AbstractC6798u.a.C14188a(obj3, obj4, obj5);
                        objArr[i22] = obj4;
                        break;
                    }
                    iM29029b = i20 + 1;
                }
            }
            return i16 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i16), c14188a};
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
                C6770g.m28906a(obj6, obj7);
                int iM29029b2 = C6788p.m29029b(obj6.hashCode());
                while (true) {
                    int i27 = iM29029b2 & i15;
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
                        c14188a = new AbstractC6798u.a.C14188a(obj6, obj7, obj8);
                        objArr[i29] = obj7;
                        break;
                    }
                    iM29029b2 = i27 + 1;
                }
            }
            return i23 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i23), c14188a};
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
            C6770g.m28906a(obj9, obj10);
            int iM29029b3 = C6788p.m29029b(obj9.hashCode());
            while (true) {
                int i34 = iM29029b3 & i15;
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
                    c14188a = new AbstractC6798u.a.C14188a(obj9, obj10, obj11);
                    objArr[i36] = obj10;
                    break;
                }
                iM29029b3 = i34 + 1;
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
        objArr2[2] = c14188a;
        return objArr2;
    }

    /* JADX INFO: renamed from: t */
    public static Object m29056t(Object[] objArr, int i10, int i11, int i12) {
        Object objM29055s = m29055s(objArr, i10, i11, i12);
        if (objM29055s instanceof Object[]) {
            throw ((AbstractC6798u.a.C14188a) ((Object[]) objM29055s)[2]).m29129a();
        }
        return objM29055s;
    }

    /* JADX INFO: renamed from: u */
    public static Object m29057u(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
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
            int iM29029b = C6788p.m29029b(obj2.hashCode());
            while (true) {
                int i12 = iM29029b & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                iM29029b = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iM29029b2 = C6788p.m29029b(obj2.hashCode());
            while (true) {
                int i14 = iM29029b2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                iM29029b2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iM29029b3 = C6788p.m29029b(obj2.hashCode());
            while (true) {
                int i16 = iM29029b3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                iM29029b3 = i16 + 1;
            }
        }
    }

    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: d */
    public AbstractC6802w<Map.Entry<K, V>> mo29025d() {
        return new a(this, this.f26684f, 0, this.f26685g);
    }

    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: e */
    public AbstractC6802w<K> mo29026e() {
        return new b(this, new c(this.f26684f, 0, this.f26685g));
    }

    @Override // ie.AbstractC6798u
    /* JADX INFO: renamed from: f */
    public AbstractC6792r<V> mo29037f() {
        return new c(this.f26684f, 1, this.f26685g);
    }

    @Override // ie.AbstractC6798u, java.util.Map
    public V get(Object obj) {
        V v5 = (V) m29057u(this.f26683e, this.f26684f, this.f26685g, 0, obj);
        if (v5 == null) {
            return null;
        }
        return v5;
    }

    @Override // java.util.Map
    public int size() {
        return this.f26685g;
    }
}
