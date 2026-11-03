package com.withpersona.sdk2.inquiry.internal;

import xo.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f12144a;

    public p(i0 i0Var) {
        this.f12144a = i0Var;
    }

    public static dt.i<o.a> b(i0 i0Var) {
        return dt.e.a(new p(i0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.o.a
    public o a(String str, String str2, String str3) {
        return this.f12144a.b(str, str2, str3);
    }
}
