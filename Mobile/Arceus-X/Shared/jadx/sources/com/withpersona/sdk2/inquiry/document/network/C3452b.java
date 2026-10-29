package com.withpersona.sdk2.inquiry.document.network;

import bo.InterfaceC1477c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3452b implements InterfaceC5830d<C3451a.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC1477c> f13337a;

    public C3452b(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        this.f13337a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C3452b m16708a(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        return new C3452b(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3451a.a m16709c(InterfaceC1477c interfaceC1477c) {
        return new C3451a.a(interfaceC1477c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3451a.a get() {
        return m16709c(this.f13337a.get());
    }
}
