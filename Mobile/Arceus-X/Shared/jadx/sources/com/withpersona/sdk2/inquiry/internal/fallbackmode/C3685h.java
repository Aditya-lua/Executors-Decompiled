package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3685h implements C3683f.a {

    /* JADX INFO: renamed from: a */
    public final C3684g f15211a;

    public C3685h(C3684g c3684g) {
        this.f15211a = c3684g;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3683f.a> m18504b(C3684g c3684g) {
        return C5831e.m26182a(new C3685h(c3684g));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.C3683f.a
    /* JADX INFO: renamed from: a */
    public C3683f mo18500a(int i10) {
        return this.f15211a.m18503b(i10);
    }
}
