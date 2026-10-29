package zo;

import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<com.withpersona.sdk2.inquiry.internal.network.e> f37941a;

    public n0(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        this.f37941a = iVar;
    }

    public static n0 a(ft.i<com.withpersona.sdk2.inquiry.internal.network.e> iVar) {
        return new n0(iVar);
    }

    public static com.withpersona.sdk2.inquiry.internal.r c(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig, com.withpersona.sdk2.inquiry.internal.network.e eVar) {
        return new com.withpersona.sdk2.inquiry.internal.r(str, str2, str3, str4, inquirySessionConfig, eVar);
    }

    public com.withpersona.sdk2.inquiry.internal.r b(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return c(str, str2, str3, str4, inquirySessionConfig, this.f37941a.get());
    }
}
