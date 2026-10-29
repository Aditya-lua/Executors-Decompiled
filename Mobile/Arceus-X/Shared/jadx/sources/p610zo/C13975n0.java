package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3715r;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import org.jetbrains.annotations.Nullable;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13975n0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48841a;

    public C13975n0(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48841a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13975n0 m50506a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13975n0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3715r m50507c(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig, C3706e c3706e) {
        return new C3715r(str, str2, str3, str4, inquirySessionConfig, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3715r m50508b(String str, @Nullable String str2, String str3, String str4, InquirySessionConfig inquirySessionConfig) {
        return m50507c(str, str2, str3, str4, inquirySessionConfig, this.f48841a.get());
    }
}
