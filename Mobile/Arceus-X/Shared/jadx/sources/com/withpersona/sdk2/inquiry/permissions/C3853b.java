package com.withpersona.sdk2.inquiry.permissions;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;
import p419rp.C11026j;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3853b implements C3852a.a {

    /* JADX INFO: renamed from: a */
    public final C11026j f15831a;

    public C3853b(C11026j c11026j) {
        this.f15831a = c11026j;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3852a.a> m19146b(C11026j c11026j) {
        return C5831e.m26182a(new C3853b(c11026j));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.C3852a.a
    /* JADX INFO: renamed from: a */
    public C3852a mo19142a() {
        return this.f15831a.m41728b();
    }
}
