package com.withpersona.sdk2.inquiry.document.network;

import bo.InterfaceC1477c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p226jq.InterfaceC7267k;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3454d implements InterfaceC5830d<C3453c.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC1477c> f13394a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC7267k> f13395b;

    public C3454d(InterfaceC5835i<InterfaceC1477c> interfaceC5835i, InterfaceC5835i<InterfaceC7267k> interfaceC5835i2) {
        this.f13394a = interfaceC5835i;
        this.f13395b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C3454d m16737a(InterfaceC5835i<InterfaceC1477c> interfaceC5835i, InterfaceC5835i<InterfaceC7267k> interfaceC5835i2) {
        return new C3454d(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3453c.a m16738c(InterfaceC1477c interfaceC1477c, InterfaceC7267k interfaceC7267k) {
        return new C3453c.a(interfaceC1477c, interfaceC7267k);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3453c.a get() {
        return m16738c(this.f13394a.get(), this.f13395b.get());
    }
}
