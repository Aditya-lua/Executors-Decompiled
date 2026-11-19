package com.withpersona.sdk2.inquiry.internal;

import hr.InquirySessionConfig;
import np.c0;
import np.e0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements n.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f10868a;

    public o(e0 e0Var) {
        this.f10868a = e0Var;
    }

    public static wt.i<n.b> b(e0 e0Var) {
        return wt.e.a(new o(e0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.n.b
    public n a(String str, @Nullable String str2, String str3, c0 c0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return this.f10868a.b(str, str2, str3, c0Var, inquirySessionConfig, z10);
    }
}
