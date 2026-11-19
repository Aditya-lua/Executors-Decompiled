package np;

import hr.InquirySessionConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26418a;

    public s0(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26418a = iVar;
    }

    public static s0 a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new s0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.a0 c(String str, String str2, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.a0(str, str2, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.a0 b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, inquirySessionConfig, this.f26418a.get());
    }
}
