package p212j8;

import ht.InterfaceC6564a;
import p071d8.InterfaceC4470b;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: j8.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7065n0 implements InterfaceC4470b<C7063m0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<InterfaceC8011a> f27645a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC8011a> f27646b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<AbstractC7046e> f27647c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<C7077t0> f27648d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6564a<String> f27649e;

    public C7065n0(InterfaceC6564a<InterfaceC8011a> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<AbstractC7046e> interfaceC6564a3, InterfaceC6564a<C7077t0> interfaceC6564a4, InterfaceC6564a<String> interfaceC6564a5) {
        this.f27645a = interfaceC6564a;
        this.f27646b = interfaceC6564a2;
        this.f27647c = interfaceC6564a3;
        this.f27648d = interfaceC6564a4;
        this.f27649e = interfaceC6564a5;
    }

    /* JADX INFO: renamed from: a */
    public static C7065n0 m29830a(InterfaceC6564a<InterfaceC8011a> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<AbstractC7046e> interfaceC6564a3, InterfaceC6564a<C7077t0> interfaceC6564a4, InterfaceC6564a<String> interfaceC6564a5) {
        return new C7065n0(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4, interfaceC6564a5);
    }

    /* JADX INFO: renamed from: c */
    public static C7063m0 m29831c(InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, Object obj, Object obj2, InterfaceC6564a<String> interfaceC6564a) {
        return new C7063m0(interfaceC8011a, interfaceC8011a2, (AbstractC7046e) obj, (C7077t0) obj2, interfaceC6564a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C7063m0 get() {
        return m29831c(this.f27645a.get(), this.f27646b.get(), this.f27647c.get(), this.f27648d.get(), this.f27649e);
    }
}
