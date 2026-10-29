package com.withpersona.sdk2.inquiry.document.network;

import bo.InterfaceC1477c;
import fo.InterfaceC5720a;
import mq.InterfaceC8644a;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3458h implements InterfaceC5830d<C3457g.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC1477c> f13435a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC5720a> f13436b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC8644a> f13437c;

    public C3458h(InterfaceC5835i<InterfaceC1477c> interfaceC5835i, InterfaceC5835i<InterfaceC5720a> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3) {
        this.f13435a = interfaceC5835i;
        this.f13436b = interfaceC5835i2;
        this.f13437c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3458h m16763a(InterfaceC5835i<InterfaceC1477c> interfaceC5835i, InterfaceC5835i<InterfaceC5720a> interfaceC5835i2, InterfaceC5835i<InterfaceC8644a> interfaceC5835i3) {
        return new C3458h(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C3457g.a m16764c(InterfaceC1477c interfaceC1477c, InterfaceC5720a interfaceC5720a, InterfaceC8644a interfaceC8644a) {
        return new C3457g.a(interfaceC1477c, interfaceC5720a, interfaceC8644a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3457g.a get() {
        return m16764c(this.f13435a.get(), this.f13436b.get(), this.f13437c.get());
    }
}
