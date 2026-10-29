package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0846i implements InterfaceC0839f1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0843h f2891a;

    /* JADX INFO: renamed from: b */
    public int f2892b;

    /* JADX INFO: renamed from: c */
    public int f2893c;

    /* JADX INFO: renamed from: d */
    public int f2894d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2895a;

        static {
            int[] iArr = new int[C0878s1.b.values().length];
            f2895a = iArr;
            try {
                iArr[C0878s1.b.f3009j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2895a[C0878s1.b.f3013n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2895a[C0878s1.b.f3002c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2895a[C0878s1.b.f3015p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2895a[C0878s1.b.f3008i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2895a[C0878s1.b.f3007h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2895a[C0878s1.b.f3003d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2895a[C0878s1.b.f3006g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2895a[C0878s1.b.f3004e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2895a[C0878s1.b.f3012m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2895a[C0878s1.b.f3016q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2895a[C0878s1.b.f3017r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2895a[C0878s1.b.f3018s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2895a[C0878s1.b.f3019t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2895a[C0878s1.b.f3010k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2895a[C0878s1.b.f3014o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2895a[C0878s1.b.f3005f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0846i(AbstractC0843h abstractC0843h) {
        AbstractC0843h abstractC0843h2 = (AbstractC0843h) C0892z.m4237b(abstractC0843h, "input");
        this.f2891a = abstractC0843h2;
        abstractC0843h2.f2870d = this;
    }

    /* JADX INFO: renamed from: Q */
    public static C0846i m3547Q(AbstractC0843h abstractC0843h) {
        C0846i c0846i = abstractC0843h.f2870d;
        return c0846i != null ? c0846i : new C0846i(abstractC0843h);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: A */
    public int mo3396A() {
        int i10 = this.f2894d;
        if (i10 != 0) {
            this.f2892b = i10;
            this.f2894d = 0;
        } else {
            this.f2892b = this.f2891a.mo3486C();
        }
        int i11 = this.f2892b;
        if (i11 == 0 || i11 == this.f2893c) {
            return Integer.MAX_VALUE;
        }
        return C0878s1.m4058a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: B */
    public void mo3397B(List<String> list) throws C0823a0.a {
        m3553W(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: C */
    public void mo3398C(List<Float> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0884v)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 2) {
                int iMo3487D = this.f2891a.mo3487D();
                m3556Z(iMo3487D);
                int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
                do {
                    list.add(Float.valueOf(this.f2891a.mo3503t()));
                } while (this.f2891a.mo3493e() < iMo3493e);
                return;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            do {
                list.add(Float.valueOf(this.f2891a.mo3503t()));
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C = this.f2891a.mo3486C();
                }
            } while (iMo3486C == this.f2892b);
            this.f2894d = iMo3486C;
            return;
        }
        C0884v c0884v = (C0884v) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 2) {
            int iMo3487D2 = this.f2891a.mo3487D();
            m3556Z(iMo3487D2);
            int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
            do {
                c0884v.m4163b(this.f2891a.mo3503t());
            } while (this.f2891a.mo3493e() < iMo3493e2);
            return;
        }
        if (iM4059b2 != 5) {
            throw C0823a0.m3342e();
        }
        do {
            c0884v.m4163b(this.f2891a.mo3503t());
            if (this.f2891a.mo3494f()) {
                return;
            } else {
                iMo3486C2 = this.f2891a.mo3486C();
            }
        } while (iMo3486C2 == this.f2892b);
        this.f2894d = iMo3486C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: D */
    public boolean mo3399D() {
        int i10;
        if (this.f2891a.mo3494f() || (i10 = this.f2892b) == this.f2893c) {
            return false;
        }
        return this.f2891a.mo3489F(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: E */
    public int mo3400E() throws C0823a0.a {
        m3555Y(5);
        return this.f2891a.mo3506w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: F */
    public void mo3401F(List<AbstractC0840g> list) throws C0823a0.a {
        int iMo3486C;
        if (C0878s1.m4059b(this.f2892b) != 2) {
            throw C0823a0.m3342e();
        }
        do {
            list.add(mo3426o());
            if (this.f2891a.mo3494f()) {
                return;
            } else {
                iMo3486C = this.f2891a.mo3486C();
            }
        } while (iMo3486C == this.f2892b);
        this.f2894d = iMo3486C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: G */
    public void mo3402G(List<Double> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0855l)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 1) {
                do {
                    list.add(Double.valueOf(this.f2891a.mo3499p()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3487D = this.f2891a.mo3487D();
            m3557a0(iMo3487D);
            int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
            do {
                list.add(Double.valueOf(this.f2891a.mo3499p()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            return;
        }
        C0855l c0855l = (C0855l) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 1) {
            do {
                c0855l.m3860b(this.f2891a.mo3499p());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3487D2 = this.f2891a.mo3487D();
        m3557a0(iMo3487D2);
        int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
        do {
            c0855l.m3860b(this.f2891a.mo3499p());
        } while (this.f2891a.mo3493e() < iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: H */
    public long mo3403H() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3505v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: I */
    public String mo3404I() throws C0823a0.a {
        m3555Y(2);
        return this.f2891a.mo3485B();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: J */
    public <T> void mo3405J(T t8, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0 {
        m3555Y(2);
        m3549S(t8, interfaceC0842g1, c0864o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: K */
    public <T> void mo3406K(List<T> list, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0.a {
        int iMo3486C;
        if (C0878s1.m4059b(this.f2892b) != 2) {
            throw C0823a0.m3342e();
        }
        int i10 = this.f2892b;
        do {
            list.add(m3552V(interfaceC0842g1, c0864o));
            if (this.f2891a.mo3494f() || this.f2894d != 0) {
                return;
            } else {
                iMo3486C = this.f2891a.mo3486C();
            }
        } while (iMo3486C == i10);
        this.f2894d = iMo3486C;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: L */
    public <T> T mo3407L(Class<T> cls, C0864o c0864o) throws C0823a0.a {
        m3555Y(2);
        return (T) m3552V(C0830c1.m3364a().m3366c(cls), c0864o);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    @Deprecated
    /* JADX INFO: renamed from: M */
    public <T> T mo3408M(Class<T> cls, C0864o c0864o) throws C0823a0.a {
        m3555Y(3);
        return (T) m3551U(C0830c1.m3364a().m3366c(cls), c0864o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: N */
    public <K, V> void mo3409N(Map<K, V> map, C0853k0.a<K, V> aVar, C0864o c0864o) throws C0823a0.a {
        m3555Y(2);
        int iMo3496m = this.f2891a.mo3496m(this.f2891a.mo3487D());
        Object objM3550T = aVar.f2943b;
        Object objM3550T2 = aVar.f2945d;
        while (true) {
            try {
                int iMo3396A = mo3396A();
                if (iMo3396A == Integer.MAX_VALUE || this.f2891a.mo3494f()) {
                    break;
                }
                if (iMo3396A == 1) {
                    objM3550T = m3550T(aVar.f2942a, null, null);
                } else if (iMo3396A != 2) {
                    try {
                        if (!mo3399D()) {
                            throw new C0823a0("Unable to parse map entry.");
                        }
                    } catch (C0823a0.a unused) {
                        if (!mo3399D()) {
                            throw new C0823a0("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM3550T2 = m3550T(aVar.f2944c, aVar.f2945d.getClass(), c0864o);
                }
            } catch (Throwable th2) {
                this.f2891a.mo3495l(iMo3496m);
                throw th2;
            }
        }
        map.put(objM3550T, objM3550T2);
        this.f2891a.mo3495l(iMo3496m);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: O */
    public <T> void mo3410O(T t8, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0.a {
        m3555Y(3);
        m3548R(t8, interfaceC0842g1, c0864o);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    @Deprecated
    /* JADX INFO: renamed from: P */
    public <T> void mo3411P(List<T> list, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0.a {
        int iMo3486C;
        if (C0878s1.m4059b(this.f2892b) != 3) {
            throw C0823a0.m3342e();
        }
        int i10 = this.f2892b;
        do {
            list.add(m3551U(interfaceC0842g1, c0864o));
            if (this.f2891a.mo3494f() || this.f2894d != 0) {
                return;
            } else {
                iMo3486C = this.f2891a.mo3486C();
            }
        } while (iMo3486C == i10);
        this.f2894d = iMo3486C;
    }

    /* JADX INFO: renamed from: R */
    public final <T> void m3548R(T t8, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) {
        int i10 = this.f2893c;
        this.f2893c = C0878s1.m4060c(C0878s1.m4058a(this.f2892b), 4);
        try {
            interfaceC0842g1.mo3475h(t8, this, c0864o);
            if (this.f2892b != this.f2893c) {
                throw C0823a0.m3345h();
            }
            this.f2893c = i10;
        } catch (Throwable th2) {
            this.f2893c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final <T> void m3549S(T t8, InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0 {
        int iMo3487D = this.f2891a.mo3487D();
        AbstractC0843h abstractC0843h = this.f2891a;
        if (abstractC0843h.f2867a >= abstractC0843h.f2868b) {
            throw C0823a0.m3346i();
        }
        int iMo3496m = abstractC0843h.mo3496m(iMo3487D);
        this.f2891a.f2867a++;
        interfaceC0842g1.mo3475h(t8, this, c0864o);
        this.f2891a.mo3491a(0);
        AbstractC0843h abstractC0843h2 = this.f2891a;
        abstractC0843h2.f2867a--;
        abstractC0843h2.mo3495l(iMo3496m);
    }

    /* JADX INFO: renamed from: T */
    public final Object m3550T(C0878s1.b bVar, Class<?> cls, C0864o c0864o) {
        switch (a.f2895a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo3416e());
            case 2:
                return mo3426o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo3422k());
            case 5:
                return Integer.valueOf(mo3432u());
            case 6:
                return Long.valueOf(mo3413b());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo3427p());
            case 9:
                return Long.valueOf(mo3403H());
            case 10:
                return mo3407L(cls, c0864o);
            case 11:
                return Integer.valueOf(mo3400E());
            case 12:
                return Long.valueOf(mo3417f());
            case 13:
                return Integer.valueOf(mo3423l());
            case 14:
                return Long.valueOf(mo3436y());
            case 15:
                return mo3404I();
            case 16:
                return Integer.valueOf(mo3419h());
            case 17:
                return Long.valueOf(mo3430s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    /* JADX INFO: renamed from: U */
    public final <T> T m3551U(InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) {
        T tMo3472e = interfaceC0842g1.mo3472e();
        m3548R(tMo3472e, interfaceC0842g1, c0864o);
        interfaceC0842g1.mo3469b(tMo3472e);
        return tMo3472e;
    }

    /* JADX INFO: renamed from: V */
    public final <T> T m3552V(InterfaceC0842g1<T> interfaceC0842g1, C0864o c0864o) throws C0823a0 {
        T tMo3472e = interfaceC0842g1.mo3472e();
        m3549S(tMo3472e, interfaceC0842g1, c0864o);
        interfaceC0842g1.mo3469b(tMo3472e);
        return tMo3472e;
    }

    /* JADX INFO: renamed from: W */
    public void m3553W(List<String> list, boolean z10) throws C0823a0.a {
        int iMo3486C;
        int iMo3486C2;
        if (C0878s1.m4059b(this.f2892b) != 2) {
            throw C0823a0.m3342e();
        }
        if (!(list instanceof InterfaceC0835e0) || z10) {
            do {
                list.add(z10 ? mo3404I() : mo3437z());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C = this.f2891a.mo3486C();
                }
            } while (iMo3486C == this.f2892b);
            this.f2894d = iMo3486C;
            return;
        }
        InterfaceC0835e0 interfaceC0835e0 = (InterfaceC0835e0) list;
        do {
            interfaceC0835e0.m3384f2(mo3426o());
            if (this.f2891a.mo3494f()) {
                return;
            } else {
                iMo3486C2 = this.f2891a.mo3486C();
            }
        } while (iMo3486C2 == this.f2892b);
        this.f2894d = iMo3486C2;
    }

    /* JADX INFO: renamed from: X */
    public final void m3554X(int i10) throws C0823a0 {
        if (this.f2891a.mo3493e() != i10) {
            throw C0823a0.m3348m();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m3555Y(int i10) throws C0823a0.a {
        if (C0878s1.m4059b(this.f2892b) != i10) {
            throw C0823a0.m3342e();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m3556Z(int i10) throws C0823a0 {
        if ((i10 & 3) != 0) {
            throw C0823a0.m3345h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: a */
    public int mo3412a() {
        return this.f2892b;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m3557a0(int i10) throws C0823a0 {
        if ((i10 & 7) != 0) {
            throw C0823a0.m3345h();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: b */
    public long mo3413b() throws C0823a0.a {
        m3555Y(1);
        return this.f2891a.mo3502s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: c */
    public void mo3414c(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 2) {
                int iMo3487D = this.f2891a.mo3487D();
                m3556Z(iMo3487D);
                int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3506w()));
                } while (this.f2891a.mo3493e() < iMo3493e);
                return;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            do {
                list.add(Integer.valueOf(this.f2891a.mo3506w()));
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C = this.f2891a.mo3486C();
                }
            } while (iMo3486C == this.f2892b);
            this.f2894d = iMo3486C;
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 2) {
            int iMo3487D2 = this.f2891a.mo3487D();
            m3556Z(iMo3487D2);
            int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
            do {
                c0890y.m4225d(this.f2891a.mo3506w());
            } while (this.f2891a.mo3493e() < iMo3493e2);
            return;
        }
        if (iM4059b2 != 5) {
            throw C0823a0.m3342e();
        }
        do {
            c0890y.m4225d(this.f2891a.mo3506w());
            if (this.f2891a.mo3494f()) {
                return;
            } else {
                iMo3486C2 = this.f2891a.mo3486C();
            }
        } while (iMo3486C2 == this.f2892b);
        this.f2894d = iMo3486C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: d */
    public void mo3415d(List<Long> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0847i0)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Long.valueOf(this.f2891a.mo3509z()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Long.valueOf(this.f2891a.mo3509z()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0847i0.m3563e(this.f2891a.mo3509z());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0847i0.m3563e(this.f2891a.mo3509z());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: e */
    public boolean mo3416e() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3497n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: f */
    public long mo3417f() throws C0823a0.a {
        m3555Y(1);
        return this.f2891a.mo3507x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: g */
    public void mo3418g(List<Long> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0847i0)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Long.valueOf(this.f2891a.mo3488E()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Long.valueOf(this.f2891a.mo3488E()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0847i0.m3563e(this.f2891a.mo3488E());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0847i0.m3563e(this.f2891a.mo3488E());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: h */
    public int mo3419h() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3487D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: i */
    public void mo3420i(List<Long> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0847i0)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Long.valueOf(this.f2891a.mo3505v()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Long.valueOf(this.f2891a.mo3505v()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0847i0.m3563e(this.f2891a.mo3505v());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0847i0.m3563e(this.f2891a.mo3505v());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: j */
    public void mo3421j(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3500q()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Integer.valueOf(this.f2891a.mo3500q()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0890y.m4225d(this.f2891a.mo3500q());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0890y.m4225d(this.f2891a.mo3500q());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: k */
    public int mo3422k() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3500q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: l */
    public int mo3423l() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3508y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: m */
    public void mo3424m(List<Boolean> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0834e)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2891a.mo3497n()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Boolean.valueOf(this.f2891a.mo3497n()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0834e c0834e = (C0834e) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0834e.m3382b(this.f2891a.mo3497n());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0834e.m3382b(this.f2891a.mo3497n());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: n */
    public void mo3425n(List<String> list) throws C0823a0.a {
        m3553W(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: o */
    public AbstractC0840g mo3426o() throws C0823a0.a {
        m3555Y(2);
        return this.f2891a.mo3498o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: p */
    public int mo3427p() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3504u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: q */
    public void mo3428q(List<Long> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0847i0)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 1) {
                do {
                    list.add(Long.valueOf(this.f2891a.mo3502s()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3487D = this.f2891a.mo3487D();
            m3557a0(iMo3487D);
            int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
            do {
                list.add(Long.valueOf(this.f2891a.mo3502s()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            return;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 1) {
            do {
                c0847i0.m3563e(this.f2891a.mo3502s());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3487D2 = this.f2891a.mo3487D();
        m3557a0(iMo3487D2);
        int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
        do {
            c0847i0.m3563e(this.f2891a.mo3502s());
        } while (this.f2891a.mo3493e() < iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: r */
    public void mo3429r(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3508y()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Integer.valueOf(this.f2891a.mo3508y()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0890y.m4225d(this.f2891a.mo3508y());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0890y.m4225d(this.f2891a.mo3508y());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    public double readDouble() throws C0823a0.a {
        m3555Y(1);
        return this.f2891a.mo3499p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    public float readFloat() throws C0823a0.a {
        m3555Y(5);
        return this.f2891a.mo3503t();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: s */
    public long mo3430s() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3488E();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: t */
    public void mo3431t(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3487D()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Integer.valueOf(this.f2891a.mo3487D()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0890y.m4225d(this.f2891a.mo3487D());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0890y.m4225d(this.f2891a.mo3487D());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: u */
    public int mo3432u() throws C0823a0.a {
        m3555Y(5);
        return this.f2891a.mo3501r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: v */
    public void mo3433v(List<Long> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0847i0)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 1) {
                do {
                    list.add(Long.valueOf(this.f2891a.mo3507x()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3487D = this.f2891a.mo3487D();
            m3557a0(iMo3487D);
            int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
            do {
                list.add(Long.valueOf(this.f2891a.mo3507x()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            return;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 1) {
            do {
                c0847i0.m3563e(this.f2891a.mo3507x());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3487D2 = this.f2891a.mo3487D();
        m3557a0(iMo3487D2);
        int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
        do {
            c0847i0.m3563e(this.f2891a.mo3507x());
        } while (this.f2891a.mo3493e() < iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: w */
    public void mo3434w(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3504u()));
                    if (this.f2891a.mo3494f()) {
                        return;
                    } else {
                        iMo3486C = this.f2891a.mo3486C();
                    }
                } while (iMo3486C == this.f2892b);
                this.f2894d = iMo3486C;
                return;
            }
            if (iM4059b != 2) {
                throw C0823a0.m3342e();
            }
            int iMo3493e = this.f2891a.mo3493e() + this.f2891a.mo3487D();
            do {
                list.add(Integer.valueOf(this.f2891a.mo3504u()));
            } while (this.f2891a.mo3493e() < iMo3493e);
            m3554X(iMo3493e);
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 0) {
            do {
                c0890y.m4225d(this.f2891a.mo3504u());
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C2 = this.f2891a.mo3486C();
                }
            } while (iMo3486C2 == this.f2892b);
            this.f2894d = iMo3486C2;
            return;
        }
        if (iM4059b2 != 2) {
            throw C0823a0.m3342e();
        }
        int iMo3493e2 = this.f2891a.mo3493e() + this.f2891a.mo3487D();
        do {
            c0890y.m4225d(this.f2891a.mo3504u());
        } while (this.f2891a.mo3493e() < iMo3493e2);
        m3554X(iMo3493e2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: x */
    public void mo3435x(List<Integer> list) throws C0823a0 {
        int iMo3486C;
        int iMo3486C2;
        if (!(list instanceof C0890y)) {
            int iM4059b = C0878s1.m4059b(this.f2892b);
            if (iM4059b == 2) {
                int iMo3487D = this.f2891a.mo3487D();
                m3556Z(iMo3487D);
                int iMo3493e = this.f2891a.mo3493e() + iMo3487D;
                do {
                    list.add(Integer.valueOf(this.f2891a.mo3501r()));
                } while (this.f2891a.mo3493e() < iMo3493e);
                return;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            do {
                list.add(Integer.valueOf(this.f2891a.mo3501r()));
                if (this.f2891a.mo3494f()) {
                    return;
                } else {
                    iMo3486C = this.f2891a.mo3486C();
                }
            } while (iMo3486C == this.f2892b);
            this.f2894d = iMo3486C;
            return;
        }
        C0890y c0890y = (C0890y) list;
        int iM4059b2 = C0878s1.m4059b(this.f2892b);
        if (iM4059b2 == 2) {
            int iMo3487D2 = this.f2891a.mo3487D();
            m3556Z(iMo3487D2);
            int iMo3493e2 = this.f2891a.mo3493e() + iMo3487D2;
            do {
                c0890y.m4225d(this.f2891a.mo3501r());
            } while (this.f2891a.mo3493e() < iMo3493e2);
            return;
        }
        if (iM4059b2 != 5) {
            throw C0823a0.m3342e();
        }
        do {
            c0890y.m4225d(this.f2891a.mo3501r());
            if (this.f2891a.mo3494f()) {
                return;
            } else {
                iMo3486C2 = this.f2891a.mo3486C();
            }
        } while (iMo3486C2 == this.f2892b);
        this.f2894d = iMo3486C2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: y */
    public long mo3436y() throws C0823a0.a {
        m3555Y(0);
        return this.f2891a.mo3509z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0839f1
    /* JADX INFO: renamed from: z */
    public String mo3437z() throws C0823a0.a {
        m3555Y(2);
        return this.f2891a.mo3484A();
    }
}
