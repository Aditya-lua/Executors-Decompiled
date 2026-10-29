package com.withpersona.sdk2.inquiry.internal;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p610zo.C13968k;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3688g implements C3677f.a {

    /* JADX INFO: renamed from: a */
    public final C13968k f15217a;

    public C3688g(C13968k c13968k) {
        this.f15217a = c13968k;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5835i<C3677f.a> m18515a(C13968k c13968k) {
        return C5831e.m26182a(new C3688g(c13968k));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.C3677f.a
    public C3677f create(String str) {
        return this.f15217a.m50487b(str);
    }
}
