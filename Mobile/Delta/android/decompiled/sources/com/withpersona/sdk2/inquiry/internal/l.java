package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import zo.a0;
import zo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements k.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f11853a;

    public l(c0 c0Var) {
        this.f11853a = c0Var;
    }

    public static ft.i<k.b> b(c0 c0Var) {
        return ft.e.a(new l(c0Var));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.k.b
    public k a(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return this.f11853a.b(str, str2, str3, a0Var, inquirySessionConfig, z10);
    }
}
