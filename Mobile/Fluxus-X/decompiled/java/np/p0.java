package np;

import hr.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<com.withpersona.sdk2.inquiry.internal.network.e> f26386a;

    public p0(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f26386a = iVar;
    }

    public static p0 a(wt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new p0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.u c(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.u(str, str2, str3, str4, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.u b(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, str3, str4, inquirySessionConfig, this.f26386a.get());
    }
}
