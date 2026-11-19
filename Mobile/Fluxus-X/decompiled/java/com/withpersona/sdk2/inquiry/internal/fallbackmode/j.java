package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import rp.k;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f10451a;

    public j(k kVar) {
        this.f10451a = kVar;
    }

    public static wt.i<i.a> b(k kVar) {
        return wt.e.a(new j(kVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a
    public i a(List<? extends NextStep> list, String str) {
        return this.f10451a.b(list, str);
    }
}
