package com.withpersona.sdk2.inquiry.governmentid.network;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p420rq.InterfaceC11067a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.network.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3569a implements InterfaceC5830d<AutoClassifyWorker.C3563b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC3570b> f14181a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC11067a> f14182b;

    public C3569a(InterfaceC5835i<InterfaceC3570b> interfaceC5835i, InterfaceC5835i<InterfaceC11067a> interfaceC5835i2) {
        this.f14181a = interfaceC5835i;
        this.f14182b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C3569a m17724a(InterfaceC5835i<InterfaceC3570b> interfaceC5835i, InterfaceC5835i<InterfaceC11067a> interfaceC5835i2) {
        return new C3569a(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static AutoClassifyWorker.C3563b m17725c(InterfaceC3570b interfaceC3570b, InterfaceC11067a interfaceC11067a) {
        return new AutoClassifyWorker.C3563b(interfaceC3570b, interfaceC11067a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AutoClassifyWorker.C3563b get() {
        return m17725c(this.f14181a.get(), this.f14182b.get());
    }
}
