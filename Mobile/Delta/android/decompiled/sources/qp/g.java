package qp;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mp.h0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmp/h0;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "b", "()Lmp/h0;", "nfc_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    @NotNull
    public static final h0<PassportNfcReaderConfig, PassportNfcReaderOutput> b() {
        return new h0<>(new com.withpersona.sdk2.inquiry.nfc.a(), new g.a() { // from class: qp.f
            @Override // g.a
            public final void a(Object obj) {
                g.c((PassportNfcReaderOutput) obj);
            }
        });
    }

    public static final void c(PassportNfcReaderOutput result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new i().b(result);
    }
}
