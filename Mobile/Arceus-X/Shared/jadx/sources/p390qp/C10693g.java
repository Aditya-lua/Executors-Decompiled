package p390qp;

import com.withpersona.sdk2.inquiry.nfc.C3827a;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp.C8624h0;
import org.jetbrains.annotations.NotNull;
import p139g.InterfaceC5852a;

/* JADX INFO: renamed from: qp.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lmp/h0;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "b", "()Lmp/h0;", "nfc_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10693g {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C8624h0<PassportNfcReaderConfig, PassportNfcReaderOutput> m40765b() {
        return new C8624h0<>(new C3827a(), new InterfaceC5852a() { // from class: qp.f
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                C10693g.m40766c((PassportNfcReaderOutput) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m40766c(PassportNfcReaderOutput result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new C10695i().m40770b(result);
    }
}
