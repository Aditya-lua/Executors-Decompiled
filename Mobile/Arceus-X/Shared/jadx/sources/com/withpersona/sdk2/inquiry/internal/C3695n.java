package com.withpersona.sdk2.inquiry.internal;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13963h0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3695n implements C3694m.a {

    /* JADX INFO: renamed from: a */
    public final C13963h0 f15278a;

    public C3695n(C13963h0 c13963h0) {
        this.f15278a = c13963h0;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5835i<C3694m.a> m18602a(C13963h0 c13963h0) {
        return C5831e.m26182a(new C3695n(c13963h0));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3694m.a
    public C3694m create(String str) {
        return this.f15278a.m50466b(str);
    }
}
