package xo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<ep.w> f35966a;
    public final dt.i<wn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt.i<up.c> f35967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dt.i<bp.i> f35968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dt.i<ir.a> f35969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> f35970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f35971g;

    public c0(dt.i<ep.w> iVar, dt.i<wn.a> iVar2, dt.i<up.c> iVar3, dt.i<bp.i> iVar4, dt.i<ir.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        this.f35966a = iVar;
        this.b = iVar2;
        this.f35967c = iVar3;
        this.f35968d = iVar4;
        this.f35969e = iVar5;
        this.f35970f = iVar6;
        this.f35971g = iVar7;
    }

    public static c0 a(dt.i<ep.w> iVar, dt.i<wn.a> iVar2, dt.i<up.c> iVar3, dt.i<bp.i> iVar4, dt.i<ir.a> iVar5, dt.i<com.withpersona.sdk2.inquiry.shared.inquiryTheme.a> iVar6, dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        return new c0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static com.withpersona.sdk2.inquiry.internal.k c(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10, ep.w wVar, wn.a aVar, up.c cVar, bp.i iVar, ir.a aVar2, com.withpersona.sdk2.inquiry.shared.inquiryTheme.a aVar3, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.k(str, str2, str3, a0Var, inquirySessionConfig, z10, wVar, aVar, cVar, iVar, aVar2, aVar3, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.k b(String str, @Nullable String str2, String str3, a0 a0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return c(str, str2, str3, a0Var, inquirySessionConfig, z10, this.f35966a.get(), this.b.get(), this.f35967c.get(), this.f35968d.get(), this.f35969e.get(), this.f35970f.get(), this.f35971g.get());
    }
}
