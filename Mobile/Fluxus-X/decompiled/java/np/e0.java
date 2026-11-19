package np;

import hr.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<up.w> f26287a;
    public final wt.i<mo.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<kq.c> f26288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<rp.i> f26289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<zr.a> f26290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<gr.b> f26291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26292g;

    public e0(wt.i<up.w> iVar, wt.i<mo.a> iVar2, wt.i<kq.c> iVar3, wt.i<rp.i> iVar4, wt.i<zr.a> iVar5, wt.i<gr.b> iVar6, wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        this.f26287a = iVar;
        this.b = iVar2;
        this.f26288c = iVar3;
        this.f26289d = iVar4;
        this.f26290e = iVar5;
        this.f26291f = iVar6;
        this.f26292g = iVar7;
    }

    public static e0 a(wt.i<up.w> iVar, wt.i<mo.a> iVar2, wt.i<kq.c> iVar3, wt.i<rp.i> iVar4, wt.i<zr.a> iVar5, wt.i<gr.b> iVar6, wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar7) {
        return new e0(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7);
    }

    public static com.withpersona.sdk2.inquiry.internal.n c(String str, @Nullable String str2, String str3, c0 c0Var, InquirySessionConfig inquirySessionConfig, boolean z10, up.w wVar, mo.a aVar, kq.c cVar, rp.i iVar, zr.a aVar2, gr.b bVar, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.n(str, str2, str3, c0Var, inquirySessionConfig, z10, wVar, aVar, cVar, iVar, aVar2, bVar, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.n b(String str, @Nullable String str2, String str3, c0 c0Var, InquirySessionConfig inquirySessionConfig, boolean z10) {
        return c(str, str2, str3, c0Var, inquirySessionConfig, z10, this.f26287a.get(), this.b.get(), this.f26288c.get(), this.f26289d.get(), this.f26290e.get(), this.f26291f.get(), this.f26292g.get());
    }
}
