package com.withpersona.sdk2.inquiry.document.network;

import bo.InterfaceC1477c;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3456f implements InterfaceC5830d<C3455e.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC1477c> f13412a;

    public C3456f(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        this.f13412a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C3456f m16748a(InterfaceC5835i<InterfaceC1477c> interfaceC5835i) {
        return new C3456f(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3455e.a m16749c(InterfaceC1477c interfaceC1477c) {
        return new C3455e.a(interfaceC1477c);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3455e.a get() {
        return m16749c(this.f13412a.get());
    }
}
