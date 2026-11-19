package com.withpersona.sdk2.inquiry.internal;

import com.withpersona.sdk2.inquiry.FieldMapping;
import hr.InquirySessionConfig;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10943a;

    public z(y yVar) {
        this.f10943a = yVar;
    }

    public static wt.i<x.a> b(y yVar) {
        return wt.e.a(new z(yVar));
    }

    @Override // com.withpersona.sdk2.inquiry.internal.x.a
    public x a(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, x.TransitionData transitionData) {
        return this.f10943a.b(str, str2, str3, str4, list, inquirySessionConfig, transitionData);
    }
}
