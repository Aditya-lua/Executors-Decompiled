package p028b8;

import ht.InterfaceC6564a;
import p071d8.InterfaceC4470b;
import p163h8.InterfaceC6319e;
import p190i8.C6677r;
import p190i8.C6681v;
import p267l8.InterfaceC8011a;

/* JADX INFO: renamed from: b8.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1274v implements InterfaceC4470b<C1272t> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<InterfaceC8011a> f5296a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC8011a> f5297b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<InterfaceC6319e> f5298c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<C6677r> f5299d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6564a<C6681v> f5300e;

    public C1274v(InterfaceC6564a<InterfaceC8011a> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<InterfaceC6319e> interfaceC6564a3, InterfaceC6564a<C6677r> interfaceC6564a4, InterfaceC6564a<C6681v> interfaceC6564a5) {
        this.f5296a = interfaceC6564a;
        this.f5297b = interfaceC6564a2;
        this.f5298c = interfaceC6564a3;
        this.f5299d = interfaceC6564a4;
        this.f5300e = interfaceC6564a5;
    }

    /* JADX INFO: renamed from: a */
    public static C1274v m7055a(InterfaceC6564a<InterfaceC8011a> interfaceC6564a, InterfaceC6564a<InterfaceC8011a> interfaceC6564a2, InterfaceC6564a<InterfaceC6319e> interfaceC6564a3, InterfaceC6564a<C6677r> interfaceC6564a4, InterfaceC6564a<C6681v> interfaceC6564a5) {
        return new C1274v(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4, interfaceC6564a5);
    }

    /* JADX INFO: renamed from: c */
    public static C1272t m7056c(InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, InterfaceC6319e interfaceC6319e, C6677r c6677r, C6681v c6681v) {
        return new C1272t(interfaceC8011a, interfaceC8011a2, interfaceC6319e, c6677r, c6681v);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1272t get() {
        return m7056c(this.f5296a.get(), this.f5297b.get(), this.f5298c.get(), this.f5299d.get(), this.f5300e.get());
    }
}
