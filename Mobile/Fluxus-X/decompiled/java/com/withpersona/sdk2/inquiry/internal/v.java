package com.withpersona.sdk2.inquiry.internal;

import hr.InquirySessionConfig;
import np.p0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f10903a;

    public v(p0 p0Var) {
        this.f10903a = p0Var;
    }

    public static wt.i<u.a> b(p0 p0Var) {
        return wt.e.a(new v(p0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.u.a
    public u a(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return this.f10903a.b(str, str2, str3, str4, inquirySessionConfig);
    }
}
