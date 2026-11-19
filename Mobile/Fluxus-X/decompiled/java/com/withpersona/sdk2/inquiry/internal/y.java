package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import com.withpersona.sdk2.inquiry.FieldMapping;
import hr.InquirySessionConfig;
import java.util.List;
import np.q0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<up.w> f10939a;
    public final wt.i<so.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<q0> f10940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<to.e> f10941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<Context> f10942e;

    public y(wt.i<up.w> iVar, wt.i<so.a> iVar2, wt.i<q0> iVar3, wt.i<to.e> iVar4, wt.i<Context> iVar5) {
        this.f10939a = iVar;
        this.b = iVar2;
        this.f10940c = iVar3;
        this.f10941d = iVar4;
        this.f10942e = iVar5;
    }

    public static y a(wt.i<up.w> iVar, wt.i<so.a> iVar2, wt.i<q0> iVar3, wt.i<to.e> iVar4, wt.i<Context> iVar5) {
        return new y(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    public static x c(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, x.TransitionData transitionData, up.w wVar, so.a aVar, q0 q0Var, to.e eVar, Context context) {
        return new x(str, str2, str3, str4, list, inquirySessionConfig, transitionData, wVar, aVar, q0Var, eVar, context);
    }

    public x b(String str, @Nullable String str2, String str3, @Nullable String str4, List<FieldMapping> list, InquirySessionConfig inquirySessionConfig, x.TransitionData transitionData) {
        return c(str, str2, str3, str4, list, inquirySessionConfig, transitionData, this.f10939a.get(), this.b.get(), this.f10940c.get(), this.f10941d.get(), this.f10942e.get());
    }
}
