package zo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37945a;

    public p0(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f37945a = iVar;
    }

    public static p0 a(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new p0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.v c(String str, String str2, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.v(str, str2, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.v b(String str, String str2, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, inquirySessionConfig, this.f37945a.get());
    }
}
