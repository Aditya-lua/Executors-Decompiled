package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0885v0<T> implements InterfaceC0842g1<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0874r0 f3130a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0863n1<?, ?> f3131b;

    /* JADX INFO: renamed from: c */
    public final boolean f3132c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0867p<?> f3133d;

    public C0885v0(AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0874r0 interfaceC0874r0) {
        this.f3131b = abstractC0863n1;
        this.f3132c = abstractC0867p.mo3938e(interfaceC0874r0);
        this.f3133d = abstractC0867p;
        this.f3130a = interfaceC0874r0;
    }

    /* JADX INFO: renamed from: j */
    private <UT, UB> int m4165j(AbstractC0863n1<UT, UB> abstractC0863n1, T t8) {
        return abstractC0863n1.mo3899i(abstractC0863n1.mo3897g(t8));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: androidx.datastore.preferences.protobuf.v0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private <UT, UB, ET extends C0879t.b<ET>> void m4166k(AbstractC0863n1<UT, UB> abstractC0863n1, AbstractC0867p<ET> abstractC0867p, T t8, InterfaceC0839f1 interfaceC0839f1, C0864o c0864o) throws Throwable {
        AbstractC0863n1<UT, UB> abstractC0863n2;
        UB ubMo3896f = abstractC0863n1.mo3896f(t8);
        Object objMo3937d = abstractC0867p.mo3937d(t8);
        while (interfaceC0839f1.mo3396A() != Integer.MAX_VALUE) {
            try {
                abstractC0863n2 = abstractC0863n1;
                AbstractC0867p<ET> abstractC0867p2 = abstractC0867p;
                InterfaceC0839f1 interfaceC0839f2 = interfaceC0839f1;
                C0864o c0864o2 = c0864o;
                try {
                    if (!m4168m(interfaceC0839f2, c0864o2, abstractC0867p2, objMo3937d, abstractC0863n2, ubMo3896f)) {
                        abstractC0863n2.mo3905o(t8, ubMo3896f);
                        return;
                    }
                    interfaceC0839f1 = interfaceC0839f2;
                    c0864o = c0864o2;
                    abstractC0867p = abstractC0867p2;
                    abstractC0863n1 = abstractC0863n2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    abstractC0863n2.mo3905o(t8, ubMo3896f);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                abstractC0863n2 = abstractC0863n1;
            }
        }
        abstractC0863n1.mo3905o(t8, ubMo3896f);
    }

    /* JADX INFO: renamed from: l */
    public static <T> C0885v0<T> m4167l(AbstractC0863n1<?, ?> abstractC0863n1, AbstractC0867p<?> abstractC0867p, InterfaceC0874r0 interfaceC0874r0) {
        return new C0885v0<>(abstractC0863n1, abstractC0867p, interfaceC0874r0);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: a */
    public void mo3468a(T t8, T t10) {
        C0848i1.m3576G(this.f3131b, t8, t10);
        if (this.f3132c) {
            C0848i1.m3574E(this.f3133d, t8, t10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: b */
    public void mo3469b(T t8) {
        this.f3131b.mo3900j(t8);
        this.f3133d.mo3939f(t8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: c */
    public final boolean mo3470c(T t8) {
        return this.f3133d.mo3936c(t8).m4084p();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: d */
    public int mo3471d(T t8) {
        int iM4165j = m4165j(this.f3131b, t8);
        return this.f3132c ? iM4165j + this.f3133d.mo3936c(t8).m4079j() : iM4165j;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: e */
    public T mo3472e() {
        InterfaceC0874r0 interfaceC0874r0 = this.f3130a;
        return interfaceC0874r0 instanceof AbstractC0888x ? (T) ((AbstractC0888x) interfaceC0874r0).m4190O() : (T) interfaceC0874r0.mo4027e().mo4030d();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: f */
    public int mo3473f(T t8) {
        int iHashCode = this.f3131b.mo3897g(t8).hashCode();
        return this.f3132c ? (iHashCode * 53) + this.f3133d.mo3936c(t8).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: g */
    public boolean mo3474g(T t8, T t10) {
        if (!this.f3131b.mo3897g(t8).equals(this.f3131b.mo3897g(t10))) {
            return false;
        }
        if (this.f3132c) {
            return this.f3133d.mo3936c(t8).equals(this.f3133d.mo3936c(t10));
        }
        return true;
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.p<?>, androidx.datastore.preferences.protobuf.p<ET extends androidx.datastore.preferences.protobuf.t$b<ET>> */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: h */
    public void mo3475h(T t8, InterfaceC0839f1 interfaceC0839f1, C0864o c0864o) throws Throwable {
        m4166k(this.f3131b, this.f3133d, t8, interfaceC0839f1, c0864o);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: androidx.datastore.preferences.protobuf.n1<?, ?>, androidx.datastore.preferences.protobuf.n1<UT, UB> */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0842g1
    /* JADX INFO: renamed from: i */
    public void mo3476i(T t8, InterfaceC0881t1 interfaceC0881t1) {
        Iterator itM4085t = this.f3133d.mo3936c(t8).m4085t();
        while (itM4085t.hasNext()) {
            Map.Entry entry = (Map.Entry) itM4085t.next();
            C0879t.b bVar = (C0879t.b) entry.getKey();
            if (bVar.mo4093k() != C0878s1.c.MESSAGE || bVar.mo4091f() || bVar.mo4094m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C0829c0.b) {
                interfaceC0881t1.mo3805b(bVar.getNumber(), ((C0829c0.b) entry).m3362a().m3375e());
            } else {
                interfaceC0881t1.mo3805b(bVar.getNumber(), entry.getValue());
            }
        }
        m4169n(this.f3131b, t8, interfaceC0881t1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: androidx.datastore.preferences.protobuf.t<ET extends androidx.datastore.preferences.protobuf.t$b<ET>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final <UT, UB, ET extends C0879t.b<ET>> boolean m4168m(InterfaceC0839f1 interfaceC0839f1, C0864o c0864o, AbstractC0867p<ET> abstractC0867p, C0879t<ET> c0879t, AbstractC0863n1<UT, UB> abstractC0863n1, UB ub) throws C0823a0 {
        int iMo3412a = interfaceC0839f1.mo3412a();
        int iMo3419h = 0;
        if (iMo3412a != C0878s1.f2998a) {
            if (C0878s1.m4059b(iMo3412a) != 2) {
                return interfaceC0839f1.mo3399D();
            }
            Object objMo3935b = abstractC0867p.mo3935b(c0864o, this.f3130a, C0878s1.m4058a(iMo3412a));
            if (objMo3935b == null) {
                return abstractC0863n1.m3903m(ub, interfaceC0839f1, 0);
            }
            abstractC0867p.mo3941h(interfaceC0839f1, objMo3935b, c0864o, c0879t);
            return true;
        }
        Object objMo3935b2 = null;
        AbstractC0840g abstractC0840gMo3426o = null;
        while (interfaceC0839f1.mo3396A() != Integer.MAX_VALUE) {
            int iMo3412a2 = interfaceC0839f1.mo3412a();
            if (iMo3412a2 == C0878s1.f3000c) {
                iMo3419h = interfaceC0839f1.mo3419h();
                objMo3935b2 = abstractC0867p.mo3935b(c0864o, this.f3130a, iMo3419h);
            } else if (iMo3412a2 == C0878s1.f3001d) {
                if (objMo3935b2 != null) {
                    abstractC0867p.mo3941h(interfaceC0839f1, objMo3935b2, c0864o, c0879t);
                } else {
                    abstractC0840gMo3426o = interfaceC0839f1.mo3426o();
                }
            } else if (!interfaceC0839f1.mo3399D()) {
                break;
            }
        }
        if (interfaceC0839f1.mo3412a() != C0878s1.f2999b) {
            throw C0823a0.m3339b();
        }
        if (abstractC0840gMo3426o != null) {
            if (objMo3935b2 != null) {
                abstractC0867p.mo3942i(abstractC0840gMo3426o, objMo3935b2, c0864o, c0879t);
            } else {
                abstractC0863n1.mo3894d(ub, iMo3419h, abstractC0840gMo3426o);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final <UT, UB> void m4169n(AbstractC0863n1<UT, UB> abstractC0863n1, T t8, InterfaceC0881t1 interfaceC0881t1) {
        abstractC0863n1.mo3909s(abstractC0863n1.mo3897g(t8), interfaceC0881t1);
    }
}
