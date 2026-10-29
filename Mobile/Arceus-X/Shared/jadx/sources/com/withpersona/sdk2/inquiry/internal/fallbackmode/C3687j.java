package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import p082dp.C4657k;
import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C3687j implements C3686i.a {

    /* JADX INFO: renamed from: a */
    public final C4657k f15216a;

    public C3687j(C4657k c4657k) {
        this.f15216a = c4657k;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5835i<C3686i.a> m18514b(C4657k c4657k) {
        return C5831e.m26182a(new C3687j(c4657k));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i.a
    /* JADX INFO: renamed from: a */
    public C3686i mo18513a(List<? extends NextStep> list, String str) {
        return this.f15216a.m22902b(list, str);
    }
}
