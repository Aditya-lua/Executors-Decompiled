package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bp.k;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f11890a;

    public j(k kVar) {
        this.f11890a = kVar;
    }

    public static dt.i<i.a> b(k kVar) {
        return dt.e.a(new j(kVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.i.a
    public i a(List<? extends NextStep> list, String str) {
        return this.f11890a.b(list, str);
    }
}
