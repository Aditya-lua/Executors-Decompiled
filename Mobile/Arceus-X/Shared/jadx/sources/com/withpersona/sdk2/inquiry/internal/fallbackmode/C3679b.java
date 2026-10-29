package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import p082dp.InterfaceC4647a;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3679b implements InterfaceC5830d<InterfaceC4647a> {

    /* JADX INFO: renamed from: a */
    public final C3678a f15147a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C3681d> f15148b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C3683f.a> f15149c;

    public C3679b(C3678a c3678a, InterfaceC5835i<C3681d> interfaceC5835i, InterfaceC5835i<C3683f.a> interfaceC5835i2) {
        this.f15147a = c3678a;
        this.f15148b = interfaceC5835i;
        this.f15149c = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC4647a m18481a(C3678a c3678a, C3681d c3681d, C3683f.a aVar) {
        return (InterfaceC4647a) C5834h.m26194e(c3678a.m18480a(c3681d, aVar));
    }

    /* JADX INFO: renamed from: b */
    public static C3679b m18482b(C3678a c3678a, InterfaceC5835i<C3681d> interfaceC5835i, InterfaceC5835i<C3683f.a> interfaceC5835i2) {
        return new C3679b(c3678a, interfaceC5835i, interfaceC5835i2);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4647a get() {
        return m18481a(this.f15147a, this.f15148b.get(), this.f15149c.get());
    }
}
