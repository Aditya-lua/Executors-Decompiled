package xo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<com.withpersona.sdk2.inquiry.internal.network.e> f36064a;

    public n0(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f36064a = iVar;
    }

    public static n0 a(dt.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new n0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.r c(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.r(str, str2, str3, str4, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.r b(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, str3, str4, inquirySessionConfig, this.f36064a.get());
    }
}
