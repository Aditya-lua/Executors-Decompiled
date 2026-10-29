package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0870q extends AbstractC0867p<AbstractC0888x.d> {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2970a;

        static {
            int[] iArr = new int[C0878s1.b.values().length];
            f2970a = iArr;
            try {
                iArr[C0878s1.b.f3002c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2970a[C0878s1.b.f3003d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2970a[C0878s1.b.f3004e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2970a[C0878s1.b.f3005f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2970a[C0878s1.b.f3006g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2970a[C0878s1.b.f3007h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2970a[C0878s1.b.f3008i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2970a[C0878s1.b.f3009j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2970a[C0878s1.b.f3014o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2970a[C0878s1.b.f3016q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2970a[C0878s1.b.f3017r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2970a[C0878s1.b.f3018s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2970a[C0878s1.b.f3019t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2970a[C0878s1.b.f3015p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2970a[C0878s1.b.f3013n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2970a[C0878s1.b.f3010k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2970a[C0878s1.b.f3011l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2970a[C0878s1.b.f3012m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: a */
    public int mo3934a(Map.Entry<?, ?> entry) {
        return ((AbstractC0888x.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: b */
    public Object mo3935b(C0864o c0864o, InterfaceC0874r0 interfaceC0874r0, int i10) {
        return c0864o.m3912a(interfaceC0874r0, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: c */
    public C0879t<AbstractC0888x.d> mo3936c(Object obj) {
        return ((AbstractC0888x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: d */
    public C0879t<AbstractC0888x.d> mo3937d(Object obj) {
        return ((AbstractC0888x.c) obj).m4214U();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: e */
    public boolean mo3938e(InterfaceC0874r0 interfaceC0874r0) {
        return interfaceC0874r0 instanceof AbstractC0888x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: f */
    public void mo3939f(Object obj) {
        mo3936c(obj).m4086u();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo3940g(Object obj, InterfaceC0839f1 interfaceC0839f1, Object obj2, C0864o c0864o, C0879t<AbstractC0888x.d> c0879t, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1) {
        Object objM4078i;
        ArrayList arrayList;
        AbstractC0888x.e eVar = (AbstractC0888x.e) obj2;
        int iM4219c = eVar.m4219c();
        if (eVar.f3143b.mo4091f() && eVar.f3143b.mo4094m()) {
            switch (a.f2970a[eVar.m4217a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3402G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3398C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3420i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3418g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3434w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3428q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3435x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3424m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3431t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3414c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3433v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3429r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3415d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC0839f1.mo3421j(arrayList);
                    eVar.f3143b.m4216b();
                    ub = (UB) C0848i1.m3625z(obj, iM4219c, arrayList, null, ub, abstractC0863n1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f3143b.mo4092g());
            }
            c0879t.m4089y(eVar.f3143b, arrayList);
            return ub;
        }
        Object objM4242g = null;
        if (eVar.m4217a() == C0878s1.b.f3015p) {
            interfaceC0839f1.mo3427p();
            eVar.f3143b.m4216b();
            throw null;
        }
        int[] iArr = a.f2970a;
        switch (iArr[eVar.m4217a().ordinal()]) {
            case 1:
                objM4242g = Double.valueOf(interfaceC0839f1.readDouble());
                break;
            case 2:
                objM4242g = Float.valueOf(interfaceC0839f1.readFloat());
                break;
            case 3:
                objM4242g = Long.valueOf(interfaceC0839f1.mo3403H());
                break;
            case 4:
                objM4242g = Long.valueOf(interfaceC0839f1.mo3430s());
                break;
            case 5:
                objM4242g = Integer.valueOf(interfaceC0839f1.mo3427p());
                break;
            case 6:
                objM4242g = Long.valueOf(interfaceC0839f1.mo3413b());
                break;
            case 7:
                objM4242g = Integer.valueOf(interfaceC0839f1.mo3432u());
                break;
            case 8:
                objM4242g = Boolean.valueOf(interfaceC0839f1.mo3416e());
                break;
            case 9:
                objM4242g = Integer.valueOf(interfaceC0839f1.mo3419h());
                break;
            case 10:
                objM4242g = Integer.valueOf(interfaceC0839f1.mo3400E());
                break;
            case 11:
                objM4242g = Long.valueOf(interfaceC0839f1.mo3417f());
                break;
            case 12:
                objM4242g = Integer.valueOf(interfaceC0839f1.mo3423l());
                break;
            case 13:
                objM4242g = Long.valueOf(interfaceC0839f1.mo3436y());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objM4242g = interfaceC0839f1.mo3426o();
                break;
            case 16:
                objM4242g = interfaceC0839f1.mo3437z();
                break;
            case 17:
                if (!eVar.m4220d()) {
                    Object objM4078i2 = c0879t.m4078i(eVar.f3143b);
                    if (objM4078i2 instanceof AbstractC0888x) {
                        InterfaceC0842g1 interfaceC0842g1M3367d = C0830c1.m3364a().m3367d(objM4078i2);
                        if (!((AbstractC0888x) objM4078i2).m4186I()) {
                            Object objMo3472e = interfaceC0842g1M3367d.mo3472e();
                            interfaceC0842g1M3367d.mo3468a(objMo3472e, objM4078i2);
                            c0879t.m4089y(eVar.f3143b, objMo3472e);
                            objM4078i2 = objMo3472e;
                        }
                        interfaceC0839f1.mo3410O(objM4078i2, interfaceC0842g1M3367d, c0864o);
                        return ub;
                    }
                }
                objM4242g = interfaceC0839f1.mo3408M(eVar.m4218b().getClass(), c0864o);
                break;
            case 18:
                if (!eVar.m4220d()) {
                    Object objM4078i3 = c0879t.m4078i(eVar.f3143b);
                    if (objM4078i3 instanceof AbstractC0888x) {
                        InterfaceC0842g1 interfaceC0842g1M3367d2 = C0830c1.m3364a().m3367d(objM4078i3);
                        if (!((AbstractC0888x) objM4078i3).m4186I()) {
                            Object objMo3472e2 = interfaceC0842g1M3367d2.mo3472e();
                            interfaceC0842g1M3367d2.mo3468a(objMo3472e2, objM4078i3);
                            c0879t.m4089y(eVar.f3143b, objMo3472e2);
                            objM4078i3 = objMo3472e2;
                        }
                        interfaceC0839f1.mo3405J(objM4078i3, interfaceC0842g1M3367d2, c0864o);
                        return ub;
                    }
                }
                objM4242g = interfaceC0839f1.mo3407L(eVar.m4218b().getClass(), c0864o);
                break;
        }
        if (eVar.m4220d()) {
            c0879t.m4075a(eVar.f3143b, objM4242g);
            return ub;
        }
        int i10 = iArr[eVar.m4217a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objM4078i = c0879t.m4078i(eVar.f3143b)) != null) {
            objM4242g = C0892z.m4242g(objM4078i, objM4242g);
        }
        c0879t.m4089y(eVar.f3143b, objM4242g);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: h */
    public void mo3941h(InterfaceC0839f1 interfaceC0839f1, Object obj, C0864o c0864o, C0879t<AbstractC0888x.d> c0879t) {
        AbstractC0888x.e eVar = (AbstractC0888x.e) obj;
        c0879t.m4089y(eVar.f3143b, interfaceC0839f1.mo3407L(eVar.m4218b().getClass(), c0864o));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: i */
    public void mo3942i(AbstractC0840g abstractC0840g, Object obj, C0864o c0864o, C0879t<AbstractC0888x.d> c0879t) {
        AbstractC0888x.e eVar = (AbstractC0888x.e) obj;
        InterfaceC0874r0.a aVarMo4027e = eVar.m4218b().mo4027e();
        AbstractC0843h abstractC0843hMo3453m = abstractC0840g.mo3453m();
        aVarMo4027e.mo4031y(abstractC0843hMo3453m, c0864o);
        c0879t.m4089y(eVar.f3143b, aVarMo4027e.mo4030d());
        abstractC0843hMo3453m.mo3491a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0867p
    /* JADX INFO: renamed from: j */
    public void mo3943j(InterfaceC0881t1 interfaceC0881t1, Map.Entry<?, ?> entry) {
        AbstractC0888x.d dVar = (AbstractC0888x.d) entry.getKey();
        if (!dVar.mo4091f()) {
            switch (a.f2970a[dVar.mo4092g().ordinal()]) {
                case 1:
                    interfaceC0881t1.mo3833p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    interfaceC0881t1.mo3779B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    interfaceC0881t1.mo3843u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    interfaceC0881t1.mo3813f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    interfaceC0881t1.mo3817h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    interfaceC0881t1.mo3839s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    interfaceC0881t1.mo3807c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    interfaceC0881t1.mo3845v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    interfaceC0881t1.mo3831o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    interfaceC0881t1.mo3847w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    interfaceC0881t1.mo3819i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    interfaceC0881t1.mo3785H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    interfaceC0881t1.mo3827m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    interfaceC0881t1.mo3817h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    interfaceC0881t1.mo3788K(dVar.getNumber(), (AbstractC0840g) entry.getValue());
                    break;
                case 16:
                    interfaceC0881t1.mo3811e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    interfaceC0881t1.mo3791N(dVar.getNumber(), entry.getValue(), C0830c1.m3364a().m3366c(entry.getValue().getClass()));
                    break;
                case 18:
                    interfaceC0881t1.mo3789L(dVar.getNumber(), entry.getValue(), C0830c1.m3364a().m3366c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2970a[dVar.mo4092g().ordinal()]) {
            case 1:
                C0848i1.m3584O(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 2:
                C0848i1.m3588S(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 3:
                C0848i1.m3591V(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 4:
                C0848i1.m3603d0(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 5:
                C0848i1.m3590U(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 6:
                C0848i1.m3587R(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 7:
                C0848i1.m3586Q(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 8:
                C0848i1.m3582M(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 9:
                C0848i1.m3601c0(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 10:
                C0848i1.m3593X(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 11:
                C0848i1.m3594Y(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 12:
                C0848i1.m3595Z(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 13:
                C0848i1.m3597a0(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 14:
                C0848i1.m3590U(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, dVar.mo4094m());
                break;
            case 15:
                C0848i1.m3583N(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1);
                break;
            case 16:
                C0848i1.m3599b0(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C0848i1.m3589T(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, C0830c1.m3364a().m3366c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C0848i1.m3592W(dVar.getNumber(), (List) entry.getValue(), interfaceC0881t1, C0830c1.m3364a().m3366c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
