package zo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<gp.w> f37843a;
    public final ft.i<yn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.i<wp.c> f37844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.i<dp.i> f37845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.i<kr.a> f37846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f37847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37848g;

    public c0(ft.i<gp.w> iVar, ft.i<yn.a> iVar2, ft.i<wp.c> iVar3, ft.i<dp.i> iVar4, ft.i<kr.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        this.f37843a = iVar;
        this.b = iVar2;
        this.f37844c = iVar3;
        this.f37845d = iVar4;
        this.f37846e = iVar5;
        this.f37847f = iVar6;
        this.f37848g = iVar7;
    }

    public static c0 a(ft.i<gp.w> iVar, ft.i<yn.a> iVar2, ft.i<wp.c> iVar3, ft.i<dp.i> iVar4, ft.i<kr.a> iVar5, ft.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static com.withpersona.sdk2.inquiry.internal.k c(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10, gp.w wVar, yn.a aVar, wp.c cVar, dp.i iVar, kr.a aVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar3, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.k(str, str2, str3, a0Var, inquirySessionConfig, z10, wVar, aVar, cVar, iVar, aVar2, aVar3, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.k b(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return c(str, str2, str3, a0Var, inquirySessionConfig, z10, this.f37843a.get(), this.b.get(), this.f37844c.get(), this.f37845d.get(), this.f37846e.get(), this.f37847f.get(), this.f37848g.get());
    }
}
